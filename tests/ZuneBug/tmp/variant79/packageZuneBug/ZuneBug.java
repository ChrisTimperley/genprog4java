package packageZuneBug;

public class ZuneBug {

    public int CurrentYear(int days){

    	int year = 1980;
    	while(days > 365){
    		{
				if (days > 366) {
					days -= 366;
					year += 1;
				}
			}
    	}
    	return year;
    }
}