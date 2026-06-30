package org.chromium.net.impl;

/* loaded from: classes13.dex */
public final class CronetLoggerFactory {
    private static final java.lang.String CRONET_LOGGER_IMPL_CLASS = "com.google.net.cronet.telemetry.CronetLoggerImpl";
    private static final int SAMPLE_RATE_PER_SECOND = 1;
    private static final java.lang.String TAG = "CronetLoggerFactory";
    private static final org.chromium.net.impl.CronetLogger sDefaultLogger = new org.chromium.net.impl.NoOpLogger();
    private static org.chromium.net.impl.CronetLogger sTestingLogger;

    /* loaded from: classes13.dex */
    public static class SwapLoggerForTesting implements java.lang.AutoCloseable {
        public SwapLoggerForTesting(org.chromium.net.impl.CronetLogger cronetLogger) {
            org.chromium.net.impl.CronetLoggerFactory.setLoggerForTesting(cronetLogger);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            org.chromium.net.impl.CronetLoggerFactory.setLoggerForTesting(null);
        }
    }

    private CronetLoggerFactory() {
    }

    public static org.chromium.net.impl.CronetLogger createLogger(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        org.chromium.net.impl.CronetLogger cronetLogger = sTestingLogger;
        if (cronetLogger != null) {
            return cronetLogger;
        }
        if (!org.chromium.net.impl.CronetManifest.isAppOptedInForTelemetry(context, cronetSource) || android.os.Build.VERSION.SDK_INT < 30) {
            return sDefaultLogger;
        }
        java.lang.Class<? extends org.chromium.net.impl.CronetLogger> fetchLoggerImplClass = fetchLoggerImplClass();
        if (fetchLoggerImplClass == null) {
            return sDefaultLogger;
        }
        try {
            return fetchLoggerImplClass.getConstructor(java.lang.Integer.TYPE).newInstance(1);
        } catch (java.lang.Exception unused) {
            return sDefaultLogger;
        }
    }

    public static org.chromium.net.impl.CronetLogger createNoOpLogger() {
        return sDefaultLogger;
    }

    private static java.lang.Class<? extends org.chromium.net.impl.CronetLogger> fetchLoggerImplClass() {
        try {
            return org.chromium.net.impl.CronetLoggerFactory.class.getClassLoader().loadClass(CRONET_LOGGER_IMPL_CLASS).asSubclass(org.chromium.net.impl.CronetLogger.class);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setLoggerForTesting(org.chromium.net.impl.CronetLogger cronetLogger) {
        sTestingLogger = cronetLogger;
    }
}
