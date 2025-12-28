package pe.gob.sencico.gestion_mapa_aiquipa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gestionmapa", schema = "sigweb")
public class Gestionmapa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30, nullable = false)
	private String titulo;

	@Column(length = 60, nullable = false)
	private String descripcion;

	@Column(length = 90)
	private String empresa;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String url;

	@Column(length = 9)
	private String service = "WMS";

	@Column(length = 9)
	private String version = "1.1.0";

	@Column(length = 15)
	private String request = "GetMap";

	@Column(length = 120, nullable = false)
	private String layers;

	@Column(length = 60)
	private String styles;

	@Column(name = "long_izq")
	private Double longitudIzquierda = -81.32839259126409;

	@Column(name = "lat_izq")
	private Double latitudIzquierda = -18.351232410195724;

	@Column(name = "long_der")
	private Double longitudDerecha = -68.65339649897223;

	@Column(name = "lat_der")
	private Double latitudDerecha = -0.0386074385036425;

	private Integer width = 531;

	private Integer height = 768;

	@Column(name = "srs", length = 18)
	private String srs = "EPSG:4326";

	@Column(length = 64)
	private String format = "image/png";

	public Gestionmapa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getLayers() {
		return layers;
	}

	public void setLayers(String layers) {
		this.layers = layers;
	}

	public String getStyles() {
		return styles;
	}

	public void setStyles(String styles) {
		this.styles = styles;
	}

	public Double getLongitudIzquierda() {
		return longitudIzquierda;
	}

	public void setLongitudIzquierda(Double longitudIzquierda) {
		this.longitudIzquierda = longitudIzquierda;
	}

	public Double getLatitudIzquierda() {
		return latitudIzquierda;
	}

	public void setLatitudIzquierda(Double latitudIzquierda) {
		this.latitudIzquierda = latitudIzquierda;
	}

	public Double getLongitudDerecha() {
		return longitudDerecha;
	}

	public void setLongitudDerecha(Double longitudDerecha) {
		this.longitudDerecha = longitudDerecha;
	}

	public Double getLatitudDerecha() {
		return latitudDerecha;
	}

	public void setLatitudDerecha(Double latitudDerecha) {
		this.latitudDerecha = latitudDerecha;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getSrs() {
		return srs;
	}

	public void setSrs(String srs) {
		this.srs = srs;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "Gestionmapa [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", empresa=" + empresa
				+ ", url=" + url
				+ ", service=" + service + ", version=" + version + ", request=" + request + ", layers=" + layers
				+ ", styles=" + styles + ", longitudIzquierda=" + longitudIzquierda + ", latitudIzquierda="
				+ latitudIzquierda + ", longitudDerecha=" + longitudDerecha + ", latitudDerecha=" + latitudDerecha
				+ ", width=" + width + ", height=" + height + ", srs=" + srs + ", format=" + format + "]";
	}

}
