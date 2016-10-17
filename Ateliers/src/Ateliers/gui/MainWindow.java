
package Ateliers.gui;

import java.awt.FlowLayout;

public class MainWindow extends javax.swing.JFrame {

 
    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFruitButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        buttonTopPanel = new javax.swing.JPanel(new FlowLayout(FlowLayout.LEFT));
        pommeButton = new javax.swing.JToggleButton();
        orangeButton = new javax.swing.JToggleButton();
        topMenuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuItemOpen = new javax.swing.JMenuItem();
        menuItemQuit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();

        createFruitButtonGroup.add(pommeButton);
        createFruitButtonGroup.add(orangeButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.BorderLayout());

        buttonTopPanel.setPreferredSize(new java.awt.Dimension(400, 35));

        pommeButton.setText("Pomme");
        buttonTopPanel.add(pommeButton);

        orangeButton.setText("Orange");
        buttonTopPanel.add(orangeButton);

        jMenu3.setText("File");

        menuItemOpen.setText("Open");
        jMenu3.add(menuItemOpen);

        menuItemQuit.setText("Quit");
        menuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemQuitActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemQuit);

        topMenuBar.add(jMenu3);

        menuEdit.setText("Edit");
        topMenuBar.add(menuEdit);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuItemQuitActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonTopPanel;
    private javax.swing.ButtonGroup createFruitButtonGroup;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenuItem menuItemOpen;
    private javax.swing.JMenuItem menuItemQuit;
    private javax.swing.JToggleButton orangeButton;
    private javax.swing.JToggleButton pommeButton;
    private javax.swing.JMenuBar topMenuBar;
    // End of variables declaration//GEN-END:variables
}
