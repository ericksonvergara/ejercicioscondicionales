/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author usuario
 */
public class ejercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio4
     */
    public ejercicio4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        r1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Digite un numero de 3 cifras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 26, 180, 40));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 140, 30));

        enviar.setText("enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        getContentPane().add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, 30));
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        int num=Integer.parseInt(numero.getText());
        int n1, n2, n3 ;
        
        n1 = num / 100;
        
        n2 = (num % 100) / 10;
        
        n3 = num % 10;
        
        if ((n1 > n2 && n1 > n3) && (n2 > n3)){
            r1.setText("El numero mayor formado es: " + n1 + n2 + n3);
            r2.setText("El número menor formado es: " + n3 + n2 + n1);
        }
        else{
            if ((n1 > n2 && n1 > n3) && (n2 < n3)){
            r1.setText("El numero mayor formado es: " + n1 + n3 + n2);
            r2.setText("El número menor formado es: " + n2 + n3 + n1);
            }
            else{
                if((n2 > n1 && n2 > n3) && (n1 > n3)){
                r1.setText("El numero mayor formado es: " + n2 + n1 + n3);
                r2.setText("El número menor formado es: " + n3 + n1 + n2);
                }
                else{
                    if((n2 > n1 && n2 > n3) && (n1 < n3)){
                    r1.setText("El numero mayor formado es: " + n2 + n3 + n1);
                    r2.setText("El número menor formado es: " + n1 + n3 + n2);
                    }
                    else{
                        if((n3 > n2 && n3 > n1) && (n2 > n1)){
                        r1.setText("El numero mayor formado es: " + n3 + n2 + n1);
                        r2.setText("El número menor formado es: " + n1 + n2 + n3);
                        }
                        else{
                        r1.setText("El numero mayor formado es: " + n3 + n1 + n2);
                        r2.setText("El número menor formado es: " + n2 + n1 + n3);
                        }
                    }
                }
            }
        }
        
        //r1.setText(" " + n1 + " - " +  + n2 + " - " + n3);
        
        /*       
        if (num>resultado)
        {
          r1.setText("El numero mayor es: "+ num);
          r2.setText("El numero menor es: "+resultado);
        }
        else{
          r1.setText("El numero mayor es: "+ resultado);
          r2.setText("El numero menor es: "+ num);   
        }
        */
    }//GEN-LAST:event_enviarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    // End of variables declaration//GEN-END:variables
}
