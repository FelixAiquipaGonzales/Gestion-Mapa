package pe.gob.sencico.gestion_mapa_aiquipa.model;

public class GestionmapaModel {

    private Long id;

    private String titulo;

    private String descripcion;

    private String empresa;

    private String url;

    private String service = "WMS";

    private String version = "1.1.0";

    private String request = "GetMap";

    private String layers;

    private String styles;

    private Double longitudIzquierda = -81.32839259126409;

    private Double latitudIzquierda = -18.351232410195724;

    private Double longitudDerecha = -68.65339649897223;

    private Double latitudDerecha = -0.0386074385036425;

    private Integer width = 531;

    private Integer height = 768;

    private String srs = "EPSG:4326";

    private String format = "application/openlayers";

    private String urlcompleta;

    private String urlwfs;

    private String urlLegendGraphic;

    public GestionmapaModel() {
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

    public String getUrlcompleta() {
        return urlcompleta;
    }

    public void setUrlcompleta(String urlcompleta) {
        this.urlcompleta = urlcompleta;
    }

    public String getUrlwfs() {
        return urlwfs;
    }

    public void setUrlwfs(String urlwfs) {
        this.urlwfs = urlwfs;
    }

    public String getUrlLegendGraphic() {
        return urlLegendGraphic;
    }

    public void setUrlLegendGraphic(String urlLegendGraphic) {
        this.urlLegendGraphic = urlLegendGraphic;
    }

    @Override
    public String toString() {
        return "GestionmapaModel [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", empresa="
                + empresa + ", url=" + url
                + ", service=" + service + ", version=" + version + ", request=" + request + ", layers=" + layers
                + ", styles=" + styles + ", longitudIzquierda=" + longitudIzquierda + ", latitudIzquierda="
                + latitudIzquierda + ", longitudDerecha=" + longitudDerecha + ", latitudDerecha=" + latitudDerecha
                + ", width=" + width + ", height=" + height + ", srs=" + srs + ", format=" + format + ", urlcompleta="
                + urlcompleta + ", urlwfs=" + urlwfs + ", urlLegendGraphic=" + urlLegendGraphic + "]";
    }

}
