package com.driver.models;
import javax.persistence.*;
import java.util.Date;


//@Table
@Entity
public  class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String dimensions;
    private Blog blog;
}
