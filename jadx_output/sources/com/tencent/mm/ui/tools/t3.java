package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class t3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f210752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f210753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f210754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f210755g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f210756h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f210757i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f210758m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f210759n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f210760o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210761p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int[] f210762q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f210763r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f210764s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f210765t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.v3 f210766u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f210767v;

    public t3(boolean z17, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, android.view.View view, int[] iArr, int i17, int i18, android.graphics.Rect rect, com.tencent.mm.ui.tools.v3 v3Var, float f39, float f47) {
        this.f210752d = z17;
        this.f210753e = f17;
        this.f210754f = f18;
        this.f210755g = f19;
        this.f210756h = f27;
        this.f210757i = f28;
        this.f210758m = f29;
        this.f210759n = f37;
        this.f210760o = f38;
        this.f210761p = view;
        this.f210762q = iArr;
        this.f210763r = i17;
        this.f210764s = i18;
        this.f210765t = rect;
        this.f210766u = v3Var;
        this.f210767v = f47;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        com.tencent.mm.ui.tools.a4.a(this.f210753e, this.f210754f, this.f210755g, this.f210756h, this.f210757i, this.f210758m, this.f210759n, this.f210760o, this.f210761p, this.f210762q, this.f210763r, this.f210764s, this.f210765t, this.f210766u, 0.0f, this.f210767v, this.f210752d ? 1.0f - animator.getAnimatedFraction() : animator.getAnimatedFraction());
    }
}
