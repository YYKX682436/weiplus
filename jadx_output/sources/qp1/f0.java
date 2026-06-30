package qp1;

/* loaded from: classes2.dex */
public final class f0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f365720d;

    public f0(yz5.l lVar) {
        this.f365720d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f365720d.invoke(java.lang.Float.valueOf(it.getAnimatedFraction()));
    }
}
