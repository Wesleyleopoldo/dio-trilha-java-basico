public class Usuario {
    public static void main (String [] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();


        smartTv.ligar();

        smartTv.mudarCanal(22);

        System.out.println("TV Ligada : " + smartTv.ligada);
        System.out.println("Canal da TV: " + smartTv.canal);
        System.out.println("Volume da TV :" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal da TV: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV Ligada : " + smartTv.ligada);
    }
}
