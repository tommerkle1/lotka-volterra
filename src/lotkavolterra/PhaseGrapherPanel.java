/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotkavolterra;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Tom
 */
public class PhaseGrapherPanel extends LVPanel {

    public PhaseGrapherPanel(DataPairList list) {
        super(list);
        
    }

    public void drawPoints(Graphics g) {
        System.out.println("" + list.hashCode());
        if(list.size() == 0){return;}
        
        g.setColor(Color.blue);
        for (int i = 1; i < list.size(); i++) {
            DataPair nextPair = list.get(i);
            g.fillOval(xOf(nextPair.getH()), yOf(nextPair.getP()), 5, 5);
        }
        
    }

    int xOf(int h) {
        return left + w * h / hMax;
    }

    int yOf(int p) {
        return down - ht * p / pMax;
    }

    public void setList(DataPairList list){
        this.list = list;
        
    }




    /**
     * Creates new form PhaseGrapherPanel
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
