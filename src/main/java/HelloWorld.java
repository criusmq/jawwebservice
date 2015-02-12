import static spark.Spark.*;

public class HelloWorld {
  public static void main(String[] args){

    get("/", (req,res)->{
      return new Hello("world");
    }, new GsonTransformer());

    get("/hello/:name", (req,res)->{
      return new Hello(req.params(":name"));
    }, new GsonTransformer());
  }
}
