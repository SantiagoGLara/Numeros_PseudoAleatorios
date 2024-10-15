import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Dimension;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
public class VentanaGeneracion extends JFrame{

    JButton Salir;
    JButton Generar;
    JPanel panelPrincipal;
    JLabel titulo;
    JTextField campoNumero;
    JPanel panelBotones;
    JPanel panelMedio;

    public VentanaGeneracion(){
        super("Generador Medios Cuadrados");

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(Color.decode("#E8F8F5"));
        panelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));

        panelMedio =new JPanel();
        panelMedio.setLayout(new BoxLayout(panelMedio,BoxLayout.Y_AXIS));
        panelMedio.setAlignmentY(LEFT_ALIGNMENT);

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

        Salir = new JButton("Salir");
        Salir.setFont(new Font("Arial", Font.BOLD, 14));
        Salir.setBackground(Color.decode("#E74C3C"));
        Salir.setForeground(Color.WHITE);
        Salir.setFocusPainted(false);

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(Color.decode("#E8F8F5"));
        panelBotones.add(Generar);
        panelBotones.add(Salir);
        panelMedio.add(campoNumero);
        panelMedio.add(panelBotones);
        panelMedio.add(panelBotones);

        panelPrincipal.add(titulo, BorderLayout.NORTH);
        panelPrincipal.add(panelMedio,BorderLayout.CENTER);
        

        add(panelPrincipal);
        
        setLocationRelativeTo(null);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    
    }
    
}

