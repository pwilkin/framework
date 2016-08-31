/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.v7.client.connectors;

import com.vaadin.shared.ui.Connect;
import com.vaadin.v7.client.renderers.TextRenderer;

/**
 * A connector for {@link TextRenderer}.
 *
 * @since 7.4
 * @author Vaadin Ltd
 */
@Connect(com.vaadin.v7.ui.renderers.TextRenderer.class)
public class TextRendererConnector
        extends AbstractGridRendererConnector<String> {

    @Override
    public TextRenderer getRenderer() {
        return (TextRenderer) super.getRenderer();
    }
}
