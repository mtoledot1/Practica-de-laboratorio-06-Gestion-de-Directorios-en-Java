package ec.edu.ups.controlador;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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

    public boolean setRuta(String ruta) {
	this.ruta = ruta;
	archivo = new File(ruta);
	archivos = archivo.listFiles();
	if(archivo.exists())
	    if(archivo.isDirectory())
		return true;
	return false;
    }

    public File getArchivo() {
	return archivo;
    }

    public void actualizarArchivos(){
	archivos = archivo.listFiles();
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
    
    public List<String> listarArchivos(){
	List<String> lista = new ArrayList<>();
	for (File a : archivos) {
	    if(a.isFile() && !a.isHidden())
		lista.add(a.getName());
	}
	return lista;
    }
    
    public List<String> listarArchivosOcultos(){
	List<String> lista = new ArrayList<>();
	for (File a : archivos) {
	    if(a.isFile() && a.isHidden())
		lista.add(a.getName());
	}
	return lista;
    }
	
    public List<String> listarDirectorios(){
	List<String> lista = new ArrayList<>();
	for (File a : archivos) {
	    if(a.isDirectory()&& !a.isHidden())
		lista.add(a.getName());
	}
	return lista;
    }
    
    public List<String> listarDirectoriosOcultos(){
	List<String> lista = new ArrayList<>();
	for (File a : archivos) {
	    if(a.isDirectory()&& a.isHidden())
		lista.add(a.getName());
	}
	return lista;
    }
    
    public void crearDirectorio(String nombre, boolean directorio) throws IOException{
	File nuevo = new File(ruta+"/"+nombre);
	if(directorio)
	    nuevo.mkdir();
	else
	    nuevo.createNewFile();    
    }
    
    public void eliminarDirectorio(String nombre) throws IOException{
	File nuevo = new File(nombre);
	if(nuevo.isFile())
	    nuevo.delete();
	else{
	    eliminar(nuevo);
	    nuevo.delete();
	}
    }
    
    public void eliminar(File directorio){
	for(File f : directorio.listFiles()){
	    if(f.isFile())
		f.delete();
	    else{
		eliminar(f);
		f.delete();
	    }
	}
    }
    
    public void renombrarDirectorio(String actual, String nuevo) throws IOException{
	File arch = new File(actual);
	arch.renameTo(new File(nuevo));
    }
    
    public String mostrarInformacion(String nombre){
	File nuevo = new File(nombre);
	String informacion = nuevo.getAbsolutePath();
	double bytes = 0;
	if(nuevo.isFile())
	    bytes = nuevo.length();
	else
	    bytes = tamanioDirectorio(nuevo);
	
	int cont = 0;
	while(bytes >= 1024){
	    bytes/=1024;
	    cont++;
	}
	informacion += "\n" + bytes;
	switch(cont){
	    case 0:
		informacion += " bytes";
		break;
	    case 1:
		informacion += " KB";
		break;
	    case 2:
		informacion += " MB";
		break;
	    case 3:
		informacion += " GB";
		break;
	    case 4:
		informacion += " TB";
		break;
	    case 5:
		informacion += " PB";
		break;
	    case 6:
		informacion += " EB";
		break;
	    case 7:
		informacion += " ZB";
		break;
	    case 8:
		informacion += " YB";
		break;
	}
	
	if(nuevo.canRead())
	    informacion += "\nSe puede leer";
	else
	    informacion += "\nNo se puede leer";
	
	if(nuevo.canWrite())
	    informacion += "\nSe puede escribir";
	else
	    informacion += "\nNo se puede ecribir";
	
	LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(nuevo.lastModified()), ZoneId.systemDefault());
	informacion += "\n" + date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	
	return informacion;
    }
    
    public double tamanioDirectorio(File directorio){
	double tam = 0;
	for(File f : directorio.listFiles()){
	    if(f.isFile())
		tam += f.length();
	    else
		tam += tamanioDirectorio(f);
	}
	return tam;
    }
}
