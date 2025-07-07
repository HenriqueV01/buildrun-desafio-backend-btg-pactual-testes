package tech.buildrun.btgpactual.orderms.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.buildrun.btgpactual.orderms.service.OrderService;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OrderControllerTest {

    @Mock
    OrderService orderService;
    @InjectMocks
    OrderController orderController;





}