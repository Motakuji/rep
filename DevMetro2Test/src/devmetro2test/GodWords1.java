/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devmetro2test;

/**
 *
 * @author User
 */
public class GodWords1 {
    String word;
    
    public GodWords1(String word){
        this.word = word;
    }
    
    public int Count(){
        int count = 0;
        for(int i=0; i < word.length()-3; i++){
            if(word.charAt(i) == word.charAt(i+2) && word.charAt(i+1) == word.charAt(i+3)){
                count++;
                while(word.charAt(i) != ' ' && i != word.length()-1 ){
                    i++;
                }
            }
        }
        return count;
    }
}
