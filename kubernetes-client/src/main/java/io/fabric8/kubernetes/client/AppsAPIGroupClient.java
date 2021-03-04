/**
 * Copyright (C) 2015 Red Hat, Inc.
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
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.model.apps.*;
import io.fabric8.kubernetes.api.model.apps.DoneableDaemonSet;
import io.fabric8.kubernetes.api.model.apps.DoneableDeployment;
import io.fabric8.kubernetes.api.model.apps.DoneableReplicaSet;
import io.fabric8.kubernetes.api.model.apps.DoneableStatefulSet;
import io.fabric8.kubernetes.api.model.apps.DoneableTidbCluster;
import io.fabric8.kubernetes.api.model.apps.clickhouse.ClickHouse;
import io.fabric8.kubernetes.api.model.apps.clickhouse.ClickHouseList;
import io.fabric8.kubernetes.api.model.apps.clickhouse.DoneableClickHouse;
import io.fabric8.kubernetes.api.model.apps.istio.*;

import io.fabric8.kubernetes.api.model.apps.istio.DoneableDestinationRule;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableGateWay;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableVirtualService;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.DoneableSeaweedFS;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.SeaweedFS;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.SeaweedFSList;
import io.fabric8.kubernetes.client.dsl.RollableScalableResource;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.AppsAPIGroupDSL;
import io.fabric8.kubernetes.client.dsl.internal.apps.v1.*;


import io.fabric8.kubernetes.client.dsl.clickhouse.ClickHouseOperationsImpl;
import io.fabric8.kubernetes.client.dsl.istio.DestinationRuleOperationsImpl;
import io.fabric8.kubernetes.client.dsl.istio.GateWayOperationsImpl;
import io.fabric8.kubernetes.client.dsl.istio.VirtualServiceOperationsImpl;
import io.fabric8.kubernetes.client.dsl.seaweedfs.SeaweedFSOperationsImpl;
import okhttp3.OkHttpClient;

public class AppsAPIGroupClient extends BaseClient implements AppsAPIGroupDSL {

  public AppsAPIGroupClient() throws KubernetesClientException {
    super();
  }

  public AppsAPIGroupClient(OkHttpClient httpClient, final Config config) throws KubernetesClientException {
    super(httpClient, config);
  }

  @Override
  public MixedOperation<DaemonSet, DaemonSetList, DoneableDaemonSet, Resource<DaemonSet, DoneableDaemonSet>> daemonSets() {
    return new DaemonSetOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<Deployment, DeploymentList, DoneableDeployment, RollableScalableResource<Deployment, DoneableDeployment>> deployments() {
    return new DeploymentOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<ReplicaSet, ReplicaSetList, DoneableReplicaSet, RollableScalableResource<ReplicaSet, DoneableReplicaSet>> replicaSets() {
    return new ReplicaSetOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<StatefulSet, StatefulSetList, DoneableStatefulSet, RollableScalableResource<StatefulSet, DoneableStatefulSet>> statefulSets() {
    return new StatefulSetOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<TidbCluster, TidbClusterList, DoneableTidbCluster, RollableScalableResource<TidbCluster, DoneableTidbCluster>> tidbClusters() {
    return new TidbClusterOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<VirtualService, VirtualServiceList, DoneableVirtualService, RollableScalableResource<VirtualService, DoneableVirtualService>> virtualServices() {
    return new VirtualServiceOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<GateWay, GateWayList, DoneableGateWay, RollableScalableResource<GateWay, DoneableGateWay>> gateways() {
    return new GateWayOperationsImpl(httpClient, getConfiguration());
  }

  public MixedOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, RollableScalableResource<DestinationRule, DoneableDestinationRule>> destinationRules() {
    return new DestinationRuleOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<SeaweedFS, SeaweedFSList, DoneableSeaweedFS, RollableScalableResource<SeaweedFS, DoneableSeaweedFS>> seaweeds() {
    return new SeaweedFSOperationsImpl(httpClient, getConfiguration());
  }

  @Override
  public MixedOperation<ClickHouse, ClickHouseList, DoneableClickHouse, RollableScalableResource<ClickHouse, DoneableClickHouse>> clickhouse() {
    return new ClickHouseOperationsImpl(httpClient, getConfiguration());
  }
}
