package com.sapient.blog.springbootblogrestapi.service;

import com.sapient.blog.springbootblogrestapi.entity.Post;
import com.sapient.blog.springbootblogrestapi.payload.PostDto;
import com.sapient.blog.springbootblogrestapi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
