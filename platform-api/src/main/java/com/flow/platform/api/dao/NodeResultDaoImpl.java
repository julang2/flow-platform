/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flow.platform.api.dao;

import com.flow.platform.api.domain.NodeResult;
import com.flow.platform.api.domain.NodeResultKey;
import org.springframework.stereotype.Repository;

/**
 * @author lhl
 */
@Repository(value = "nodeResultDao")

public class NodeResultDaoImpl extends AbstractBaseDao<NodeResultKey, NodeResult> implements NodeResultDao{

    @Override
    Class<NodeResult> getEntityClass() {
        return NodeResult.class;
    }

    @Override
    String getKeyName() {
        return "nodeResultKey";
    }

//    @Override
//    public NodeResult find(final NodeResultKey nodeResultKey){
//        NodeResult nodeResult = (NodeResult) execute(session -> (NodeResult) session
//          .createQuery("from NodeResult where jobId = :jobId and path = :path")
//          .setParameter("jobId", nodeResultKey.getJobId())
//          .setParameter("path", nodeResultKey.getPath())
//          .uniqueResult());
//        return nodeResult;
//
//    }
//



}