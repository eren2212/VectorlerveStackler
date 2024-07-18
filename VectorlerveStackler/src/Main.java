
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;


public class Main {

   
    public static void main(String[] args) {
        Vector<String> vectorlist = new Vector<String>();
        
        vectorlist.add("php");
        vectorlist.add("pyhton");
        vectorlist.add("pyhton");
        vectorlist.add("javascript");
        
        
        //bu 3 şekilde bastırıp gezinebiliroyurz.
        /*for(String s :vectorlist){
            System.out.println(s);
        }*/
        
        
        /*ListIterator<String> iterator = vectorlist.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        
        /*Enumeration<String> enumaration = vectorlist.elements();
        
        while(enumaration.hasMoreElements()){
            System.out.println(enumaration.nextElement());
        }*/
        
        /*System.out.println(vectorlist.firstElement());
        System.out.println(vectorlist.lastElement());*/
        
        
        Stack<String> stack = new Stack<String>();
        
        stack.push("eren");
        stack.push("melih");
        stack.push("Php");
        stack.push("veli");
        
        /*for(String s:stack){
            System.out.println(s);
        }*/
        
        /*Enumeration<String> enumeration = stack.elements();
        
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }*/
        
        //System.out.println(stack.peek());
        //BURADA SON ELEMANI BASTIRDIK ÇIKARMADIK.
        
        
        //System.out.println(stack.empty());
        //stackin boş olup olmadığını true false ile döndürür.
        
        
        
        while(!stack.empty()){
            System.out.println("Eleman çıkarılıyor:"+stack.pop());
        }
    }
    
}
