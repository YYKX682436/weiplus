package gr2;

/* loaded from: classes4.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView f274765d;

    public f(com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView frameworkCircleAnimView) {
        this.f274765d = frameworkCircleAnimView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView frameworkCircleAnimView = this.f274765d;
        frameworkCircleAnimView.f122120h = animatedFraction <= 0.33f ? (android.graphics.RadialGradient) kz5.n0.a0(frameworkCircleAnimView.f122121i, 0) : animatedFraction <= 0.66f ? (android.graphics.RadialGradient) kz5.n0.a0(frameworkCircleAnimView.f122121i, 1) : (android.graphics.RadialGradient) kz5.n0.a0(frameworkCircleAnimView.f122121i, 2);
        frameworkCircleAnimView.f122126q = (frameworkCircleAnimView.getHeight() - frameworkCircleAnimView.f122122m) * animatedFraction;
        frameworkCircleAnimView.invalidate();
    }
}
