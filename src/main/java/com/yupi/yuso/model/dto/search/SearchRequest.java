package com.yupi.yuso.model.dto.search;

import com.yupi.yuso.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRequest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 类型
     */
    private String type;

    private static final long serialVersionUID = 1L;
}