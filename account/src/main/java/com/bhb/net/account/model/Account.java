package com.bhb.net.account.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Account")
public class Account {
    @Id
    private String id;
    private String fname;
    private String lname;
    private String email;
    private String Dob;
    private List<String> followers;
    private List<String> followings;
    private String phone;

}
