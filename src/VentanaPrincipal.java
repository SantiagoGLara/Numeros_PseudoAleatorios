import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;

public class VentanaPrincipal extends JFrame{
    JButton botonGenerar;
    JLabel labelBienvenida;
    JPanel panelPrincipal;
    JLabel labelImagen;

    VentanaPrincipal(){
        super("Inicio");

        panelPrincipal=new JPanel(new BorderLayout());
        
        botonGenerar=new JButton("Iniciar Generación");
        ImageIcon IconoBotonGenerarOriginal = new ImageIcon("reproducir2.png");
        Image imagenBotonGenerarEscalada = IconoBotonGenerarOriginal.getImage().getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH);
        ImageIcon iconoBotonGeneracionEscalado = new ImageIcon(imagenBotonGenerarEscalada);
        botonGenerar.setIcon(iconoBotonGeneracionEscalado);

        labelBienvenida=new JLabel("Bienvenido al Software Numeros Pseudoaleatorios");
        labelBienvenida.setFont(new Font("Arial", Font.BOLD, 24));
        
        
        ImageIcon IconoImagenCentroOriginal=new ImageIcon("dados.jpg");
        labelImagen=new JLabel(IconoImagenCentroOriginal);
        
        
        panelPrincipal.add(botonGenerar,BorderLayout.SOUTH);
        panelPrincipal.add(labelBienvenida, BorderLayout.NORTH);
        panelPrincipal.add(labelImagen,BorderLayout.CENTER);

        add(panelPrincipal);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
