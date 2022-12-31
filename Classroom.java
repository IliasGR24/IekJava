
public class Classroom {
	
	private String classCode;
	private String classDesc; 
	
	public String getClassCode() {
		
		return classCode;
	}
	
	public String getClassDesc() {
		
		return classDesc;
	}
	
	public void setClassCode(String x) {
		
		classCode = x;
	}
	
	public void setClassDesc(String y) {
		
		classDesc = y;
	}
	
	public void printInfo() {
		System.out.println("Taxsh "+this.getClassDesc());
		System.out.println("Me kodoko taxhs "+this.getClassCode());
	}

}