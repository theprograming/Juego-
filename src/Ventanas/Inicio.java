
package Ventanas;

public final class Inicio extends javax.swing.JFrame {
    private static final long serialVersionUID=1L;
 Cargar_inciio  hilo;
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        hilo = new Cargar_inciio (Progreso);
        hilo.start();
        hilo= null;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Progreso = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Alex2_opt.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 440, -1));

        Progreso.setBackground(new java.awt.Color(102, 255, 102));
        Progreso.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Progreso.setForeground(new java.awt.Color(153, 153, 255));
        Progreso.setStringPainted(true);
        Progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgresoStateChanged(evt);
            }
        });
        getContentPane().add(Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 520, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pistas/883265372-640x640.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 590, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProgresoStateChanged
        if (Progreso.getValue()==100)
        {
            dispose ();
            ventana1 a = new ventana1 ();
            a.setVisible(true);
        }
    }//GEN-LAST:event_ProgresoStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
