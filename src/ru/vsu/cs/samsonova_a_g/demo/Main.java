package ru.vsu.cs.samsonova_a_g.demo;

import java.awt.EventQueue;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.UIManager;

import ru.vsu.cs.samsonova_a_g.util.SwingUtils;


public class Main
{

    public static void main(String[] args) throws Exception
    {
        Locale.setDefault(Locale.ROOT);
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        SwingUtils.setDefaultFont("Arial", 20);

        EventQueue.invokeLater(() ->
        {
            try {
                JFrame frameMain = new TreeDemoFrame();
                frameMain.setVisible(true);
                frameMain.setSize(1400, 800);
                frameMain.setLocationRelativeTo(null);
                frameMain.setResizable(false);
            } catch (Exception ex)
            {
                SwingUtils.showErrorMessageBox(ex);
            }
        });
    }
}
