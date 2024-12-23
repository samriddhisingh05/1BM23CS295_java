class DisplayThread extends Thread { 
        private String message; 
        private int interval; 
Public DisplayThread(String message, int interval) 
{ 
      this.message = message; 
      this.interval = interval; } 
 public void run()
 { 
try { 
while (true) { 
      System.out.println(message); Thread.sleep(interval * 1000);  } 
} 
catch (InterruptedException e) 
{ 
            System.out.println("Thread interrupted: " + message); } } 
public static void main(String[] args) { 
  
DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10); 
DisplayThread thread2 = new DisplayThread("CSE", 2); 
 } 
}
