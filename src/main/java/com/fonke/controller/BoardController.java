package com.fonke.controller;

import com.fonke.dto.BoardDto;
import com.fonke.entity.Board;
import com.fonke.service.BoardService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/api/boards")
    public Collection<BoardDto> findAll(){
        Iterable<Board> boards = this.boardService.findAll();
        List<BoardDto> boardDto = new ArrayList<>();
        boards.forEach(b-> boardDto.add(convertToDto(b)));
        return boardDto;
    }

    protected BoardDto convertToDto(Board board){
        BoardDto boardDto = modelMapper.map(board, BoardDto.class);
        return boardDto;
    }
}
