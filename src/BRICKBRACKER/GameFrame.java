package BRICKBRACKER;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breackout Ball");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setBackground(Color.DARK_GRAY);
        obj.setVisible(true);
        obj.add(gameplay);
       

    }
    
}