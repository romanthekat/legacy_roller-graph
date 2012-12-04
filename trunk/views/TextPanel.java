package views;

import java.awt.Color;

/**
 *
 * @author Kat
 */
public class TextPanel extends javax.swing.JPanel implements InnerPanelInterface {

    private Color enabledBackgroundColor = new Color(153,255,153);
    private Color disabledBackgroundColor = new Color(240, 240, 240);
    /**
     * Creates new form TextPanel
     */
    public TextPanel(String text) {
        initComponents();
        mainLabel.setText(text);
        setDisabled();
    }
    
    private TextPanel() {};

    public void setEnabled() {
        setBackground(enabledBackgroundColor);
    }
    
    public void setDisabled() {
        //стандартный фоновый цвет (среди констант его почему-то не нашёл)
        setBackground(disabledBackgroundColor);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(500, 55));
        setMinimumSize(new java.awt.Dimension(100, 50));
        setPreferredSize(new java.awt.Dimension(236, 55));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainLabel.setText("some text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(mainLabel)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        System.out.println("Inner panel with text "+mainLabel.getText()+" clicked.");
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mainLabel;
    // End of variables declaration//GEN-END:variables
}
