package frame.dubbo.spi;/**
 * @Description
 * @author YORICHEONG
 * @create 2021-08-25 15:59
 */

/**
 * @description: TODO
 * @author YORICHEONG
 * @date 2021/8/25 15:59
 * @version 1.0
 */
public class SPIImpl2 implements SPIService{
    /**
     * @return : void
     * @param:
     * @description : 创建一个执行的方法
     * @author : YORICHEONG
     * @date : 2021/8/25
     */
    @Override
    public void execute() {
        System.out.println("This is spiimpl2 execute");
    }
}
