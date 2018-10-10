package creational.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHelper.instance;
	}

	private static class SingletonHelper {
		private static final Singleton instance = new Singleton();
	}

	protected Object readResolve() {
		return getInstance();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}

}
