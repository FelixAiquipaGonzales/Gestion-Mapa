package pe.gob.sencico.gestion_mapa_aiquipa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.gob.sencico.gestion_mapa_aiquipa.entity.Gestionmapa;

@Repository("gestionmapaRepository")
public interface GestionmapaRepository extends JpaRepository<Gestionmapa, Long>{

}