package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class jd {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f184871a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f184872b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f184873c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f184874d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f184875e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f184876f;

    /* renamed from: g, reason: collision with root package name */
    public int f184877g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f184878h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f184879i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f184880j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f184881k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f184882l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f184883m;

    /* renamed from: n, reason: collision with root package name */
    public long f184884n;

    /* renamed from: o, reason: collision with root package name */
    public long f184885o;

    public bw5.lp0 a() {
        java.lang.String wi6;
        java.lang.String str = this.f184883m;
        if (str == null || str.isEmpty()) {
            wi6 = ((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).wi(this.f184880j);
        } else {
            wi6 = com.tencent.mm.sdk.platformtools.t8.z1("id://local/i.html?__biz=%s&mid=%s&idx=%s", this.f184883m, java.lang.Long.valueOf(this.f184884n), java.lang.Long.valueOf(this.f184885o));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
            wi6 = com.tencent.mm.sdk.platformtools.w2.a(this.f184880j);
        }
        java.lang.String str2 = this.f184875e;
        if (str2 == null || str2.isEmpty()) {
            str2 = this.f184873c;
        }
        bw5.j40 j40Var = new bw5.j40();
        j40Var.i(this.f184880j);
        j40Var.f28808f = this.f184874d;
        boolean[] zArr = j40Var.H;
        zArr[3] = true;
        j40Var.f28812m = this.f184871a;
        zArr[7] = true;
        j40Var.f28809g = this.f184872b;
        zArr[4] = true;
        j40Var.f28810h = str2;
        zArr[5] = true;
        j40Var.f28822w = true;
        zArr[17] = true;
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(2);
        v70Var.o(j40Var);
        v70Var.x(this.f184874d);
        v70Var.p(this.f184872b);
        v70Var.q(str2);
        v70Var.r(j40Var.f28818s);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        lp0Var.g(wi6);
        return lp0Var;
    }
}
