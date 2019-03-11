import java.util.*; 
import java.io.*;

class Main {  
  public static String ScaleBalancing(String[] strArr) {
    int[] scale = toArray(strArr[0]);
    int left = scale[0];
    int right = scale[1];
    int[] weight = toArray(strArr[1]);
    List<String> solution = new ArrayList<>();
    for (int i = 0; i < weight.length; i++) {
        if (Math.abs(left - right) == weight[i]) 
            solution.add("" + weight[i]);
        for (int j = i + 1; j < weight.length; j++)
            if ((left + weight[i]) == (right + weight[j]) 
                || (left + weight[j]) == (right + weight[i]) 
                || Math.abs(left - right) == (weight[i] + weight[j]))
                solution.add(weight[i] + "," + weight[j]);
    }
    if (!solution.isEmpty()) {
        Collections.sort(solution, (s1, s2) -> Integer.valueOf(s1.length()).compareTo(s2.length()));
        return solution.get(0);
    }
    return "No possible solution. Please try again.";
  }
  
  public static int[] toArray(String str) {
      String[] strWeight = str.substring(1, str.length() - 1).split(",");
      int[] weight = new int[strWeight.length];
      for (int i = 0; i < strWeight.length; i++) weight[i] = Integer.parseInt(strWeight[i].trim());
      return weight;
  }
  
  public static void main (String[] args) { 
    Scanner s = new Scanner(System.in);
    System.out.print(ScaleBalancing(s.nextLine())); 
  }   
}
