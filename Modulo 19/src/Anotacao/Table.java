package Anotacao;

/**
 * @author Daniel
 */

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)

public @interface Table {
    String name();
}
