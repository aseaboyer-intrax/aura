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
package org.auraframework.adapter;

import org.auraframework.css.ThemeValueProvider;
import org.auraframework.def.ApplicationDef;
import org.auraframework.def.DefDescriptor;
import org.auraframework.def.StyleDef;
import org.auraframework.def.ThemeDef;
import org.auraframework.system.AuraContext;

/**
 * Adapter for CSS/Style stuff.
 */
public interface StyleAdapter extends AuraAdapter {
    /**
     * Gets a {@link ThemeValueProvider} using whatever {@link ThemeDef} override is specified on the current
     * {@link AuraContext}, or the {@link ApplicationDef#getOverrideThemeDescriptor()}. This is usually the method you
     * want.
     * 
     * @param descriptor The {@link StyleDef} descriptor of the CSS file being parsed. This is used to determine which
     *            namespace-default {@link ThemeDef} to use, as well as which component-bundle {@link ThemeDef} to use.
     */
    ThemeValueProvider getThemeValueProvider(DefDescriptor<StyleDef> descriptor);

    /**
     * Gets a {@link ThemeValueProvider} using the given override theme.
     * 
     * @param descriptor The {@link StyleDef} descriptor of the CSS file being parsed. This is used to determine which
     *            namespace-default {@link ThemeDef} to use, as well as which component-bundle {@link ThemeDef} to use.
     * @param override Use this {@link ThemeDef} as the override theme.
     */
    ThemeValueProvider getThemeValueProvider(DefDescriptor<StyleDef> descriptor, DefDescriptor<ThemeDef> override);

    /**
     * Gets a {@link ThemeValueProvider} that doesn't use any override theme (even if one is set on the current
     * {@link AuraContext}).
     * 
     * @param descriptor The {@link StyleDef} descriptor of the CSS file being parsed. This is used to determine which
     *            namespace-default {@link ThemeDef} to use, as well as which component-bundle {@link ThemeDef} to use.
     */
    ThemeValueProvider getThemeValueProviderNoOverrides(DefDescriptor<StyleDef> descriptor);
}
