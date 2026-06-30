package zv;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f475986e;

    public i(java.lang.String str, boolean z17) {
        this.f475985d = str;
        this.f475986e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f475985d;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        if (n17 == null || !n17.r2() || !n17.m2() || !n17.l2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: contact not biz service contact!");
            return;
        }
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if (this.f475986e) {
            Di.Q((java.lang.String[]) kz5.b0.c(str).toArray(new java.lang.String[0]), "service_officialaccounts", true, true);
        }
    }
}
