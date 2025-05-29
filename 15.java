public int buscarPosicao(int valor) {
  
    int posicao = inicio;

    for (int i = 0; i < qtd; i++) {
      
        if (elementos[posicao] == valor) {
            return i; 
        }
      
        posicao++;
        if (posicao > elementos.length - 1) {
            posicao = 0;
        }
    }

    return -1; 

}
