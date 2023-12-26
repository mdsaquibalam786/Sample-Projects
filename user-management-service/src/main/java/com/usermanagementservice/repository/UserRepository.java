package com.usermanagementservice.repository;


import com.usermanagementservice.model.userEntity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {


    UserEntity findByUserName(String userName);
    UserEntity findByEmail(String email);

}