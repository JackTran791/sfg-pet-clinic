package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Jack Tran
 */
public interface CrudService<T, ID> {

    // Close #3

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
