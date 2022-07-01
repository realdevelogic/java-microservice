package com.volentis.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email

) {

}
