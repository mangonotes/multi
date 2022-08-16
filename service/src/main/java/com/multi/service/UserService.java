package com.multi.service;

import com.multi.service.dao.entity.entity.UserEntity;
import com.multi.service.dao.repo.UserRepository;
import com.multi.service.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConversionService userConversionService;
    private Logger log = LoggerFactory.getLogger(UserService.class);
   @Value("${user.flag}")
    private String userFlag;
    public List<UserDTO>  getAllUser(){

        List<UserEntity> finalAll =userRepository.findAll();
    List<UserDTO> userDTOList= finalAll.stream()
             .map(userConversionService.convert())
             .collect(Collectors.toList());
        log.info("list {}",userDTOList.size());

        return userDTOList;
    }
}
