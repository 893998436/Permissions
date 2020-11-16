package com.itheima.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private  static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

    private  static  String encoderPassword(String password){
        return  bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String a="123";

        System.out.println(encoderPassword(a));
    }
}
