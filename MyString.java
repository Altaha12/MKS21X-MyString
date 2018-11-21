public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  //constructor
  public MyString(CharSequence s){
    this.data=s.toCharArray();
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
    if(start<0||end<0||end>data.length||start>data.length)throw new IndexOutOfBoundException();
  }
  public String toString(){}
  }
}
