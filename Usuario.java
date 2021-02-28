public class Usuario
{
	String nome;
	double saldo;

	public Usuario(String nome, double saldo)
	{
		this.nome = nome;
		this.saldo = saldo;
	}

	public void depositar(double valor)
	{
		this.saldo = saldo + valor;
	}

	public void sacar(double valor)
	{
		if(valor > this.saldo)
		{
			System.out.println("Valor maior que o Saldo!");
		}else{
			this.saldo = saldo - valor;
		}
	}

	public void setNome(String nome)
	{
		this.nome = nome;	
	}

		public String getNome()
		{
			return nome;
		}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

		public double getSaldo()
		{
			return saldo;
		}
}