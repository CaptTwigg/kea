# Create tables and manipulate them with ease:
Made by Marco Bang Romeri

## Documentation:

### Initialize a table:
```
Table table = new Table(new String[]{}, new int[]{});
```

The constructor takes 2 parameters:
 - An array of strings which contains the headers for the table.
 - An array of int which containts the width of the cells (not including padding or border).
 
 Example:
```
Table table = new Table(new String[]{"ID:", "Firstname:", "Lastname:"}, new int(){20, 20, 20});
```

### Set padding on cells
```
table.setPadding(1);
table.setPadding(1, 2);
table.setPadding(1, 2, 1, 4);
```

This method sets the padding of all cells (between the data of the cell and the border):
 - First method shown takes 1 parameter, this parameter applies to all paddings of the cell (TOP, BOTTOM, RIGHT, LEFT).
 - Second method shown takes 2 parameters, first parameter applies to TOP and BOTTOM, second parameter applies to LEFT and RIGHT.
 - Third method shown takes 4 parameters, first parameter applies to TOP, second applies to RIGHT, third applies to BOTTOM and fourth applies to LEFT.
 
 ### Set border on cells
 ```
table.setBorder(1, '+');
```

This method creates a border around the table and between each cell:
- First parameter contains the width of the border.
- Second parameter contains the char which the border contains of.

### Insert a row into the table (besides the already made headers)
 ```
table.row(new String[]{});
```

This method create a row in the table:
 - The method takes 1 parameter which needs to be an array of string, REMEMBER to convert any value, which is not a string to a string, by simply call String.valueOf(<variable>);
 - Also, REMEMBER, to have as many elements as the headers of the tables have.
 
Example:
 ```
table.row(new String[]{String.valueOf(1)});
```

### Print the table to the console
 ```
table.print();
```

Simply call this method when the table is done and is ready to be printed.
