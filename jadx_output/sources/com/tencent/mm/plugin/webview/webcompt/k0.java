package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f187838a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.d24 f187839b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.f1 f187840c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f187841d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f187842e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f187843f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f187844g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f187845h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f187846i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f187847j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f187848k;

    /* renamed from: l, reason: collision with root package name */
    public o25.k2 f187849l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.r1 f187850m;

    public k0(com.tencent.mm.plugin.webview.webcompt.l0 l0Var, int i17, r45.d24 webComptInfo, com.tencent.mm.plugin.webview.webcompt.f1 webCompt) {
        kotlin.jvm.internal.o.g(webComptInfo, "webComptInfo");
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        this.f187838a = i17;
        this.f187839b = webComptInfo;
        this.f187840c = webCompt;
        this.f187844g = "";
        this.f187845h = "";
        this.f187846i = "";
        this.f187847j = "";
        this.f187848k = "";
        java.lang.String name = webComptInfo.f372006d;
        kotlin.jvm.internal.o.f(name, "name");
        com.tencent.mm.plugin.webview.webcompt.r1 r1Var = new com.tencent.mm.plugin.webview.webcompt.r1(webCompt, name);
        this.f187850m = r1Var;
        ((com.tencent.mm.plugin.appbrand.jsruntime.n) a()).addJavascriptInterface(r1Var, "__webcompt");
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.r a() {
        com.tencent.mm.plugin.appbrand.jsruntime.r x07 = com.tencent.mm.plugin.webview.webcompt.h0.b(com.tencent.mm.plugin.webview.webcompt.f1.f187797e).x0(this.f187838a);
        kotlin.jvm.internal.o.f(x07, "getJsContext(...)");
        return x07;
    }
}
