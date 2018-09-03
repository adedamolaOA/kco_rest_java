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

import java.util.List;

public class MerchantRequested extends Model {
    private Boolean additionalCheckbox = false;

    private List<MerchantRequestedCheckbox> additionalCheckboxes = null;

    /**
     * Informs whether the additional_checkbox is checked or not, when applicable.
     * @return additionalCheckbox
     **/
    public Boolean isAdditionalCheckbox() {
        return additionalCheckbox;
    }

    /**
     * Informs whether the additional_checkboxes is checked or not, when applicable.
     * @return additionalCheckboxes
     **/
    public List<MerchantRequestedCheckbox> getAdditionalCheckboxes() {
        return additionalCheckboxes;
    }
}
