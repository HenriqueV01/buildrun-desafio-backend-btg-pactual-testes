package tech.buildrun.btgpactual.orderms.controller.dto;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import tech.buildrun.btgpactual.orderms.entity.OrderEntity;
import tech.buildrun.btgpactual.orderms.factoty.OrderEntityFactory;

import static org.junit.jupiter.api.Assertions.*;

class OrderResponseTest {

    @Nested
    class fromEntity{
        @Test
        void shouldMapCorretly() {
            // ARRANGE
            var orderEntity = OrderEntityFactory.build();

            // ACT
            var orderResponse  = OrderResponse.fromEntity(orderEntity);

            // ASSERT
            assertEquals(orderEntity.getOrderId(), orderResponse.orderId());
            assertEquals(orderEntity.getCustomerId(), orderResponse.customerId());
            assertEquals(orderEntity.getTotal(), orderResponse.total());

        }
    }

}