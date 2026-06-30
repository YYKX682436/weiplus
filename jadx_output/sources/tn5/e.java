package tn5;

/* loaded from: classes15.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn5.f f420867d;

    public e(tn5.f fVar) {
        this.f420867d = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f420867d.f420868a;
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        wxRefreshLayout.s(((java.lang.Integer) animatedValue).intValue(), false);
    }
}
