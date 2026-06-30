package kh;

/* loaded from: classes12.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.Animator.AnimatorListener f307882d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f307883e;

    public p(android.animation.Animator.AnimatorListener origin, java.lang.String taskName) {
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(taskName, "taskName");
        this.f307882d = origin;
        this.f307883e = taskName;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        try {
            kh.g.f307802f.h(this.f307883e, this.f307882d.hashCode(), new kh.l(this, animation));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f307838n;
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationCancel");
            }
            throw e17;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        try {
            kh.g.f307802f.h(this.f307883e, this.f307882d.hashCode(), new kh.m(this, animation));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f307838n;
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationEnd");
            }
            throw e17;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        try {
            kh.g.f307802f.h(this.f307883e, this.f307882d.hashCode(), new kh.n(this, animation));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f307838n;
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationRepeat");
            }
            throw e17;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        try {
            kh.g.f307802f.h(this.f307883e, this.f307882d.hashCode(), new kh.o(this, animation));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f307838n;
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationStart");
            }
            throw e17;
        }
    }
}
