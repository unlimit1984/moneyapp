package com.mentor.app.moneyapp.domain;

import lombok.Data;

@Data
public class User {
  String name;
  String email;
  Role role;

}
