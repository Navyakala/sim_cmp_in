public class simple_in {

     private Double  si;
     Double p;
     Double r;
     Double t;

   public  simple_in(Double p, Double r, Double t)
   {
         this.p=p;
         this.r=r;
         this.t=t;
   }

    public simple_in() {

    }


    Double   display() {

       return si;

   }
}

class cmp_in extends simple_in
{
    Double cmp;
    Double p1;
    Double r1;
    Double n1;
    Double t1;
    cmp_in(Double p1,Double r1,Double n1,Double t1)
    {
        super();
        this.p1=p1;
        this.r1=r1;
        this.n1=n1;
        this.t1=t1;

    }

    public cmp_in() {

    }

    Double  display()
    {
        return cmp;

    }


}