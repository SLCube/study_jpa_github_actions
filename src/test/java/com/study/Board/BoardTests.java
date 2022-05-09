package com.study.Board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.board.entity.Board;
import com.study.board.entity.BoardRepository;

@SpringBootTest
public class BoardTests {

	@Autowired
	BoardRepository boardRepository;
	
//	@Test
//	void save() {
//		Board params = Board.builder()
//				.title("1번 게시글 제목")
//				.content("1번 게시글 내용")
//				.writer("도뎡이")
//				.deleteYn('N')
//				.build();
//		
//		boardRepository.save(params);
//		
//		Board entity = boardRepository.findById((long) 1).get();
//		assertThat(entity.getTitle()).isEqualTo("1번 게시글 제목");
//		assertThat(entity.getContent()).isEqualTo("1번 게시글 내용");
//		assertThat(entity.getWriter()).isEqualTo("도뎡이");
//	}
//	
//	@Test
//	void findAll() {
//		
//		long boardsCount = boardRepository.count();
//		
//		List<Board> boards = boardRepository.findAll();
//	}
//	
//	@Test
//	void delete() {
//		
//		Board entity = boardRepository.findById((long) 3).get();
//		
//		boardRepository.delete(entity);
//	}
	
}
