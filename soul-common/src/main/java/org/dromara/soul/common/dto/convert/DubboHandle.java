/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.dromara.soul.common.dto.convert;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DubboHandle.
 * @author xiaoyu(Myth)
 */
@ToString
@Getter
@Setter
public class DubboHandle extends HystrixHandle implements Serializable {

    /**
     * zookeeper url  is required.
     */
    private String registry;

    /**
     * dubbo application Name  is required.
     */
    private String appName;

    /**
     * dubbo protocol.
     */
    private String protocol;

    /**
     * port.
     */
    private int port;

    /**
     *  timeout is required.
     */
    private Integer timeout;

    /**
     * version.
     */
    private String version;


    /**
     *  group.
     */
    private String group;

    /**
     * retries.
     */
    private Integer retries;

    /**
     * loadbalance random hash robin.
     */
    private String loadbalance;


}
