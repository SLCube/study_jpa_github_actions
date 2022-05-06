package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board")
public class BoardPageController {

	/**
	 * 게시글 리스트 페이지
	 * @return
	 */
	@GetMapping(value = "/list")
	public String openBoardList() {
		return "board/list";
	}
	
}
