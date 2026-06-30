package nh2;

/* loaded from: classes10.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f337108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f337109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView f337110f;

    public h(float f17, float f18, com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView) {
        this.f337108d = f17;
        this.f337109e = f18;
        this.f337110f = ktvRenderLayoutView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f337109e;
        float f18 = this.f337108d;
        float f19 = f18 - (floatValue * (f18 - f17));
        com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = this.f337110f;
        ktvRenderLayoutView.f111683r.setTranslationY(f19);
        ktvRenderLayoutView.f111682q.setTranslationY(f19);
    }
}
