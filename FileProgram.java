import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileProgram
{
    private File file;
    public FileProgram()
    {
        
    }

    public void createFile()
    {
        String nombre = new JOptionPane().showInputDialog("Introduce el nombre del archivo");
        
        this.file = new File(nombre);
        try
        {
            this.file.createNewFile();
        }catch(IOException e)
        {
            System.out.println("No se ha creado el archivo");
        }
    }
}