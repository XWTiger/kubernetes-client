package io.fabric8.kubernetes.client.dsl.seaweedfs;

import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.api.model.apps.DoneableTidbCluster;
import io.fabric8.kubernetes.api.model.apps.TidbCluster;
import io.fabric8.kubernetes.api.model.apps.TidbClusterList;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.DoneableSeaweedFS;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.SeaweedFS;
import io.fabric8.kubernetes.api.model.apps.seaweedfs.SeaweedFSList;
import io.fabric8.kubernetes.api.model.extensions.DeploymentRollback;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.dsl.ImageEditReplacePatchable;
import io.fabric8.kubernetes.client.dsl.LogWatch;
import io.fabric8.kubernetes.client.dsl.RollableScalableResource;
import io.fabric8.kubernetes.client.dsl.TimeoutImageEditReplacePatchable;
import io.fabric8.kubernetes.client.dsl.base.BaseOperation;
import io.fabric8.kubernetes.client.dsl.base.OperationContext;
import io.fabric8.kubernetes.client.dsl.internal.RollingOperationContext;
import io.fabric8.kubernetes.client.dsl.internal.apps.v1.RollableScalableResourceOperation;
import io.fabric8.kubernetes.client.dsl.internal.apps.v1.RollingUpdater;
import io.fabric8.kubernetes.client.dsl.internal.apps.v1.TidbClusterOperationsImpl;
import okhttp3.OkHttpClient;

import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SeaweedFSOperationsImpl extends RollableScalableResourceOperation<SeaweedFS, SeaweedFSList, DoneableSeaweedFS, RollableScalableResource<SeaweedFS, DoneableSeaweedFS>>
  implements TimeoutImageEditReplacePatchable<SeaweedFS, SeaweedFS, DoneableSeaweedFS>{
  public SeaweedFSOperationsImpl(RollingOperationContext context) {
    super(context.withApiGroupName("seaweed.seaweedfs.com")
      .withApiGroupVersion("seaweed.seaweedfs.com/v1")
      .withPlural("seaweeds"));
    this.type = SeaweedFS.class;
    this.listType = SeaweedFSList.class;
    this.doneableType = DoneableSeaweedFS.class;
  }

  public SeaweedFSOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, null);
  }

  public SeaweedFSOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(new RollingOperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace).withPropagationPolicy(DEFAULT_PROPAGATION_POLICY));
  }

  @Override
  public BaseOperation<SeaweedFS, SeaweedFSList, DoneableSeaweedFS, RollableScalableResource<SeaweedFS, DoneableSeaweedFS>> newInstance(OperationContext context) {
    return new SeaweedFSOperationsImpl((RollingOperationContext) context);
  }

  @Override
  public SeaweedFS updateImage(Map<String, String> containerToImageMap) {
    return null;
  }

  @Override
  public SeaweedFS updateImage(String image) {
    return null;
  }

  @Override
  public SeaweedFS pause() {
    return null;
  }

  @Override
  public SeaweedFS resume() {
    return null;
  }

  @Override
  public SeaweedFS restart() {
    return null;
  }

  @Override
  public SeaweedFS undo() {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<SeaweedFS, SeaweedFS, DoneableSeaweedFS> withTimeout(long timeout, TimeUnit unit) {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<SeaweedFS, SeaweedFS, DoneableSeaweedFS> withTimeoutInMillis(long timeoutInMillis) {
    return null;
  }

  @Override
  protected SeaweedFS withReplicas(int count) {
    return null;
  }

  @Override
  protected RollingUpdater<SeaweedFS, SeaweedFSList, DoneableSeaweedFS> getRollingUpdater(long rollingTimeout, TimeUnit rollingTimeUnit) {
    return null;
  }

  @Override
  protected int getCurrentReplicas(SeaweedFS current) {
    return 0;
  }

  @Override
  protected int getDesiredReplicas(SeaweedFS item) {
    return 0;
  }

  @Override
  protected long getObservedGeneration(SeaweedFS current) {
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
  public TimeoutImageEditReplacePatchable<SeaweedFS, SeaweedFS, DoneableSeaweedFS> rolling() {
    return null;
  }

  @Override
  public Status rollback(DeploymentRollback deploymentRollback) {
    return null;
  }
}
