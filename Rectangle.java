package Rectangle.Recjava;

public class Rectangle {
    private static int count = 0 ;
    private float length ;
    private float width ;
    
    public Rectangle(float length , float width){
        this.length = length ;
        this.width = width ;
        Rectangle.count += 1 ;
    }

    public Rectangle(){
        length = 0 ;
        width = 0 ;
        Rectangle.count += 1 ;
    }

    public Rectangle(Rectangle recor) {
        this.length = recor.length;
        this.width = recor.width;
        Rectangle.count += 1 ;
    }

    public float Getlength (){
        return length ;
    }

    public void Setlength(float length1){
        this.length = length1 ;
    }

    public float Getwidth (){
        return width ;
    }

    public void Setwidth(float width1){
        this.width = width1 ;
    }

    public float Getcount (){
        return count ;
    }

    public boolean Equals(Rectangle Rec1) {
        return Rec1.Getlength() == this.Getlength() && Rec1.Getwidth() == this.Getwidth();
    }

    public float Perimetre () {
        return (this.width + this.length) * 2 ;  
    }

    public float Surface () {
        return (this.width * this.length) ;  
    }

    public String ToString() {
        return "Width :" + this.Getwidth() + "\nLength :" + this.Getlength() +"\nNbrRectangle :"+ this.Getcount()  ;
    }
}
    class Parallelepipede extends Rectangle {
        private static int count1 = 0 ;
        private float height ;
        public Parallelepipede(float length , float width , float height){
            super(length,width);
            this.height = height ;
            Parallelepipede.count1 += 1 ;
        }

        public Parallelepipede(){
            height = 0 ;
            Parallelepipede.count1 += 1 ;
        }

        public Parallelepipede(Parallelepipede paror){
            super(paror);
            this.height = paror.height ;
            Parallelepipede.count1 += 1 ;
        }

        public float Getheight (){
            return height ;
        }

        public void Setwidth(float height1){
            this.height = height1 ;
        }

        public float Getcount1 (){
            return count1 ;
        }

        public boolean Equals(Parallelepipede par1) {
            return par1.Getlength() == this.Getlength() && par1.Getwidth() == this.Getwidth() && par1.Getheight() == this.Getheight();
        }

        public float Surface (){
            return ((super.Surface()) + this.height * super.Getwidth() + this.height * super.Getlength()) * 2 ;
        }
        public String ToString() {
            return "Length : " + super.Getlength() + "\nWidth : "+ super.Getwidth()+ "\nHeight : " + this.Getheight() + "\nNbrParallelepipede" + Getcount1();
        }

        public float Volume(){
            return super.Getwidth() * super.Getlength() * this.Getheight() ;
        }
    }
    
