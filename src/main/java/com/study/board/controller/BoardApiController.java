package com.study.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.board.dto.BoardRequestDto;
import com.study.board.dto.BoardResponseDto;
import com.study.board.model.BoardService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardApiController {

	private final BoardService boardService;
	
	/**
	 * 게시글 생성
	 * @param params
	 * @return
	 */
	@PostMapping(value = "/boards")
	public Long save(@RequestBody final BoardRequestDto params) {
		return boardService.save(params);
	}
	
	/**
	 * 게시글 리스트 조회
	 * @return
	 */
	@GetMapping(value = "/boards")
	public List<BoardResponseDto> findAll(){
		return boardService.findAll();
	}
	
	@PatchMapping(value = "/boards/{id}")
	public Long save(@PathVariable final Long id, @RequestBody BoardRequestDto params) {
		return boardService.update(id, params);
	}
	
}
