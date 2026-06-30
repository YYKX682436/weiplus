package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.w f203023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f203024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f203025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f203026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.r f203027i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f203028m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f203029n;

    public o(int i17, com.tencent.mm.ui.chatting.view.w wVar, int i18, android.graphics.Rect rect, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, com.tencent.mm.ui.chatting.view.r rVar, int i19, float f17) {
        this.f203022d = i17;
        this.f203023e = wVar;
        this.f203024f = i18;
        this.f203025g = rect;
        this.f203026h = mMNeat7extView;
        this.f203027i = rVar;
        this.f203028m = i19;
        this.f203029n = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        int i17 = this.f203022d;
        com.tencent.mm.ui.chatting.view.w wVar = this.f203023e;
        int b17 = a06.d.b(i17 + ((wVar.f203133a - i17) * animatedFraction));
        int b18 = a06.d.b(this.f203024f + ((wVar.f203134b - r1) * animatedFraction));
        int i18 = wVar.f203133a;
        int f17 = e06.p.f(i18 - b17, 0, i18);
        android.graphics.Rect rect = this.f203025g;
        rect.left = f17;
        rect.bottom = e06.p.f(b18, 0, wVar.f203134b);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f203026h;
        mMNeat7extView.setClipBounds(rect);
        float e17 = e06.p.e(((animatedFraction * 300.0f) - 150.0f) / 150.0f, 0.0f, 1.0f);
        float f18 = this.f203029n;
        this.f203027i.J(mMNeat7extView, this.f203028m, f18 + ((1.0f - f18) * e17));
    }
}
