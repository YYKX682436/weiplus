package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class h3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView f116343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f116346g;

    public h3(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView finderLiveCameraOptBeautyPowerfulSuitView, int i17, int i18, int i19) {
        this.f116343d = finderLiveCameraOptBeautyPowerfulSuitView;
        this.f116344e = i17;
        this.f116345f = i18;
        this.f116346g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitView.a(this.f116343d, this.f116344e, this.f116345f, this.f116346g, ((java.lang.Float) animatedValue).floatValue());
    }
}
