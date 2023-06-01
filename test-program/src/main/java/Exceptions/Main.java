package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //divide(a,b);
            //throw new Exception("Just for fun");
            String name = new String();
            name = "Mateusz";
            if (name.equals("Mateusz")) {
                throw new MyException("Name is Mateusz");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        } finally {
            System.out.println("This will always execute");
        }
    }
        static int divide ( int a, int b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Please do no divide by zero");
            }
            return a / b;
        }
    }

