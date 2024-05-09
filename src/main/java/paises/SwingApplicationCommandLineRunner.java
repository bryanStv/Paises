package paises;

import paises.repository.*;
import paises.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.swing.*;
import java.awt.*;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */

@Component
public class SwingApplicationCommandLineRunner implements CommandLineRunner {

    private final PaisRepository paisRepository;

    @Autowired
    public SwingApplicationCommandLineRunner(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    @Override
    public void run(String... args) {
        //This boots up the GUI.
        //EventQueue.invokeLater(()  ->  JOptionPane.showMessageDialog(null, "FUNCIONA"));
        EventQueue.invokeLater(() -> new PaisUI(paisRepository).setVisible(true));
    }
}
