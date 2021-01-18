package io.fabric8.kubernetes.client.dsl.istio;

import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableVirtualService;
import io.fabric8.kubernetes.api.model.apps.istio.VirtualService;
import io.fabric8.kubernetes.api.model.apps.istio.VirtualServiceList;
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

public class VirtualServiceOperationsImpl extends RollableScalableResourceOperation<VirtualService, VirtualServiceList, DoneableVirtualService, RollableScalableResource<VirtualService, DoneableVirtualService>>
  implements TimeoutImageEditReplacePatchable<VirtualService, VirtualService, DoneableVirtualService> {

  public VirtualServiceOperationsImpl(RollingOperationContext context) {
    super(context.withApiGroupName("networking.istio.io")
      .withApiGroupVersion("networking.istio.io/v1alpha3")
      .withPlural("virtualservices"));
    this.type = VirtualService.class;
    this.listType = VirtualServiceList.class;
    this.doneableType = DoneableVirtualService.class;
  }
  public VirtualServiceOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, null);
  }
  public VirtualServiceOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(new RollingOperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace).withPropagationPolicy(DEFAULT_PROPAGATION_POLICY));
  }

  @Override
  public BaseOperation<VirtualService, VirtualServiceList, DoneableVirtualService, RollableScalableResource<VirtualService, DoneableVirtualService>> newInstance(OperationContext context) {
    return new VirtualServiceOperationsImpl((RollingOperationContext) context);
  }
  @Override
  public NonNamespaceOperation<VirtualService, VirtualServiceList, DoneableVirtualService, RollableScalableResource<VirtualService, DoneableVirtualService>> inNamespace(String namespace) {
    return super.inNamespace(namespace);
  }

  @Override
  public VirtualService updateImage(Map<String, String> containerToImageMap) {
    return null;
  }

  @Override
  public VirtualService updateImage(String image) {
    return null;
  }

  @Override
  public VirtualService pause() {
    return null;
  }

  @Override
  public VirtualService resume() {
    return null;
  }

  @Override
  public VirtualService restart() {
    return null;
  }

  @Override
  public VirtualService undo() {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<VirtualService, VirtualService, DoneableVirtualService> withTimeout(long timeout, TimeUnit unit) {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<VirtualService, VirtualService, DoneableVirtualService> withTimeoutInMillis(long timeoutInMillis) {
    return null;
  }

  @Override
  protected VirtualService withReplicas(int count) {
    return null;
  }

  @Override
  protected RollingUpdater<VirtualService, VirtualServiceList, DoneableVirtualService> getRollingUpdater(long rollingTimeout, TimeUnit rollingTimeUnit) {
    return null;
  }

  @Override
  protected int getCurrentReplicas(VirtualService current) {
    return 0;
  }

  @Override
  protected int getDesiredReplicas(VirtualService item) {
    return 0;
  }

  @Override
  protected long getObservedGeneration(VirtualService current) {
    return 0;
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
  public TimeoutImageEditReplacePatchable<VirtualService, VirtualService, DoneableVirtualService> rolling() {
    return null;
  }

  @Override
  public Status rollback(DeploymentRollback deploymentRollback) {
    return null;
  }
}
