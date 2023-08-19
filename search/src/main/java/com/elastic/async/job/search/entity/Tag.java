package com.elastic.async.job.search.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Tag {
    private String tagID;
    private String tagName;
    @ManyToMany(mappedBy = "tags")
    private List<Book> books;
}
