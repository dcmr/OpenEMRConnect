/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is OpenEMRConnect.
 *
 * The Initial Developer of the Original Code is International Training &
 * Education Center for Health (I-TECH) <http://www.go2itech.org/>
 *
 * Portions created by the Initial Developer are Copyright (C) 2011
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */
/*
 * FingerprintDialog.java
 *
 * Created on May 26, 2011, 9:30:59 AM
 */
package ke.go.moh.oec.reception.gui;

import com.griaule.grfingerjava.GrFingerJavaException;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import ke.go.moh.oec.Fingerprint;
import ke.go.moh.oec.Fingerprint.TechnologyType;
import ke.go.moh.oec.Fingerprint.Type;
import ke.go.moh.oec.reception.data.ImagedFingerprint;
import ke.go.moh.oec.reception.controller.Session;
import ke.go.moh.oec.reception.reader.ReaderManager;
import org.jdesktop.application.Action;

/**
 *
 * @author Gitahi Ng'ang'a
 */
public class FingerprintDialog extends javax.swing.JDialog {

    private ReaderManager readerManager;
    private Session session;

    public void setSession(Session session) {
        this.session = session;
        switch (Session.getImagedFingerprintList().size() - 1) {
            case -1:
                rightIndexRadioButton.setSelected(true);
                break;
            case 0:
                leftIndexRadioButton.setSelected(true);
                break;
            case 1:
                rightMiddleRadioButton.setSelected(true);
                break;
            case 2:
                leftMiddleRadioButton.setSelected(true);
                break;
            case 3:
                rightRingRadioButton.setSelected(true);
                break;
            case 4:
                leftRingRadioButton.setSelected(true);
                break;
            default:
                rightIndexRadioButton.setSelected(true);
        }
    }

