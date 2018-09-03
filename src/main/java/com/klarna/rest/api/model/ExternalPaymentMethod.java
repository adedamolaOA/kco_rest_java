/*
 * Copyright 2015 Klarna AB
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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * The model for an external payment methods.
 */
public class ExternalPaymentMethod extends Model {
    /**
     * External payment methods name.
     */
    private String name;

    /**
     * Redirect URI.
     */
    private URI redirectUrl;

    /**
     * Image URI.
     */
    private URI imageUrl;

    /**
     * Fee in cents, including tax.
     */
    private Long fee;

    /**
     * Description.
     */
    private String description = null;

    /**
     * If specified, limits the method to the listed countries (alpha 2 codes).
     */
    private List<String> countries = null;

    /**
     * Get the payment method name.
     *
     * @return Payment method name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the payment method name.
     *
     * @param name Payment method name.
     * @return same instance.
     */
    public ExternalPaymentMethod setName(final String name) {
        this.name = name;

        return this;
    }

    /**
     * Get the redirect URI.
     *
     * @return Redirect URI.
     */
    public URI getRedirectUrl() {
        return this.redirectUrl;
    }

    /**
     * Set the redirect URI.
     *
     * @param redirectUrl Redirect URI.
     * @return Same instance.
     */
    public ExternalPaymentMethod setRedirectUrl(final URI redirectUrl) {
        this.redirectUrl = redirectUrl;

        return this;
    }

    /**
     * Get the image URI.
     *
     * @return Image URI.
     */
    public URI getImageUrl() {
        return this.imageUrl;
    }

    /**
     * Set the image URI.
     *
     * @param imageUrl Image URI.
     * @return Same instance.
     */
    public ExternalPaymentMethod setImageUrl(final URI imageUrl) {
        this.imageUrl = imageUrl;

        return this;
    }

    /**
     * Get the payment method fee.
     *
     * @return Payment method fee.
     */
    public Long getFee() {
        return this.fee;
    }

    /**
     * Set the payment method fee.
     *
     * @param fee Payment method fee.
     * @return Same instance.
     */
    public ExternalPaymentMethod setFee(final Long fee) {
        this.fee = fee;

        return this;
    }

    /**
     * Get the payment method description.
     *
     * @return Payment method name.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the payment method description.
     *
     * @param description Payment method description.
     * @return same instance.
     */
    public ExternalPaymentMethod setDescription(final String description) {
        this.description = description;

        return this;
    }

    public ExternalPaymentMethod addCountriesItem(String countriesItem) {
        if (this.countries == null) {
            this.countries = new ArrayList<String>();
        }
        this.countries.add(countriesItem);
        return this;
    }

    /**
     * Gets the listed countries (alpha 2 codes).
     *
     * @return Countries
     **/
    public List<String> getCountries() {
        return countries;
    }

    /**
     * Sets the listed countries (alpha 2 codes).
     *
     * @return Countries
     **/
    public ExternalPaymentMethod setCountries(List<String> countries) {
        this.countries = countries;

        return this;
    }
}
