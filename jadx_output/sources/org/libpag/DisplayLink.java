package org.libpag;

/* loaded from: classes15.dex */
class DisplayLink implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    private android.animation.ValueAnimator f347746a;
    private long nativeContext = 0;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Handler f347747b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* loaded from: classes15.dex */
    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            org.libpag.DisplayLink.this.f347746a.start();
        }
    }

    /* loaded from: classes15.dex */
    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            org.libpag.DisplayLink.this.f347746a.cancel();
        }
    }

    private DisplayLink() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f347746a = ofFloat;
        ofFloat.setDuration(1000L);
        this.f347746a.addUpdateListener(this);
        this.f347746a.setRepeatCount(-1);
    }

    public static org.libpag.DisplayLink Create(long j17) {
        org.libpag.DisplayLink displayLink = new org.libpag.DisplayLink();
        displayLink.nativeContext = j17;
        return displayLink;
    }

    private native void onUpdate(long j17);

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        onUpdate(this.nativeContext);
    }

    public void start() {
        this.f347747b.post(new org.libpag.DisplayLink.a());
    }

    public void stop() {
        this.f347747b.post(new org.libpag.DisplayLink.b());
    }
}
