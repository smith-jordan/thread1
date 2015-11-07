/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcurrentthread;

/**
 *
 * @author Jordan
 */

  public class GetCurrentThread implements Runnable {

  Thread th;
  
  public GetCurrentThread(String threadName) {
  th= new Thread(this,threadName);
  th.start();
  }

  public void run() {
  System.out.println(th.getName()+" is starting.....");
  System.out.println("Current thread name : "+
  Thread.currentThread().getName());
  }

  public static void main(String args[]) {
  System.out.println("Current thread name : "+
  Thread.currentThread().getName());
  new GetCurrentThread("1st Thread");
  new GetCurrentThread("2nd Thread");
  }
}
    
    

