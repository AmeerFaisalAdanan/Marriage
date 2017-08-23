
public class Perempuan
{
    String nama;
    int umur;
    public Perempuan(String nama, int umur)
    {
       this.nama=nama;
       this.umur=umur;
    }
    
    public void berkahwin()
    {
        Lelaki suami = new Lelaki("Ali", 21);
        suami.getNama();
    }
    public void papar()
    {
        Perempuan p = new Perempuan("Ani", 21);
        Lelaki suami = new Lelaki("Ali", 21);
        return suami.getNama(nama);
    }
}
