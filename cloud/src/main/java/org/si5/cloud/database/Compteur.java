package org.si5.cloud.database;

import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compteur")
public class Compteur {

    @Id
    @Column(name = "id_compteur")
    private int id = 1;

    @Column(name = "value_compteur", columnDefinition = "int not null default 0")
    int compteur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
