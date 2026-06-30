package com.tencent.tencentmap.mapsdk.vector.compat.utils.animation;

/* loaded from: classes13.dex */
public abstract class OverlayAnimator {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f215424a;

    /* renamed from: b, reason: collision with root package name */
    public long f215425b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f215426c = new android.animation.AnimatorSet();

    public OverlayAnimator(java.lang.Object obj, long j17) {
        this.f215424a = obj;
        this.f215425b = java.lang.Math.max(0L, j17);
    }

    public void addAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.f215426c.addListener(animatorListener);
    }

    public void cancelAnimation() {
        synchronized (this) {
            this.f215426c.cancel();
        }
    }

    public abstract android.animation.ValueAnimator createSegmentAnimator(int i17);

    public void endAnimation() {
        synchronized (this) {
            this.f215426c.end();
        }
    }

    public android.animation.AnimatorSet getAnimatorSet() {
        return this.f215426c;
    }

    public long getDuration() {
        return this.f215425b;
    }

    public java.lang.Object getObject() {
        return this.f215424a;
    }

    public void setAnimatorSet(android.animation.AnimatorSet animatorSet) {
        this.f215426c = animatorSet;
    }

    public void setDuration(long j17) {
        this.f215425b = j17;
    }

    public void setObject(java.lang.Object obj) {
        this.f215424a = obj;
    }

    public void startAnimation() {
        synchronized (this) {
            if (!this.f215426c.isRunning()) {
                this.f215426c.start();
            }
        }
    }
}
