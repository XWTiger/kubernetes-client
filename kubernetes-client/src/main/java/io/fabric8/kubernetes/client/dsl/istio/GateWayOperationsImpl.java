package io.fabric8.kubernetes.client.dsl.istio;

import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableGateWay;
import io.fabric8.kubernetes.api.model.apps.istio.GateWay;
import io.fabric8.kubernetes.api.model.apps.istio.GateWayList;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.*;
import io.fabric8.kubernetes.client.dsl.base.BaseOperation;
import io.fabric8.kubernetes.client.dsl.base.OperationContext;
import io.fabric8.kubernetes.client.dsl.internal.RollingOperationContext;
import io.fabric8.kubernetes.client.dsl.internal.apps.v1.RollableScalableResourceOperation;
import io.fabric8.kubernetes.client.dsl.internal.apps.v1.RollingUpdater;
import okhttp3.OkHttpClient;

import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class GateWayOperationsImpl extends RollableScalableResourceOperation<GateWay, GateWayList, DoneableGateWay, RollableScalableResource<GateWay, DoneableGateWay>>
  implements TimeoutImageEditReplacePatchable<GateWay, GateWay, DoneableGateWay> {

  public GateWayOperationsImpl(RollingOperationContext context) {
    super(context.withApiGroupName("networking.istio.io")
      .withApiGroupVersion("networking.istio.io/v1alpha3")
      .withPlural("gateways"));
    this.type = GateWay.class;
    this.listType = GateWayList.class;
    this.doneableType = DoneableGateWay.class;
  }
  public GateWayOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, null);
  }

  public GateWayOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(new RollingOperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace).withPropagationPolicy(DEFAULT_PROPAGATION_POLICY));
  }


  @Override
  public BaseOperation<GateWay, GateWayList, DoneableGateWay, RollableScalableResource<GateWay, DoneableGateWay>> newInstance(OperationContext context) {
    return new GateWayOperationsImpl((RollingOperationContext) context);
  }

  @Override
  protected long getObservedGeneration(GateWay current) {
    return 0;
  }

  @Override
  protected GateWay withReplicas(int count) {
    return null;
  }

  @Override
  protected int getDesiredReplicas(GateWay item) {
    return 1;
  }

  @Override
  public NonNamespaceOperation<GateWay, GateWayList, DoneableGateWay, RollableScalableResource<GateWay, DoneableGateWay>> inNamespace(String namespace) {
    return super.inNamespace(namespace);
  }

  @Override
  protected int getCurrentReplicas(GateWay current) {
    return 1;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return super.toString();
  }




  @Override
  public GateWay updateImage(Map<String, String> containerToImageMap) {
    return null;
  }

  @Override
  public GateWay updateImage(String image) {
    return null;
  }

  @Override
  public GateWay pause() {
    return null;
  }

  @Override
  public GateWay resume() {
    return null;
  }

  @Override
  public GateWay restart() {
    return null;
  }

  @Override
  public GateWay undo() {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<GateWay, GateWay, DoneableGateWay> withTimeout(long timeout, TimeUnit unit) {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<GateWay, GateWay, DoneableGateWay> withTimeoutInMillis(long timeoutInMillis) {
    return null;
  }

  @Override
  public String getLog() {
    return null;
  }

  @Override
  public String getLog(Boolean isPretty) {
    return null;
  }

  @Override
  public Reader getLogReader() {
    return null;
  }

  @Override
  public LogWatch watchLog() {
    return null;
  }

  @Override
  public LogWatch watchLog(OutputStream out) {
    return null;
  }

  @Override
  public TimeoutImageEditReplacePatchable<GateWay, GateWay, DoneableGateWay> rolling() {
    return null;
  }

  @Override
  protected RollingUpdater<GateWay, GateWayList, DoneableGateWay> getRollingUpdater(long rollingTimeout, TimeUnit rollingTimeUnit) {
    return null;
  }

  @Override
  public Status rollback(DeploymentRollback deploymentRollback) {
    return null;
  }
}
