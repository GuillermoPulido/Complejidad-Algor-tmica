
public class ejemplo3 {
    
    final static byte[] n = { 4, 2, 5, 1, 6, 0, 6, 9, 5, 4, 5, 0 };
    static int resultado = 0;

    public static void main(String[] args) {
        
        for(int i=1; i<=n.length; i++){
            
            for(int j=n.length; j>=1; j--){
            resultado = i*7;
            resultado /= 2;
            }
            
        }
        
        System.out.println("El resultado es: "+resultado);
        
    }
    
}
