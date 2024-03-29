package com.blog.app.services;

import java.util.List;

import com.blog.app.entities.Post;
import com.blog.app.payloads.PostDto;
import com.blog.app.payloads.PostResponse;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//getAll post 
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//get single Post
	PostDto getPostById(Integer postId);
	
	//get all post by category;
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all post by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search post by keywords
	List<PostDto>  searchPosts(String keywords);
	
}
