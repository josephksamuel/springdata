package userservice.repository;

import org.springframework.data.repository.CrudRepository;

import userservice.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}