package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f152921a = com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f152922b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f152923c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152925e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152926f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f152927g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f152928h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f152929i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f152930j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f152931k;

    public f(com.tencent.mm.plugin.performance.diagnostic.d dVar) {
        this.f152931k = dVar.j();
        this.f152922b = dVar.b() + ".$source";
        this.f152923c = dVar.b() + ".$enable";
        this.f152924d = dVar.b() + ".$duration";
        this.f152925e = dVar.b() + ".begin";
        this.f152926f = dVar.b() + ".$multiprocess";
        this.f152927g = dVar.b() + ".$process";
        this.f152928h = dVar.b() + ".clientversion";
        this.f152929i = dVar.b() + ".crash";
        this.f152930j = dVar.b() + ".$dumpcycle";
    }

    public void a(java.util.Map map) {
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.performance.diagnostic.d.f152913e, "convert and save config");
        java.lang.String str = this.f152923c;
        boolean equals = "1".equals(map.get(str));
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f152921a;
        o4Var.G(str, equals);
        java.lang.String str2 = this.f152924d;
        o4Var.A(str2, com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2), 0));
        o4Var.B(this.f152925e, java.lang.System.currentTimeMillis());
        java.lang.String str3 = this.f152926f;
        o4Var.G(str3, "1".equals(map.get(str3)));
        java.lang.String str4 = this.f152927g;
        o4Var.D(str4, (java.lang.String) map.get(str4));
        o4Var.A(this.f152928h, com.tencent.mm.sdk.platformtools.z.f193112h);
    }

    public boolean b() {
        boolean i17 = this.f152921a.i(this.f152926f, false);
        java.lang.String d17 = d();
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.performance.diagnostic.d.f152913e, "[%s] filterProcess: target process is %s, current process is %s", this.f152931k, d17, bm5.f1.a());
        if (d17.contains(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL) || (android.text.TextUtils.isEmpty(d17) && i17)) {
            return true;
        }
        if ((d17.contains("mm") || android.text.TextUtils.isEmpty(d17)) && com.tencent.mm.sdk.platformtools.x2.n()) {
            return true;
        }
        if (d17.contains("appbrand") && com.tencent.mm.sdk.platformtools.x2.j()) {
            return true;
        }
        return d17.contains("tools") && com.tencent.mm.sdk.platformtools.x2.s();
    }

    public long c() {
        return java.util.concurrent.TimeUnit.MINUTES.toMillis(this.f152921a.q(this.f152930j, 30L));
    }

    public java.lang.String d() {
        return this.f152921a.u(this.f152927g, "");
    }

    public boolean e() {
        return this.f152921a.i(this.f152923c, false);
    }
}
