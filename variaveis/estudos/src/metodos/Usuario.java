package metodos;

public class Usuario {
    public static void main(String[] args) {
        SmarTv smarTv = new SmarTv();

      System.out.println("A Tv está ligada? " + smarTv.estado);
      System.out.println("Volume = " + smarTv.volume);
      System.out.println("Canal = " + smarTv.canal);
      System.out.println("---------------------");
      
      smarTv.ligarTV();
      for ( int i = 0 ; i <= 13 ; i++) {
        smarTv.aumentarVolume();
      }
      smarTv.mudarCanal(7);
      System.out.println("A Tv está ligada? " + smarTv.estado);
      System.out.println("Volume = " + smarTv.volume);
      System.out.println("Canal = " + smarTv.canal);
     
    


   
    }

   
}
