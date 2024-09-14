class ComplexNumber {
    double real, imag; 
    ComplexNumber(double r, double i) { real = r; imag = i; }
    ComplexNumber add(ComplexNumber c) { return new ComplexNumber(real + c.real, imag + c.imag); }
    ComplexNumber sub(ComplexNumber c) { return new ComplexNumber(real - c.real, imag - c.imag); }
    ComplexNumber mul(ComplexNumber c) { return new ComplexNumber(real * c.real - imag * c.imag, real * c.imag + imag * c.real); }
    ComplexNumber conjugate() { return new ComplexNumber(real, -imag); }
    public String toString() { return real + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i"; }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5), c2 = new ComplexNumber(2, -3);
        System.out.println("Sum: " + c1.add(c2) + ", Sub: " + c1.sub(c2) + ", Mul: " + c1.mul(c2) + ", Conj: " + c1.conjugate());
    }
}
