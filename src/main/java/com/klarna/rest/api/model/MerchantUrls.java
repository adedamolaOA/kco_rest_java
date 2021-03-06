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

package com.klarna.rest.api.model;

/**
 * Merchant URLs data model.
 */
public class MerchantUrls extends Model {

    /**
     * URL to the terms page.
     */
    private String terms;

    /**
     * URL of merchant cancellation terms.
     */
    private String cancellationTerms;

    /**
     * URL to the checkout page.
     */
    private String checkout;

    /**
     * URL to the thank you page.
     */
    private String confirmation;

    /**
     * URL to the push notification page.
     */
    private String push;

    /**
     * URL to the validation page.
     */
    private String validation;

    /**
     * URL for shipping option update.
     */
    private String shippingOptionUpdate;

    /**
     * URL for shipping and tax updates.
     */
    private String addressUpdate;

    /**
     * URL for notifications on pending orders.
     */
    private String notification;

    /**
     * URL for shipping, tax and purchase currency updates. Will be called on purchase country changes.
     */
    private String countryChange;

    /**
     * Gets the URL of merchant cancellation terms.
     *
     * @return Terms page
     */
    public String getCancellationTerms() {
        return this.cancellationTerms;
    }

    /**
     * Sets the URL of merchant cancellation terms.
     *
     * @param cancellationTerms URL or Cancellation Terms
     * @return Same instance
     */
    public MerchantUrls setCancellationTerms(final String cancellationTerms) {
        this.cancellationTerms = cancellationTerms;

        return this;
    }

    /**
     * Gets the terms URL.
     *
     * @return Terms page
     */
    public String getTerms() {
        return this.terms;
    }

    /**
     * Sets the terms URL.
     *
     * @param url Terms page
     * @return Same instance
     */
    public MerchantUrls setTerms(final String url) {
        this.terms = url;

        return this;
    }

    /**
     * Gets the checkout URL.
     *
     * @return Checkout page
     */
    public String getCheckout() {
        return this.checkout;
    }

    /**
     * Sets the checkout URL.
     *
     * @param url Checkout page
     * @return Same instance
     */
    public MerchantUrls setCheckout(final String url) {
        this.checkout = url;

        return this;
    }

    /**
     * Gets the confirmation URL.
     *
     * @return Thank you page
     */
    public String getConfirmation() {
        return this.confirmation;
    }

    /**
     * Sets the confirmation URL.
     *
     * @param url Thank you page
     * @return Same instance
     */
    public MerchantUrls setConfirmation(final String url) {
        this.confirmation = url;

        return this;
    }

    /**
     * Gets the push URL.
     *
     * @return Push notification page
     */
    public String getPush() {
        return this.push;
    }

    /**
     * Sets the push URL.
     *
     * @param url Push notification page
     * @return Same instance
     */
    public MerchantUrls setPush(final String url) {
        this.push = url;

        return this;
    }

    /**
     * Gets the validation URL.
     *
     * @return Validation page
     */
    public String getValidation() {
        return this.validation;
    }

    /**
     * Sets the validation URL.
     *
     * @param url Validation page
     * @return Same instance
     */
    public MerchantUrls setValidation(final String url) {
        this.validation = url;

        return this;
    }

    /**
     * Gets the shipping option update URL.
     *
     * @return Shipping option update.
     */
    public String getShippingOptionUpdate() {
        return this.shippingOptionUpdate;
    }

    /**
     * Sets the shipping option update URL.
     *
     * @param url Shipping option update.
     * @return Same instance.
     */
    public MerchantUrls setShippingOptionUpdate(final String url) {
        this.shippingOptionUpdate = url;

        return this;
    }

    /**
     * Gets the address update URL.
     *
     * @return Address update.
     */
    public String getAddressUpdate() {
        return this.addressUpdate;
    }

    /**
     * Sets the address update URL.
     *
     * @param url Address update.
     * @return Same instance.
     */
    public MerchantUrls setAddressUpdate(final String url) {
        this.addressUpdate = url;

        return this;
    }

    /**
     * Gets the notification URL.
     *
     * @return Notification.
     */
    public String getNotification() {
        return this.notification;
    }

    /**
     * Sets the notification URL.
     *
     * @param url Notification.
     * @return Same instance.
     */
    public MerchantUrls setNotification(final String url) {
        this.notification = url;

        return this;
    }

    /**
     * Gets the URL for shipping, tax and purchase currency updates.
     *
     * @return Notification.
     */
    public String getCountryChange() {
        return this.countryChange;
    }

    /**
     * Sets the URL for shipping, tax and purchase currency updates.
     *
     * @param url URL for shipping, tax and purchase currency updates
     * @return Same instance.
     */
    public MerchantUrls setCountryChange(final String url) {
        this.countryChange = url;

        return this;
    }
}
