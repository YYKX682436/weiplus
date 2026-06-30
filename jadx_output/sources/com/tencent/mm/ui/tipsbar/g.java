package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209935e;

    public g(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup, int i17) {
        this.f209934d = chatTipsBarGroup;
        this.f209935e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f209934d;
        chatTipsBarGroup.f209906e.setOutlineProvider(new com.tencent.mm.ui.tipsbar.f(this.f209935e, animatedFraction));
        chatTipsBarGroup.f209906e.invalidate();
    }
}
