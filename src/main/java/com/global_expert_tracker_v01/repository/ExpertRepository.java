package com.global_expert_tracker_v01.repository;

import com.global_expert_tracker_v01.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с экспертами.
 */
@Repository
public interface ExpertRepository extends JpaRepository<Expert, Long> {

    //нужен лист экспертов которые свободны на запрашиваемую дату и которые свободны на предыдущий день
    //и которые рядом с местом выезда
}