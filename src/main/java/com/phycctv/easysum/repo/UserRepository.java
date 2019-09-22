package com.phycctv.easysum.repo;

import org.springframework.data.repository.CrudRepository;

import com.phycctv.easysum.model.AppUser;

import java.util.List;

public interface UserRepository extends CrudRepository<AppUser, Long> {

    List<AppUser> findByName(String name);

}
