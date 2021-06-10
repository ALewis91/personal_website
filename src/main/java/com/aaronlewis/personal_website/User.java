package com.aaronlewis.personal_website;

import org.springframework.data.annotation.Id;

public class User {

  @Id
  public String id;

  public String firstName;
  public String lastName;
  public String email;
  public String password;

  public User() {}

  public User(String firstName, String lastName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }

  @Override
  public String toString() {
    return String.format(
        "User[id=%s, firstName='%s', lastName='%s', email='%s']",
        id, firstName, lastName, email);
  }

}