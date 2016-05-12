public class ComplexNumber 
{
	public static int myReal;
	public static int myImaginary;
	
	public ComplexNumber(int real, int imaginary)
	{
		myReal = real;
		myImaginary = imaginary;
	}
	
	public static int getReal()
	{
		return myReal;
	}
	
	public static int getImaginary()
	{
		return myImaginary;
	}
	
	public String iRaisedTo()
	{
		if(myReal < 0)
		{
		    if(Math.abs(myReal) % 4 == 0)
		    {
		    	return "";
		    }
		    else if(Math.abs(myReal) % 4 == 1)
		    {
		    	return "-i";
		    }
		    else if(Math.abs(myReal) % 4 == 2)
		    {
		    	return "-";
		    }
		    else
		    {
		    	return "i";
		    }
		}
		else if(myReal > 0)
		{
		    if(Math.abs(myReal) % 4 == 0)
		    {
		    	return "";
		    }
		    else if(Math.abs(myReal) % 4 == 1)
		    {
		    	return "i";
		    }
		    else if(Math.abs(myReal) % 4 == 2)
		    {
		    	return "-";
		    }
		    else
		    {
		    	return "-i";
		    }
		}
		else
		{
			return "";
		}
	}
	
	public String reduce()
	{
		int number;
		if(myImaginary > 0)
		{			
			if(myImaginary % 2 == 0)
			{
				number = myImaginary/2;
				if(number == 1)
				{
					return "-π + " + 2*myImaginary + "kπ";
				}
				else
				{
					return "-" + number + "π + " + 2*myImaginary + "kπ";
				}
			}
			else
			{
				if(myImaginary == 1)
				{
					return "π/2 + " + 2*myImaginary + "kπ";
				}
				else
				{
					return "-" + myImaginary + "π/2 + " + 2*myImaginary + "kπ";
				}
			}
			
		}
		
		else if(myImaginary < 0)
		{
			if(myImaginary % 2 == 0)
			{
				number = myImaginary/2;
				if(number == -1)
				{
					return "π + " + 2*myImaginary + "kπ";
				}
				else
				{
					return number + "π + " + 2*myImaginary + "kπ";
				}
			}
			else
			{
				if(myImaginary == -1)
				{
					return "-π/2" + 2*myImaginary + "kπ";
				}
				else
				{
					return myImaginary + "π/2 + " + 2*myImaginary + "kπ";
				}
			}
		}
		
		else
		{
			return "0";
		}
	}
}
