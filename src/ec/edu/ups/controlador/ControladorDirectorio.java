package ec.edu.ups.controlador;

import java.awt.List;
import java.io.File;

public class ControladorDirectorio {
    
    private String ruta;
    private File archivo;
    private File[] archivos;
    
    public ControladorDirectorio(){
	
    }
    
    public ControladorDirectorio(String ruta){
	this.ruta = ruta;
	archivo = new File(ruta);
	archivos = archivo.listFiles();
    }

    public String getRuta() {
	return ruta;
    }

    public void setRuta(String ruta) {
	this.ruta = ruta;
    }

    public File getArchivo() {
	return archivo;
    }

    public void setArchivo(File archivo) {
	this.archivo = archivo;
    }

    public File[] getArchivos() {
	return archivos;
    }

    public void setArchivos(File[] archivos) {
	this.archivos = archivos;
    }
    
}
