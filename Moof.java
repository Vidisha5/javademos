
public class Moof {

	private int i;

	public Moof(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public boolean equals(Object o) {
		/*Moof obj=(Moof) o;
		if(obj instanceof Moof && obj.i==this.i) {
			return true;
		}
		else {
			return false;
		}*/
		if(o instanceof Moof && ((Moof)o).getI()==this.i) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Moof moof=new Moof(8);
		Moof moof1=new Moof(9);
		System.out.println(moof.equals(moof1));
	}
}
