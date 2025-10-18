package com.sky.utils;

public class CurrentHolder {

    private static final ThreadLocal<Long> CURRENT_USER_ID=new ThreadLocal<>();

    public static void setCurrentUserId(Long id){
        CURRENT_USER_ID.set(id);
    }

    public static Long getCurrentUserId(){
        return CURRENT_USER_ID.get();
    }

    public static void clear(){
        CURRENT_USER_ID.remove();
    }


}
