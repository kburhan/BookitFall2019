package com.bookit.pages;

public class SelfPage {
    public String getUserInfo(String value){
        String xpath = "//p[text()='"+value+"']/preceding-sibling::p";
        return "";
    }
}