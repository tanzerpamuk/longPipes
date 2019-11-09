/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author up822906
 */
public class Type2 extends Pipe {
    
    private final double volume;
    private double costPerInch;
    double sum;
    
    public Type2(double length, double d, int plasticGrade, int colorPrint, boolean innerInsulation, boolean outerInsulation, boolean chemRes) {
        this.length = length;
        this.d = d;
        this.chemRes = chemRes;
        this.plasticGrade = plasticGrade;
        this.colorPrint = 1;
        this.innerIns = false;
        this.outerReinf = false;
        volume = getVolumeInches(length, d);
    }
    
    @Override
    public double calculateCost() {
        costPerInch = getCostPerInch();
        sum = costPerInch * volume * 1.12;
        if(chemRes) {
            sum *= 1.14;
        }
        return sum;
    }
}