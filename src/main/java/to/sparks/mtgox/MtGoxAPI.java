package to.sparks.mtgox;

import java.util.List;
import to.sparks.mtgox.model.*;

/**
 * A java api for the MtGox bitcoin exchange built using Spring and Maven
 *
 * @author SparksG
 */
public interface MtGoxAPI {

    public enum OrderType {

        Bid, Ask
    }

    FullDepth getFullDepth() throws Exception;

    Order[] getOpenOrders() throws Exception;

    OrderResult getOrderResult(OrderType orderType, String orderRef) throws Exception;

    List<Depth> getAllDepthSince(long timestamp);

    List<Depth> getDepthHistory();

    List<Ticker> getTickerHistory();

    Ticker getTicker() throws Exception;

    String placeMarketOrder(OrderType orderType, double volume) throws Exception;

    String placeOrder(OrderType orderType, Double price, double volume) throws Exception;
}
