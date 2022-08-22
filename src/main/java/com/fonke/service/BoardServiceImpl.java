package com.fonke.service;

import com.fonke.entity.Board;
import com.fonke.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Iterable<Board> findAll() {
        return boardRepository.findAll();
    }
}
