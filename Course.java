import java.util.ArrayList;
	

	public class Course
	{
		private String courseName;
		private ArrayList<String >students = new ArrayList<String>();
		private int numberOfStudents;
	

		public Course(String courseName)
		{
			this.courseName = courseName;
		}
	

		public void addStudent(String student)
		{
			students.add(student);
			numberOfStudents++;
		}
	

		public ArrayList<String> getStudents()
		{
			return students;
		}
	

		public int getNumberOfStudents()
		{
			return numberOfStudents;
		}
	

		public String getCourseName()
		{
			return courseName;
		}
	

		public void clear()
		{
			students.removeAll(students);
			numberOfStudents = 0;
		}
	

		public void dropStudent(String student)
		{
			for (int i = 0; i < numberOfStudents; i++)
			{
				if (students.get(i) == student)
				{
					students.remove(i);
					numberOfStudents--;
					break;
				}
			}
		}
	}
