package person.liufan.bookstore.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * @author liufan E-mail:fan.liu@biz-united.com.cn
 * @version 创建时间：2021/1/18
 * 订单实体类
 */
public class BookstoreOrder {
    /**
     * 订单id
     */
    private Long id;
    /**
     * 订单总共金额
     */
    private BigDecimal tbBookstoreOrderTotalMoney;
    /**
     * 订单收货地址
     */
    private String tbBookstoreOrderShippingAddress;
    /**
     * 创建时间
     */
    private Date tbBookstoreOrderCreateTime;
    /**
     * 修改时间
     */
    private Date tbBookstoreOrderUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTbBookstoreOrderTotalMoney() {
        return tbBookstoreOrderTotalMoney;
    }

    public void setTbBookstoreOrderTotalMoney(BigDecimal tbBookstoreOrderTotalMoney) {
        this.tbBookstoreOrderTotalMoney = tbBookstoreOrderTotalMoney;
    }

    public String getTbBookstoreOrderShippingAddress() {
        return tbBookstoreOrderShippingAddress;
    }

    public void setTbBookstoreOrderShippingAddress(String tbBookstoreOrderShippingAddress) {
        this.tbBookstoreOrderShippingAddress = tbBookstoreOrderShippingAddress;
    }

    public Date getTbBookstoreOrderCreateTime() {
        return tbBookstoreOrderCreateTime;
    }

    public void setTbBookstoreOrderCreateTime(Date tbBookstoreOrderCreateTime) {
        this.tbBookstoreOrderCreateTime = tbBookstoreOrderCreateTime;
    }

    public Date getTbBookstoreOrderUpdateTime() {
        return tbBookstoreOrderUpdateTime;
    }

    public void setTbBookstoreOrderUpdateTime(Date tbBookstoreOrderUpdateTime) {
        this.tbBookstoreOrderUpdateTime = tbBookstoreOrderUpdateTime;
    }
}