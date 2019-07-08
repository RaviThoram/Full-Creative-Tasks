import java.io.Serializable;

//@SuppressWarnings("serial")
public class Message implements Serializable {

	//private static final long serialVersionUID = 1L;
	Integer firstNumber;
	Integer secondNumber;
	Integer result;
   
	Message(Integer firstNumber, Integer secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public Integer getfirstNumber() {
		return firstNumber;
	}
	public Integer getsecondNumber() {
		return secondNumber;
	}
	public Integer getresult() {
		return result;
	}
	public void setresult(Integer result) {
		this.result=result;
	}
	
}
