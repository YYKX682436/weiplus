package kh;

/* loaded from: classes12.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f307899d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f307900e;

    public r(android.animation.ValueAnimator.AnimatorUpdateListener origin, java.lang.String taskName) {
        kotlin.jvm.internal.o.g(origin, "origin");
        kotlin.jvm.internal.o.g(taskName, "taskName");
        this.f307899d = origin;
        this.f307900e = taskName;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        try {
            kh.g.f307802f.h(this.f307900e, this.f307899d.hashCode(), new kh.q(this, animation));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.AnimatorTracker", e17, "wrapUpdateListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f307838n;
            if (kh.k1.f307838n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "UpdateListenerWrap", "onAnimationUpdate");
            }
            throw e17;
        }
    }
}
