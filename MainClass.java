import javax.swing.*;
public class MainClass
{
    private static PrincipalWindow principal_window;
    public static void main(String[] args)
    {
        principal_window = new PrincipalWindow();
        principal_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}