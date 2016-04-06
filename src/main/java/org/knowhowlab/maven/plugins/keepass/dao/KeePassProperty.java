/*
 * Copyright (c) 2010-2016 Dmytro Pishchukhin (http://knowhowlab.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.knowhowlab.maven.plugins.keepass.dao;

import de.slackspace.openkeepass.domain.Property;

/**
 * @author dpishchukhin.
 */
public class KeePassProperty {
    private Property property;

    public KeePassProperty(Property property) {
        this.property = property;
    }

    public String getKey() {
        return property.getKey();
    }

    public String getValue() {
        return property.getValue();
    }
}
