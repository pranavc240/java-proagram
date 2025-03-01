import java.util.Scanner;

class SwitchCase 
{
	public static void main(String[] args) 
	{System.out.println("***************havlet Resturant*************");
		System.out.println("***************MENU*************");
		System.out.println("1.papad \n2.pizza \n3.shevpav \n4.misal \n5.pavbaji \n6.vadapav\n7.momos \n8.shawrama \n9.chai");
		System.out.println("\n pelase place your order");
		
		Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();




		switch (a)
		{
		case 1 :{
			System.out.println("your order has confirmed");

			System.out.println("papad will be served in few min ");
			}
			break;


		case 2 :{
			System.out.println("your order has confirmed");
			System.out.println("pizza will be served in few min ");
			}
			break;

		case 3 :{
			System.out.println("your order has confirmed");
			System.out.println("shevpav will be served in few min ");
			}
			break;
		case 4 :{
			System.out.println("your order has confirmed");
			System.out.println("misal will be served in few min ");
			}
            break;
		case 5 :{
			System.out.println("your order has confirmed");
			System.out.println("pavbaji will be served in few min ");
			}
			break;
		case 6 :{
			System.out.println("your order has confirmed");
			System.out.println("vadapav will be served in few min ");
			}
			break;
		case 7 :{
			System.out.println("your order has confirmed");
			System.out.println("momos will be served in few min ");
			}
		case 8 :{
			System.out.println("your order has confirmed");
			System.out.println("shawarama will be served in few min ");
			}
			break;
		case 9 :{
			System.out.println("your order has confirmed");
			System.out.println("chai will be served in few min ");
			}
			break;


		default:
			{
				
              System.out.println("your order has not confirmed");
			}
		
		}




	}
}
