/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecto;
import java.awt.Graphics2D;
import Utilitarios.Utilitarios;
import java.awt.Color;
/**
 *
 * @author Baziota Beans
 */
public class Estrelas 
{
    int massa;
    String nome;
    Utilitarios utilitario = new Utilitarios();
    public Estrelas(int massa, String nome) {
        this.massa = massa;
        this.nome = nome;
    }
    
    public void doEstrela(Graphics2D g2d, int x, int y)
    {
        if(nome.equals("Pedra")) g2d.setColor(new Color(210,105,30));
        g2d.setComposite(utilitario.getTransparencia(false));
        g2d.fillOval(x, y, massa, massa);
        g2d.setComposite(utilitario.getTransparencia(true));
        g2d.fillOval(x - ((massa*2 - massa)/2), y - ((massa*2 - massa)/2), massa * 2, massa * 2);

    }
    
}
