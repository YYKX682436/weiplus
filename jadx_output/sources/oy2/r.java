package oy2;

/* loaded from: classes8.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout f350000d;

    public r(com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout) {
        this.f350000d = scrollFrameLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f350000d.g(((java.lang.Float) animatedValue).floatValue());
    }
}
