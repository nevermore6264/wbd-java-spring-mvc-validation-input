package com.codegym.model;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Valid
public class User {
    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(18)
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}