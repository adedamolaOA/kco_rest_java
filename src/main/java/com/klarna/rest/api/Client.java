/*
 * Copyright 2014 Klarna AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klarna.rest.api;

import java.net.URI;

/**
 * Library client facade interface.
 */
public interface Client {

    /**
     * API library client version.
     */
    String VERSION = "2.2.3";

    /**
     * API base URL for Europe.
     */
    URI EU_BASE_URL = URI.create("https://api.klarna.com");

    /**
     * Testing API base URL for Europe.
     */
    URI EU_TEST_BASE_URL = URI.create("https://api.playground.klarna.com");

    /**
     * API base URL for North America.
     */
    URI NA_BASE_URL = URI.create("https://api-na.klarna.com");

    /**
     * Testing API base URL for North America.
     */
    URI NA_TEST_BASE_URL = URI.create("https://api-na.playground.klarna.com");

    /**
     * Constructs a new checkout order resource.
     *
     * @return A new checkout order resource
     */
    CheckoutOrder newCheckoutOrder();

    /**
     * Constructs a new checkout order resource.
     *
     * @param checkoutOrderId Resource ID.
     * @return A new checkout order resource
     */
    CheckoutOrder newCheckoutOrder(String checkoutOrderId);

    /**
     * Constructs a new order resource.
     *
     * @param orderId Resource id
     * @return A new order resource
     */
    Order newOrder(String orderId);

    /**
     * Constructs a new capture resource.
     *
     * @param orderId Order resource id
     * @return A new capture resource
     */
    Capture newCapture(String orderId);

    /**
     * Constructs a new capture resource.
     *
     * @param orderId Order resource id
     * @param captureId Capture resource id
     * @return A new capture resource
     */
    Capture newCapture(String orderId, String captureId);

    /**
     * Constructs a new refund resource.
     *
     * @param orderId Order resource id
     * @return A new refund resource
     */
    Refund newRefund(String orderId);

    /**
     * Constructs a new refund resource.
     *
     * @param orderId Order resource id
     * @param refundId Refund resource id
     * @return A new refund resource
     */
    Refund newRefund(String orderId, String refundId);

    /**
     * Set the connect timeout interval, in milliseconds.
     *
     * @param timeout the connect timeout interval. If null or 0 then
     * an interval of infinity is declared.
     */
    void setConnectTimeout(Integer timeout);

    /**
     * Set the read timeout interval, in milliseconds.
     *
     * @param timeout The read timeout interval. If null or 0 then
     * an interval of infinity is declared.
     */
    void setReadTimeout(Integer timeout);

    /**
     * Sets the proxy for this client.
     *
     * @param scheme Proxy scheme, e.g. "http"
     * @param host Proxy host
     * @param port Proxy port
     */
    void setProxy(String scheme, String host, int port);

    /**
     * Sets the proxy for this client.
     *
     * @param scheme Proxy scheme, e.g. "http"
     * @param host Proxy host
     * @param port Proxy port
     * @param username Proxy username
     * @param password Proxy password
     */
    void setProxy(String scheme, String host, int port,
                  String username, String password);
}
