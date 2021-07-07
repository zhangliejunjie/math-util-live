package com.fu.mathutil;

public class MathUtilLive {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);//hàm tính đi coi là mấy
        System.out.println("5! = 120; actual = " + result);
        System.out.println("6! = 720; actual = " + MathUtil.getFactorial(6));
        System.out.println("0! = 1  ; actual = " + MathUtil.getFactorial(0));
        //kỹ thuật kiểm thử phần mềm
        //MathUtil.getFactorial(-5);//ném ngoại lệ thật rồi
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 5:35PM 7.7.21
        System.out.println("3! = 6  ; actual = " + MathUtil.getFactorial(0));
    }
    
}
