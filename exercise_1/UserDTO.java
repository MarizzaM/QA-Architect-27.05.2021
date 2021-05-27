package com.example.demo;

public class UserDTO {

    public Integer Id;
    public String Name;
    public String Username;
    public String Email;

    public UserDTO() {
    }

    public UserDTO(Integer id, String name, String username, String email) {
        Id = id;
        Name = name;
        Username = username;
        Email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

}

