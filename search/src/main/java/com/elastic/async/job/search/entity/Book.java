package com.elastic.async.job.search.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Book {
    @Id
    private String bookID;
    private String title;
    private String authors;
    private String average_rating;
    private String isbn;


    @JoinTable(name = "book_tags")
    @ManyToMany(targetEntity = Tag.class)
    private List<Tag> tags;

    @JoinTable(name = "book_Categories")
    @ManyToMany(targetEntity = Category.class)
    private List<Category> categories;
}