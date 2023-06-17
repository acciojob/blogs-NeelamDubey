package com.driver.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    List<Blog> blogList=new ArrayList<>();

}