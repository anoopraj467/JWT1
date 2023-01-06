package com.sapient.blog.springbootblogrestapi.repository;

import com.sapient.blog.springbootblogrestapi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
