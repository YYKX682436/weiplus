package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public r45.py3 f181154c;

    /* renamed from: d, reason: collision with root package name */
    public r45.oy3 f181155d;

    /* renamed from: m, reason: collision with root package name */
    public int f181164m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f181166o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f181167p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f181168q;

    /* renamed from: r, reason: collision with root package name */
    public int f181169r;

    /* renamed from: s, reason: collision with root package name */
    public int f181170s;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f181152a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f181153b = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f181156e = 1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181157f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f181158g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181159h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181160i = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f181161j = null;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f181162k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f181163l = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f181165n = false;

    public com.tencent.mm.modelbase.m1 a(mt4.e eVar, boolean z17) {
        int i17 = z17 ? 2 : 1;
        if (!this.f181165n) {
            return new com.tencent.mm.wallet_core.model.c1(eVar.f331304c, i17, this.f181164m, this.f181156e, eVar.f331305d, eVar.f331307f, eVar.f331308g, eVar.f331309h, eVar.f331310i);
        }
        int i18 = this.f181164m;
        if (!(i18 == 2)) {
            r45.oy3 oy3Var = this.f181155d;
            oy3Var.f382617m = eVar.f331308g;
            oy3Var.f382614g = eVar.f331305d;
            oy3Var.f382612e = eVar.f331310i;
            oy3Var.f382613f = eVar.f331309h;
            oy3Var.f382611d = eVar.f331304c;
            oy3Var.f382616i = eVar.f331307f;
        }
        return new nt4.t(i18, i17, eVar.f331304c, this.f181154c, this.f181155d);
    }
}
