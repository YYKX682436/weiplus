package kl;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Long f308728b = 172800000L;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Long f308729c = 86400000L;

    /* renamed from: d, reason: collision with root package name */
    public static long f308730d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f308731a;

    public h(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        this.f308731a = arrayList;
        if (list == null || list.isEmpty()) {
            return;
        }
        arrayList.addAll(list);
    }

    public final void a(java.lang.String str) {
        boolean z17;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y()) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "%s is not exist or not Directory", str);
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "none files exist", null);
            return;
        }
        for (java.lang.String str2 : D) {
            java.util.Iterator it = ((java.util.ArrayList) this.f308731a).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.contains((java.lang.String) it.next())) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "file is the block file, don't delete", null);
            } else {
                java.lang.String str3 = str + "/" + str2;
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str3);
                if (!r6Var2.m()) {
                    int i27 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "file not exist", null);
                } else if (r6Var2.y()) {
                    int i28 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioScanConvertCacheController", "file is directory, scan and delete subFilePath:%s", str3);
                    a(str3);
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > f308728b.longValue()) {
                    java.lang.Object[] objArr = {r6Var2.getName(), r6Var2.o()};
                    int i29 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioScanConvertCacheController", "Clean 2 days file in mix convert file name=%s, path:%s", objArr);
                    r6Var2.l();
                }
            }
        }
    }
}
