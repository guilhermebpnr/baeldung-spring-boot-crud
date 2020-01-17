package dev.guilhermebpnr.learn.baeldung.tutorials.springbootcrud.repository;

import dev.guilhermebpnr.learn.baeldung.tutorials.springbootcrud.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
