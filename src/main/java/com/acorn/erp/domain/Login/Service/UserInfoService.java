package com.acorn.erp.domain.Login.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.erp.domain.Login.Entity.UserInfo;
import com.acorn.erp.domain.Login.Repository.UserInfoMapper;

@Service
public class UserInfoService {
	
    @Autowired
    private UserInfoMapper userInfoMapper;
	
    public List<UserInfo> getAllUserInfo() {
        return userInfoMapper.getAllUserInfo();
    }

    public void insertUserInfo(UserInfo userinfo) {
        userInfoMapper.insertUserInfo(userinfo);
    }
	
    public void deleteUserInfo(String email) {
        userInfoMapper.deleteUserInfo(email);
    }
	
    public void updateUserInfo(UserInfo userinfo) {
        userInfoMapper.updateUserInfo(userinfo);
        System.out.println("업데이트 성공");
    }
    
    //로그인 관련 매퍼
    
    public UserInfoService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public UserInfo login(String email, String password) {
        return userInfoMapper.getUserByEmailAndPassword(email, password);
    }
    
  
    public String getShopname(String email) {
    	return userInfoMapper.getShopname(email);
    }
}