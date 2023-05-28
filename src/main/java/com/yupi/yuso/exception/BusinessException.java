package com.yupi.yuso.exception;

import com.yupi.yuso.common.ErrorCode;

/**
 * 自定义异常类
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    // [鱼皮的知识星球](https://t.zsxq.com/0emozsIJh) 从 0 到 1 求职指导，斩获 offer！1 对 1 简历优化服务、200+ 真实简历和建议参考、2000+ 求职面试经验分享、25w 字前后端精选面试题

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
