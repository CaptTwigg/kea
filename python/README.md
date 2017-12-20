# Python range for java
By Mike H. Jahn

## Documentation:

 
### Methods 
- range(max);
- range(min, max);

### Use

``` 
import static kea.python.Range.range;
```

Example:
```
    for(int i : range(10)){
      System.out.println(i);
    }
```

Output:
```
0
1
2
3
4
5
6
7
8
9
```
Example with mininum and maxinum:
```
    for(int i : range(5, 10)){
      System.out.println(i);
    }
```

Output:
```
5
6
7
8
9
```


