
package Ventanas;

import javax.swing.JProgressBar;

public class Cargar_inciio extends  Thread {
    JProgressBar Progreso;
public  Cargar_inciio (JProgressBar Progreso)
{
  super  ();
  this.Progreso = Progreso;
    
}  
    @Override
public void run()
{
    for(int a = 1; a<=100; a++)
            {
                Progreso.setValue (a);
                pausa(50);
            }
}
public void  pausa (int mlseg)
{
    try {
        Thread.sleep(mlseg);
        
    }catch (Exception e){
        
    }
}
}