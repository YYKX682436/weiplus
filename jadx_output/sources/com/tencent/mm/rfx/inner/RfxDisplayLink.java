package com.tencent.mm.rfx.inner;

/* loaded from: classes13.dex */
class RfxDisplayLink implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final android.animation.ValueAnimator mAnimator;
    private long nativeDisplayLink = 0;
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    private RfxDisplayLink() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mAnimator = ofFloat;
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(this);
        ofFloat.setRepeatCount(-1);
    }

    public static com.tencent.mm.rfx.inner.RfxDisplayLink Create(long j17) {
        com.tencent.mm.rfx.inner.RfxDisplayLink rfxDisplayLink = new com.tencent.mm.rfx.inner.RfxDisplayLink();
        rfxDisplayLink.nativeDisplayLink = j17;
        return rfxDisplayLink;
    }

    private native void onUpdate(long j17);

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        onUpdate(this.nativeDisplayLink);
    }

    public void start() {
        this.mHandler.post(new com.tencent.mm.rfx.inner.a(this));
    }

    public void stop() {
        this.mHandler.post(new com.tencent.mm.rfx.inner.b(this));
    }
}
