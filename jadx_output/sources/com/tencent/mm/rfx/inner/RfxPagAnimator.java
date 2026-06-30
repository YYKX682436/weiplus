package com.tencent.mm.rfx.inner;

/* loaded from: classes13.dex */
public class RfxPagAnimator {
    private float animationScale;
    private long nativeAnimator = 0;
    private java.lang.ref.WeakReference<com.tencent.mm.rfx.inner.g> weakListener;

    static {
        tq5.k.a("xlabeffect");
        nativeInit();
    }

    private RfxPagAnimator(android.content.Context context, com.tencent.mm.rfx.inner.g gVar) {
        this.weakListener = null;
        this.animationScale = 1.0f;
        this.weakListener = new java.lang.ref.WeakReference<>(gVar);
        if (context != null) {
            this.animationScale = android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        nativeSetup();
    }

    public static com.tencent.mm.rfx.inner.RfxPagAnimator MakeFrom(android.content.Context context, com.tencent.mm.rfx.inner.g gVar) {
        if (gVar == null) {
            return null;
        }
        return new com.tencent.mm.rfx.inner.RfxPagAnimator(context, gVar);
    }

    private native void doStart();

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    private native void nativeSetup();

    private void onAnimationCancel() {
        com.tencent.mm.rfx.inner.g gVar = this.weakListener.get();
        if (gVar != null) {
            gVar.onAnimationCancel(this);
        }
    }

    private void onAnimationEnd() {
        com.tencent.mm.rfx.inner.g gVar = this.weakListener.get();
        if (gVar != null) {
            gVar.onAnimationEnd(this);
        }
    }

    private void onAnimationRepeat() {
        com.tencent.mm.rfx.inner.g gVar = this.weakListener.get();
        if (gVar != null) {
            gVar.onAnimationRepeat(this);
        }
    }

    private void onAnimationStart() {
        com.tencent.mm.rfx.inner.g gVar = this.weakListener.get();
        if (gVar != null) {
            gVar.onAnimationStart(this);
        }
    }

    private void onAnimationUpdate() {
        com.tencent.mm.rfx.inner.g gVar = this.weakListener.get();
        if (gVar != null) {
            gVar.onAnimationUpdate(this);
        }
    }

    public native void cancel();

    public native long duration();

    public void finalize() {
        nativeFinalize();
    }

    public native boolean isRunning();

    public native boolean isSync();

    public native double progress();

    public void release() {
        nativeRelease();
    }

    public native int repeatCount();

    public native void setDuration(long j17);

    public native void setProgress(double d17);

    public native void setRepeatCount(int i17);

    public native void setSync(boolean z17);

    public void start() {
        if (this.animationScale != 0.0f) {
            doStart();
            return;
        }
        com.tencent.mm.rfx.inner.g gVar = this.weakListener.get();
        if (gVar != null) {
            gVar.onAnimationUpdate(this);
            gVar.onAnimationEnd(this);
        }
    }

    public native void update();
}
