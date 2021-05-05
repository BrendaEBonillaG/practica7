public boolean parseOption(char option) {
    switch (option) {
        case 'y':
        case 'Y':
            System.out.println("La opción es afirmativa");
            break;

        case 'n':
        case 'N':
            System.out.println("La opción es negativa");
            break;

        default:
            System.out.println("La opción seleccionada puede ser Y o N");
            return false;

        }
        return true;
}
