package userservice.repository;

import org.springframework.data.repository.CrudRepository;

import userservice.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
    Book findByTitle(String title);
}