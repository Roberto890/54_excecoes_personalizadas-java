package model.exceptions;
						// se colocar extends RuntimeException
						//nao � presciso tratar a exce��o q sair
public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
}
