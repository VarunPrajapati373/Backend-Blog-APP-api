package com.blog.app.services;

import com.blog.app.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComments(CommentDto commentDto, Integer postId);
	
	void deleteComment(Integer commentId);

}
