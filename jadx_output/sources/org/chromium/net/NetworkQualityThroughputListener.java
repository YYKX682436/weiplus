package org.chromium.net;

/* loaded from: classes16.dex */
public abstract class NetworkQualityThroughputListener {
    private final java.util.concurrent.Executor mExecutor;

    public NetworkQualityThroughputListener(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.IllegalStateException("Executor must not be null");
        }
        this.mExecutor = executor;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.mExecutor;
    }

    public abstract void onThroughputObservation(int i17, long j17, int i18);
}
