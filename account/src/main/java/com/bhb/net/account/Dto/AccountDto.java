package com.bhb.net.account.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private String id;
    private String fname;
    private String lname;
    private String email;
    private String Dob;
    private List<String> followers;
    private List<String> followings;
    private String phone;
}
