package io.fabric8.kubernetes.client.dsl.istio;

import io.fabric8.kubernetes.api.model.Status;
import io.fabric8.kubernetes.api.model.apps.istio.DestinationRule;
import io.fabric8.kubernetes.api.model.apps.istio.DestinationRuleList;
import io.fabric8.kubernetes.api.model.apps.istio.DoneableDestinationRule;
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

public class DestinationRuleOperationsImpl extends RollableScalableResourceOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, RollableScalableResource<DestinationRule, DoneableDestinationRule>>
  implements TimeoutImageEditReplacePatchable<DestinationRule, DestinationRule, DoneableDestinationRule> {

  public DestinationRuleOperationsImpl(RollingOperationContext context) {
    super(context.withApiGroupName("networking.istio.io")
      .withApiGroupVersion("networking.istio.io/v1alpha3")
      .withPlural("destinationrules"));
    this.type = DestinationRule.class;
    this.listType = DestinationRuleList.class;
    this.doneableType = DoneableDestinationRule.class;
  }
  public DestinationRuleOperationsImpl(OkHttpClient client, Config config) {
    this(client, config, null);
  }
  public DestinationRuleOperationsImpl(OkHttpClient client, Config config, String namespace) {
    this(new RollingOperationContext().withOkhttpClient(client).withConfig(config).withNamespace(namespace).withPropagationPolicy(DEFAULT_PROPAGATION_POLICY));
  }



  @Override
  public NonNamespaceOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, RollableScalableResource<DestinationRule, DoneableDestinationRule>> inNamespace(String namespace) {
    return super.inNamespace(namespace);
  }

  @Override
  public BaseOperation<DestinationRule, DestinationRuleList, DoneableDestinationRule, RollableScalableResource<DestinationRule, DoneableDestinationRule>>
  newInstance(OperationContext context) {
    return new DestinationRuleOperationsImpl((RollingOperationContext) context);
  }

  @Override
  public DestinationRule updateImage(Map<String, String> containerToImageMap) {
    return null;
  }

  @Override
  public DestinationRule updateImage(String image) {
    return null;
  }

  @Override
  public DestinationRule pause() {
    return null;
  }

  @Override
  public DestinationRule resume() {
    return null;
  }

  @Override
  public DestinationRule restart() {
    return null;
  }

  @Override
  public DestinationRule undo() {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<DestinationRule, DestinationRule, DoneableDestinationRule> withTimeout(long timeout, TimeUnit unit) {
    return null;
  }

  @Override
  public ImageEditReplacePatchable<DestinationRule, DestinationRule, DoneableDestinationRule> withTimeoutInMillis(long timeoutInMillis) {
    return null;
  }

  @Override
  protected DestinationRule withReplicas(int count) {
    return null;
  }

  @Override
  protected RollingUpdater<DestinationRule, DestinationRuleList, DoneableDestinationRule> getRollingUpdater(long rollingTimeout, TimeUnit rollingTimeUnit) {
    return null;
  }

  @Override
  protected int getCurrentReplicas(DestinationRule current) {
    return 0;
  }

  @Override
  protected int getDesiredReplicas(DestinationRule item) {
    return 0;
  }

  @Override
  protected long getObservedGeneration(DestinationRule current) {
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
  public TimeoutImageEditReplacePatchable<DestinationRule, DestinationRule, DoneableDestinationRule> rolling() {
    return null;
  }

  @Override
  public Status rollback(DeploymentRollback deploymentRollback) {
    return null;
  }
}
