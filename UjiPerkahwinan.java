public class UjiPerkahwinan
{
    public UjiPerkahwinan()
    {
    }
    
    public static void main(String[] args)
    {
        Perempuan p = new Perempuan("Ani", 21);
        //Lelaki l = new Lelaki("Ali", 21);
        
        System.out.print(p.nama+" berkahwin kepada "+p.papar());
    }
}
