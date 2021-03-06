/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.action.admin.cluster.bootstrap;

import org.elasticsearch.action.Action;
import org.elasticsearch.common.io.stream.Writeable.Reader;

public class GetDiscoveredNodesAction extends Action<GetDiscoveredNodesResponse> {
    public static final GetDiscoveredNodesAction INSTANCE = new GetDiscoveredNodesAction();
    public static final String NAME = "cluster:monitor/discovered_nodes";

    private GetDiscoveredNodesAction() {
        super(NAME);
    }

    @Override
    public GetDiscoveredNodesResponse newResponse() {
        throw new UnsupportedOperationException("usage of Streamable is to be replaced by Writeable");
    }

    @Override
    public Reader<GetDiscoveredNodesResponse> getResponseReader() {
        return GetDiscoveredNodesResponse::new;
    }
}
