package com.salesmanager.core.business.services.order;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.order.Order;
import com.salesmanager.core.model.order.OrderCriteria;
import com.salesmanager.core.model.order.OrderList;
import com.salesmanager.core.model.order.orderstatus.OrderStatusHistory;
@Service
public class OrderManagementService implements OrderManagementServiceImpl {

    @Override
    public void addOrderStatusHistory(Order order, OrderStatusHistory history) throws ServiceException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOrderStatusHistory'");
    }

    @Override
    public Order getOrder(Long id, MerchantStore store) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrder'");
    }

    @Override
    public OrderList listByStore(MerchantStore store, OrderCriteria criteria) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listByStore'");
    }

    @Override
    public OrderList getOrders(OrderCriteria criteria, MerchantStore store) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrders'");
    }

    @Override
    public void saveOrUpdate(Order order) throws ServiceException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveOrUpdate'");
    }

    @Override
    public boolean hasDownloadFiles(Order order) throws ServiceException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasDownloadFiles'");
    }

    @Override
    public List<Order> getCapturableOrders(MerchantStore store, Date startDate, Date endDate) throws ServiceException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCapturableOrders'");
    }
    
}
