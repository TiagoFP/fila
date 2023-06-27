package one.digitalinnovation;

public class Fila<T> {
	private No<T> refNoEntradaFila;

	public Fila() {
		this.refNoEntradaFila = null;
	}

	public void enqueue(T object) {
		No novoNo = new No(object);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}

	public T first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {

				} else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public T dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	public boolean isEmpty() {
		/*if (refNoEntradaFila == null) {
			return true;
		}
		return false;
		*/
		// Refatorando o código acima (simplificando)
		return refNoEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = " ";
		No noAuxiliar = refNoEntradaFila;

		if (refNoEntradaFila != null) {
			while (true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] --->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
	
	

	
}
