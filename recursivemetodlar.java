public class recursivemetodlar {
    public static void main(String[] args) {
    int sonuc= faktoriyel(6);
        System.out.println(sonuc);

    }

    public static int faktoriyel(int a){
        if(a==1)
            return 1;
        else
             return a*faktoriyel(a-1);

    }
}
