public class FormatadorDeCep {
    
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep não corresponde com as regras de negocios...");;
        }
    }
    
    
    
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
        throw new CepInvalidException();
        
          //simulando um cep formatado
            return "23.765-064";
    }
}
