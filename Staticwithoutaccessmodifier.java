class Staticwithoutaccessmodifier{
    static String s(){
        return "hello Students";
    }
    public static void main(String args[]){
        String res=s();
        System.out.println(res);
    }
}