import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class VentanaPrincipal extends JFrame{
    JButton botonGenerar;
    JLabel labelBienvenida;
    JPanel panelPrincipal;
    JLabel labelImagen;

    VentanaPrincipal(){
        super("Inicio");

        panelPrincipal=new JPanel(new BorderLayout());
        
        botonGenerar=new JButton("Iniciar Generación");
        ImageIcon IconoBotonGenerarOriginal = new ImageIcon("4to\\Simulacion\\Numeros_PseudoAleatorios\\reproducir.png");
        Image imagenBotonGenerarEscalada = IconoBotonGenerarOriginal.getImage().getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH);
        ImageIcon iconoBotonGeneracionEscalado = new ImageIcon(imagenBotonGenerarEscalada);
        botonGenerar.setIcon(iconoBotonGeneracionEscalado);
        botonGenerar.setBackground(Color.decode("#3498DB"));
        botonGenerar.setForeground(Color.WHITE);
        botonGenerar.setFocusPainted(false);
        botonGenerar.setBorderPainted(false);
        botonGenerar.setOpaque(true);

        botonGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose();
                    new VentanaGeneracion();
                } catch (Exception w) {
                    w.printStackTrace();
                }
            }
        });

        labelBienvenida=new JLabel("Bienvenido al Software Numeros Pseudoaleatorios");
        labelBienvenida.setFont(new Font("Arial", Font.BOLD, 24));
        
        
        ImageIcon IconoImagenCentroOriginal=new ImageIcon("4to\\Simulacion\\Numeros_PseudoAleatorios\\dados.jpg");
        labelImagen=new JLabel(IconoImagenCentroOriginal);
        labelImagen.setBounds(200, 100 ,1000, 1000);
        
        
        panelPrincipal.add(botonGenerar,BorderLayout.SOUTH);
        panelPrincipal.add(labelBienvenida, BorderLayout.NORTH);
        panelPrincipal.add(labelImagen,BorderLayout.CENTER);

        add(panelPrincipal);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
