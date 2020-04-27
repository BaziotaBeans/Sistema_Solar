/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objecto;
import Utilitarios.Constante;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.BasicStroke;
/**
 *
 * @author Baziota Beans
 */
public class Planeta 
{
    int massa;
    int distancia;
    int velocidade_sol;
    int velocidade_self;
    AffineTransform tx1, tx2;
    int teta1, teta2;
    String nome;
    private AffineTransform tx3;
    private double teta3;
    float[] dash1 = {2f, 0f, 2f};
    float[] dash2 = {1f, 1f, 1f};
    float[] dash3 = {4f, 0f, 2f};
    float[] dash4 = {4f, 4f, 1f};
    
    
    public Planeta(String nome, int massa, int distancia, int velocidade_sol, int velocidade_self) {
        this.massa = massa;
        this.distancia = distancia;
        this.velocidade_sol = velocidade_sol;
        this.velocidade_self = velocidade_self;
        this.nome = nome;
    }

    public void doPlanet(Graphics2D g2d, int x, int y)
    {
        tx1 = new AffineTransform();
        tx2 = new AffineTransform();
        tx3 = new AffineTransform();
        
        tx1.rotate(Math.toRadians(teta1), x + Constante.MASSA_SOL/2, y + Constante.MASSA_SOL/2);
        tx2.rotate(Math.toRadians(teta2), (x - distancia) - (massa/2), y + massa/2);
        tx3.rotate(Math.toRadians(teta3), (x - distancia) - (massa/2), y + massa/2);
        
        
        g2d.setTransform(new AffineTransform());
        //Orbita
        BasicStroke bs4 = new BasicStroke(1, BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND, 1.0f, dash4, 2f);
        g2d.setStroke(bs4);
        g2d.setColor(Color.WHITE);
        g2d.drawOval(
            x - distancia - massa/2, 
            y - distancia - massa/2, 
            distancia + Constante.MASSA_SOL + distancia + massa, 
            distancia + Constante.MASSA_SOL + distancia + massa
        );
        
        switch (nome)
        {
            case "Terra":
                tx1.concatenate(tx3);
                g2d.setTransform(tx1);
                g2d.setColor(Color.WHITE);
                g2d.fillOval(x - distancia - massa - 20, y, 10, 10);
                //g2d.fillOval(x - distancia - massa - 20, y + 15, 10, 10);
                break;
            case "Mercurio":
                tx1.concatenate(tx3);
                g2d.setTransform(tx1);
                g2d.setColor(new Color(138,43,226));
                g2d.fillOval(x - distancia - massa - 20, y, 10, 10);
            case "Jupiter":
                tx1.concatenate(tx3);
                g2d.setTransform(tx1);
                g2d.setColor(new Color(211,211,211));
                g2d.fillOval(x - distancia - massa - 20, y, 10, 10);
            default:
                break;
        }
        
        g2d.setTransform(new AffineTransform());
        tx1 = new AffineTransform();
        tx1.rotate(Math.toRadians(teta1), x + Constante.MASSA_SOL/2, y + Constante.MASSA_SOL/2);
        tx1.concatenate(tx2);
        //Planeta
        g2d.setTransform(tx1);
        if(nome.equals("Mercurio")) g2d.setColor(new Color(139,69,19));
        if(nome.equals("Venus")) g2d.setColor(new Color(160,82,45));
        if(nome.equals("Terra")) g2d.setColor(new Color(30,144,255));
        if(nome.equals("Marte")) g2d.setColor(new Color(128,0,0));
        if(nome.equals("Jupiter")) g2d.setColor(new Color(205,133,63));
        if(nome.equals("Saturno")) g2d.setColor(new Color(244,164,96));
        if(nome.equals("Uranos")) g2d.setColor(new Color(176,196,222));
        if(nome.equals("Neptunio")) g2d.setColor(new Color(70,130,180));
        if(nome.equals("Pluto")) g2d.setColor(new Color(211,211,211));
        g2d.fillOval(x - distancia - massa,y, massa, massa);
        
        
       
        
        teta1 +=velocidade_sol;
        teta2 +=velocidade_self;
        teta3 +=velocidade_self+2;
        
    } 
    
    
  
    
    
}
