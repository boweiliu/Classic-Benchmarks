package som;

public class WhileLoop extends Benchmark {

  public int singleRun() {
    int sum = 0;
    while (sum < 1000) {
      sum++;
    }
    return sum;
  }

  @Override
  public Object benchmark() {
    int sum = 0;
    while (sum < 20000) {
      sum += singleRun();
    }
    return sum;
  }

  public static void main(final String[] args) {
    new WhileLoop().run(args);
  }

  @Override
  public boolean verifyResult(final Object result) {
    return result.equals(20000);
  }
}
