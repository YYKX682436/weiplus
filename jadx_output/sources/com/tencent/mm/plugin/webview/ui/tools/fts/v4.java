package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public abstract class v4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f184675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f184676b;

    /* renamed from: c, reason: collision with root package name */
    public int f184677c;

    /* renamed from: d, reason: collision with root package name */
    public final int f184678d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f184679e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f184680f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f184681g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f184682h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f184683i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f184684j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f184685k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f184686l;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f184687m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f184688n;

    /* renamed from: o, reason: collision with root package name */
    public final float[][] f184689o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f184690p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f184692r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.t4 f184693s;

    /* renamed from: t, reason: collision with root package name */
    public final int f184694t;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.fts.u4 f184691q = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Init;

    /* renamed from: u, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f184695u = new com.tencent.mm.plugin.webview.ui.tools.fts.p4(this);

    /* renamed from: v, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f184696v = new com.tencent.mm.plugin.webview.ui.tools.fts.q4(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f184697w = new com.tencent.mm.plugin.webview.ui.tools.fts.r4(this);

    /* renamed from: x, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f184698x = new com.tencent.mm.plugin.webview.ui.tools.fts.s4(this);

    public v4(android.content.Context context, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.view.View view5, android.view.View view6, android.view.View view7, android.view.View view8, android.view.View view9, android.view.View view10) {
        this.f184694t = 0;
        int b17 = i65.a.b(context, 20);
        this.f184675a = b17;
        i65.a.b(context, 14);
        this.f184676b = i65.a.b(context, 16);
        this.f184689o = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 3, 2);
        this.f184690p = new float[2];
        this.f184679e = view;
        this.f184680f = view2;
        this.f184681g = view3;
        this.f184682h = view4;
        this.f184683i = view5;
        this.f184684j = view6;
        this.f184685k = view7;
        this.f184686l = view8;
        this.f184687m = view9;
        this.f184688n = view10;
        this.f184678d = b17 * 2;
        view.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.m4(this, view), 100L);
        view2.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.n4(this, view2, view), 150L);
        view7.post(new com.tencent.mm.plugin.webview.ui.tools.fts.o4(this, view7));
        this.f184694t = com.tencent.mm.ui.search.FTSEditTextView.getSearchInputType();
    }
}
