package com.raj.DataBaseWithDTO.model;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass // pozwala na mapowanie jej przez dziecko czyli tak naprawdę dziedziczy w bazie - potrebne do bazy
public class EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
