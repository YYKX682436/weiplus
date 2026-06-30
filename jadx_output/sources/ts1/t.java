package ts1;

/* loaded from: classes.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f421617d;

    public t(java.util.List list) {
        this.f421617d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        for (zq1.i0 i0Var : this.f421617d) {
            java.lang.String url = i0Var.f474983a;
            kotlin.jvm.internal.o.f(url, "url");
            if (r26.i0.y(url, "http", false) && i0Var.f474993k != null) {
                java.lang.String a17 = ts1.u.a(i0Var.f474983a);
                java.lang.String b17 = ts1.u.b(a17, i0Var);
                if (a17.length() > 0) {
                    if (b17.length() > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "saveUrlQueryList key: " + a17 + ", encodeQueryList " + b17);
                        ((com.tencent.mm.sdk.platformtools.o4) ts1.u.f421618a.i()).D(a17, b17);
                    } else {
                        com.tencent.mm.sdk.platformtools.v3 v3Var = ts1.u.f421618a;
                        if (v3Var.m(a17)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "saveUrlQueryList remove key: ".concat(a17));
                            v3Var.getClass();
                            int i18 = v3Var.f192886b;
                            if (i18 >= 0) {
                                while (true) {
                                    com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.o.h(v3Var, v3Var.e(i17), 0L, 2, null);
                                    if (o4Var != null) {
                                        o4Var.remove(a17);
                                    }
                                    i17 = i17 != i18 ? i17 + 1 : 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
