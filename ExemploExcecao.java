public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = DoNumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}