package fr.m2i.service;

import fr.m2i.domain.Calculatrice;
import fr.m2i.enumerator.OperationEnum;
import fr.m2i.models.CalculetteModel;

public class CalculetteServiceImpl implements CalculetteService {

    private Calculatrice calculatrice;
    private CalculetteModel calc;

    public CalculetteServiceImpl(Calculatrice calculatrice) {
        this.calculatrice = calculatrice;
    }

    public void calcul() {
        final OperationEnum type = calc.getOperationType();

        int result;
        switch (type) {
            case ADDITION:
                result = calculatrice.add(calc.getArg1(), calc.getArg2());
                break;
            case SOUSTRACTION:
                result = calculatrice.sous(calc.getArg1(), calc.getArg2());
                break;
            case MULTIPLICATION:
                result = calculatrice.multiply(calc.getArg1(), calc.getArg2());
                break;
            case DIVISION:
                try {
                    result = calculatrice.div(calc.getArg1(), calc.getArg2());
                } catch (final ArithmeticException e) {
                    throw new IllegalArgumentException(e);
                }
                break;
            default:
                throw new UnsupportedOperationException("Unsupported calculations");
        }

        calc.setResultat(result);
    }

    public int getResult() {
        return calc.getResultat();
    }

    public void setCalc(CalculetteModel calc) {
        this.calc = calc;
    }

}
