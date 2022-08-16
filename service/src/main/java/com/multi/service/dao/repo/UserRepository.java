package com.multi.service.dao.repo;

import com.multi.service.dao.entity.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository  extends CrudRepository<UserEntity, Long> {
    List<UserEntity> findAll();
}
