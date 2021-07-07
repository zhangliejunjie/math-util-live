package com.fu.mathutil;

//TA VIẾT CLASS ĐỂ CHUNG CẤP CHO NƠI KHÁC XÀI
//KHI ĐÓ TA KHÔNG CÒN NHỚ CÁI GÌ CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {

    //n! = 1.2.3.4...n
    //0! = 1! = 1
    //không có Factorial cho n < 0
    //20! là vừa khớp kiểu long (tối đa 18 con số 0)
    //nếu đưa vào âm hay 21 => ta éo tính và ta đập vào mặt ai xài hàm này một 
    //Expception 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid Argument, n must be "
                    + "between 0 and 20");
        //hàm dừng liền éo cần return        
        //n nằm từ 0 đến 20
        if (n == 0 || n == 1) 
            return 1;
        //xuống đến đây n thuộc [0..20]
        //chơi for hoặc đệ qui - recursion
        //kỹ thuật nhồi con heo đất
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i; //product bằng product nhân với con i rồi đập ngược lại
        //nhân từ 2 đến n 
        return product;
    }
}
