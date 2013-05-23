/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvbos.androidgc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

/**
 *
 * @author mbecker
 */
public class GraphicConsole extends javax.swing.JFrame {

    public static final String ANDROID_RES_OK = "OK";
    public static final String ANDROID_RES_KO = "KO";
    public static final String NEW_LINE = "\n";

    /**
     * Creates new form GraphicConsole
     */
    public GraphicConsole() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        tfIP = new javax.swing.JTextField();
        tfPort = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        battPower = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bttPowerCharge = new javax.swing.JSlider();
        battAC = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tfConsoleInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfConsoleOutput = new javax.swing.JTextPane();
        btnStartCon = new javax.swing.JToggleButton();
        lblAlert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Android: Graphic Console");

        tfIP.setText("localhost");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnStartCon, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), tfIP, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        tfPort.setText("5554");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnStartCon, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), tfPort, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel1.setText("Capacity");

        jLabel2.setText("Set capacity");

        bttPowerCharge.setMajorTickSpacing(10);
        bttPowerCharge.setMinorTickSpacing(1);
        bttPowerCharge.setPaintLabels(true);
        bttPowerCharge.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bttPowerChargeStateChanged(evt);
            }
        });

        battAC.setSelected(true);
        battAC.setText("AC On/Off");
        battAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                battACActionPerformed(evt);
            }
        });

        jLabel3.setText("Set AC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(battAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battPower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttPowerCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(battPower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttPowerCharge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(battAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {battPower, bttPowerCharge});

        jTabbedPane1.addTab("Battery", jPanel2);

        tfConsoleInput.setText("help");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnStartCon, org.jdesktop.beansbinding.ELProperty.create("${selected}"), tfConsoleInput, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        tfConsoleInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfConsoleInputKeyReleased(evt);
            }
        });

        tfConsoleOutput.setEditable(false);
        jScrollPane1.setViewportView(tfConsoleOutput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(tfConsoleInput, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfConsoleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Console", jPanel1);

        btnStartCon.setText("Connect");
        btnStartCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartConActionPerformed(evt);
            }
        });

        lblAlert.setText("No connected.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfIP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStartCon))
                    .addComponent(lblAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStartCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlert)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private PrintWriter out;
    private BufferedReader in;
    private Socket socket;
    private StringBuilder consoleOut = new StringBuilder(500);

    private void tfConsoleInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfConsoleInputKeyReleased
        if (evt.getKeyCode() == 10 && isConnected()) {
            sendCommand(tfConsoleInput.getText());
            tfConsoleInput.setText(null);

            String res = listenAndroid();
            updateConsole(res);
        }
    }//GEN-LAST:event_tfConsoleInputKeyReleased

    private void bttPowerChargeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bttPowerChargeStateChanged
        if (!isConnected()) {
            return;
        }

        JSlider source = (JSlider) evt.getSource();
        if (!source.getValueIsAdjusting()) {
            sendCommand(CMD.Power.CAPACITY.getCommand() + source.getValue());
            String res = listenAndroid();
            if (res.trim().equals(ANDROID_RES_OK)) {
                updateSystemInfo();
            }
        }
    }//GEN-LAST:event_bttPowerChargeStateChanged

    private void btnStartConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartConActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource();
        if (btn.isSelected()) {
            btn.setSelected(startConnection());
        } else {
            endConnection();
        }
    }//GEN-LAST:event_btnStartConActionPerformed

    private void battACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_battACActionPerformed
        if (!isConnected()) {
            return;
        }
        JToggleButton btn = (JToggleButton) evt.getSource();
        sendCommand(CMD.Power.AC.getCommand() + (btn.isSelected() ? "on" : "off"));
        String res = listenAndroid();
        if (res.trim().equals(ANDROID_RES_OK)) {
            updateSystemInfo();
        }

    }//GEN-LAST:event_battACActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton battAC;
    private javax.swing.JProgressBar battPower;
    private javax.swing.JToggleButton btnStartCon;
    private javax.swing.JSlider bttPowerCharge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAlert;
    private javax.swing.JTextField tfConsoleInput;
    private javax.swing.JTextPane tfConsoleOutput;
    private javax.swing.JTextField tfIP;
    private javax.swing.JTextField tfPort;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void updateConsole(String text) {
        consoleOut.append(text);
        tfConsoleOutput.setText(consoleOut.toString());
    }

    private boolean isConnected() {
        if (socket == null || out == null || in == null) {
            return false;
        }

        return socket.isConnected();
    }

    private void updateSystemInfo() {
        try {
            //update battery info
            out.println(CMD.Power.DISPLAY.getCommand());
            String res;
            String value;
            while (true) {
                res = in.readLine();

                CMD.Power powerCommand = CMD.parsePowerCommand(res);
                if (powerCommand != null) {
                    value = CMD.getValue(res);
                    switch (powerCommand) {
                        case AC:
                            battAC.setSelected(value.equals("online"));
                            break;
                        case CAPACITY:
                            battPower.setValue(Integer.valueOf(value));
                            break;
                    }
                }

                if (res.equals(ANDROID_RES_OK)) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GraphicConsole.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private String listenAndroid() {
        String res;
        StringBuilder sb = new StringBuilder(100);
        try {
            while (true) {
                res = in.readLine();
                sb.append(res).append(NEW_LINE);

                //System.out.println(res);

                if (res.equals(ANDROID_RES_OK)
                        || res.startsWith(ANDROID_RES_KO)) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(GraphicConsole.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sb.toString();
    }

    private void sendCommand(String cmd) {
        out.println(cmd);
    }

    private boolean startConnection() {
        try {
            socket = new Socket(tfIP.getText(), Integer.valueOf(tfPort.getText()));
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String res = listenAndroid();
            updateConsole(res);
            updateSystemInfo();

            lblAlert.setText("Conected.");

            return true;

        } catch (IllegalArgumentException ex) {
            lblAlert.setText("IP or Port invalid.");
            Logger.getLogger(GraphicConsole.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            lblAlert.setText("Unknown Host.");
            Logger.getLogger(GraphicConsole.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            lblAlert.setText("Error to conect on Android Emulator.");
            Logger.getLogger(GraphicConsole.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    private void endConnection() {
        out = null;
        in = null;
        socket = null;
        consoleOut.delete(0, consoleOut.length());

        lblAlert.setText("No connected.");
    }
}
