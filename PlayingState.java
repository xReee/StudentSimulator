import processing.core.*;
import java.util.Random;

class Playing implements State {
  Student student;
  
  private static final Playing instance = new Playing();
  
  private Playing(){}
  public int timerMultiplier;
  
  public static Playing getInstance(Student s, int timerMultiplier){
    instance.timerMultiplier = timerMultiplier;
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está se divertindo sozinho.");
    System.out.println("");
    
    student.change(Constraint.ignorance,2);
    student.change(Constraint.loneliness,2);
    student.change(Constraint.sleepiness, (int)0.7*timerMultiplier);
    student.change(Constraint.hunger,4);
    student.change(Constraint.stress,-2);
    
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O Aluno começou a se divertir para passar o tempo.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O Aluno começou terminou de se divertir.");
    System.out.println("");
  }
}
