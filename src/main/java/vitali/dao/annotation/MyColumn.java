package vitali.dao.annotation;




import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;









/**
 * It is a columns name annotation.
 * @author Vitali
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@interface MyColumn { // It is description
    String name(); // It is description
    // It is annotation.
}
