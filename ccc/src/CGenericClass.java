
public class CGenericClass {

//	private volatile static CGenericClass instance;
//	
//	private CGenericClass() {
//		
//	}
//	
//	public static CGenericClass getInstance() {
//		
//		if(instance == null) {
//			synchronized (CGenericClass.class) {
//				if(instance == null) {
//					instance = new CGenericClass();
//				}
//			}
//		}
//		
//		return instance;
//	}
	
	
	public static CGenericClass getInstance() {
		
		return INNER.instance;
	}
	
	static class INNER{
		public static final CGenericClass instance = new CGenericClass();
	}
	
}
