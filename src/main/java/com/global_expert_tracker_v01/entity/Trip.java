package com.global_expert_tracker_v01.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Сущность, представляющая поездку эксперта.
 * Поездка включает в себя дату выезда, страну/регион и связанного с ней эксперта.
 */
@Entity
@Table(name = "trip")  // Имя таблицы в единственном числе
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    /**
     * Уникальный идентификатор поездки.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Дата выезда эксперта в поездку.
     */
    private LocalDate departureDate;

    /**
     * Страна или регион РФ, куда отправляется эксперт.
     * Если эксперт ограничен поездками по России, это поле должно содержать только территорию России.
     */
    private String countryOrRegion;

    /**
     * Эксперт, связанный с поездкой.
     * Один эксперт может иметь несколько поездок.
     */
    @OneToOne
    private Expert expert;
}