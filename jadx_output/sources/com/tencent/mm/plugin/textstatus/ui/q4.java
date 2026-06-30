package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class q4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f174219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f174220g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f174221h;

    public q4(android.view.View view, int i17, int i18, com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity, int i19) {
        this.f174217d = view;
        this.f174218e = i17;
        this.f174219f = i18;
        this.f174220g = textStatusCardFeedsActivity;
        this.f174221h = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f174217d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new com.tencent.mm.plugin.textstatus.ui.p4(this.f174218e, this.f174219f, animatedFraction, this.f174220g, this.f174221h));
    }
}
