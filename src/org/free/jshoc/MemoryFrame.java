/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MemoryFrame.java
 *
 * Created on 2010-5-30, 11:53:15
 */

package org.free.jshoc;

import java.util.Stack;

/**
 *
 * @author juntao
 */
public class MemoryFrame extends javax.swing.JFrame {
    private Stack memory;
    /** Creates new form MemoryFrame */
    public MemoryFrame(Stack stack) {
        this.memory = stack;
        initComponents();
        this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMemory = new javax.swing.JPanel();
        spMemory = new javax.swing.JScrollPane();
        listMemory = new javax.swing.JList();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        panelMemory.setName("panelMemory"); // NOI18N

        spMemory.setName("spMemory"); // NOI18N

        listMemory.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return memory.size(); }
            public Object getElementAt(int i) { return memory.get(i); }
        });
        listMemory.setName("listMemory"); // NOI18N
        spMemory.setViewportView(listMemory);
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(MemoryFrame.class);
        //org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(org.free.jshoc.Main.class).getContext().getResourceMap(MemoryFrame.class);
        btnCancel.setText(resourceMap.getString("btnCancel.text")); // NOI18N
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMemoryLayout = new javax.swing.GroupLayout(panelMemory);
        panelMemory.setLayout(panelMemoryLayout);
        panelMemoryLayout.setHorizontalGroup(
            panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spMemory, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMemoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel))
        );
        panelMemoryLayout.setVerticalGroup(
            panelMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMemoryLayout.createSequentialGroup()
                .addComponent(spMemory, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JList listMemory;
    private javax.swing.JPanel panelMemory;
    private javax.swing.JScrollPane spMemory;
    // End of variables declaration//GEN-END:variables

}
