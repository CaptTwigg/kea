# Input Error Check with messages
By Mike H. Jahn

## Documentation:
Methods to repeat user input until right input type given.
Methods take a message for what to enter and an error message for feedback.

### Methods 
- Int();
- Boolean();

Both work the same way, just takes diffrent type as input.

### Use

```
intputCheck.Int(Input message, Error message);
intputCheck.Boolean(Input message, Error message);
```

Example:
```
intputCheck.Int("Enter a number: ", "Not a number");
```

Output:
```
Enter a number: 2
```

Output with error:
```
Enter a number: k
Not a number
Enter a number: 
```
