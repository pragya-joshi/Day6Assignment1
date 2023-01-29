package day6;

import java.util.*;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>empList=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		System.out.println("Press 1 to Insert");
		System.out.println("Press 2 to Display");
		System.out.println("Press 3 to Search");
		System.out.println("Press 4 to Delete");
		System.out.println("Press 5 to Update");
		System.out.println("Press 6 to Exit");
		int choice;
		do {
			System.out.println("Enter your choice ");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter empInfo");
				int empNo=in.nextInt();String name=in.next();int salary=in.nextInt();
				Employee emp=new Employee(empNo,name,salary);
				empList.add(emp);
				break;
			case 2:
				displayDetails(empList);
				break;
			case 3:
				System.out.println("Enter empNo to be searched");
				int targetEmpNo=in.nextInt();
				Iterator<Employee>itr=findEmployee(empList,targetEmpNo);
				if(itr.hasNext()) {
					System.out.println("Employee with "+targetEmpNo+" found");
				}else {
					System.out.println("Employee with "+targetEmpNo+" not found");
				}
				break;
				
			case 4:
				System.out.println("Enter empNo to be deleted");
				int targetEmp=in.nextInt();
				Iterator<Employee>itr1=findEmployee(empList,targetEmp);
				if(itr1.hasNext()) {
					itr1.remove();
					System.out.println("Employee with "+targetEmp+" removed");
				}else {
					System.out.println("There exist no employee with empno "+targetEmp);
				}
				
				break;
				
			case 5:
				System.out.println("Enter empNo to be updated");
				int targetEmpNum=in.nextInt(),newEmpNo=in.nextInt();int index=-1;
				for(int i=0;i<empList.size();i++) {
					if(empList.get(i).getEmpNo()==targetEmpNum) {
						index=i;
						break;
					}
				}
				if(index!=-1) {
					empList.get(index).setEmpNo(newEmpNo);
					System.out.println("Employee with empNo "+targetEmpNum+" updated to "+newEmpNo);
				}else {
					System.out.println("Employee with empNo "+targetEmpNum+" not present");
				}
				break;
			case 6:
				System.out.println("Exit successful!");
				break;
			}
		}while(choice!=6);
		
		
	}
	public static void displayDetails(List<Employee>empList) {
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static Iterator<Employee> findEmployee(List<Employee>empList,int targetEmpNo) {
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext()) {
			Employee emp1=(Employee) itr.next();
			if(emp1.getEmpNo()==targetEmpNo) {
				break;
			}
			
		}
		
		return itr;
	}

}
