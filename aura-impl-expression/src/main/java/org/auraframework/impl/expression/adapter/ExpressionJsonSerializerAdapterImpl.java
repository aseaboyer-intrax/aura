/*
 * Copyright (C) 2013 salesforce.com, inc.
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
package org.auraframework.impl.expression.adapter;

import java.util.Collections;
import java.util.Map;

import org.auraframework.adapter.JsonSerializerAdapter;
import org.auraframework.impl.expression.FunctionCallImpl;
import org.auraframework.impl.expression.LiteralImpl;
import org.auraframework.impl.expression.PropertyReferenceImpl;
import org.auraframework.util.json.JsonSerializer;

import com.google.common.collect.Maps;

/**
 * direct serializers for expression implementations
 */
public class ExpressionJsonSerializerAdapterImpl implements JsonSerializerAdapter {

    @Override
    public Map<String, JsonSerializer<?>> lookupSerializers() {
        Map<String, JsonSerializer<?>> m = Maps.newHashMap();
        m.put(PropertyReferenceImpl.class.getName(), PropertyReferenceImpl.SERIALIZER);
        m.put(LiteralImpl.class.getName(), LiteralImpl.SERIALIZER);
        m.put(FunctionCallImpl.class.getName(), FunctionCallImpl.SERIALIZER);
        return m;
    }

    @Override
    public Map<Class<?>, JsonSerializer<?>> instanceofSerializers() {
        return Collections.emptyMap();
    }

}
