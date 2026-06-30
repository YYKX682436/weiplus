package wo1;

/* loaded from: classes5.dex */
public final class n0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f447996d;

    public n0(wo1.a1 a1Var) {
        this.f447996d = a1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.loading.MMProgressLoading loadingProgress = this.f447996d.getLoadingProgress();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        loadingProgress.setProgress(((java.lang.Integer) animatedValue).intValue());
    }
}
