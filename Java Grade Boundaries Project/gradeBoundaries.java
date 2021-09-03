public class gradeBoundaries{
  String gradeExpectations;
  String candidateList;
  boolean gradeAchieved;

  public gradeBoundaries(String candidates, String grades, Boolean achieved) {
      candidateList = candidates;
      gradeExpectations = grades;
      gradeAchieved = achieved;
    }
  
  public void greetCandidate(){ //Grade portal structure
    System.out.println("Welcome to your grade portal, " + candidateList + "!");
  }
  public void gradeRequirements() {
      System.out.println("You need to achieve an " + gradeExpectations + "!");
    System.out.println("To successfully graduate from High School!");
  }
  public void canGraduate() { //Checks to see if student can graduate
      boolean gradeA = true;
      boolean gradeB = false;
      boolean gradeC = false;
      boolean gradeD = false;
      if (gradeAchieved == gradeA) {
          System.out.println("Can graduate!");
        } else if(gradeAchieved == gradeB) {
          System.out.println("Can graduate!");
        } else if(gradeAchieved == gradeC) {
          System.out.println("Can graduate!");
        } else if(gradeAchieved == gradeD) {
          System.out.println("Cannot graduate!");
}          else {
          System.out.println("Grade not found!");
}
  }       
  public static void get() { 
    gradeBoundaries gradePortal = new gradeBoundaries("Dave", "c", true);
    gradePortal.greetCandidate();
    gradePortal.gradeRequirements();
    gradePortal.canGraduate();
    
}
      
      
  }
