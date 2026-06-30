package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class n4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f174116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f174117g;

    public n4(android.view.View view, int i17, int i18, int i19) {
        this.f174114d = view;
        this.f174115e = i17;
        this.f174116f = i18;
        this.f174117g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        android.view.View view = this.f174114d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new com.tencent.mm.plugin.textstatus.ui.m4(this.f174115e, this.f174116f, animatedFraction, this.f174117g));
    }
}
