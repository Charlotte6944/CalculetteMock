package fr.m2i.enumerator;

public enum OperationEnum {
    ADDITION,
    SOUSTRACTION,
    MULTIPLICATION,
    DIVISION;

    public static OperationEnum fromSymbol(String operation) {

         switch (operation) {
            case "+":
                return ADDITION;
            case "-":
                return SOUSTRACTION;
            case "/":
                return DIVISION;
            case "*":
                return MULTIPLICATION;
            case "x":
                return MULTIPLICATION;
            default:
                throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}
