package com.driver.models;
import javax.persistence.*;
import java.util.Date;


//@Table
@Entity
public  class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String Title;
    private String content;
    private Date pubDate;
}
