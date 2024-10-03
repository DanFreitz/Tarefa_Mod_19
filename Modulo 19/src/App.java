import Anotacao.Table;
import Entidades.Produto;

import java.lang.annotation.Annotation;

/**
 * @author Daniel
 */

public class App {

    public static void main(String[] args) {

        Class<Produto> produtoClass = Produto.class;
        Annotation[] annotations = produtoClass.getAnnotations();

        for (Annotation annotation : annotations) {

           if (annotation instanceof Table tableAnnotation) {
               String product = tableAnnotation.name();
               System.out.println("Product Name: " + product);
           }
        }
    }
}
