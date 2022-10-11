/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loilt.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Loi Lam
 */
//class chuẩn bị tách data
//ra khỏi câu lệnh xanh đỏ vcho dễ kiểm soát các test case
//thư viện JUnit nó sẽ tự generate them code phía  sau hậu trường 
//lúc biên dịch để giúp hiện thực hoá ý tưởng DDT
//ví dụ nó sẻ tự biết lấy data ở mảng 2 chiều nào đó nhồi vào hàm
//assertEquals()
//ép ta phải viết code thoe cách nào đó định trước mới chạy đc 
//thư viện đó được gọi tên mới là framework


@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //ta tự tạo ra 1 cái hàm, tên lưu ý, trả về mảng 2 chiều
    //chứa danh sách data ta dự định nhồi vào hàm getF() và assertEqual()
    //
    @Parameterized.Parameters
    public static Object[][] initData() {
        //int a[] = {5, 10, 15, 20, 25};

        //
        //Object arr1[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}};
        return new Integer[][]{
            {1, 0},
            {1, 1},
            {2, 2},
            {6, 3},
            {24, 4},
            {120, 5},
            {720, 6}
        };
    }

    @Parameterized.Parameter(value = 0)
    public long expected;//biến này sẽ lưu giá trị kì vọng khi xài hàm
    //getFatorial() -> expected

    @Parameterized.Parameter(value = 1)
    public int n;//biến này sẽ lưu giá trị đưa cho hàm getF() để check
    //ta sẽ map/ánh xạ 2 biến này ứng với 2 cột của từng dòng
    //của mảng ở trên
    //ta phải quy bước biến expected map vào cột nào mình muốn
    //thứ tự biến ko quan trọng, thứ tự cột trong mảng ko quan trọng
    //vì ta sẻ cấu hình việc map tương ứng này!!

    //Test các test case
    @Test
    public void testFactorialGivenRightArgumentReturnWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }

}

//DDT: data Driven Testinh, là 1 kĩ thuật dùng trong kĩ thuật 
//viết code kiểm thử dùng trong unit test
//dùng để viết code test các hàm/class một cách dễ đọc hơn
//bằng cách tách data kiểm thử và câu lệnh test  hàm thành 2
//nơi khác nhau
//ví dụ cách cũ, no-DDT
//assertEquals(0, getF(0));
//assertEquals(1, getF(1));
//assertEquals(2, getF(2));
//assertEquals(6, getF(3));
//assertEquals(24, getF(4));
//assertEquals(120, getF(5));
//assertEquals(720, getF(6));
// cách này dễ viết nhưng khó kiểm tra đủ hết tập test cases
//cần test,trộn lẫn data đưa vào, và câu lệnh gọi hàm kiểm thử
//kĩ thuật tách data 00, 11, 22, 63, 244, 1205,7206
//để riêng ra 1 chổ, sau đó nhồi file/feed nạp chúng vào
//lệnh gọi hàm assertEquals(?, getF(?))
//giúp code clean dễ hiểu
//kĩ thuật này gọi là : Data Driven Testing
//                      tách data code kiểm thử
//tham số hoá data - biến data ra 1 nơi, đặt cho chúng tên biến
//lát hồi nhồi vào lệnh so sánh
    //tham số hoá, biến data thành biến tham số - parameterized

//JUnit sex twj tasch mamnrg ra thanfh casc test case
//chạy so sánh xanh đỏ từng test case và đưa ra kết luận chung
//xanh khi tất cảcùng xanh
//chỉ 1 thằng đỏ, tất cả đỏ- hàm ts hàm đúng là phải đúng hết khi test

//khi đỏ,tbì có 1 tình huống
//đỏ: do có sự cố != nhau giữa expected và actual
//đỏ vì expected != actual, vậy ko bằng vì lý do gì?
//1.expected là giá trị tính toán trước, hàm phải trả về bằng đc đc giá trị
//này , và expected mình tính = tay khi chưa xài app, phải tính
//đúng mày đỏ là do actrual ko giống, tức là code sai, bug

//2. expected mình tính bằng tay, và bị sai kì vọng, đã sai trước
//khi đó hàm trá về cho dù vcó dúng thì cũng bị màu đỏ
//kì vọng sai thì ko thẻ kết luận đc hàm có bug hay ko


//BTVN: làm việc nhóm
//cho 1 unit test  framework bạn thích
//java: junit (cấm chọn), TestNG
//c#: NUnit, xUnit, MSTest,(NuGet)
//search google: unit test frame work for 
//tuần thứ 6, thứ 3, demo, mỗi nhóm 30p