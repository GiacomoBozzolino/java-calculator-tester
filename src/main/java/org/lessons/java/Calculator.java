package org.lessons.java;

public class Calculator {
	
	public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) throws Exception {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new Exception("Cannot divide by zero");
        }
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

	public float multiply() {
		// TODO Auto-generated method stub
		return 0;
	}

}
