package pe.gob.sencico.gestion_mapa_aiquipa.controller;

import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import pe.gob.sencico.gestion_mapa_aiquipa.model.FormatImage;
import pe.gob.sencico.gestion_mapa_aiquipa.model.GestionmapaModel;
import pe.gob.sencico.gestion_mapa_aiquipa.service.GestionmapaService;

@Controller
@RequestMapping("/galeria")
@SessionAttributes("gestionmapa")
public class GestionmapaController {

	private static final Logger logger = LoggerFactory.getLogger(GestionmapaController.class);

	@Autowired
	@Qualifier("gestionmapaService")
	private GestionmapaService gestionmapaService;

	@GetMapping("/show")
	public String listMapas(Model model) {
		List<GestionmapaModel> listModel = gestionmapaService.findAll();
		model.addAttribute("gestionmap", listModel);
		return "mapQuery";
	}

	@GetMapping("/add")
	public String add(Model model) {
		GestionmapaModel model_default = new GestionmapaModel();

		List<FormatImage> listFormatImage = new LinkedList<>();

		listFormatImage.add(new FormatImage("image/png"));
		listFormatImage.add(new FormatImage("image/png8"));
		listFormatImage.add(new FormatImage("image/jpeg"));
		listFormatImage.add(new FormatImage("image/gif"));
		listFormatImage.add(new FormatImage("image/svg"));

		model.addAttribute("gestionmap", model_default);
		model.addAttribute("listFormat", listFormatImage);
		return "mapForm";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {

		List<FormatImage> listFormatImage = new LinkedList<>();

		listFormatImage.add(new FormatImage("image/png"));
		listFormatImage.add(new FormatImage("image/png8"));
		listFormatImage.add(new FormatImage("image/jpeg"));
		listFormatImage.add(new FormatImage("image/gif"));
		listFormatImage.add(new FormatImage("image/svg"));

		model.addAttribute("gestionmap", gestionmapaService.findById(id));
		model.addAttribute("flag", "actualizacion");
		model.addAttribute("listFormat", listFormatImage);
		return "mapForm";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("gestionmap") GestionmapaModel gestionmapaModel) {
		gestionmapaService.save(gestionmapaModel);
		return "redirect:/galeria/show";
	}

	@GetMapping("/del/{id}")
	public String del(@PathVariable Long id) {
		gestionmapaService.deleteById(id);
		return "redirect:/galeria/show";
	}

	@GetMapping("/health")
	public ResponseEntity<String> health() {
		logger.info("Health check solicitado");
		return ResponseEntity.ok("Servicio de upload activo");
	}

	// Para ver la galeria de mapas

	@GetMapping("/view")
	public String listarMapas(Model model) {
		List<GestionmapaModel> listModel = gestionmapaService.findAll();

		model.addAttribute("listmapas", listModel);
		return "mapas";
	}

	@GetMapping("/showmap/{id}")
	public String verMapa(@PathVariable Long id, Model model) {
		GestionmapaModel modelgm = gestionmapaService.findById(id);
		model.addAttribute("mapa", modelgm);
		return "viewmap";
	}

}
