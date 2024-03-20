package com.hfld.ojcodesandbox;


import com.hfld.ojcodesandbox.model.ExecuteCodeRequest;
import com.hfld.ojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
