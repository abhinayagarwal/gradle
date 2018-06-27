/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.internal.logging.events;

import org.gradle.api.logging.LogLevel;

import javax.annotation.Nullable;

public class AddListenerEvent extends OutputEvent {
    private final OutputEventListener listener;

    public AddListenerEvent(OutputEventListener listener) {
        this.listener = listener;
    }

    public OutputEventListener getListener() {
        return listener;
    }

    @Nullable
    @Override
    public LogLevel getLogLevel() {
        return null;
    }
}