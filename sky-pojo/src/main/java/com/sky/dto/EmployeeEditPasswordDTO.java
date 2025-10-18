package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 修改密码请求dto
 */
@Data
public class EmployeeEditPasswordDTO implements Serializable {

    private String oldPassword;

    private String newPassword;

    private Long empId;
}
