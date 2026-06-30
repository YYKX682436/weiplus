package gr2;

/* loaded from: classes4.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView f274769d;

    public g(com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView frameworkCircleAnimView) {
        this.f274769d = frameworkCircleAnimView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f274769d.setAlpha(1.0f - it.getAnimatedFraction());
    }
}
