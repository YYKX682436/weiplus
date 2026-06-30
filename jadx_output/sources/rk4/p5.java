package rk4;

/* loaded from: classes14.dex */
public final class p5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment f396896d;

    public p5(com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment) {
        this.f396896d = tingPlayerHalfProfileDialogFragment;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            f17.floatValue();
        }
        int i17 = com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment.f174628p;
        this.f396896d.getClass();
    }
}
