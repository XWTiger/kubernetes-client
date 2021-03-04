/**
 * Copyright (C) 2015 Red Hat, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.kubernetes.client.dsl;


import io.fabric8.kubernetes.api.model.apps.*;
import io.fabric8.kubernetes.api.model.apps.DoneableDaemonSet;
import io.fabric8.kubernetes.api.model.apps.DoneableDeployment;
import io.fabric8.kubernetes.api.model.apps.DoneableStatefulSet;
import io.fabric8.kubernetes.api.model.apps.DoneableTidbCluster;
import io.fabric8.kubernetes.api.model.apps.clickhouse.ClickHouse;
import io.fabric8.kubernetes.api.model.apps.clickhouse.ClickHouseList;
import io.fabric8.kubernetes.api.model.apps.clickhouse.DoneableClickHouse;
import io.fabric8.kubernetes.api.model.apps.istio.*;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableDestinationRule;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableGateWay;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableVirtualService;
import io.fabric8.kubernetes.api.model.apps.DoneableReplicaSet;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.DoneableSeaweedFS;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.SeaweedFS;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.SeaweedFSList;
import io.fabric8.kubernetes.client.Client;

public interface AppsAPIGroupDSL extends Client {

  MixedOperation<DaemonSet, DaemonSetList, DoneableDaemonSet, Resource<DaemonSet, DoneableDaemonSet>> daemonSets();

  MixedOperation<Deployment, DeploymentList, DoneableDeployment, RollableScalableResource<Deployment, DoneableDeployment>> deployments();

  MixedOperation<ReplicaSet, ReplicaSetList, DoneableReplicaSet, RollableScalableResource<ReplicaSet, DoneableReplicaSet>> replicaSets();

  MixedOperation<StatefulSet, StatefulSetList, DoneableStatefulSet, RollableScalableResource<StatefulSet, DoneableStatefulSet>> statefulSets();

  MixedOperation<TidbCluster, TidbClusterList, DoneableTidbCluster, RollableScalableResource<TidbCluster, DoneableTidbCluster>> tidbClusters();

  MixedOperation<VirtualService, VirtualServiceList, DoneableVirtualService, RollableScalableResource<VirtualService, DoneableVirtualService>> virtualServices();

  MixedOperation<GateWay, GateWayList, DoneableGateWay, RollableScalableResource<GateWay, DoneableGateWay>> gateways();

  MixedOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, RollableScalableResource<DestinationRule, DoneableDestinationRule>> destinationRules();

  MixedOperation<SeaweedFS, SeaweedFSList, DoneableSeaweedFS, RollableScalableResource<SeaweedFS, DoneableSeaweedFS>> seaweeds();

  MixedOperation<ClickHouse, ClickHouseList, DoneableClickHouse, RollableScalableResource<ClickHouse, DoneableClickHouse>> clickhouse();


  }
