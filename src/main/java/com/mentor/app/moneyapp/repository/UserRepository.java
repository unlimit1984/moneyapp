package com.mentor.app.moneyapp.repository;

import com.mentor.app.moneyapp.domain.User;

import java.util.List;

public interface UserRepository {

  List<User> findAll();

}
