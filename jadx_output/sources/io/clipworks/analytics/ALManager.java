package io.clipworks.analytics;

/* loaded from: classes16.dex */
public class ALManager {
    private static io.clipworks.analytics.ALManager _sInstance;
    private io.clipworks.analytics.ALEventBridge _eventBridge = null;
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private ALManager() {
    }

    private native com.facebook.jni.HybridData initHybrid();

    private native void nativeInitReporter();

    private native void nativeRegisterDefaultFileSink();

    private native void nativeRegisterEventBridge(io.clipworks.analytics.ALEventBridge aLEventBridge);

    private native void nativeShutdownReporter();

    private native void nativeUnregisterEventBridge();

    public static io.clipworks.analytics.ALManager sharedInstance() {
        if (_sInstance == null) {
            _sInstance = new io.clipworks.analytics.ALManager();
        }
        return _sInstance;
    }

    public void initReporter() {
        nativeInitReporter();
    }

    public void registerDefaultFileSink() {
        nativeRegisterDefaultFileSink();
    }

    public void registerEventSink(cz5.a aVar) {
    }

    public void shutdownReporter() {
        nativeShutdownReporter();
    }

    public void unregisterEventSink(cz5.a aVar) {
    }
}
