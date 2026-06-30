package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.w f202991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f202992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f202993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f202994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f202995i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f202996m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f202997n;

    public m(int i17, com.tencent.mm.ui.chatting.view.w wVar, int i18, android.graphics.Rect rect, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, float f17, com.tencent.mm.ui.chatting.view.r rVar, int i19) {
        this.f202990d = i17;
        this.f202991e = wVar;
        this.f202992f = i18;
        this.f202993g = rect;
        this.f202994h = mMNeat7extView;
        this.f202995i = f17;
        this.f202996m = rVar;
        this.f202997n = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        int i17 = this.f202990d;
        com.tencent.mm.ui.chatting.view.w wVar = this.f202991e;
        int b17 = a06.d.b(i17 + ((wVar.f203133a - i17) * animatedFraction));
        int b18 = a06.d.b(this.f202992f + ((wVar.f203134b - r1) * animatedFraction));
        int i18 = wVar.f203133a;
        int f17 = e06.p.f(i18 - b17, 0, i18);
        android.graphics.Rect rect = this.f202993g;
        rect.left = f17;
        rect.bottom = e06.p.f(b18, 0, wVar.f203134b);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f202994h;
        mMNeat7extView.setClipBounds(rect);
        float e17 = e06.p.e(((animatedFraction * 300.0f) - 150.0f) / 150.0f, 0.0f, 1.0f);
        float f18 = this.f202995i;
        this.f202996m.J(mMNeat7extView, this.f202997n, f18 + ((1.0f - f18) * e17));
    }
}
