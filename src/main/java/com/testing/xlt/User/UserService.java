package com.testing.xlt.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	//회원가입시 유효성 체크
	public Map<String,String> validateHandling(Errors errors){
		Map<String,String> validatorResult = new HashMap<>();
		
		for(FieldError error: errors.getFieldErrors()) {
			String validKeyName = String.format("valid_%s", error.getField());
			validatorResult.put(validKeyName, error.getDefaultMessage());
			}
		
		return validatorResult;
		}
	
	//회원가입
	public void signUp(UserDto userDto) {
		//회원 가입 비지니스 로직 구현
	}
	}

