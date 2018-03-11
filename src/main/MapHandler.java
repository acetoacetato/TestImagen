package main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MapHandler {

	private static String direccion = "IBC,valparaíso";
	
	public static ImageIcon cargaMapa() throws IOException {
		
		String path = "https://maps.googleapis.com/maps/api/staticmap?"
					  + "center="
					  + direccion
					  //+"&size=317x250"
					  +"&size=293x226"
					  +"&zoom=18"
					  +"&maptype=roadmap"
					  +"&key=AIzaSyC4ClGpPgudrfyIWrO528j9DxXLiLQ3KlU";
		
		
		URL url = new URL(path);
		BufferedImage imagen = ImageIO.read(url);
		return new ImageIcon(imagen);
				
	}
	
	public static ImageIcon cargaMapa(String dirección) throws IOException {
		
		String path = "https://maps.googleapis.com/maps/api/staticmap?"
					  + "center="
					  + dirección
					  //+"&size=317x250"
					  +"&size=293x226"
					  +"&zoom=18"
					  +"&maptype=roadmap"
					  +"&key=AIzaSyC4ClGpPgudrfyIWrO528j9DxXLiLQ3KlU";
		
		
		URL url = new URL(path);
		BufferedImage imagen = ImageIO.read(url);
		return new ImageIcon(imagen);
				
	}
	
	
	public static ImageIcon cargaMapa(String dirección, String[] puntos) throws IOException {
		//	TODO: AGREGAR EL PROCESO DE PONER PUNTOS EN LA URL
		String path = "https://maps.googleapis.com/maps/api/staticmap?"
					  + "center="
					  + dirección
					  //+"&size=317x250"
					  +"&size=293x226"
					  +"&zoom=18"
					  +"&maptype=roadmap"
					  +"&key=AIzaSyC4ClGpPgudrfyIWrO528j9DxXLiLQ3KlU";
		
		
		URL url = new URL(path);
		BufferedImage imagen = ImageIO.read(url);
		return new ImageIcon(imagen);
				
	}
	
}
