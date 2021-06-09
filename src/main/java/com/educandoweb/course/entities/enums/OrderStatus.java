package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	AGUARDANDO_PAGAMENTO (1),  // colocando esses números para facilitar se for necessário fazer alguma alteração. 
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private OrderStatus(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Função para converter um valor numérico para um tipo Enumerado.  
	  * @return O OrderStatus correspondente ao código passado.
	  * 
    */

	public static OrderStatus valueOf(int codigo) {
		for (OrderStatus valor : OrderStatus.values()) {
			if(valor.getCodigo() == codigo) {
				return valor;
			}
		}
		throw new IllegalArgumentException("CÓDIGO DO STATUS DO PEDIDO INVÁLIDO");
	}
}

