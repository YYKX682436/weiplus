package ef0;

/* loaded from: classes8.dex */
public final class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.d4 f252175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252176e;

    public b4(ef0.d4 d4Var, java.lang.String str) {
        this.f252175d = d4Var;
        this.f252176e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef0.d4 d4Var = this.f252175d;
        long j17 = 0;
        if (d4Var.f252197e == 0) {
            if (gm4.a.f273559c) {
                com.tencent.mm.sdk.platformtools.o4 o4Var = gm4.a.f273558b;
                if (o4Var != null) {
                    j17 = o4Var.getLong("key_sync_recommend", 0L);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingLocalStorage", "not init");
            }
            d4Var.f252197e = j17;
        }
        long j18 = d4Var.f252197e;
        if (java.lang.System.currentTimeMillis() - j18 < ((java.lang.Number) ((jz5.n) d4Var.f252199g).getValue()).longValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingTaskBarRecommendService", "syncTaskBarRecommendData ignore, last: %d", java.lang.Long.valueOf(j18));
            return;
        }
        d4Var.Bi(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.TingTaskBarRecommendService", "syncTaskBarRecommendData from source: " + this.f252176e);
        w71.m1 a17 = ((hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f397137h.getValue()).a();
        if (a17 != null) {
            urgen.ur_C563.UR_379F.UR_D93D(((w71.n1) a17).getCppPointer(), 10, 8);
        }
    }
}
