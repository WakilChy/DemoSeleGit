package Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException   {
		
		ReflectionData ref = new ReflectionData();
		
		Class cls1 = ref.getClass();
		System.out.println(cls1.getName());
		
		
		
		Constructor con = cls1.getConstructor();
		System.out.println(con.getName());
		
		
		Method[] mtd = cls1.getMethods();
		
		
		for (Method m : mtd) {
			System.out.println(m.getName());
		}
		
		Field f1=cls1.getDeclaredField("name");
		System.out.println(f1.getName());
		
		
		
		

	}

}
