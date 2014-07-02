/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.andre.maven.install.ui;

/**
 * Bootstraps the Swing Dialog.
 * @author Andre Albert
 */
public class Main {
    
    public static void main(String[] args) throws Exception {

        new InstallLibraryDialog(null, true).setVisible(true);
    }
}
