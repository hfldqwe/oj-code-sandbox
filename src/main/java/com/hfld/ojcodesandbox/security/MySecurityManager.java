package com.hfld.ojcodesandbox.security;

import java.security.Permission;

public class MySecurityManager extends SecurityManager{

    // 检查所有权限
    @Override
    public void checkPermission(Permission perm) {
//        super.checkPermission(perm);
    }

    // 检查程序是否可执行文件
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("权限不足" + cmd);
    }

    // 检测程序是否允许读文件
    @Override
    public void checkRead(String file) {
        super.checkRead(file);
    }

    // 检测程序是否允许写文件
    @Override
    public void checkWrite(String file) {
        super.checkWrite(file);
    }

    // 检测程序是否允许删除文件
    @Override
    public void checkDelete(String file) {
        super.checkDelete(file);
    }

    //
    @Override
    public void checkConnect(String host, int port) {
        super.checkConnect(host, port);
    }
}
