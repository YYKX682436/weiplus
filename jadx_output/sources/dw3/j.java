package dw3;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244217d;

    public j(java.lang.String str) {
        this.f244217d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dw3.k kVar = dw3.k.f244219a;
        long q17 = kVar.b().q("MediaReportTimeMs", -1L);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_media_clean_interval_day, 1);
        boolean z17 = java.lang.System.currentTimeMillis() - q17 > ((long) Ni) * 86400000;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileReporter", "triggerDailyReport config:" + Ni + " enable:" + z17);
        if (z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_clean_report_enale, true)) {
                kVar.b().B("MediaReportTimeMs", java.lang.System.currentTimeMillis());
                java.util.Set w17 = kVar.b().w("MicroMsg.MediaFileReporter", new java.util.HashSet());
                kotlin.jvm.internal.o.f(w17, "decodeStringSet(...)");
                java.util.Iterator it = w17.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6((java.lang.String) it.next()).G();
                    if (G != null) {
                        for (com.tencent.mm.vfs.r6 r6Var : G) {
                            dw3.k kVar2 = dw3.k.f244219a;
                            java.lang.String o17 = r6Var.o();
                            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                            kVar2.a(o17, 1, this.f244217d);
                        }
                    }
                }
            }
        }
    }
}
