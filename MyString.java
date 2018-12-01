public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  //constructor
  public MyString(CharSequence s){
    int nu=s.length();
    this.data = new char[nu];
    for(int i=0;i<data.length;i++){data[i]=s.charAt(i);}
  }
  //Methods
  public int length(){
    return data.length;
  }
  public char charAt(int index){
    if(index<0||!(index<this.data.length))throw new IndexOutOfBoundsException();
    return this.data[index];
  }
  public CharSequence subSequence(int start, int end){
    if(start<0||end<0||end>data.length||start>data.length||start>end)throw new IndexOutOfBoundsException();
    String ret="";
    for(int i=0;i<end-start;i++){
      ret+=data[i+start];
    }
    CharSequence s = new MyString(ret);
    return s;
  }
  public String toString(){
    String s="";
    for(int i=0;i<data.length;i++){
      s+=data[i];
    }
    return s;
 }
 public int compareTo(CharSequence o){
   for(int i=0;i<o.length()&&i<this.length();i++){
     if(!(o.charAt(i)==this.charAt(i)))return this.charAt(i)-o.charAt(i);
   }
   return this.length()-o.length();
 }
}
