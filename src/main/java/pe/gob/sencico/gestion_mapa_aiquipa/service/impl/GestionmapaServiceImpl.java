package pe.gob.sencico.gestion_mapa_aiquipa.service.impl;


import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.sencico.gestion_mapa_aiquipa.converter.GestionmapaConverter;
import pe.gob.sencico.gestion_mapa_aiquipa.entity.Gestionmapa;
import pe.gob.sencico.gestion_mapa_aiquipa.model.GestionmapaModel;
import pe.gob.sencico.gestion_mapa_aiquipa.repository.GestionmapaRepository;
import pe.gob.sencico.gestion_mapa_aiquipa.service.GestionmapaService;



@Service("gestionmapaService")
public class GestionmapaServiceImpl implements GestionmapaService{

	@Autowired
	@Qualifier("gestionmapaRepository")
	private GestionmapaRepository gestionmapaRepository;
	
	@Autowired
	@Qualifier("gestionmapaConverter")
	private GestionmapaConverter gestionmapaConverter;
	
	@Override
	@Transactional(readOnly = true)
	public List<GestionmapaModel> findAll() {
		List<Gestionmapa> entityList = gestionmapaRepository.findAll();
		List<GestionmapaModel> modelList = new LinkedList<>();
		for(Gestionmapa entity:entityList) {
			GestionmapaModel model = gestionmapaConverter.aModel(entity);
			modelList.add(model);
		}
		return modelList;
	}

	@Override
	@Transactional(readOnly = true)
	public GestionmapaModel findById(Long id) {
		Gestionmapa entity = gestionmapaRepository.findById(id).orElse(null);
		return gestionmapaConverter.aModel(entity);
	}

	@Override
	@Transactional
	public void save(GestionmapaModel model) {
		Gestionmapa entity = gestionmapaConverter.aEntity(model);
		gestionmapaRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		gestionmapaRepository.deleteById(id);
	}

}
