package Formulario;
import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame
{
    //se declaran los elementos graficos
    private JTextField txtNombre, txtApellido;
    private JLabel lblNombre, lblApellido;
    private JTextArea parrafo;
    private JButton btnGuardar, btnMostrar;
    private JPanel p1;

    
    public Formulario()
    {   
        // propiedades básicas de la ventana
        this.setTitle("Formulario 1");
        this.setVisible(true);
        this.setSize(400,200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false); //no se puede cambiar el tamaño de la ventana
        
        p1=new JPanel(); // se define el elemento JPanel que contiene los elementos definidos inicialmente
        
        p1.setLayout(new GridLayout(4,2));
        p1.setPreferredSize(new Dimension(0,130));
        p1.setBackground(Color.red);
                    
        this.add(p1);
        
               
        lblNombre= new JLabel("Nombre");
        txtNombre= new JTextField("");
        lblApellido= new JLabel("Apellidos");
        txtApellido= new JTextField("");
        parrafo=new JTextArea("");     
        btnGuardar= new JButton("Guardar");
        btnMostrar= new JButton("Mostrar");
        
        p1.add(lblNombre);
        p1.add(txtNombre);
        p1.add(lblApellido);
        p1.add(txtApellido);
        
        p1.add(btnGuardar);
        p1.add(btnMostrar);
        p1.add(parrafo);
                
       
    }
    
        
        public static void main(String[]args){
        Formulario f1= new Formulario();
     
    }
}
