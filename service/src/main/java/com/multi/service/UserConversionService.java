package com.multi.service;

import com.multi.service.dao.entity.entity.UserEntity;
import com.multi.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserConversionService {

    public Function<UserEntity,UserDTO> convert(){
        return user -> new UserDTO(user.getName(), user.getUserType(), user.getId(), user.getCreatedDate());
    }
}
