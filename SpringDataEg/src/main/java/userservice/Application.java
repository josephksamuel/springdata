package userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import userservice.model.Author;
import userservice.model.Book;
import userservice.repository.AuthorRepository;
import userservice.repository.BookRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    private static final Logger log =
            LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

  /*  @Bean
    public CommandLineRunner demo(UserRepository repo) {
       return (args) -> {
            //CREATE
            User user = new User();
            repo.save(use
            r);

            //READ
            User savedUser = repo.findById(user.getId()).get();

            //UPDATE
            savedUser.setName("Ted");
            repo.save(savedUser);

            //DELETE
            repo.delete(savedUser);
        };
     
    } */
    	 @Bean
    	    public CommandLineRunner demo(BookRepository bookRepo, AuthorRepository authRepo) {
    		 return (args) -> {
			// create a new author
			Author author = new Author("JK", "Rowling");
			// create a new book
			Book book = new Book("Harry Potter");
			// save author to db
			authRepo.save(author);
			// associate author with book
			book.setAuthor(author);
			// save book
			bookRepo.save(book);
			// read book from db with custom findByTitle
			Book savedBook = bookRepo.findByTitle("Harry Potter");
			// print title
			log.info(savedBook.getTitle());
			// print book author's full name
			log.info(savedBook.getAuthor().getFullName());
		};
	
    }
}