package com.rishiqing.modules.useradvice.service;

import cn.jeeweb.core.common.service.ICommonService;
import cn.jeeweb.core.query.data.Page;
import cn.jeeweb.core.query.data.Queryable;
import com.rishiqing.modules.useradvice.entity.RsqUserAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**   
 * @Title: 用户意见管理
 * @Description: 用户意见管理
 * @author rishiqing
 * @date 2018年11月12日15:42:25
 * @version V1.0   
 *
 */
public interface IRsqUserAdviceService extends ICommonService<RsqUserAdvice> {

    Page<RsqUserAdvice> ajaxList(Queryable queryable, HttpServletRequest request);

    void export (HttpServletRequest request, HttpServletResponse response) throws IOException;
}

