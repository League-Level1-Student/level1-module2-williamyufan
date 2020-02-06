package _07_tea_party;



public class Tea_party {
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if(isKnighted & isWoman) {
        	return "Welcome Lady" + name;
        }
        else if(isKnighted & isWoman==false) {
        	
        	return "Welcome Sir" + name;
        	
        }
        else if(isKnighted==false & isWoman) {
        return "Welcome Mrs." + name;
        	
        }
        else{
        	return "Welcome Mr." + name;
        }
		
        
        
        }
}




