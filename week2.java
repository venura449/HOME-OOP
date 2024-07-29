class Reciptionist{
    private int id;
    private String name;
    private String telephone;
    
    Reciptionist(int id,String name,String telephone){
        this.id = id;
        this.name = name;
        this.telephone = telephone;
    }
    
    public void set_id(int id){
        this.id = id;
    }
    public int get_id(){
        return id;
    }
    
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return name;
    }
    
    public void set_telephone(String telephone){
        this.telephone = telephone;
    }
    public String get_telephone(){
        return telephone;
    }
}





public class Main{
    public static void main(String [] args){
        Reciptionist R1 = new Reciptionist(1,"Tharusha","0763472790");
        
        
        System.out.println("Id : " + R1.get_id());
        System.out.println("Name :"+ R1.get_name());
        System.out.println("Telephone :" + R1.get_telephone());
    }
}