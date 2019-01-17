package sql.java;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

<<<<<<< HEAD
public class sql2 extends javax.swing.JFrame {
DefaultTableModel model=new DefaultTableModel();

public sql2() {
    initComponents();
    model.addColumn("PRODUCTO");
    model.addColumn("MODELO");
    model.addColumn("CANTIDAD");
    model.addColumn("PRECIO");
    this.Tabla.setModel(model);

    RestrictedTextField restricted = new RestrictedTextField(campocedula);
    restricted.setLimit(8);
    restricted.setOnlyNums(true);

=======
public class sql2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Bandai Ratas");
	System.out.println("Bandai putos amos");
	}
	
>>>>>>> branch 'master' of https://github.com/adrianQuintanaRodas/cosas-sql.git
}


@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    Agregar = new javax.swing.JButton();
    Eliminar = new javax.swing.JButton();
    Salir = new javax.swing.JButton();
    Guardar = new javax.swing.JButton();
    jScrollPane7 = new javax.swing.JScrollPane();
    Tabla = new javax.swing.JTable();
    jLabel8 = new javax.swing.JLabel();
    camponombre = new javax.swing.JTextField();
    campodireccion = new javax.swing.JTextField();
    campocedula = new javax.swing.JTextField();
    campotelefono = new javax.swing.JTextField();
    jSeparator3 = new javax.swing.JSeparator();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("PEDIDO RC");
    setBackground(new java.awt.Color(51, 51, 255));
    setBounds(new java.awt.Rectangle(6, 6, 3, 3));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setForeground(new java.awt.Color(51, 51, 255));
    setIconImages(null);
    setSize(new java.awt.Dimension(0, 0));

    jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(162, 4, 75));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("REALICE SU PEDIDO");
    jLabel1.setToolTipText("");

    jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
    jLabel2.setText("DATOS DEL CLIENTE");

    jLabel3.setText("Nombre y Apellido:");

    jLabel4.setText("Dirección de Entrega:");

    jLabel5.setText("Cedúla:");

    jLabel6.setText("Telefono:");

    jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
    jLabel7.setText("PRODUCTOS A PEDIR");

    Agregar.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
    Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedido/añadirprod.png"))); // NOI18N
    Agregar.setBorder(null);
    Agregar.setBorderPainted(false);
    Agregar.setContentAreaFilled(false);
    Agregar.setFocusPainted(false);
    Agregar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AgregarActionPerformed(evt);
        }
    });

    Eliminar.setBackground(javax.swing.UIManager.getDefaults().getColor("PasswordField.selectionBackground"));
    Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedido/borrarprod.png"))); // NOI18N
    Eliminar.setBorder(null);
    Eliminar.setBorderPainted(false);
    Eliminar.setContentAreaFilled(false);
    Eliminar.setFocusPainted(false);
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            EliminarActionPerformed(evt);
        }
    });

    Salir.setBackground(java.awt.Color.gray);
    Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedido/salir.png"))); // NOI18N
    Salir.setBorder(null);
    Salir.setBorderPainted(false);
    Salir.setContentAreaFilled(false);
    Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    Salir.setFocusPainted(false);
    Salir.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            SalirMouseClicked(evt);
        }
    });
    Salir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SalirActionPerformed(evt);
        }
    });

    Guardar.setBackground(java.awt.Color.gray);
    Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedido/guardar (2).png"))); // NOI18N
    Guardar.setBorder(null);
    Guardar.setBorderPainted(false);
    Guardar.setContentAreaFilled(false);
    Guardar.setFocusPainted(false);
    Guardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            GuardarActionPerformed(evt);
        }
    });

    Tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Tabla.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
        }
    ));
    jScrollPane7.setViewportView(Tabla);

    camponombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    camponombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    camponombre.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            camponombreActionPerformed(evt);
        }
    });
    camponombre.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            camponombreKeyTyped(evt);
        }
    });

    campodireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campodireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    campodireccion.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            campodireccionKeyTyped(evt);
        }
    });

    campocedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campocedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    campocedula.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            campocedulaActionPerformed(evt);
        }
    });
    campocedula.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            campocedulaKeyTyped(evt);
        }
    });

    campotelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    campotelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    campotelefono.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            campotelefonoActionPerformed(evt);
        }
    });
    campotelefono.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            campotelefonoKeyTyped(evt);
        }
    });

    jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel9)
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jLabel10)
            .addGap(153, 153, 153)
            .addComponent(jLabel1))
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jLabel2))
        .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(jLabel3)
            .addGap(28, 28, 28)
            .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(jLabel5)
            .addGap(91, 91, 91)
            .addComponent(campocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(349, 349, 349)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(jLabel4)
            .addGap(12, 12, 12)
            .addComponent(campodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(jLabel6)
            .addGap(81, 81, 81)
            .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jLabel7))
        .addGroup(layout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Agregar)
                .addComponent(Eliminar)))
        .addGroup(layout.createSequentialGroup()
            .addGap(146, 146, 146)
            .addComponent(Guardar)
            .addGap(30, 30, 30)
            .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addGap(2, 2, 2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel10))
                .addComponent(jLabel1))
            .addGap(12, 12, 12)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(jLabel2)
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel3))
                .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel5))
                .addComponent(campocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(17, 17, 17)
            .addComponent(jLabel8)
            .addGap(8, 8, 8)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel4))
                .addComponent(campodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabel6))
                .addComponent(campotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(34, 34, 34)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6)
            .addComponent(jLabel7)
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Guardar)
                .addComponent(Salir)))
    );

    pack();
}// </editor-fold>                        

