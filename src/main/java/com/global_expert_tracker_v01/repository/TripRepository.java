package com.global_expert_tracker_v01.repository;

import com.global_expert_tracker_v01.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Репозиторий для работы с поездками экспертов.
 */
@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}