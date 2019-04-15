

class BinDec{

	public double Exercise1(String x){
		System.out.println("This is the decimal notation of " + x + " : ");
		String k;
		int m=x.length()-1, n=0 , i;
		double d=0;
		for(i=m; n<=m; i--){
			
			k=x.substring(i,i+1);
			d+=Integer.parseInt(k)* (Math.pow(2,n));
			n++;
		}	
		System.out.println( d);
		return d;
	}

}


class BinDec1{
	public static void main(String abc[]){
		BinDec Z= new BinDec();
		Z.Exercise1("11110110001");

	}
}

