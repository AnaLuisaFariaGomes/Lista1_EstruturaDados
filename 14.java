public boolean existeValor(int valor) {
        int posicao = this.inicio;
        for (int i = 0; i < this.qtd; i++) {
            if (this.elementos[posicao] == valor) {
                return true;
            }
            posicao++;
            if (posicao > this.elementos.length-1) { 
                posicao = 0;
            }
        }
        return false;
}
