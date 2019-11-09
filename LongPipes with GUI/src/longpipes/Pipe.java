/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

public abstract class Pipe {
    double length;
    double d;
    int plasticGrade;
    int colorPrint;
    boolean innerIns;
    boolean outerReinf;
    boolean chemRes;
    
    
    public Pipe() {}
    
    public Pipe(double length, double d, int plasticGrade, boolean chemRes) {
        this.length = length;
        this.d = d;
        this.chemRes = chemRes;
        this.plasticGrade = plasticGrade;
        
    }
    
    protected double getVolumeInches(double length, double d) { //returns volume of pipe material
        double fullVol = Math.PI * Math.pow(d / 2, 2.0) * length * 39.37;
        double innerVol = Math.PI * Math.pow(0.9 * d / 2, 2.0) * length * 39.37;
        double volume = (fullVol - innerVol);
        return(volume);
    }
    
    protected double getCostPerInch() {
        switch(plasticGrade) {
            case 1:
                return 0.4;
            case 2:
                return 0.6;
            case 3:
                return 0.75;
            case 4:
                return 0.8;
            case 5:
                return 0.95;
        }
        return 0.0;
    }
    
    public abstract double calculateCost();
    
}