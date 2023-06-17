package com.driver.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//@Table
@Entity
public  class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String Title;
    private String content;
    private Date pubDate;
    @ManyToOne
    @JoinColumn
    private User user;
    @OneToMany(mappedBy = "Image",cascade = CascadeType.ALL)
    List<Image> imageList=new ArrayList<>();

}
