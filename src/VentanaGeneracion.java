import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class VentanaGeneracion extends JFrame{
    
    private JButton Salir;
    private JButton Generar;
    private JPanel panelMedio;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JScrollPane scrollTabla;
    private CuadradosMedios generado;

    public VentanaGeneracion(){
        super("Generador Medios Cuadrados");

        generado = new CuadradosMedios();

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(Color.decode("#E8F8F5"));
        panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));

        panelMedio =new JPanel();
        panelMedio.setLayout(new BoxLayout(panelMedio,BoxLayout.Y_AXIS));
        

        JLabel titulo = new JLabel("Generador de Números Aleatorios");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.decode("#1C2833"));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setBorder(new EmptyBorder(10, 0, 20, 0));


        JLabel labelNumero = new JLabel("Ingrese un número:");
        labelNumero.setFont(new Font("Arial", Font.PLAIN, 18));
        labelNumero.setForeground(Color.decode("#2C3E50"));
        labelNumero.setHorizontalAlignment(JLabel.CENTER);
        

        JTextField campoNumero = new JTextField(5);
        campoNumero.setFont(new Font("Arial", Font.PLAIN, 16));
        campoNumero.setMaximumSize(new Dimension(100,50));

        Generar = new JButton("Generar");
        Generar.setFont(new Font("Arial", Font.BOLD, 14));
        Generar.setBackground(Color.decode("#3498DB"));
        Generar.setForeground(Color.WHITE);
        Generar.setFocusPainted(false);
        Generar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    double dato=Double.parseDouble(campoNumero.getText());
                    generarTabla(dato);
                } catch (NumberFormatException w) {
                    w.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Ingrese un numero","ERROR",
                    JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });

        Salir = new JButton("Salir");
        Salir.setFont(new Font("Arial", Font.BOLD, 14));
        Salir.setBackground(Color.decode("#E74C3C"));
        Salir.setForeground(Color.WHITE);
        Salir.setFocusPainted(false);

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    new VentanaPrincipal();
                } catch (Exception w) {
                    w.printStackTrace();
                }
                
            }
        });
        modeloTabla = new DefaultTableModel(new Object[]{"i","Número", "Cuadrado", "Generado","Cuatro Digitos"}, 0);
        tabla = new JTable(modeloTabla);
        scrollTabla=new JScrollPane(tabla);
        scrollTabla.setPreferredSize(new Dimension(400,200));

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.decode("#E8F8F5"));
        panelBotones.add(Generar);
        panelBotones.add(Salir);
        panelMedio.add(labelNumero);
        panelMedio.add(campoNumero);
        panelMedio.add(panelBotones);
        panelMedio.add(panelBotones);
        panelMedio.setAlignmentY(CENTER_ALIGNMENT);

        panelPrincipal.add(titulo, BorderLayout.NORTH);
        panelPrincipal.add(panelMedio,BorderLayout.CENTER);
        panelPrincipal.add(scrollTabla,BorderLayout.SOUTH);
        

        add(panelPrincipal);
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(rootPane);
        setVisible(true);
    
    }
    public void generarTabla(double dato){
        CuadradosMedios generar = new CuadradosMedios();
        generar.setNumero(dato);
        modeloTabla.setRowCount(0);
        System.out.println(dato);
        double nCuadrado=dato*dato;
        double nGenerado=generar.generarNumero();
        double nuevoN=nGenerado*10000;
        modeloTabla.addRow(new Object[]{1,dato,nCuadrado,nGenerado,nuevoN});
        for (int i = 1; i < 40; i++) {
            dato=(double)modeloTabla.getValueAt(i-1, 4);
            generar.setNumero(dato);
            nCuadrado=(int)dato*dato;
            nGenerado=generar.generarNumero();
            nuevoN=nGenerado*10000;
            modeloTabla.addRow(new Object[]{i+1,(int)dato,nCuadrado,nGenerado,nuevoN});
            System.out.println(generado.generarNumero());
        }
    }

}

