
package calculadorajava;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {
    
    int x,y;
    
    ScriptEngineManager sem=new ScriptEngineManager(); 
    ScriptEngine se =  sem.getEngineByName("JavaScript");
    
    public Calculadora() {
       
        initComponents();
        this.setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,30,30);
        AWTUtilities.setWindowShape(this, forma);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_igual = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_expo = new javax.swing.JButton();
        btn_porsentaje = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_reg = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texOperacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        texOperacion.setForeground(new java.awt.Color(49, 60, 70));
        texOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(texOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 328, 29));

        txtResultado.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(49, 60, 70));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 330, 49));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 340, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_igual.setBackground(new java.awt.Color(49, 60, 70));
        btn_igual.setFont(new java.awt.Font("Montserrat Medium", 0, 36)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        btn_9.setBackground(new java.awt.Color(49, 60, 70));
        btn_9.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(49, 60, 70));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 50, 50));

        btn_expo.setBackground(new java.awt.Color(49, 60, 70));
        btn_expo.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        btn_expo.setForeground(new java.awt.Color(49, 60, 70));
        btn_expo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_expo.setText("^");
        btn_expo.setBorder(null);
        btn_expo.setFocusPainted(false);
        btn_expo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_expo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_expo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_expo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_expo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btn_porsentaje.setBackground(new java.awt.Color(49, 60, 70));
        btn_porsentaje.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        btn_porsentaje.setForeground(new java.awt.Color(49, 60, 70));
        btn_porsentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porsentaje.setText("%");
        btn_porsentaje.setBorder(null);
        btn_porsentaje.setFocusPainted(false);
        btn_porsentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porsentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porsentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_porsentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porsentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porsentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 50));

        btn_div.setBackground(new java.awt.Color(49, 60, 70));
        btn_div.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        btn_div.setForeground(new java.awt.Color(49, 60, 70));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setBorder(null);
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 50));

        btn_mult.setBackground(new java.awt.Color(49, 60, 70));
        btn_mult.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        btn_mult.setForeground(new java.awt.Color(49, 60, 70));
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_mult.setText("x");
        btn_mult.setBorder(null);
        btn_mult.setFocusPainted(false);
        btn_mult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 50, 50));

        btn_resta.setBackground(new java.awt.Color(49, 60, 70));
        btn_resta.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(49, 60, 70));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setBorder(null);
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 50, 50));

        btn_suma.setBackground(new java.awt.Color(49, 60, 70));
        btn_suma.setFont(new java.awt.Font("Montserrat Medium", 1, 36)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(49, 60, 70));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        btn_reg.setBackground(new java.awt.Color(49, 60, 70));
        btn_reg.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_reg.setForeground(new java.awt.Color(49, 60, 70));
        btn_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_reg.setText("<-");
        btn_reg.setBorder(null);
        btn_reg.setFocusPainted(false);
        btn_reg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reg.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_reg.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 50, 50));

        btn_7.setBackground(new java.awt.Color(49, 60, 70));
        btn_7.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(49, 60, 70));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 50));

        btn_8.setBackground(new java.awt.Color(49, 60, 70));
        btn_8.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(49, 60, 70));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        btn_4.setBackground(new java.awt.Color(49, 60, 70));
        btn_4.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(49, 60, 70));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, 50));

        btn_5.setBackground(new java.awt.Color(49, 60, 70));
        btn_5.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(49, 60, 70));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 50, 50));

        btn_6.setBackground(new java.awt.Color(49, 60, 70));
        btn_6.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(49, 60, 70));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 50));

        btn_1.setBackground(new java.awt.Color(49, 60, 70));
        btn_1.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(49, 60, 70));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        btn_2.setBackground(new java.awt.Color(49, 60, 70));
        btn_2.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(49, 60, 70));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        btn_3.setBackground(new java.awt.Color(49, 60, 70));
        btn_3.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(49, 60, 70));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        btn_0.setBackground(new java.awt.Color(49, 60, 70));
        btn_0.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_0.setForeground(new java.awt.Color(49, 60, 70));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_punto.setBackground(new java.awt.Color(49, 60, 70));
        btn_punto.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(49, 60, 70));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        btn_c.setBackground(new java.awt.Color(49, 60, 70));
        btn_c.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(49, 60, 70));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setBorder(null);
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_press.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 410));

        jPanel4.setBackground(new java.awt.Color(202, 229, 230));
        jPanel4.setForeground(new java.awt.Color(202, 229, 230));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("●");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 30, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("●");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 30, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/light.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
        String texto = texOperacion.getText().substring(0,texOperacion.getText().length()-1);
        
        texOperacion.setText(texto);
    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
       addNumber("4");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
       addNumber("6");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       addNumber("1");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       addNumber("3");
       btn_igual.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_igual.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expoActionPerformed
        addNumber("^");
       
    }//GEN-LAST:event_btn_expoActionPerformed

    private void btn_porsentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porsentajeActionPerformed
        addNumber("%");
        
    }//GEN-LAST:event_btn_porsentajeActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addNumber("/");
        
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
       addNumber("*");
       
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumber("-");
        
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");
        
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
       addNumber(".");
       
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try {
           String resultado = se.eval(texOperacion.getText()).toString();
           txtResultado.setText(resultado);
        } catch (Exception e) {
           
            Error("ERROR");
            
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
       texOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed
boolean modoOscuro = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
       if(!modoOscuro){
           
           
           
            jPanel4.setBackground(Color.decode("#3a4655"));
            jPanel1.setBackground(Color.decode("#152740"));
        jPanel2.setBackground(Color.decode("#243651"));
        txtResultado.setForeground(Color.decode("#00bc8b"));
        texOperacion.setForeground(Color.decode("#00cf94"));
        
        CambiarColorCat1(btn_1);
        CambiarColorCat1(btn_2);
        CambiarColorCat1(btn_3);
        CambiarColorCat1(btn_4);
        CambiarColorCat1(btn_5);
        CambiarColorCat1(btn_6);
        CambiarColorCat1(btn_7);
        CambiarColorCat1(btn_8);
        CambiarColorCat1(btn_9);
        CambiarColorCat1(btn_0);
        CambiarColorCat1(btn_punto);
        
        
        CambiarColorCat2(btn_suma);
        CambiarColorCat2(btn_div);
        CambiarColorCat2(btn_expo);
        CambiarColorCat2(btn_mult);
        CambiarColorCat2(btn_porsentaje);
        CambiarColorCat2(btn_reg);
        CambiarColorCat2(btn_resta);
        CambiarColorCat2(btn_c);
        
        
        jButton1.setIcon(new ImageIcon(getClass().getResource("/imagenes/dark.png")));
         
         btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagenes/btndark_igual.png")));
        btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btndark1-press.png")));
        btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btndark1.png")));
        btn_igual.setForeground(Color.decode("#26324f"));
        modoOscuro = true;
       }else{
           Calculadora frame = new Calculadora();
           this.dispose();
           frame.setVisible(modoOscuro);
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
       x=evt.getX();
       y=evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_jPanel4MouseDragged

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void  addNumber (String digito){
        texOperacion.setText(texOperacion.getText()+digito);
    }

    public void Error(String error){
         txtResultado.setText("Error");
    }
    
    public void CambiarColorCat1(JButton btn){
         btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btndark2.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btndark2.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btndark1.png")));
        btn.setForeground(Color.decode("#a6c1b3"));
    }
    
    public void CambiarColorCat2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btndark1.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btndark1.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btndark1-press.png")));
        btn.setForeground(Color.decode("#00cf94"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_expo;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_porsentaje;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_reg;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel texOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
