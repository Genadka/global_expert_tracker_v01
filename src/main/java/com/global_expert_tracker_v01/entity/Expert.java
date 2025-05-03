package com.global_expert_tracker_v01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Сущность, представляющая эксперта, который может быть назначен на поездки.
 * Эксперт может быть ограничен перемещениями только по территории России.
 */
@Entity
@Table(name = "expert")  // Имя таблицы в единственном числе
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Expert {

    /**
     * Уникальный идентификатор эксперта.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Имя эксперта.
     */
    private String firstName;

    /**
     * Фамилия эксперта.
     */
    private String lastName;

    /**
     * Отчество эксперта.
     */
    private String fatherName;

    /**
     * Флаг, указывающий, ограничен ли эксперт только перемещениями по России.
     * Если true, то эксперт может ездить только по России. Если false, то эксперт может выезжать за рубеж.
     */
    private boolean canTravelWithinRussiaOnly;
}
