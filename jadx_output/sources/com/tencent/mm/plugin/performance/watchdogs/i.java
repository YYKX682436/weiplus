package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class i implements ob0.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f153054a;

    /* renamed from: b, reason: collision with root package name */
    public final long f153055b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f153056c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f153057d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153058e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.performance.watchdogs.b f153059f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f153060g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.performance.watchdogs.b f153061h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f153062i;

    public i(java.lang.String bizTag, long j17) {
        kotlin.jvm.internal.o.g(bizTag, "bizTag");
        this.f153054a = bizTag;
        this.f153055b = j17;
        this.f153056c = "MicroMsg.BizStat_" + bizTag;
        this.f153057d = jz5.h.b(com.tencent.mm.plugin.performance.watchdogs.c.f153033d);
        this.f153058e = jz5.h.b(new com.tencent.mm.plugin.performance.watchdogs.d(this));
    }

    public void a() {
        com.tencent.mars.xlog.Log.i(this.f153056c, "stat start");
        if (this.f153059f != null) {
            com.tencent.mars.xlog.Log.e(this.f153056c, "duplicated start!!!");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                throw new java.lang.RuntimeException("duplicated start!!!");
            }
            return;
        }
        this.f153059f = new com.tencent.mm.plugin.performance.watchdogs.b();
        this.f153060g = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.performance.watchdogs.f(this), 1000L, 30000L);
        if (((java.lang.Boolean) ((jz5.n) this.f153057d).getValue()).booleanValue()) {
            this.f153061h = new com.tencent.mm.plugin.performance.watchdogs.b();
            ku5.u0 u0Var = ku5.t0.f312615d;
            this.f153062i = ((ku5.t0) u0Var).d(new com.tencent.mm.plugin.performance.watchdogs.h(this), 1000L, java.util.concurrent.TimeUnit.MINUTES.toMillis(1L));
        }
    }

    public void b() {
        java.lang.String str = this.f153056c;
        com.tencent.mars.xlog.Log.i(str, "stat stop");
        wu5.c cVar = this.f153060g;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f153060g = null;
        wu5.c cVar2 = this.f153062i;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        this.f153062i = null;
        if (((java.lang.Boolean) ((jz5.n) this.f153058e).getValue()).booleanValue()) {
            com.tencent.mm.plugin.performance.watchdogs.b bVar = this.f153059f;
            if ((bVar != null ? bVar.f153009b : 0L) > 10) {
                ri.i0 i0Var = ri.k0.f395920a;
                long j17 = bVar != null ? (long) bVar.f153010c : 0L;
                com.tencent.mm.plugin.performance.watchdogs.b bVar2 = this.f153061h;
                int i17 = bVar2 != null ? (int) bVar2.f153010c : 0;
                java.lang.String str2 = this.f153054a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.tencent.mm.plugin.performance.watchdogs.b bVar3 = this.f153059f;
                if (bVar3 != null) {
                    jSONObject.put("rss-max", bVar3.f153011d);
                }
                com.tencent.mm.plugin.performance.watchdogs.b bVar4 = this.f153061h;
                if (bVar4 != null) {
                    jSONObject.put("pss-max", bVar4.f153011d);
                }
                ri.j0 j0Var = new ri.j0(3000, null, 0, 0, 0L, 0L, 0L, i17, null, 0, null, 0, null, j17, 0L, 0L, str2, null, 0, 0, 0, 0, 0, 0L, null, null, ri.l0.b(jSONObject), 0, 0, null, null, 0, 0, -67182722, 1, null);
                com.tencent.mars.xlog.Log.i(str, "stat report " + j0Var);
                i0Var.a(j0Var);
            }
        }
        this.f153059f = null;
        this.f153061h = null;
    }
}
