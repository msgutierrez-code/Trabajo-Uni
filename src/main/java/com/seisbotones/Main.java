package com.seisbotones;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
 private JButton boton1, boton2, boton3, boton4, boton5, boton6;
 private JLabel label1;

 public Main(){
  setLayout(null);

  boton1 = new JButton("1");
  boton1.setBounds(10,100,60,30);
  add(boton1);
  boton1.addActionListener(this);

  boton2 = new JButton("2");
  boton2.setBounds(80,100,60,30);
  add(boton2);
  boton2.addActionListener(this);

  boton3 = new JButton("3");
  boton3.setBounds(150,100,60,30);
  add(boton3);
  boton3.addActionListener(this);

  boton4 = new JButton("4");
  boton4.setBounds(220,100,60,30);
  add(boton4);
  boton4.addActionListener(this);

  boton5 = new JButton("5");
  boton5.setBounds(10,140,60,30);
  add(boton5);
  boton5.addActionListener(this);

  boton6 = new JButton("6");
  boton6.setBounds(80,140,60,30);
  add(boton6);
  boton6.addActionListener(this);

  label1 = new JLabel("En espera...");
  label1.setBounds(10,10,300,30);
  add(label1);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    label1.setText("Owen");
  }
  if(e.getSource() == boton2){
    label1.setText("Daniel");
  }
  if(e.getSource() == boton3){
    label1.setText("Mariangel");
  }
  if(e.getSource() == boton4){
    label1.setText("Santiago");
  }
  if(e.getSource() == boton5){
    label1.setText("Felipe");
  }
  if(e.getSource() == boton6){
    label1.setText("Marlon");
  }
 }

 public static void main(String args[]){
  Main formulario1 = new Main();
  formulario1.setBounds(0,0,320,220);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}