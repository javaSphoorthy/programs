class Student {
    int id;
    String name;
    int[] yp = new int[4];

    Student(){

    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    Student(int id, String name, int[] yp){
        this.id = id;
        this.name = name;
        this.yp = yp;   
    }
    String getInfo(){
        String info;
        info = "id"+"="+id+"\n"+"name"+"="+name+"\n";
        for(int i=0;i<yp.length;i++){
            info += "year\t"+i+"=\t"+yp[i]+"%\n";
        }
        return info;
    }


}

class TestStudent{
    public static void main(String[] args){
    Student s1 = new Student(1, "Amith");
    System.out.println(s1.getInfo());
    int marks[] = new int[4];
    marks[0] = 20;
    marks[1] = 30;
    marks[2] = 45;
    marks[3] = 65;
    Student s2 = new Student(2, "smith", marks);
    System.out.println(s2.getInfo());
    marks[3] = 50;
    System.out.println(s2.getInfo());
    
}
}
