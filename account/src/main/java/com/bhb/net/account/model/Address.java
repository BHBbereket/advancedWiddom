package com.bhb.net.account.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "AddressRepository")
public class Address {
    @Id
    private String id;
    private String owner;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}
