/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loilt.mathutil.core;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Loi Lam
 */
public class MathUtilTest {
    //framework bắt dev phải viết code theo 1 khung dựng sẵn nào đó
    //thường khung đc kí hiệu @...  anotaion-flag đánh dấu 1 điều gì đó sẽ diễn ra
    //lúc biên dịch, runtime
    
    @Test   //test thử hàm so sánh 2 giá trị exception và actual
    //máy tự so  sánh giùm luôn, ko nhìn bằng mắt để tự so sánh
    //như bên hàm main() dùng sort()
    //mà FW JUnit tự generate ra code so sánh giá trị, tự
    //dùng bảng màu XANH ĐỎ mang ý
    public void  tryAssert(){
        Assert.assertEquals(100, 100);
    }
    
    //test hàng getFactorial() nhà mình,   như bên main()
    @Test   //quy tắt  đặt  tên  hàm dành  cho việc kiểm thử
    //tên hàm bao gồm ngữ nghĩa của việc kiểm thử
    //test này kiểm tra tính gt với tham số tử  tế 0..20
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1: n = 0, 0! hy vọng trả về ??
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        Assert.assertEquals(expected, actual);
        
        //Test case #1: n = 1, 1! hy vọng trả về ??
        
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #1: n = 2, 2! hy vọng trả về ??
        Assert.assertEquals(2, MathUtil.getFactorial(2));

    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWellV2() {
        
        //Test case #4: n = 3, 6! hy vọng trả về 6, ??
        
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n = 4, 4! hy vọng trả về 24, ??
        Assert.assertEquals(24, MathUtil.getFactorial(4));

    }
    
    //kiểm thử ngoại lệ khiđưa data cà chớn
    //n < 0, ko tính giaithừa âm
    //n > 20,  ko tính giai thừa tràn kiểu long
    //hàm đc thiết kế: Ném ra ngoại lệ tên là Ill;egal-Argument-Exception
    //thay vì nhận về 1 giá trị long, bạn nhận về 1 câu thông báo
    //ta đo lường có câu thông báo xuất hiện hay ko khi n = -5
    //thấy ngoại lệ 
    
    //nếu -5 mà app ném ra ngoại lệ IllegalArgumentException
    //nghĩa là hàm ổn, chạy như thiết kế, như kì vọng
    //vạtx nghĩ là hàm passed màu xanh
    //đúng kì vọng--màu xanh
    
    @Test   //(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5);
        
        //Test case #6: n = 5, exception: hy vọng thấy ngoại lệ
        //tên là IllegalArgumentException
    }
    //@Test là 1 kí hiệu annotation để báo với JUnit và JVM
    //để generate  cái hàm tryAssert()thành main() truyền thống
    //và  gửi cho  JVM để chạy. App chạy từ main()
    //thiếu @Test tương  đương app thiếu  main()no-runnable
    
    //chốt xanh đỏ
    //nếu tất cả @test điều màu xanh
    //hàm đúng cho những thí mình đã test
    //xanh khi cuối cùng tất cả cùng xanh
    //cả @test phải xanh
    //1. xanh khi tất cả cùng xanh
    
    //nếu trong các @test có ít nhất 1 thằng đỏ xem như tất cả làđỏ
    //ý nghĩa hàm đúng thì phảiđúng hết
    //hàm ko ổn định về kết quả, hàm sai
    
    //2. đỏ khi có ít nhất 1 thằng đỏ
    //đó đến từ 1 trong tình  huống
    //expected đã tính đúng,actual trả về sai -> bug của hàm
    //expected đã tính sai, actual sai đúng
    
    
    
}
