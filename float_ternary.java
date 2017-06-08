public class main {
  public static void Main(String[] args) {
    float students = 30;
    float rooms = 4;

    float studentsPerRoom = rooms == 0.0f ? 0.0f : students/rooms;

    System.out.println(studentsPerRoom);
  }
}
