/*
 * Copyright 2017 the original author or authors.
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
package com.lambdaworks.redis.dynamic;

import java.lang.reflect.Method;

/**
 * Strategy interface to resolve {@link ExecutableCommand} from a {@link Method} and {@link RedisCommandsMetadata}.
 * 
 * @author Mark Paluch
 * @since 5.0
 */
interface ExecutableCommandLookupStrategy {

    /**
     * Resolve a {@link ExecutableCommand} given the {@link Method} and {@link RedisCommandsMetadata}.
     * 
     * @param method must not be {@literal null}.
     * @param metadata must not be {@literal null}.
     * @return the {@link ExecutableCommand}.
     */
    ExecutableCommand resolveCommandMethod(CommandMethod method, RedisCommandsMetadata metadata);
}
