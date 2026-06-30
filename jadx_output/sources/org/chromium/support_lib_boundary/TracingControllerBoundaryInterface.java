package org.chromium.support_lib_boundary;

/* loaded from: classes.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i17, java.util.Collection<java.lang.String> collection, int i18);

    boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor);
}
