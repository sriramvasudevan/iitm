class Factorial2{
    public static void main(String[] a){
            System.out.println(new Fac().ComputeFac(10));
        }
}

class Fac {
    public int ComputeFac(int num){
            int num_aux ;
            Hello hel;
            hel = new Hello();
            if (num < 1)
                num_aux = 1 ;
            else
                num_aux = num * (this.ComputeFac(num-1)) ;
            return num_aux ;
        }
}
    class Hello {
      public int hi() {
        return 0;
      }
    }

