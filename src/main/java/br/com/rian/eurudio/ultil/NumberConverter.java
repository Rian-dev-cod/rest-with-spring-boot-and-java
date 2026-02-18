package br.com.rian.eurudio.ultil;

public class NumberConverter {

    public static Double convertToDouble(String strNumber){
        if(strNumber == null || strNumber.isEmpty())
            throw new UnsupportedOperationException("Digite um valor numérico!");

        String number = strNumber.replace(",", ".");
        if(!isNumeric(number))
            throw new UnsupportedOperationException("Digite um valor numérico!");

        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber){
        if(strNumber == null || strNumber.isEmpty()) return false;
        return strNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
