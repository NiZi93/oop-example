/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author User
 */
public class Politician implements Speaker{
    @Override
    public void speak()
    {
        System.oout.println("speak1");
    }
    public void speech()
    {
        System.out.println("speech");
    }
    
}
