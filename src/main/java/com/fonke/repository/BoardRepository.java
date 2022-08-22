package com.fonke.repository;

import com.fonke.entity.Board;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BoardRepository extends PagingAndSortingRepository<Board, Long> {
}
