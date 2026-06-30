package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class u3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f210795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f210796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f210797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f210798g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f210799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f210800i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f210801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f210802n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f210803o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210804p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int[] f210805q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f210806r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f210807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f210808t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.v3 f210809u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f210810v;

    public u3(boolean z17, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, android.view.View view, int[] iArr, int i17, int i18, android.graphics.Rect rect, com.tencent.mm.ui.tools.v3 v3Var, float f39, float f47) {
        this.f210795d = z17;
        this.f210796e = f17;
        this.f210797f = f18;
        this.f210798g = f19;
        this.f210799h = f27;
        this.f210800i = f28;
        this.f210801m = f29;
        this.f210802n = f37;
        this.f210803o = f38;
        this.f210804p = view;
        this.f210805q = iArr;
        this.f210806r = i17;
        this.f210807s = i18;
        this.f210808t = rect;
        this.f210809u = v3Var;
        this.f210810v = f47;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.tools.a4.a(this.f210796e, this.f210797f, this.f210798g, this.f210799h, this.f210800i, this.f210801m, this.f210802n, this.f210803o, this.f210804p, this.f210805q, this.f210806r, this.f210807s, this.f210808t, this.f210809u, 0.0f, this.f210810v, this.f210795d ? 0.0f : 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.ui.tools.a4.a(this.f210796e, this.f210797f, this.f210798g, this.f210799h, this.f210800i, this.f210801m, this.f210802n, this.f210803o, this.f210804p, this.f210805q, this.f210806r, this.f210807s, this.f210808t, this.f210809u, 0.0f, this.f210810v, this.f210795d ? 0.0f : 1.0f);
    }
}
