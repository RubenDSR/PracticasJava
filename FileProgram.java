import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/*
    Gestiona el CRUD de tipos de archivos
*/
public class FileProgram
{
    private File file;
    public FileProgram()
    {
        
    }

    /*
        Crea un showinputdialog con el mensaje introducido como parametro
    */
    public String getText(String text)
    {
        String txt = new JOptionPane().showInputDialog(text);
        return txt;
    }

    /*
        Crea los diferentes archivos del programa en la ruta por defecto
    */
    public void createFile()
    {
        
        this.file = new File(getText("Introduce el nombre del archivo"));
        try
        {
            this.file.createNewFile();
        }catch(IOException e)
        {
            System.out.println("No se ha creado el archivo");
        }
    }

    /*
        Lee los archivos del programa
    */
   public void readFile()
   {
    try(BufferedReader lector = new BufferedReader(new FileReader(getText("Introduce la ruta del archivo"))))
    {
        String linea;
        while((linea = lector.readLine())!=null)
        {
            System.out.println(linea);
        }
    }catch(IOException e)
    {
        System.out.println("Ocurrio un error" + e.getMessage());
    }
   }

}