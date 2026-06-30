package io.clipworks.androidplus.graphics;

/* loaded from: classes6.dex */
public class NativeOnFrameAvailableListener implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    private final com.facebook.jni.HybridData mHybridData;

    private NativeOnFrameAvailableListener(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void nativeOnFrameAvailable();

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        nativeOnFrameAvailable();
    }
}
