package hr.from.ivantoplak.petclinic.services.map;

import hr.from.ivantoplak.petclinic.model.BaseEntity;
import hr.from.ivantoplak.petclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, N extends Long> implements CrudService<T, N> {

    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(N id) {
        return map.get(id);
    }

    @Override
    public T save(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Object can't be null.");
        }

        if (entity.getId() == null) {
            entity.setId(getNextId());
        }

        map.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public void delete(T entity) {
        map.remove(entity.getId(), entity);
    }

    @Override
    public void deleteById(N id) {
        map.remove(id);
    }

    private Long getNextId() {

        if (map.isEmpty()) {
            return 1L;
        }

        Long max = Collections.max(map.keySet());
        return max != null ? max + 1 : 1L;
    }
}
