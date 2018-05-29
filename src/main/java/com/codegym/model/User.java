package com.codegym.model;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Valid
public class User {
    @NotEmpty(message = "Không được để trống")
    @Size(min = 2, max = 30,message = "Tên từ 2 đến 30 ký tự")
    private String name;

    @NotNull(message = "Không được để trống")
    @Min(value = 18,message = "Tuổi nhỏ nhất 18")
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