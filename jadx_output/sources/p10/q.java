package p10;

/* loaded from: classes8.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f350977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f350978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f350979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f350980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350981h;

    public q(float f17, float f18, float f19, float f27, com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350977d = f17;
        this.f350978e = f18;
        this.f350979f = f19;
        this.f350980g = f27;
        this.f350981h = magicDebugPanelView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f350978e;
        float f18 = this.f350977d;
        float f19 = f18 + ((f17 - f18) * floatValue);
        float f27 = this.f350980g;
        float f28 = this.f350979f;
        float f29 = f28 + ((f27 - f28) * floatValue);
        int i17 = com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView.G;
        this.f350981h.c(2, f19, f29);
    }
}
