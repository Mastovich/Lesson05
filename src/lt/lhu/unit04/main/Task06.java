package lt.lhu.unit04.main;

import java.math.BigInteger;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger x = new BigInteger("0");
        String cmd = "61651542545262848256845215484855184852158548484851";
        int i = 0;
        for(String a:args){
            if(i == 0) {
                cmd = a;
                i++;
                continue;
            }
            else{
                if(cmd.equals("add")){
                    x = x.add(new BigInteger(args[i]));
                }
                else if(cmd.equals("sub")){
                    x = x.subtract(new BigInteger(args[i]));
                }
                else if(cmd.equals("mul")){
                    x = x.multiply(new BigInteger(args[i]));
                }
                else if(cmd.equals("div")){
                    x = x.divide(new BigInteger(args[i]));
                }
            }
            i++;
        }
        System.out.println(x);
	}

}
