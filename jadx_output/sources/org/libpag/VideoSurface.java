package org.libpag;

/* loaded from: classes13.dex */
class VideoSurface implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    long nativeContext = 0;

    static {
        b56.a.a("pag");
        nativeInit();
    }

    private VideoSurface(int i17, int i18) {
        nativeSetup(i17, i18);
    }

    public static org.libpag.VideoSurface a(int i17, int i18) {
        org.libpag.VideoSurface videoSurface = new org.libpag.VideoSurface(i17, i18);
        if (videoSurface.nativeContext == 0) {
            return null;
        }
        return videoSurface;
    }

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    private native void nativeSetup(int i17, int i18);

    private native void notifyFrameAvailable();

    public void finalize() {
        nativeFinalize();
    }

    public native android.view.Surface getInputSurface();

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    public void a() {
        nativeRelease();
    }
}
