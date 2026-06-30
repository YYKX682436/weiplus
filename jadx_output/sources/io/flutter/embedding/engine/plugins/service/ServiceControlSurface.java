package io.flutter.embedding.engine.plugins.service;

/* loaded from: classes15.dex */
public interface ServiceControlSurface {
    void attachToService(android.app.Service service, androidx.lifecycle.o oVar, boolean z17);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
