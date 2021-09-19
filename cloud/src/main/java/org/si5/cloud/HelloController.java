package org.si5.cloud;

import org.si5.cloud.database.Compteur;
import org.si5.cloud.database.CompteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    CompteurRepository compteurRepository;

    @GetMapping("/")
    public String index() {
        Compteur compteur;

        if(compteurRepository.existsById(1)){
            compteur = compteurRepository.getOne(1);
        }
        else{
            compteur = new Compteur();
        }

        compteur.setCompteur(compteur.getCompteur()+1);
        compteurRepository.save(compteur);

        return "Hello World ! Visitor n° "+compteur.getCompteur();
    }

    public CompteurRepository getCompteurRepository() {
        return compteurRepository;
    }

    public void setCompteurRepository(CompteurRepository compteurRepository) {
        this.compteurRepository = compteurRepository;
    }
}