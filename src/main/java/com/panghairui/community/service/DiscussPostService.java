package com.panghairui.community.service;

import com.panghairui.community.dao.DiscussPostMapper;
import com.panghairui.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired(required = false)
    private DiscussPostMapper discussPostMapper;

    //当前页显示的帖子集合
    public List<DiscussPost> findDiscussPosts(int userId, int offerset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offerset, limit);
    }

    public int findDiscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }

}
