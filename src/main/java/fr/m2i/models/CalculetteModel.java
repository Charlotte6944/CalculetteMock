package fr.m2i.models;

import fr.m2i.enumerator.OperationEnum;

public class CalculetteModel {

    private int arg1;
    private int arg2;
    private OperationEnum operationType;
    private int resultat = 0;

    public CalculetteModel(int arg1, int arg2, OperationEnum operationType) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operationType = operationType;
    }

    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public OperationEnum getOperationType() {
        return operationType;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public void setOperationType(OperationEnum operationType) {
        this.operationType = operationType;
    }

    public void setResultat(int resultat) {
        this.resultat = resultat;
    }

    public int getResultat() {
        return this.resultat;
    }
}
