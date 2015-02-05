/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.lifecycle;

import org.apache.ignite.*;

/**
 * All components provided in GridGain configuration can implement this interface.
 * If a component implements this interface, then method {@link #start()} will be called
 * during grid startup and {@link #stop()} will be called during stop.
 */
public interface LifecycleAware {
    /**
     * Starts grid component, called on grid start.
     *
     * @throws IgniteException If failed.
     */
    public void start() throws IgniteException;

    /**
     * Stops grid component, called on grid shutdown.
     *
     * @throws IgniteException If failed.
     */
    public void stop() throws IgniteException;
}
