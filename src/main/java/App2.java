import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


/**
 * Created by AndrewUkraine on 05.02.2018.
 */

//этими просто реализую печать , прсто вывоим надпись с помощью спринга

public class App2 {


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Print_2_App2.class);

        ctx.getBean(Print_App2.class).print();





    }
}
