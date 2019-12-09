/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracongraficosdos;


import com.sun.awt.AWTUtilities;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author soporte.cita
 */
public class Splash extends JFrame implements MouseListener,MouseMotionListener{
    
    ImageIcon Favicon = new ImageIcon(getClass().getResource("/imagenes/calcu.png"));
    
    ImageIcon ImGif = new ImageIcon(getClass().getResource("/imagenes/carga.png"));
    JLabel LblImagen = new JLabel(ImGif);
    int x,y; //variables para detectar la posicion de la etiqueta con imagen.

    public Splash() {
        configInicial();
        agregarEtiqueta();
        agregarOyentes();
        this.setVisible(true);
        // matar al gif de carga
        matarSplash();
    } 

    private void configInicial() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(ImGif.getIconWidth(), ImGif.getIconHeight());
        this.setLocationRelativeTo(null);
        this.setIconImage(Favicon.getImage());
        this.setTitle("Iniciando...");
        
        // quitar el decorado (barra de titulo , marco , ect)
        this.setUndecorated(true);
        // dejar solo lo trasparente
        AWTUtilities.setWindowOpaque(this, false);
        this.setAlwaysOnTop(true);
    }

    private void agregarEtiqueta() {
        this.add(LblImagen);
    }

    private void agregarOyentes() {
        // crear oyentes del mouse 
        LblImagen.addMouseListener(this);
        // crear oyente para el mousemotion
        LblImagen.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {  
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==LblImagen){
            x = e.getX();
            y = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==LblImagen){
            LblImagen.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    ////////////////////////////////////////
    @Override
    public void mouseDragged(MouseEvent e) {
        if(e.getSource()==LblImagen){
            this.setLocation(this.getLocation().x+e.getX()-x,this.getLocation().y+e.getY()-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    // matar splash
    
    private void matarSplash() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose(); // liberando memoria (cierra el Splash o mata al splash pero no a la app
        // entrada a nueva ventana
        //VistaLogin VentanLogin = new VistaLogin();      
        //MVC
        Vista vista = new Vista();
    }
}
