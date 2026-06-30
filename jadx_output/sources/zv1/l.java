package zv1;

/* loaded from: classes7.dex */
public final class l extends zv1.v0 {
    public l(int i17) {
        super(i17, true, true);
    }

    @Override // zv1.w0
    public jz5.l c(java.lang.String path) {
        jz5.l lVar;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(path);
        int i17 = this.f476384a;
        if (m17 != null) {
            boolean z17 = m17.f213235e > java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.DAYS.toMillis((long) i17);
            lVar = new jz5.l(java.lang.Boolean.valueOf(z17), "within " + i17 + "days: " + z17);
        } else {
            lVar = new jz5.l(java.lang.Boolean.FALSE, "");
        }
        if (((java.lang.Boolean) lVar.f302833d).booleanValue() && r26.i0.n(path, ".xlog", false)) {
            java.lang.String str = (java.lang.String) kz5.n0.i0(r26.n0.f0(path, new java.lang.String[]{"/"}, false, 0, 6, null));
            int L = r26.n0.L(str, "_", 0, false, 6, null);
            int L2 = r26.n0.L(str, ".xlog", 0, false, 6, null);
            if (L >= 0 && L < L2) {
                java.lang.String substring = str.substring(L + 1, L2);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                int b17 = com.tencent.mm.sdk.platformtools.b8.b(substring, 0);
                if (b17 > 0) {
                    zv1.k kVar = zv1.k.f476312a;
                    int b18 = com.tencent.mm.sdk.platformtools.b8.b(((java.text.SimpleDateFormat) ((jz5.n) zv1.k.f476314c).getValue()).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), 0);
                    if (b18 > 0 && b18 - b17 > i17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.CacheCleanerFactory", "ignore exemption by file name: " + path + ", dateNum=" + b17 + ", currDateNum=" + b18);
                        return new jz5.l(java.lang.Boolean.FALSE, "fileNameExpired: " + b17);
                    }
                }
            }
        }
        return lVar;
    }
}
