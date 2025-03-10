public class Teste {
   public int a;
   public int b;
   public int c;
    
    public int getC(){
        return this.c;
    }
    
    public Teste(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Teste(int a, int b, int c) {
        this.a = 10;
        this.b = 10;
        this.c = 10;
    }
    public void ImprimeA(){
    System.out.println("Valor de A:"+a);
    
    }
    public void ImprimeB(){
    System.out.println("Valor de A:"+b);
    
    }
    public void ImprimeC(){
    System.out.println("Valor de A:"+c);
    
    }
}
