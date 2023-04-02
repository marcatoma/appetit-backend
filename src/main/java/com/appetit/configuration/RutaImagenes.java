package com.appetit.configuration;

import java.io.File;

public class RutaImagenes {
	// public static final String RUTA_PRODUCTOS = "C:\\Users\\MARCATOMA\\Documents\\Springboot\\imagenes\\uploads\\imgproductos";
	//public static final String RUTA_CATEGORIAS = "C:\\Users\\Marcatoma\\Documents\\Springboot\\imagenes\\uploads\\imgcategorias";
	public static final String RUTA_CATEGORIAS = new File("imagenes/imgcategorias").getAbsolutePath();
	public static final String RUTA_PRODUCTOS = new File("imagenes/productos").getAbsolutePath();
}
