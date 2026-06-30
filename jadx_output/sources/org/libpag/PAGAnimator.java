package org.libpag;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class PAGAnimator {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference f347761a;

    /* renamed from: b, reason: collision with root package name */
    private float f347762b;
    private long nativeContext = 0;

    /* loaded from: classes13.dex */
    public interface Listener {
        void onAnimationCancel(org.libpag.PAGAnimator pAGAnimator);

        void onAnimationEnd(org.libpag.PAGAnimator pAGAnimator);

        void onAnimationRepeat(org.libpag.PAGAnimator pAGAnimator);

        void onAnimationStart(org.libpag.PAGAnimator pAGAnimator);

        void onAnimationUpdate(org.libpag.PAGAnimator pAGAnimator);
    }

    static {
        b56.a.a("pag");
        nativeInit();
    }

    private PAGAnimator(android.content.Context context, org.libpag.PAGAnimator.Listener listener) {
        this.f347761a = null;
        this.f347762b = 1.0f;
        this.f347761a = new java.lang.ref.WeakReference(listener);
        if (context != null) {
            this.f347762b = android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        nativeSetup();
    }

    public static org.libpag.PAGAnimator a(android.content.Context context, org.libpag.PAGAnimator.Listener listener) {
        if (listener == null) {
            return null;
        }
        return new org.libpag.PAGAnimator(context, listener);
    }

    private native void doStart();

    private native void nativeFinalize();

    private static native void nativeInit();

    private native void nativeRelease();

    private native void nativeSetup();

    private void onAnimationCancel() {
        org.libpag.PAGAnimator.Listener listener = (org.libpag.PAGAnimator.Listener) this.f347761a.get();
        if (listener != null) {
            listener.onAnimationCancel(this);
        }
    }

    private void onAnimationEnd() {
        org.libpag.PAGAnimator.Listener listener = (org.libpag.PAGAnimator.Listener) this.f347761a.get();
        if (listener != null) {
            listener.onAnimationEnd(this);
        }
    }

    private void onAnimationRepeat() {
        org.libpag.PAGAnimator.Listener listener = (org.libpag.PAGAnimator.Listener) this.f347761a.get();
        if (listener != null) {
            listener.onAnimationRepeat(this);
        }
    }

    private void onAnimationStart() {
        org.libpag.PAGAnimator.Listener listener = (org.libpag.PAGAnimator.Listener) this.f347761a.get();
        if (listener != null) {
            listener.onAnimationStart(this);
        }
    }

    private void onAnimationUpdate() {
        org.libpag.PAGAnimator.Listener listener = (org.libpag.PAGAnimator.Listener) this.f347761a.get();
        if (listener != null) {
            listener.onAnimationUpdate(this);
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

    public native int repeatCount();

    public native void setDuration(long j17);

    public native void setProgress(double d17);

    public native void setRepeatCount(int i17);

    public native void setSync(boolean z17);

    public native void update();

    public void a() {
        if (this.f347762b == 0.0f) {
            org.libpag.PAGAnimator.Listener listener = (org.libpag.PAGAnimator.Listener) this.f347761a.get();
            if (listener != null) {
                listener.onAnimationUpdate(this);
                listener.onAnimationEnd(this);
                return;
            }
            return;
        }
        doStart();
    }
}
