// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/mcs.proto
package org.microg.gms.gcm.mcs;

import com.squareup.wire.Message;

/**
 * Included in IQ with ID 13, sent from client or server after 10 unconfirmed
 * messages.
 */
public final class StreamAck extends Message {

  public StreamAck() {
  }

  private StreamAck(Builder builder) {
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof StreamAck;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<StreamAck> {

    public Builder() {
    }

    public Builder(StreamAck message) {
      super(message);
    }

    @Override
    public StreamAck build() {
      return new StreamAck(this);
    }
  }
}
