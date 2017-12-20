# Save & Load objects to a file
By Mike H. Jahn

## Documentation:
Methods to load and save objects to a file as byte code.
 
### Methods 
- save(); 
  - returns void
- load(); 
  - returns ArrayList


### Use

``` 
import static kea.file.Object.*;

load(file);
save(file, object);
```
Example on save:
```java
import static kea.file.Object.*;
import java.util.ArrayList;

public class test {
  public static void main(String[] args) throws Exception{
    
    String file = "test.ser";
    ArrayList<String> list = new ArrayList<>();
    
    list.add("first");
    list.add("second");
    list.add("third");
    
    save(file, list); 
  }
}
```

Output to test.ser file:
```
�� sr java.util.ArrayListx����a� I sizexp   w   t firstt secondt thirdx
```

Example on load:
```java
import static kea.file.Object.*;
import java.util.ArrayList;

public class test {
  public static void main(String[] args) throws Exception{
    
    String file = "test.ser";
    ArrayList<String> list = load(file);
    
    System.out.println(list);

  }
}
```

Output to the terminal:
```
[first, second, third]
```