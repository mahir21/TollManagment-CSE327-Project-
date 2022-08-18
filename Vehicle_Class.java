package toll_Plaza;

public class Vehicle_Class {
	public  int payment(int v){
        int pay;
        switch (v) {
            case 1:
                pay =100;
                break;
            case 2:
                pay =750;
                break;
            case 3:
                pay =1200;
                break;
            case 4:
                pay =1300;
                break;
            case 5:
                pay =1400;
                break;
            case 6:
                pay =2000;
                break;
            case 7:
                pay =2400;
                break;
            case 8:
                pay =1800;
                break;
            case 9:
                pay =2100;
                break;
            case 10:
                pay =2800;
                break;
            case 11:
                pay =5500;
                break;
            case 12:
                pay =6000;
                break;
            /*case 13:
                pay =6000;
                break;*/
                
            default:
                pay=6000;
                break;
        }
        return pay;    
            
        
    }

}
