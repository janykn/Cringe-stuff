class Main {
    public static String Reverse(String str){
    if(str.length()==0){
        return "";
    }
    return str.substring(str.length()-1,str.length()) + Reverse(str.substring(0,str.length()-1));
}
  public static void main(String[] args) {
    String str1 = "java is fun";
    System.out.println(Reverse(str1));

  }
}
