package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class r6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f190604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f190605i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f190606m;

    public r6(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f190600d = c8Var;
        this.f190601e = i17;
        this.f190602f = i18;
        this.f190603g = i19;
        this.f190604h = i27;
        this.f190605i = i28;
        this.f190606m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f190600d.h().setOutlineProvider(new com.tencent.mm.pluginsdk.ui.chat.q6(this.f190601e, it.getAnimatedFraction(), this.f190602f, this.f190603g, this.f190604h, this.f190605i, this.f190606m, 0.0f, 0.5f, this.f190600d));
    }
}
