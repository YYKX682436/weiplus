package io.flutter.embedding.engine.plugins.service;

/* loaded from: classes15.dex */
public interface ServiceAware {

    /* loaded from: classes15.dex */
    public interface OnModeChangeListener {
        void onMoveToBackground();

        void onMoveToForeground();
    }

    void onAttachedToService(io.flutter.embedding.engine.plugins.service.ServicePluginBinding servicePluginBinding);

    void onDetachedFromService();
}
