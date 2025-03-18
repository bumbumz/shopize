package com.salesmanager.core.business.services.order;

import org.springframework.stereotype.Service;
import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.model.customer.Customer;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.order.OrderSummary;
import com.salesmanager.core.model.order.OrderTotalSummary;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.shoppingcart.ShoppingCart;

@Service
public class OrderCalculationServiceImpl implements OrderCalculationService {

    @Override
    public OrderTotalSummary caculateOrderTotal(OrderSummary orderSummary, Customer customer, MerchantStore store, Language language) 
            throws ServiceException {
        // TODO: Implement logic
        return new OrderTotalSummary();
    }

    @Override
    public OrderTotalSummary caculateOrderTotal(OrderSummary orderSummary, MerchantStore store, Language language) 
            throws ServiceException {
        // TODO: Implement logic
        return new OrderTotalSummary();
    }

    @Override
    public OrderTotalSummary calculateShoppingCartTotal(ShoppingCart shoppingCart, Customer customer, MerchantStore store, Language language) 
            throws ServiceException {
        // TODO: Implement logic
        return new OrderTotalSummary();
    }

    @Override
    public OrderTotalSummary calculateShoppingCartTotal(ShoppingCart shoppingCart, MerchantStore store, Language language) 
            throws ServiceException {
        // TODO: Implement logic
        return new OrderTotalSummary();
    }
}
