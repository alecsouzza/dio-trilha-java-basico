package metodos;

public class SmarTv {
    
    
  boolean estado = false; 
  int canal = 1;
  int volume = 10;

   public  void ligarTV () {
        estado = true;
   }

   public void desligarTv () {
        estado = false ;
   }

   public void aumentarVolume () {
    volume++;
   }

   public void diminuirVolume () {
    volume -- ;
   }

   public void mudarCanal ( int novoCanal) {
    canal = novoCanal;
   }

        
}
    
   

