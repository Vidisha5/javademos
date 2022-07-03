
public class Covariantreturn1 extends Covariantreturn{

	@Override
	Covariantreturn1 meth1() {
		
		return new Covariantreturn1();
	}

	

	

	
}
class Covariantreturn{
	Covariantreturn meth1() {
		return new Covariantreturn();		
	}
}