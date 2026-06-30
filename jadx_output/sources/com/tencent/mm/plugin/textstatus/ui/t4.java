package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class t4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f174314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f174315g;

    public t4(android.view.View view, int i17, int i18, int i19) {
        this.f174312d = view;
        this.f174313e = i17;
        this.f174314f = i18;
        this.f174315g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f174312d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new com.tencent.mm.plugin.textstatus.ui.s4(this.f174313e, this.f174314f, animatedFraction, this.f174315g));
    }
}
