/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awalan;

/**
 *
 * @author Rhif0053
 */
public class KonversiSuhu {
    double celKeFah(double suhuAwal){
        return (suhuAwal * 9/5) + 32;
    }
    double celKeRe(double suhuAwal){
        return suhuAwal * 4/5;
    }
    double fahKeCel(double suhuAwal){
        return (suhuAwal - 32) * 5/9;
    }
    double fahKeRe(double suhuAwal){
        return (suhuAwal - 32) * 4/9;
    }
    double reKeCel(double suhuAwal){
        return suhuAwal * 5/4;
    }
    double reKeFah(double suhuAwal){
        return (suhuAwal * 9/4) + 32;
    }
}
