package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class o6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f190536h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f190537i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f190538m;

    public o6(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f190532d = c8Var;
        this.f190533e = i17;
        this.f190534f = i18;
        this.f190535g = i19;
        this.f190536h = i27;
        this.f190537i = i28;
        this.f190538m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f190532d.h().setOutlineProvider(new com.tencent.mm.pluginsdk.ui.chat.n6(this.f190533e, it.getAnimatedFraction(), this.f190534f, this.f190535g, this.f190536h, this.f190537i, this.f190538m, 0.5f, 0.0f, this.f190532d));
    }
}
