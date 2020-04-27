/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
import java.awt.RenderingHints;
import java.awt.AlphaComposite;
import java.security.SecureRandom;
/**
 *
 * @author Baziota Beans
 */
public class Utilitarios 
{
    SecureRandom random = new SecureRandom();
    
    public RenderingHints getQualidade()
    {
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        return rh;
    }
    
    public AlphaComposite getTransparencia(boolean flag)
    {
        float alpha = 0.1f;
        AlphaComposite al = null;
        if(flag) return  al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
        else return  al = AlphaComposite.getInstance(AlphaComposite.SRC_IN, 1.0f);        
    }
    
    
    public AlphaComposite getTransparenciaMedio()
    {
        float alpha = 0.5f;
        AlphaComposite al = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
        return al;       
    }
    
    public void inicializarPosicoes(int []posicoes)
    {
        for(int i=0; i < 1000; i++)
        {
           posicoes[i] = random.nextInt(2500);
        }
    }

    
}