    /** Creates new form FingerprintDialog */
    public FingerprintDialog(java.awt.Frame parent, boolean modal) throws GrFingerJavaException {
        super(parent, modal);
        initComponents();
        try {
            this.readerManager = new ReaderManager(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FingerprintDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fingerButtonGroup = new javax.swing.ButtonGroup();
        fingerprintPanel = new javax.swing.JPanel();
        fingerPanel = new javax.swing.JPanel();
        rightIndexRadioButton = new javax.swing.JRadioButton();
        leftIndexRadioButton = new javax.swing.JRadioButton();
        rightMiddleRadioButton = new javax.swing.JRadioButton();
        leftMiddleRadioButton = new javax.swing.JRadioButton();
        rightRingRadioButton = new javax.swing.JRadioButton();
        leftRingRadioButton = new javax.swing.JRadioButton();
        fingerprintImagePanel = new ke.go.moh.oec.reception.gui.custom.ImagePanel();
        qualityTextField = new javax.swing.JTextField();
        notAvailableCheckBox = new javax.swing.JCheckBox();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Take Fingerprint");
        setResizable(false);

        fingerprintPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Fingerprint"));

        fingerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Finger"));

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(ke.go.moh.oec.reception.gui.App.class).getContext().getActionMap(FingerprintDialog.class, this);
        rightIndexRadioButton.setAction(actionMap.get("showTakenFingerprint")); // NOI18N
        fingerButtonGroup.add(rightIndexRadioButton);
        rightIndexRadioButton.setText("Right index");

        leftIndexRadioButton.setAction(actionMap.get("showTakenFingerprint")); // NOI18N
        fingerButtonGroup.add(leftIndexRadioButton);
        leftIndexRadioButton.setText("Left index");

        rightMiddleRadioButton.setAction(actionMap.get("showTakenFingerprint")); // NOI18N
        fingerButtonGroup.add(rightMiddleRadioButton);
        rightMiddleRadioButton.setText("Right middle");

        leftMiddleRadioButton.setAction(actionMap.get("showTakenFingerprint")); // NOI18N
        fingerButtonGroup.add(leftMiddleRadioButton);
        leftMiddleRadioButton.setText("Left middle");

        rightRingRadioButton.setAction(actionMap.get("showTakenFingerprint")); // NOI18N
        fingerButtonGroup.add(rightRingRadioButton);
        rightRingRadioButton.setText("Right ring");

        leftRingRadioButton.setAction(actionMap.get("showTakenFingerprint")); // NOI18N
        fingerButtonGroup.add(leftRingRadioButton);
        leftRingRadioButton.setText("Left ring");

        org.jdesktop.layout.GroupLayout fingerPanelLayout = new org.jdesktop.layout.GroupLayout(fingerPanel);
        fingerPanel.setLayout(fingerPanelLayout);
        fingerPanelLayout.setHorizontalGroup(
            fingerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fingerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(fingerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rightIndexRadioButton)
                    .add(leftIndexRadioButton)
                    .add(rightMiddleRadioButton)
                    .add(leftMiddleRadioButton)
                    .add(rightRingRadioButton)
                    .add(leftRingRadioButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fingerPanelLayout.setVerticalGroup(
            fingerPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fingerPanelLayout.createSequentialGroup()
                .add(rightIndexRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(leftIndexRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rightMiddleRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(leftMiddleRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rightRingRadioButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(leftRingRadioButton))
        );

        fingerprintImagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout fingerprintImagePanelLayout = new org.jdesktop.layout.GroupLayout(fingerprintImagePanel);
        fingerprintImagePanel.setLayout(fingerprintImagePanelLayout);
        fingerprintImagePanelLayout.setHorizontalGroup(
            fingerprintImagePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 93, Short.MAX_VALUE)
        );
        fingerprintImagePanelLayout.setVerticalGroup(
            fingerprintImagePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 97, Short.MAX_VALUE)
        );

        qualityTextField.setEditable(false);

        notAvailableCheckBox.setAction(actionMap.get("addUnavailableFingerprint")); // NOI18N
        notAvailableCheckBox.setText("Not available");

        org.jdesktop.layout.GroupLayout fingerprintPanelLayout = new org.jdesktop.layout.GroupLayout(fingerprintPanel);
        fingerprintPanel.setLayout(fingerprintPanelLayout);
        fingerprintPanelLayout.setHorizontalGroup(
            fingerprintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fingerprintPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(fingerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fingerprintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(notAvailableCheckBox)
                    .add(fingerprintImagePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(qualityTextField))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fingerprintPanelLayout.setVerticalGroup(
            fingerprintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fingerprintPanelLayout.createSequentialGroup()
                .add(fingerprintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(fingerPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fingerprintPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(fingerprintImagePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(qualityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(notAvailableCheckBox)))
                .addContainerGap())
        );

        okButton.setAction(actionMap.get("addFingerprint")); // NOI18N
        okButton.setText("OK");

        cancelButton.setAction(actionMap.get("cancel")); // NOI18N
        cancelButton.setText("Cancel");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, statusLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(okButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cancelButton)))
                .addContainerGap())
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(fingerprintPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        layout.linkSize(new java.awt.Component[] {cancelButton, okButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .add(statusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(okButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(fingerprintPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    FingerprintDialog dialog = new FingerprintDialog(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (GrFingerJavaException ex) {
                    Logger.getLogger(FingerprintDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.ButtonGroup fingerButtonGroup;
    private javax.swing.JPanel fingerPanel;
    private ke.go.moh.oec.reception.gui.custom.ImagePanel fingerprintImagePanel;
    private javax.swing.JPanel fingerprintPanel;
    private javax.swing.JRadioButton leftIndexRadioButton;
    private javax.swing.JRadioButton leftMiddleRadioButton;
    private javax.swing.JRadioButton leftRingRadioButton;
    private javax.swing.JCheckBox notAvailableCheckBox;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField qualityTextField;
    private javax.swing.JRadioButton rightIndexRadioButton;
    private javax.swing.JRadioButton rightMiddleRadioButton;
    private javax.swing.JRadioButton rightRingRadioButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    public void log(String message) {
        statusLabel.setText(message);
    }

    public void showImage(BufferedImage fingerprintImage) {
        if (fingerprintImage != null) {
            fingerprintImagePanel.setImage(fingerprintImage);
            repaint();
        }
    }

    public void showQuality(String message) {
        qualityTextField.setText(message);
    }

    @Action
    public void cancel() {
        this.dispose();
    }

    @Override
    public void dispose() {
        try {
            this.setVisible(false);
            readerManager.destroy();
        } catch (GrFingerJavaException ex) {
            Logger.getLogger(FingerprintDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.dispose();
    }

    @Action
    public void addFingerprint() {
        Fingerprint fingerPrint = new Fingerprint();
        if (rightIndexRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.rightIndexFinger);
        } else if (leftIndexRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.leftIndexFinger);
        } else if (rightMiddleRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.rightMiddleFinger);
        } else if (leftMiddleRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.leftMiddleFinger);
        } else if (rightRingRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.rightRingFinger);
        } else if (leftRingRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.leftRingFinger);
        }
        try {
            fingerPrint.setTechnologyType(TechnologyType.griauleTemplate);
            fingerPrint.setTemplate(readerManager.getTemplate().getData());
        } catch (Exception ex) {
            showWarningMessage("Please ask the client to place a finger on the reader.", this, fingerprintImagePanel);
            return;
        }
        ImagedFingerprint imagedFingerprint = new ImagedFingerprint(fingerPrint, fingerprintImagePanel.getImage(), false);
        List<ImagedFingerprint> imagedFingerprintList = Session.getImagedFingerprintList();
        if (imagedFingerprintList.contains(imagedFingerprint)) {
            if (showConfirmMessage("A print has already been taken from the finger you want to"
                    + " add. Would you like to overwite it?", this)) {
                imagedFingerprintList.remove(imagedFingerprintList.indexOf(imagedFingerprint));
                session.addImagedFingerprint(imagedFingerprint);
                session.setCurrentImagedFingerprint(imagedFingerprint);
            } else {
                return;
            }
        } else {
            session.addImagedFingerprint(imagedFingerprint);
        }
        dispose();
    }

    private void showWarningMessage(String message, Component parent, JComponent toFocus) {
        JOptionPane.showMessageDialog(parent, message, Session.getApplicationName(), JOptionPane.WARNING_MESSAGE);
        toFocus.requestFocus();
    }

    public boolean showConfirmMessage(String message, Component parent) {
        return JOptionPane.showConfirmDialog(this, message, Session.getApplicationName(),
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;
    }

    @Action
    public void addUnavailableFingerprint() {
        showImage(Session.getRefusedFingerprint().getImage());
        Fingerprint fingerPrint = new Fingerprint();
        if (rightIndexRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.rightIndexFinger);
        } else if (leftIndexRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.leftIndexFinger);
        } else if (rightMiddleRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.rightMiddleFinger);
        } else if (leftMiddleRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.leftMiddleFinger);
        } else if (rightRingRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.rightRingFinger);
        } else if (leftRingRadioButton.isSelected()) {
            fingerPrint.setFingerprintType(Type.leftRingFinger);
        }
        fingerPrint.setTechnologyType(TechnologyType.griauleTemplate);
        ImagedFingerprint imagedFingerprint = new ImagedFingerprint(fingerPrint, fingerprintImagePanel.getImage(), false);
        List<ImagedFingerprint> imagedFingerprintList = Session.getImagedFingerprintList();
        if (imagedFingerprintList.contains(imagedFingerprint) || !imagedFingerprint.isPlaceholder()) {
            if (showConfirmMessage("A print has already been taken from the finger you want to"
                    + " add. Would you like to overwite it?", this)) {
                imagedFingerprintList.remove(imagedFingerprintList.indexOf(imagedFingerprint));
                session.addImagedFingerprint(imagedFingerprint);
                session.setCurrentImagedFingerprint(imagedFingerprint);
            } else {
                return;
            }
        } else {
            session.addImagedFingerprint(imagedFingerprint);
        }
    }

    @Action
    public void showTakenFingerprint() {
        List<ImagedFingerprint> imagedFingerprintList = Session.getImagedFingerprintList();
        Fingerprint fingerprint = new Fingerprint();
        if (rightIndexRadioButton.isSelected()) {
            fingerprint.setFingerprintType(Type.rightIndexFinger);
        } else if (leftIndexRadioButton.isSelected()) {
            fingerprint.setFingerprintType(Type.leftIndexFinger);
        } else if (rightMiddleRadioButton.isSelected()) {
            fingerprint.setFingerprintType(Type.rightMiddleFinger);
        } else if (leftMiddleRadioButton.isSelected()) {
            fingerprint.setFingerprintType(Type.leftMiddleFinger);
        } else if (rightRingRadioButton.isSelected()) {
            fingerprint.setFingerprintType(Type.rightRingFinger);
        } else if (leftRingRadioButton.isSelected()) {
            fingerprint.setFingerprintType(Type.leftRingFinger);
        }
        ImagedFingerprint dummy = new ImagedFingerprint(fingerprint);
        if (imagedFingerprintList.contains(dummy)) {
            showImage(imagedFingerprintList.get(imagedFingerprintList.indexOf(dummy)).getImage());
        }
    }
}
