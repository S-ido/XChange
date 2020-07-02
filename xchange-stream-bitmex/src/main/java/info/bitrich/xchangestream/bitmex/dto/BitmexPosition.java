package info.bitrich.xchangestream.bitmex.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** Created by Piotr Chebdowski on 16.06.20. */
public class BitmexPosition extends BitmexMarketDataEvent {

  protected final int account;
  protected final String currency;
  protected final BigDecimal currentQty;
  protected final BigDecimal markPrice;
  protected final String posState;

  @JsonCreator
  public BitmexPosition(
      @JsonProperty("account") int account,
      @JsonProperty("symbol") String symbol,
      @JsonProperty("currency") String currency,
      @JsonProperty("currentQty") BigDecimal currentQty,
      @JsonProperty("markPrice") BigDecimal markPrice,
      @JsonProperty("posState") String posState,
      @JsonProperty("timestamp") String timestamp) {
    super(symbol, timestamp);
    this.account = account;
    this.currency = currency;
    this.currentQty = currentQty;
    this.markPrice = markPrice;
    this.posState = posState;
  }

  //    public BitmexPosition(int account, String symbol, String currency, String timestamp) {
  //        super(symbol, timestamp);
  //
  //        this.account = account;
  //        this.currency = currency;
  //    }

  public int getAccount() {
    return account;
  }

  public String getCurrency() {
    return currency;
  }

  public BigDecimal getCurrentQty() {
    return currentQty;
  }

  public BigDecimal getMarkPrice() {
    return markPrice;
  }

  public String getPosState() {
    return posState;
  }

  @Override
  public String toString() {
    return "BitmexPosition{"
        + "account="
        + account
        + ", currency='"
        + currency
        + '\''
        + ", currentQty="
        + currentQty
        + ", markPrice="
        + markPrice
        + ", posState='"
        + posState
        + '\''
        + ", timestamp='"
        + timestamp
        + '\''
        + ", symbol='"
        + symbol
        + '\''
        + '}';
  }
}
