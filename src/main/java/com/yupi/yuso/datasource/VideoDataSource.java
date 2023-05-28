package com.yupi.yuso.datasource;

// [加入编程导航](https://www.code-nav.cn/) 入门捷径+交流答疑+项目实战+求职指导，帮你自学编程不走弯路

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Component;

/**
 * 视频数据源
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Component
public class VideoDataSource implements DataSource<Object> {

    @Override
    public Page<Object> doSearch(String searchText, long pageNum, long pageSize) {
        return null;
    }
}
