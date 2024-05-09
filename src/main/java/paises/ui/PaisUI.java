package paises.ui;

import javax.swing.*;

import paises.entity.Pais;
import paises.repository.PaisRepository;


public class PaisUI extends JFrame {
    private JTextField idField;
    private JTextField nameField;
    private JTextField poblacionField;
    private JPanel panel1;
    private Pais pais;

    public PaisUI(){
        setTitle("Book Maintenance");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        initComponents();
    }

    public PaisUI(PaisRepository paisRepository){
        setTitle("Book Maintenance");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        initComponents();

        this.pais = paisRepository.findFirstByOrderByIdAsc();
        //poblacionField = String.valueOf(this.pais.getPoblacion());
        updateData();
    }

    private void updateData(){
        idField.setText(Long.toString(this.pais.getId()));
        nameField.setText(this.pais.getNombre());

    }

    private void initComponents(){
        panel1 = new JPanel();
        idField = new JTextField(10);
        nameField = new JTextField(10);
        poblacionField = new JTextField(10);
        JLabel l;

        this.setLayout(null);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 500, 650);

        l = new JLabel("ID:");
        l.setBounds(10, 10, 70, 20);
        panel1.add(l);
        idField.setEnabled(false);
        idField.setBounds(10 + 80, 10, 200, 20);
        panel1.add(idField);

        l = new JLabel("Nombre:");
        l.setBounds(10, 40, 70, 20);
        panel1.add(l);
        nameField.setBounds(10 + 80, 40, 200, 20 );
        panel1.add(nameField);

        l = new JLabel("Poblacion:");
        l.setBounds(10, 70, 70, 20);
        panel1.add(l);
        poblacionField.setBounds(10 + 80, 70, 200, 20);
        panel1.add(poblacionField);
        this.add(panel1);
    }
}
