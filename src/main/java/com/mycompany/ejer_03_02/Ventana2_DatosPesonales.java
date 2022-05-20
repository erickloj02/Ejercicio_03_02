
package com.mycompany.ejer_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana2_DatosPesonales extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
 
    public Ventana2_DatosPesonales (String title) throws HeadlessException {
        super(title);
        this.setSize(400, 310);
        this.setLocation(5, 290);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(10,2));
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Personal"));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
    }
    
    public void iniciarPaneles(){
       this.jPanelList = new ArrayList<>();
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanel1.add(this.jPanelList.get(0));
       this.jPanel1.add(this.jPanelList.get(1));
       this.jPanel1.add(this.jPanelList.get(2));
       this.jPanel1.add(this.jPanelList.get(3));
       this.jPanel1.add(this.jPanelList.get(4));
       this.jPanel1.add(this.jPanelList.get(5));
       this.jPanel1.add(this.jPanelList.get(6)); 
       this.jPanel1.add(this.jPanelList.get(7)); 
       this.jPanel1.add(this.jPanelList.get(8)); 
       this.jPanel1.add(this.jPanelList.get(9)); 
    }
    
    public void iniciarEtiquetas(){
       this.jLabelList= new ArrayList<>();
       this.jLabelList.add(new JLabel("Apellidos: "));
       this.jLabelList.add(new JLabel(" LOJANO COLLANTES "));
       this.jLabelList.add(new JLabel("Nombres:"));
       this.jLabelList.add(new JLabel(" ERICK LOJANO"));
       this.jLabelList.add(new JLabel("Nacionalidad:"));
       this.jLabelList.add(new JLabel(" ECUATORIANA"));
       this.jLabelList.add(new JLabel("Género:"));
       this.jLabelList.add(new JLabel("Masculino"));
       this.jLabelList.add(new JLabel("Correo electrónico personal:"));
       this.jLabelList.add(new JLabel(" ericklojano361@gmail.com"));
       this.jLabelList.add(new JLabel("Fecha Nacimiento: "));
       this.jLabelList.add(new JLabel("02-08-1999 "));
       this.jLabelList.add(new JLabel("Teléfono Domicilio:"));
       this.jLabelList.add(new JLabel("2845731 "));
       this.jLabelList.add(new JLabel("Teléfono Celular:"));
       this.jLabelList.add(new JLabel("09989795937"));
       this.jLabelList.add(new JLabel("Whatsapp:"));
         
       this.jPanelList.get(0).add(this.jLabelList.get(0));
       this.jPanelList.get(0).add(this.jLabelList.get(1));
       this.jPanelList.get(1).add(this.jLabelList.get(2));
       this.jPanelList.get(1).add(this.jLabelList.get(3));
       this.jPanelList.get(2).add(this.jLabelList.get(4));
       this.jPanelList.get(2).add(this.jLabelList.get(5));
       this.jPanelList.get(3).add(this.jLabelList.get(6));
       this.jPanelList.get(3).add(this.jLabelList.get(7));
       this.jPanelList.get(4).add(this.jLabelList.get(8));
       this.jPanelList.get(4).add(this.jLabelList.get(9));
       this.jPanelList.get(5).add(this.jLabelList.get(10));
       this.jPanelList.get(5).add(this.jLabelList.get(11));
       this.jPanelList.get(6).add(this.jLabelList.get(12));
       this.jPanelList.get(6).add(this.jLabelList.get(13));
       this.jPanelList.get(7).add(this.jLabelList.get(14));
       this.jPanelList.get(7).add(this.jLabelList.get(15));
       this.jPanelList.get(8).add(this.jLabelList.get(16));

       this.jPanelList.get(0).setBackground(Color.WHITE);
       this.jPanelList.get(1).setBackground(Color.WHITE);
       this.jPanelList.get(2).setBackground(Color.WHITE);
       this.jPanelList.get(3).setBackground(Color.WHITE);
       this.jPanelList.get(4).setBackground(Color.WHITE);
       this.jPanelList.get(5).setBackground(Color.WHITE);
       this.jPanelList.get(6).setBackground(Color.WHITE);
       this.jPanelList.get(7).setBackground(Color.WHITE);
       this.jPanelList.get(8).setBackground(Color.WHITE);
       this.jPanelList.get(9).setBackground(Color.WHITE);
    }
    
    public void iniciarTextos(){
       this.jTextFieldList = new ArrayList<>();
        
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());
       this.jTextFieldList.add(new JTextField());

       this.jTextFieldList.get(8).setColumns(15);
       this.jPanelList.get(8).add(this.jTextFieldList.get(8));
    } 
}
