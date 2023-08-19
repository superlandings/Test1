package com.itheima.d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    //掌握正则表达式查找内容
    public static void main(String[] args) {
        method();
    }
    //需求：从以下内容中爬取出，手机，邮箱，座机，400等电话信息
    private static void method() {
        String date = "来黑马程序员学习Java，\n" +
                "       电话： 18666688888, 18699997777\n" +
                "       或者联系邮箱:boniu@itcast.cn, \n" +
                "       座机电话：01036517895, 010-98951256\n" +
                "       邮箱：bizai@itcast.cn,\n" +
                "       邮箱：dlei0009@163.com,\n" +
                "       热线电话：400-618-9090 , 400-618-4000 , 4006184000 , 4006189090" ;
        //定义爬取规则
        String regex = "(\\w{1,}@\\w{2,20}(\\.\\w{2,10}){1,2})| "
                 + "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15}|400-?\\d{3,8}-?\\d{3,8})";
        //把正则表达式封装成一个pattern对象
        Pattern pattern = Pattern.compile(regex);

        //通过pattern对象去获取查找内容的匹配器对象
        Matcher matcher = pattern.matcher(date);

        //定义一个循环开始爬取信息
        while (matcher.find()){
            String rs = matcher.group();
            System.out.println(rs);
        }
    }
}
