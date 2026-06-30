package io.flutter.embedding.engine.plugins.activity;

/* loaded from: classes15.dex */
public interface ActivityAware {
    void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding);

    void onDetachedFromActivity();

    void onDetachedFromActivityForConfigChanges();

    void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding);
}
