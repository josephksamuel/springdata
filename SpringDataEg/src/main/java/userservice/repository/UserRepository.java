package userservice.repository;

import org.springframework.data.repository.CrudRepository;

import userservice.model.User;

public interface UserRepository extends CrudRepository<User,Long> {
}