package io.fabric8.kubernetes.client.dsl.internal.apps.v1;

import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.api.model.apps.DoneableTidbCluster;
import io.fabric8.kubernetes.api.model.apps.TidbCluster;
import io.fabric8.kubernetes.api.model.apps.TidbClusterList;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.*;
import io.fabric8.kubernetes.client.dsl.base.BaseOperation;
import io.fabric8.kubernetes.client.dsl.base.OperationContext;
import io.fabric8.kubernetes.client.dsl.internal.RollingOperationContext;
import okhttp3.OkHttpClient;

import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TidbClusterOperationsImpl extends RollableScalableResourceOperation<TidbCluster, TidbClusterList, DoneableTidbCluster, RollableScalableResource<TidbCluster, DoneableTidbCluster>>
  implements TimeoutImageEditReplacePatchable<TidbCluster, TidbCluster, DoneableTidbCluster>
{

  public TidbClusterOperationsImpl(RollingOperationContext context) {
    super(context.withApiGroupName("pingcap.com")
      .withApiGroupVersion("pingcap.com/v1alpha1")
      .withPlural("tidbclusters"));
    this.type = TidbCluster.class;
    this.listType = TidbClusterList.class;
    this.doneableType = DoneableTidbCluster.class;
  }
  public TidbClusterOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, null);
  }
  public TidbClusterOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(new RollingOperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace).withPropagationPolicy(DEFAULT_PROPAGATION_POLICY));
  }

  @Override
  public BaseOperation<TidbCluster, TidbClusterList, DoneableTidbCluster, RollableScalableResource<TidbCluster, DoneableTidbCluster>> newInstance(OperationContext context) {
    return new TidbClusterOperationsImpl((RollingOperationContext) context);
  }

  @Override
  public TidbCluster updateImage(Map<String, String> containerToImageMap) {
    return null;
  }

  @Override
  public TidbCluster updateImage(String image) {
    return null;
  }

  @Override
  public TidbCluster pause() {
    return null;
  }

  @Override
  public TidbCluster resume() {
    return null;
  }

  @Override
  public TidbCluster restart() {
    return null;
  }

  @Override
  public TidbCluster undo() {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<TidbCluster, TidbCluster, DoneableTidbCluster> withTimeout(long timeout, TimeUnit unit) {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<TidbCluster, TidbCluster, DoneableTidbCluster> withTimeoutInMillis(long timeoutInMillis) {
    return null;
  }

  /**
   * just edit tidb replicas
   * @param count
   * @return
   */
  @Override
  protected TidbCluster withReplicas(int count) {
    return cascading(false).edit().editSpec().editTidb().withReplicas(count).endTidb().endSpec().done();
  }

  @Override
  protected RollingUpdater<TidbCluster, TidbClusterList, DoneableTidbCluster> getRollingUpdater(long rollingTimeout, TimeUnit rollingTimeUnit) {
    return null;
  }

  @Override
  protected int getCurrentReplicas(TidbCluster current) {
    return 0;
  }

  @Override
  protected int getDesiredReplicas(TidbCluster item) {
    return 0;
  }

  @Override
  protected long getObservedGeneration(TidbCluster current) {
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
  public TimeoutImageEditReplacePatchable<TidbCluster, TidbCluster, DoneableTidbCluster> rolling() {
    return null;
  }

  @Override
  public Status rollback(DeploymentRollback deploymentRollback) {
    return null;
  }

  @Override
  public NonNamespaceOperation<TidbCluster, TidbClusterList, DoneableTidbCluster, RollableScalableResource<TidbCluster, DoneableTidbCluster>> inNamespace(String namespace) {
    return super.inNamespace(namespace);
  }
}
