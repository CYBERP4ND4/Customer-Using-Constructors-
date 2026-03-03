

class customer{
    //encapsulation
    private int cno;
    private  String cname;
    private String add;
    private String item_des;
    private double price;
    private double quantity;
    private int modePay;

    customer(){
        cno = 123456789;
        cname = "Max Verstappen";
        add = "Netherlands";
        item_des = "Red Bull";
        price = 25.50;
        quantity = 1;
        modePay = 1;
    }

    customer(int cno, String cname, String add, String item_des, double price, double quantity, int modePay){
        this.cno = cno;
        this.cname = cname;
        this.add = add;
        this.item_des = item_des;
        this.price = price;
        this.quantity = quantity;
        this.modePay = modePay;
    }
    //setters
    public void setCNO(int a){
        cno=a;
    }
    void setCNAME(String a){
        cname=a;
    }
    void setADD(String a){
        add=a;
    }
    void setIDES(String a){
        item_des=a;
    }
    void setPRICE(double a){
        price=a;
    }
    void setQUAN(double a){
        quantity=a;
    }
    public void setMODEPAY(int a){
        modePay=a;
    }
    //getters
    public int getCNO(){
        return cno;
    }
    String getCNAME()
    {
        return cname;
    }
    String getADD()
    {
        return add;
    }
    String getIDES()
    {
        return item_des;
    }
    double getPRICE()
    {
        return price;
    }
    double getQUAN()
    {
        return quantity;
    }

    double compute()
    {
        return price * quantity;
    }

    double net()
    {
        double net_ttl=0;
        switch (modePay) {
            case 1: net_ttl= compute() * 0.95; break;
            // net_ttl = compute() - (compute()*0.05);
            case 2: net_ttl= compute() * 1.05; break;
            // net_ttl = compute() + (compute()*0.05);
            case 3: net_ttl= compute() * 1.1; break;
            // net_ttl = compute() + (compute()*0.1);
            default:
                System.out.println("Invalid choice."); net_ttl = 0;
                
        }

        return net_ttl;
    }

    void display()
    {
        System.out.println("Customer Details");
        System.out.println("Customer NO : "+cno);
        System.out.println("Name : "+cname);
        System.out.println("Address : "+add);
        System.out.println("Item Description : "+item_des);
        System.out.println("Price : Php "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Price : Php "+compute());
        System.out.println("Net Price : Php "+net());

    }
}