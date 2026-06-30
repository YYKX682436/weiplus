package yq1;

/* loaded from: classes7.dex */
public final class o implements zq1.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f464447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yq1.z f464448b;

    public o(long j17, yq1.z zVar) {
        this.f464447a = j17;
        this.f464448b = zVar;
    }

    @Override // zq1.h0
    public final void a(java.util.List list) {
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        long j17 = this.f464447a;
        ((yq1.x0) m0Var).getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3 b3Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3.f94192a;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.a3(j17), "MicroMsg.WebPrefetcherCallbackManager");
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                zq1.k0 k0Var = (zq1.k0) it.next();
                this.f464448b.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPrefetchResult result: ");
                sb6.append(k0Var.f475010b);
                sb6.append(", ");
                zq1.i0 i0Var = k0Var.f475009a;
                sb6.append(i0Var != null ? i0Var.f474983a : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceImpl", sb6.toString());
            }
        }
    }
}
