package com.tencent.tencentmap.mapsdk.maps.model.transform;

/* loaded from: classes13.dex */
public abstract class OverlayAnimator {
    private android.animation.Animator.AnimatorListener mAnimatorListener;
    private android.animation.AnimatorSet mAnimatorSet = new android.animation.AnimatorSet();
    private long mDuration;
    private java.lang.Object mObject;

    public OverlayAnimator(java.lang.Object obj, long j17) {
        this.mObject = obj;
        this.mDuration = j17;
    }

    public void addAnimationListener() {
        if (this.mAnimatorSet == null) {
            return;
        }
        if (this.mAnimatorListener == null) {
            this.mAnimatorListener = new android.animation.Animator.AnimatorListener() { // from class: com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(android.animation.Animator animator) {
                    com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator.this.innerAnimationEnd();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(android.animation.Animator animator) {
                }
            };
        }
        this.mAnimatorSet.addListener(this.mAnimatorListener);
    }

    public void addAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.mAnimatorSet.addListener(animatorListener);
    }

    public void cancelAnimation() {
        synchronized (this) {
            this.mAnimatorSet.cancel();
        }
    }

    public abstract android.animation.ValueAnimator createSegmentAnimator(int i17);

    public void endAnimation() {
        synchronized (this) {
            this.mAnimatorSet.end();
        }
    }

    public android.animation.AnimatorSet getAnimatorSet() {
        return this.mAnimatorSet;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public java.lang.Object getObject() {
        return this.mObject;
    }

    public void innerAnimationEnd() {
    }

    public void removeAnimationListener() {
        android.animation.AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet == null) {
            return;
        }
        animatorSet.removeListener(this.mAnimatorListener);
        this.mAnimatorListener = null;
    }

    public void setAnimatorSet(android.animation.AnimatorSet animatorSet) {
        this.mAnimatorSet = animatorSet;
    }

    public void setDuration(long j17) {
        this.mDuration = j17;
    }

    public void setObject(java.lang.Object obj) {
        this.mObject = obj;
    }

    public void startAnimation() {
        synchronized (this) {
            if (!this.mAnimatorSet.isRunning()) {
                this.mAnimatorSet.start();
            }
        }
    }
}
