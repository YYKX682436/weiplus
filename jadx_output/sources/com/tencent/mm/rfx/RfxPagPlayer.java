package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagPlayer {
    private com.tencent.mm.rfx.RfxPagSurface pagSurface = null;
    private long nativePlayer = 0;

    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    public RfxPagPlayer() {
        nativeSetup();
    }

    private native void nativeFinalize();

    private native com.tencent.mm.rfx.RfxPagComposition nativeGetComposition();

    private native void nativeGetMatrix(float[] fArr);

    private static final native void nativeInit();

    private final native void nativeRelease();

    private native void nativeSetMatrix(float f17, float f18, float f19, float f27, float f28, float f29);

    private native void nativeSetSurface(long j17);

    private final native void nativeSetup();

    public native long duration();

    public void finalize() {
        nativeFinalize();
    }

    public boolean flush() {
        return flushAndFenceSync(null);
    }

    public native boolean flushAndFenceSync(long[] jArr);

    public native com.tencent.mm.rfx.RfxPagFrameInfo flushWithInfo();

    public com.tencent.mm.rfx.RfxPagFile getComposition() {
        return (com.tencent.mm.rfx.RfxPagFile) nativeGetComposition();
    }

    public native double getProgress();

    public com.tencent.mm.rfx.RfxPagSurface getSurface() {
        return this.pagSurface;
    }

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

    public native void setComposition(com.tencent.mm.rfx.RfxPagFile rfxPagFile);

    public void setMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        nativeSetMatrix(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    public native void setMaxFrameRate(float f17);

    public native void setProgress(double d17);

    public native void setScaleMode(int i17);

    public void setSurface(com.tencent.mm.rfx.RfxPagSurface rfxPagSurface) {
        this.pagSurface = rfxPagSurface;
        if (rfxPagSurface == null) {
            nativeSetSurface(0L);
        } else {
            nativeSetSurface(rfxPagSurface.nativeSurface);
        }
    }

    public native boolean waitSync(long j17);
}
