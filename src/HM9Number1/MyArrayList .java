package HM9Number1;

class MyArrayList  {


     private Object[] data;
     private int size;

     public MyArrayList() {
         this.data = new Object[10];
         this.size = 0;

     }

     public  int size(){

         return size;
    }


     public void add(Object value){
        if(size >= data.length){
            resizeArray();
        }
        data[size] = value;
        size++;
         }
     public void resizeArray (){
         Object[] newArray = new Object[data.length * 2];
         System.arraycopy(data, 0, newArray, 0, size);
         data = newArray;
     }


     public Object get(int index){
         if (index < 0 || index >= size)
             throw new IndexOutOfBoundsException("Invalid index");
         return data[index];
     }
     public  void remove(int index){
         if (index < 0 || index >= size)
             throw new IndexOutOfBoundsException("Invalid index");
         for(int i = index;i < size - 1; i++){
             data[i] = data[i + 1];
         }
         data[size - 1] = null;
         size--;
         }

     public  void clear(){
         for (int i =0; i< size; i++){
             data[i] = null;

         }
          size =0;
     }

}

