package com.elastic.async.job.search.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Category {
    private String categoryID;
    private String categoryName;

    @ManyToMany(mappedBy = "categories")
    List<Book> books;
}
