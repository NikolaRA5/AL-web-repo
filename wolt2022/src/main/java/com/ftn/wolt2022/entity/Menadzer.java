package com.ftn.wolt2022.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Menadzer extends Korisnik {
	@OneToOne(mappedBy = "menadzer", cascade = CascadeType.ALL)
    private Restoran restoran;
}
