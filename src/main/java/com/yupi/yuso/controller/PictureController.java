package com.yupi.yuso.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.gson.Gson;
import com.yupi.yuso.annotation.AuthCheck;
import com.yupi.yuso.common.BaseResponse;
import com.yupi.yuso.common.DeleteRequest;
import com.yupi.yuso.common.ErrorCode;
import com.yupi.yuso.common.ResultUtils;
import com.yupi.yuso.constant.UserConstant;
import com.yupi.yuso.exception.BusinessException;
import com.yupi.yuso.exception.ThrowUtils;
import com.yupi.yuso.model.dto.picture.PictureQueryRequest;
import com.yupi.yuso.model.dto.post.PostAddRequest;
import com.yupi.yuso.model.dto.post.PostEditRequest;
import com.yupi.yuso.model.dto.post.PostQueryRequest;
import com.yupi.yuso.model.dto.post.PostUpdateRequest;
import com.yupi.yuso.model.entity.Picture;
import com.yupi.yuso.model.entity.Post;
import com.yupi.yuso.model.entity.User;
import com.yupi.yuso.model.vo.PostVO;
import com.yupi.yuso.service.PictureService;
import com.yupi.yuso.service.PostService;
import com.yupi.yuso.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 图片接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private PictureService pictureService;

    /**
     * 分页获取列表（封装类）
     *
     * @param pictureQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page/vo")
    public BaseResponse<Page<Picture>> listPictureByPage(@RequestBody PictureQueryRequest pictureQueryRequest,
                                                        HttpServletRequest request) {
        long current = pictureQueryRequest.getCurrent();
        long size = pictureQueryRequest.getPageSize();
        // 限制爬虫
        ThrowUtils.throwIf(size > 20, ErrorCode.PARAMS_ERROR);
        String searchText = pictureQueryRequest.getSearchText();
        Page<Picture> picturePage = pictureService.searchPicture(searchText, current, size);
        return ResultUtils.success(picturePage);
    }


}
