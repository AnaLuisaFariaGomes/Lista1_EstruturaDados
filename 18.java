public static void converteDeci(int numUm, int base) {
        Stack<Integer> pilha = new Stack<>();

        while(numUm>0) {
            pilha.push(numUm%base);
            numUm/=base;
        }

        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
}
