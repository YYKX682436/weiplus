package org.chromium.base.metrics;

/* loaded from: classes3.dex */
public class ScopedSysTraceEvent implements java.lang.AutoCloseable {
    private ScopedSysTraceEvent(java.lang.String str) {
    }

    public static org.chromium.base.metrics.ScopedSysTraceEvent scoped(java.lang.String str) {
        return new org.chromium.base.metrics.ScopedSysTraceEvent(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
