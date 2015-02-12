
## Building

    mvn clean install

## Running

    # with heroku foreman (from the Procfile)
    foreman start

    # OR
    # " is used to prevent shell expansion on *
    java -cp "target/classes:target/dependency/*" HelloWorld

## Dependencies

- [Spark](http://sparkjava.com/documentation.html)
- [Gson](https://code.google.com/p/google-gson/)
