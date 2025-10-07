package es.etg.psp.calc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fichero {

    public static final String FICHERO = "datos.txt";

    public static void guardar(String datos) throws IOException{
        File fich = new File(FICHERO);
        FileOutputStream fout = new FileOutputStream(fich);
        fout.write(datos.getBytes());
        fout.close();
    }

    public static String leer() throws IOException{
        File fich = new File(FICHERO);
        FileInputStream fin = new FileInputStream(fich);
        String data = new String(fin.readAllBytes());
        fin.close();
        return data;
    }
    
}