private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {                                        

}                                       

private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {                                         
    int eli=Tabla.getSelectedRowCount();
    if(eli>0){
        model.removeRow(eli);
    }else{
        JOptionPane.showMessageDialog(null, "No hay productos que eliminar");
    }     
}                                        

private void SalirActionPerformed(java.awt.event.ActionEvent evt) {                                      
    System.exit(0);
}                                     

private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {                                        
    // TODO add your handling code here:
}                                       

private void SalirMouseClicked(java.awt.event.MouseEvent evt) {                                   

}                                  

private void campocedulaActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // TODO add your handling code here:
}                                           

private void campotelefonoActionPerformed(java.awt.event.ActionEvent evt) {                                              

}                                             

private void camponombreActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // TODO add your handling code here:
}                                           

private void campocedulaKeyTyped(java.awt.event.KeyEvent evt) {                                     
    char validar=evt.getKeyChar();
    if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
    }

}                                    

private void campotelefonoKeyTyped(java.awt.event.KeyEvent evt) {                                       
    char validar=evt.getKeyChar();
    if (Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
    }
}                                      

private void camponombreKeyTyped(java.awt.event.KeyEvent evt) {                                     
    char validar=evt.getKeyChar();

    if(Character.isDigit(validar)){
        getToolkit().beep();
        evt.consume();
    }
}                                    

private void campodireccionKeyTyped(java.awt.event.KeyEvent evt) {                                        

}                                       

/**
 * @param args the command line arguments
 */
public static void main(String args[]) {

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new interfaz().setVisible(true);

        }
    });
}

// Variables declaration - do not modify                     
private javax.swing.JButton Agregar;
private javax.swing.JButton Eliminar;
private javax.swing.JButton Guardar;
private javax.swing.JButton Salir;
private javax.swing.JTable Tabla;
private javax.swing.JTextField campocedula;
private javax.swing.JTextField campodireccion;
private javax.swing.JTextField camponombre;
private javax.swing.JTextField campotelefono;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel10;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JScrollPane jScrollPane7;
private javax.swing.JSeparator jSeparator1;
private javax.swing.JSeparator jSeparator3;
// End of variables declaration                   
}