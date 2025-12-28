package pe.gob.sencico.gestion_mapa_aiquipa.service;

import java.util.List;
import pe.gob.sencico.gestion_mapa_aiquipa.model.GestionmapaModel;

public interface GestionmapaService {

    public List<GestionmapaModel> findAll();
    
    public GestionmapaModel findById(Long id);
    
    public void save(GestionmapaModel model);
    
    public void deleteById(Long id);
}