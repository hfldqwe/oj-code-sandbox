package com.hfld.ojcodesandbox.security;

import java.security.Permission;

public class DefaultSecurityManager extends SecurityManager {

    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不作任何权限设置");
        System.out.println(perm);
        super.checkPermission(perm);
    }
}
