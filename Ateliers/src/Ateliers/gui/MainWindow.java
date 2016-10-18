package Ateliers.gui;

import java.awt.FlowLayout;
import Ateliers.domain.FruitBasketController;
import Ateliers.domain.FruitBasketController.FruitModes;
import java.awt.Point;

public class MainWindow extends javax.swing.JFrame {

    
    public FruitBasketController controller;
    public FruitModes selectedFruitCreationMode;
    
    public MainWindow() {
        controller = new FruitBasketController();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFruitButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        buttonTopPanel = buttonTopPanel = new javax.swing.JPanel(new FlowLayout(FlowLayout.LEFT))
        ;
        pommeButton = new javax.swing.JToggleButton();
        orangeButton = new javax.swing.JToggleButton();
        mainScrollPane = new javax.swing.JScrollPane();
        drawingPanel1 = new Ateliers.gui.DrawingPanel(this);
        topMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        createFruitButtonGroup.add(pommeButton);
        createFruitButtonGroup.add(orangeButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        buttonTopPanel.setPreferredSize(new java.awt.Dimension(400, 35));

        pommeButton.setText("Pomme");
        pommeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pommeButtonActionPerformed(evt);
            }
        });
        buttonTopPanel.add(pommeButton);

        orangeButton.setText("Orange");
        orangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeButtonActionPerformed(evt);
            }
        });
        buttonTopPanel.add(orangeButton);

        mainPanel.add(buttonTopPanel, java.awt.BorderLayout.NORTH);

        drawingPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout drawingPanel1Layout = new javax.swing.GroupLayout(drawingPanel1);
        drawingPanel1.setLayout(drawingPanel1Layout);
        drawingPanel1Layout.setHorizontalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        drawingPanel1Layout.setVerticalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        mainScrollPane.setViewportView(drawingPanel1);

        mainPanel.add(mainScrollPane, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        jMenuItem1.setText("Open");
        fileMenu.add(jMenuItem1);

        jMenuItem2.setText("Quit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        topMenuBar.add(fileMenu);

        editMenu.setText("Edit");
        topMenuBar.add(editMenu);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void pommeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pommeButtonActionPerformed
       
        this.setMode(FruitModes.APPLE);
    }//GEN-LAST:event_pommeButtonActionPerformed

    private void orangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeButtonActionPerformed
        
        this.setMode(FruitModes.ORANGE);
    }//GEN-LAST:event_orangeButtonActionPerformed

    private void drawingPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanel1MousePressed
        
         Point mousePoint = evt.getPoint();
         FruitBasketController.FruitModes actualMode = this.selectedFruitCreationMode;
         this.controller.addFruit(actualMode,mousePoint);
         drawingPanel1.repaint();
    }//GEN-LAST:event_drawingPanel1MousePressed
   
     public void setMode(FruitModes newMode) 
 {
     this.selectedFruitCreationMode = newMode;
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonTopPanel;
    private javax.swing.ButtonGroup createFruitButtonGroup;
    private Ateliers.gui.DrawingPanel drawingPanel1;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JToggleButton orangeButton;
    private javax.swing.JToggleButton pommeButton;
    private javax.swing.JMenuBar topMenuBar;
    // End of variables declaration//GEN-END:variables
}
