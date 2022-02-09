package userservice.model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Author author;

    @Column(unique=true)
    private String title;

    protected Book() {}

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public Author getAuthor(){
        return this.author;
    }

}