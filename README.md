# ArbitraryInteger
A Java class that handles arbitrarily long integer. Slightly better performance than BigInteger in almost every category.
There are several functions available:
  ArbitraryInteger(String value): This is the constructor that you feed a String into. It returns an initialized ArbitraryInteger. Example: ArbitraryInteger arbInt = new ArbitraryInteger("277777788888899");
  multiply(ArbitraryInteger value): This is the multiply function that you feed an already initialized ArbitraryInteger into. It returns an ArbitraryInteger. Example: arbInt = arbInt.multiply(arbInt);
  add(ArbitraryInteger value): This is the addition function that you feed an already initialized ArbitraryInteger into. It returns an ArbitraryInteger. Example: arbInt = arbInt.add(arbInt);
  subtract(ArbitraryInteger value): This is the subtraction function that you feed an already initialized ArbitraryInteger into. It returns an ArbitraryInteger. Example: arbInt = arbInt.subtract(arbInt);
  equals(Object o): Returns true if the object given is equivalent to the ArbitraryInteger. Returns false if otherwise. Example: if(arbInt.equals(arbInt){}
  compareTo(ArbitraryInteger):  Returns true if the ArbitraryInteger given is equivalent to the ArbitraryInteger. Returns false if otherwise. Example: if(arbInt.compareTo(arbInt){}
In addition, there are functions that take no arguments are return what they say they return:
  getSign(): Returns the sign of the ArbitraryInteger as 1 (positive) or -1 (negative).
  intValue(): Returns the int value of the ArbitraryInteger if it's below the int max.
  longValue(): Returns the long value of the ArbitraryInteger if it's below the long max.
  floatValue() and doubleValue() remain unimplemented do to their uselessness.
  hashCode(): Returns the hash code of the ArbitraryInteger.
  getNumber(): Returns an array of longs storing the value of the ArbitraryInteger.
  toString(): Returns a String representing the ArbitraryInteger.
  
  
