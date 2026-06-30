package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class x4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f116793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f116794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f116795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f116796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f116797h;

    public x4(float f17, float f18, float f19, float f27, com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2) {
        this.f116793d = f17;
        this.f116794e = f18;
        this.f116795f = f19;
        this.f116796g = f27;
        this.f116797h = finderLiveFloatContainerV2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 1.0f;
        float f18 = this.f116794e;
        float f19 = this.f116793d;
        float f27 = f19 + ((f18 - f19) * floatValue);
        float f28 = this.f116796g;
        float f29 = this.f116795f;
        float f37 = f29 + ((f28 - f29) * floatValue);
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2.D;
        this.f116797h.j(f27, f37);
    }
}
