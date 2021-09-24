package org.si5.cloud.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteurRepository extends JpaRepository<Compteur, Integer> { }
