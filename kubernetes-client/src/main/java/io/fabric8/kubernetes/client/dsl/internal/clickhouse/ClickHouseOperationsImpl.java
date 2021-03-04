package io.fabric8.kubernetes.client.dsl.internal.clickhouse;

import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.api.model.apps.clickhouse.ClickHouse;
import io.fabric8.kubernetes.api.model.apps.clickhouse.ClickHouseList;
import io.fabric8.kubernetes.api.model.apps.clickhouse.DoneableClickHouse;
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
import okhttp3.OkHttpClient;

import java.io.OutputStream;
import java.io.Reader;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ClickHouseOperationsImpl extends RollableScalableResourceOperation<ClickHouse, ClickHouseList, DoneableClickHouse, RollableScalableResource<ClickHouse,DoneableClickHouse>>
  implements TimeoutImageEditReplacePatchable<ClickHouse,ClickHouse,DoneableClickHouse> {
  public ClickHouseOperationsImpl(RollingOperationContext context) {
    super(context.withApiGroupName("clickhouse.altinity.com")
      .withApiGroupVersion("clickhouse.altinity.com/v1")
      .withPlural("clickhouse"));
    this.type=ClickHouse.class;
    this.listType=ClickHouseList.class;
    this.doneableType = DoneableClickHouse.class;
  }

  public ClickHouseOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, null);
  }

  public ClickHouseOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(new RollingOperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace).withPropagationPolicy(DEFAULT_PROPAGATION_POLICY));
  }

  @Override
  public BaseOperation<ClickHouse, ClickHouseList, DoneableClickHouse, RollableScalableResource<ClickHouse, DoneableClickHouse>> newInstance(OperationContext context) {
    return new ClickHouseOperationsImpl((RollingOperationContext) context);
  }

  @Override
  public ClickHouse updateImage(Map<String, String> containerToImageMap) {
    return null;
  }

  @Override
  public ClickHouse updateImage(String image) {
    return null;
  }

  @Override
  public ClickHouse pause() {
    return null;
  }

  @Override
  public ClickHouse resume() {
    return null;
  }

  @Override
  public ClickHouse restart() {
    return null;
  }

  @Override
  public ClickHouse undo() {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<ClickHouse, ClickHouse, DoneableClickHouse> withTimeout(long timeout, TimeUnit unit) {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<ClickHouse, ClickHouse, DoneableClickHouse> withTimeoutInMillis(long timeoutInMillis) {
    return null;
  }

  @Override
  protected ClickHouse withReplicas(int count) {
    return null;
  }

  @Override
  protected RollingUpdater<ClickHouse, ClickHouseList, DoneableClickHouse> getRollingUpdater(long rollingTimeout, TimeUnit rollingTimeUnit) {
    return null;
  }

  @Override
  protected int getCurrentReplicas(ClickHouse current) {
    return 0;
  }

  @Override
  protected int getDesiredReplicas(ClickHouse item) {
    return 0;
  }

  @Override
  protected long getObservedGeneration(ClickHouse current) {
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
  public TimeoutImageEditReplacePatchable<ClickHouse, ClickHouse, DoneableClickHouse> rolling() {
    return null;
  }

  @Override
  public Status rollback(DeploymentRollback deploymentRollback) {
    return null;
  }
}
