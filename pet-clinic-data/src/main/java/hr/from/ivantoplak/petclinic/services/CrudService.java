package hr.from.ivantoplak.petclinic.services;

import java.util.Set;

public interface CrudService<T, N> {

    Set<T> findAll();

    T findById(N id);

    T save(T entity);

    void delete(T entity);

    void deleteById(N id);
}
