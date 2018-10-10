package structural.proxy;

public class ProxyExample {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("admin", "dfhgjkfh@jd");
		try {
			executor.runCommand("dir");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}
}
