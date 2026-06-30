package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f209942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f209943f;

    public j(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup, int i17, int i18) {
        this.f209941d = chatTipsBarGroup;
        this.f209942e = i17;
        this.f209943f = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f209941d;
        chatTipsBarGroup.f209911m.setOutlineProvider(new com.tencent.mm.ui.tipsbar.i(this.f209942e, this.f209943f, animatedFraction));
        chatTipsBarGroup.f209911m.invalidate();
    }
}
