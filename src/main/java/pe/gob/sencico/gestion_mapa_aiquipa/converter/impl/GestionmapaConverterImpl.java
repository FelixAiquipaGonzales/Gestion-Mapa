package pe.gob.sencico.gestion_mapa_aiquipa.converter.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import pe.gob.sencico.gestion_mapa_aiquipa.converter.GestionmapaConverter;
import pe.gob.sencico.gestion_mapa_aiquipa.entity.Gestionmapa;
import pe.gob.sencico.gestion_mapa_aiquipa.model.GestionmapaModel;



@Component("gestionmapaConverter")
public class GestionmapaConverterImpl implements GestionmapaConverter{

	@Override
	public Gestionmapa aEntity(GestionmapaModel model) {
		Gestionmapa entity = new Gestionmapa();
		BeanUtils.copyProperties(model,entity);
		return entity;
	}

	@Override
	public GestionmapaModel aModel(Gestionmapa entity) {
		GestionmapaModel model = new GestionmapaModel();
		BeanUtils.copyProperties(entity,model);
		//Falta agregar mas campos
		model.setUrlcompleta(entity.getUrl()+"service="+entity.getService()+"&version="+entity.getVersion()+"&request="+entity.getRequest()+"&layers="+entity.getLayers()+"&bbox="+entity.getLongitudIzquierda()+","+entity.getLatitudIzquierda()+","+entity.getLongitudDerecha()+","+entity.getLatitudDerecha()+"&width="+entity.getWidth()+"&height="+entity.getHeight()+"&srs="+entity.getSrs()+"&styles=&format="+entity.getFormat());
		model.setUrlLegendGraphic(entity.getUrl()+"REQUEST=GetLegendGraphic&VERSION=1.0.0&FORMAT=image/png&WIDTH=20&HEIGHT=20&LAYER="+entity.getLayers());
		model.setUrlwfs(entity.getUrl().replaceAll("wms", "ows")+"service=WFS&version=1.0.0&request=GetFeature&typeName="+entity.getLayers()+"&maxFeatures=1000000&outputFormat=SHAPE-ZIP");
		
		return model;
	}

}
