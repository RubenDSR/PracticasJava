import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

/*
    Crea la ventana principal del programa
*/
public class PrincipalWindow extends JFrame
{
    private JPanel lamina;  // Lamina principal de la ventana

    public PrincipalWindow()
    {
        // Bloque basico de la ventana principal
        setTitle("Principal Window");
        setBounds( 800, 400, 600, 600 );
        setVisible(true);
        this.lamina = new JPanel();
        add(this.lamina);

        // Cuadro de texto central de la pantalla.....continuar desde aqui....
        JTextArea text_area = new JTextArea();
        this.lamina.setLayout(new BorderLayout());
        this.lamina.add(text_area, BorderLayout.SOUTH);

        //Barra principal del programa
        JMenuBar barra = new JMenuBar();
        this.lamina.add(barra);

        //Menu de la barra principal
        JMenu menu = new JMenu("File");
        barra.add(menu);

        //Menu de archivo
        JMenuItem file = new JMenuItem("New File");
        file.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    FileProgram file = new FileProgram();
                    file.readFile();
                }
            }
        );

        menu.add(file);

        //Menu de opciones
        JMenu opciones = new JMenu("Opciones");
        barra.add(opciones);
    }
}
