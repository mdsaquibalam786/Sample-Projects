package com.usermanagementservice.model.userDto;


import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class UserDetails {

    private int id;
    private String userName;
    private String email;
    private String password;
}
