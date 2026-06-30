package xt2;

/* loaded from: classes3.dex */
public final class b0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView f456627d;

    public b0(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView finderLiveShopCountDownAnimView) {
        this.f456627d = finderLiveShopCountDownAnimView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f456627d.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }
}
