
package com.mycompany.ejer_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana3_InfoCarrera extends JFrame{

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
 
    public Ventana3_InfoCarrera (String title) throws HeadlessException {
        super(title);
        this.setSize(450,330);
        this.setLocation(410, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(9,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarBotones();
        this.iniciarCombo();
        this.iniciarCombo2();
        this.iniciarCombo3();
        this.iniciarCombo4();
        this.iniciarCombo5();
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

        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6)); 
        this.jPanel1.add(this.jPanelList.get(7)); 
        this.jPanel1.add(this.jPanelList.get(8)); 
    }
    
    public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel("INFORMACIÓN DE CARRERA "));
       this.jLabelList.add(new JLabel("Periodo Académico :"));
       this.jLabelList.add(new JLabel(" 2022-2022"));
       this.jLabelList.add(new JLabel("Carrera: *"));
       this.jLabelList.add(new JLabel("Modalidad: * "));
       this.jLabelList.add(new JLabel("Sede: *"));
       this.jLabelList.add(new JLabel("Campus: *"));
       this.jLabelList.add(new JLabel("Jornada: *"));
       this.jLabelList.add(new JLabel("Fecha de Registo:"));
       this.jLabelList.add(new JLabel("29/04/2022"));

       this.jPanelList.get(0).add(this.jLabelList.get(0));
       this.jPanelList.get(1).add(this.jLabelList.get(1));
       this.jPanelList.get(1).add(this.jLabelList.get(2));
       this.jPanelList.get(2).add(this.jLabelList.get(3));
       this.jPanelList.get(3).add(this.jLabelList.get(4));
       this.jPanelList.get(4).add(this.jLabelList.get(5)); 
       this.jPanelList.get(5).add(this.jLabelList.get(6)); 
       this.jPanelList.get(6).add(this.jLabelList.get(7)); 
       this.jPanelList.get(7).add(this.jLabelList.get(8)); 
       this.jPanelList.get(7).add(this.jLabelList.get(9)); 

       this.jPanelList.get(0).setBackground(Color.CYAN);
       this.jPanelList.get(1).setBackground(Color.WHITE);
       this.jPanelList.get(2).setBackground(Color.WHITE);
       this.jPanelList.get(3).setBackground(Color.WHITE);
       this.jPanelList.get(4).setBackground(Color.WHITE);
       this.jPanelList.get(5).setBackground(Color.WHITE);
       this.jPanelList.get(6).setBackground(Color.WHITE);
       this.jPanelList.get(7).setBackground(Color.WHITE);
       this.jPanelList.get(8).setBackground(Color.WHITE);
    }

    public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("ARQUITECTURA");
        this.jComboBox1.addItem("MECATRONICA");
        this.jComboBox1.addItem("COMPUTACION");
        this.jPanelList.get(2).add(this.jComboBox1);      
    }
    
    public void iniciarCombo2 (){
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("PRESENCIAL");
        this.jComboBox2.addItem("VIRTUAL");
        this.jPanelList.get(3).add(this.jComboBox2);
    }
    
    public void iniciarCombo3 (){
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("MATRIZ CUENCA");
        this.jComboBox3.addItem("MATRIZ QUITO");
        this.jComboBox3.addItem("MATRIZ GUAYAQUIL");
        this.jPanelList.get(4).add(this.jComboBox3);
    }
    
    public void iniciarCombo4 (){
        this.jComboBox4 = new JComboBox();
        this.jComboBox4.addItem("EL VECINO");
        this.jPanelList.get(5).add(this.jComboBox4);
    }
    public void iniciarCombo5 (){
        this.jComboBox5 = new JComboBox();
        this.jComboBox5.addItem("Seleccione una Opción");
        this.jComboBox5.addItem("DIURNA");
        this.jComboBox5.addItem("NOCTURNA");
        this.jPanelList.get(6).add(this.jComboBox5);
    }
    
     public void iniciarBotones(){
        this.jButtonList = new ArrayList<>(); 
        this.jButtonList.add(new JButton(" Siguiente"));  
        this.jPanelList.get(8).add(this.jButtonList.get(0));     
    }
}