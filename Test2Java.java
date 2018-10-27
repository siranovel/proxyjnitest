import java.util.Map;
public class Test2Java {
	private String id;
	private String name;
	private String memo;
	public Test2Java(String id, String name, String memo) {
		this.id = id;
		this.name = name;
		this.memo = memo;
	}
	public void showInfox(TestJava testJava) {
		System.out.println("showInfox in");
		testJava.objectTest_paramS(id, name, memo);
	}
	public void showInfoy(Runnable runner, Map<String, Object> hv) {
		System.out.println("showInfoy in");
		runner.run();
		
	}
}
