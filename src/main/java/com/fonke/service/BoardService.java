package com.fonke.service;

import com.fonke.entity.Board;

public interface BoardService {

    Iterable<Board> findAll();
}
