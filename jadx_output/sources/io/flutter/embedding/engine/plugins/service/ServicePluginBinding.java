package io.flutter.embedding.engine.plugins.service;

/* loaded from: classes15.dex */
public interface ServicePluginBinding {
    void addOnModeChangeListener(io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener onModeChangeListener);

    java.lang.Object getLifecycle();

    android.app.Service getService();

    void removeOnModeChangeListener(io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener onModeChangeListener);
}
