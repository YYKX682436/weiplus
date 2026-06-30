package org.libpag;

/* loaded from: classes13.dex */
public class PAGPlayer {

    /* renamed from: a, reason: collision with root package name */
    private org.libpag.PAGSurface f347802a = null;
    private long nativeContext = 0;

    static {
        b56.a.a("pag");
        nativeInit();
    }

    public PAGPlayer() {
        nativeSetup();
    }

    private native void nativeFinalize();

    private native void nativeGetMatrix(float[] fArr);

    private static final native void nativeInit();

    private final native void nativeRelease();

    private native void nativeSetMatrix(float f17, float f18, float f19, float f27, float f28, float f29);

    private native void nativeSetSurface(long j17);

    private final native void nativeSetup();

    public native boolean cacheEnabled();

    public native float cacheScale();

    public native long currentFrame();

    public native long duration();

    public void finalize() {
        nativeFinalize();
    }

    public boolean flush() {
        return flushAndFenceSync(null);
    }

    public native boolean flushAndFenceSync(long[] jArr);

    public native android.graphics.RectF getBounds(org.libpag.PAGLayer pAGLayer);

    public native org.libpag.PAGComposition getComposition();

    public native org.libpag.PAGLayer[] getLayersUnderPoint(float f17, float f18);

    public native double getProgress();

    public org.libpag.PAGSurface getSurface() {
        return this.f347802a;
    }

    public native boolean hitTestPoint(org.libpag.PAGLayer pAGLayer, float f17, float f18, boolean z17);

    public android.graphics.Matrix matrix() {
        float[] fArr = new float[9];
        nativeGetMatrix(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public native float maxFrameRate();

    public native void prepare();

    public void release() {
        nativeRelease();
    }

    public native int scaleMode();

    public native void setCacheEnabled(boolean z17);

    public native void setCacheScale(float f17);

    public native void setComposition(org.libpag.PAGComposition pAGComposition);

    public void setMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        nativeSetMatrix(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    public native void setMaxFrameRate(float f17);

    public native void setProgress(double d17);

    public native void setScaleMode(int i17);

    public void setSurface(org.libpag.PAGSurface pAGSurface) {
        this.f347802a = pAGSurface;
        if (pAGSurface == null) {
            nativeSetSurface(0L);
        } else {
            nativeSetSurface(pAGSurface.nativeSurface);
        }
    }

    public native void setUseDiskCache(boolean z17);

    public native void setVideoEnabled(boolean z17);

    public native boolean useDiskCache();

    public native boolean videoEnabled();

    public native boolean waitSync(long j17);
}
