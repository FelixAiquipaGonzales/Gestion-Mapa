package pe.gob.sencico.gestion_mapa_aiquipa.converter;

import pe.gob.sencico.gestion_mapa_aiquipa.entity.Gestionmapa;
import pe.gob.sencico.gestion_mapa_aiquipa.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}
