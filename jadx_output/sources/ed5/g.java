package ed5;

/* loaded from: classes5.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed5.c f251359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewOverlay f251360e;

    public g(ed5.c cVar, android.view.ViewOverlay viewOverlay) {
        this.f251359d = cVar;
        this.f251360e = viewOverlay;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ed5.c cVar = this.f251359d;
        cVar.f251349b = floatValue;
        if (cVar.f251350c) {
            cVar.invalidateSelf();
        } else {
            this.f251360e.add(cVar);
            cVar.f251350c = true;
        }
    }
}
