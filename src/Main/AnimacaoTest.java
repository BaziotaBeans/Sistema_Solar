/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JFrame;
import Animacao.Animacao;

/**
 *
 * @author Baziota Beans
 */
public class AnimacaoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new JFrame("Animação");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Animacao animated = new Animacao();
        janela.add(animated);
        janela.setSize(500, 500);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }

}
