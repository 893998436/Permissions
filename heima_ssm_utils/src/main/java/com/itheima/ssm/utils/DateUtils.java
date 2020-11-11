package com.itheima.ssm.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

        //日期转换成字符串
        public static String  dateToString(Date date,String format){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            String format1 = simpleDateFormat.format(date);
            return  format1;
        }
         //字符串转换成日期
        public  static  Date  stringToDate(String str, String format) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            Date parse = simpleDateFormat.parse(str);
            return  parse;
        }


}
