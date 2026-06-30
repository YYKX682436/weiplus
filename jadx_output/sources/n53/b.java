package n53;

/* loaded from: classes8.dex */
public abstract class b {
    public static final void a(java.lang.String appId, long j17, int i17, int i18, int i19, java.lang.String str) {
        kotlin.jvm.internal.o.g(appId, "appId");
        lj0.b bVar = new lj0.b(appId, 0L, j17, i17, i18, i19, 0, 0, str, 194, null);
        com.tencent.mars.xlog.Log.i("Report20267", "reportInfo = " + bVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20267, bVar.f318799a, java.lang.Integer.valueOf(bVar.f318805g), java.lang.Integer.valueOf(bVar.f318806h), java.lang.Integer.valueOf(nj0.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a)), 0, null, 60, java.lang.Long.valueOf(bVar.f318800b), java.lang.Long.valueOf(bVar.f318801c), java.lang.Integer.valueOf(bVar.f318802d), java.lang.Integer.valueOf(bVar.f318804f), java.lang.Integer.valueOf(bVar.f318803e), null, null, null, null, null, null, null, null, null, null, null, null, null, nj0.a.d(bVar.f318807i), null);
    }

    public static final void b(java.lang.String appId, long j17, int i17, int i18, int i19, java.lang.String str, int i27, int i28) {
        kotlin.jvm.internal.o.g(appId, "appId");
        lj0.b bVar = new lj0.b(appId, 0L, j17, i17, i18, i19, i28, i27, str, 2, null);
        com.tencent.mars.xlog.Log.i("Report20267", "reportInfo = " + bVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20267, bVar.f318799a, java.lang.Integer.valueOf(bVar.f318805g), java.lang.Integer.valueOf(bVar.f318806h), java.lang.Integer.valueOf(nj0.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a)), 0, null, 60, java.lang.Long.valueOf(bVar.f318800b), java.lang.Long.valueOf(bVar.f318801c), java.lang.Integer.valueOf(bVar.f318802d), java.lang.Integer.valueOf(bVar.f318804f), java.lang.Integer.valueOf(bVar.f318803e), null, null, null, null, null, null, null, null, null, null, null, null, null, nj0.a.d(bVar.f318807i), null);
    }

    public static final void c(lj0.b info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("Report20267", "reportInfo = " + info);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20267, info.f318799a, java.lang.Integer.valueOf(info.f318805g), java.lang.Integer.valueOf(info.f318806h), java.lang.Integer.valueOf(nj0.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a)), 0, null, 60, java.lang.Long.valueOf(info.f318800b), java.lang.Long.valueOf(info.f318801c), java.lang.Integer.valueOf(info.f318802d), java.lang.Integer.valueOf(info.f318804f), java.lang.Integer.valueOf(info.f318803e), null, null, null, null, null, null, null, null, null, null, null, null, null, nj0.a.d(info.f318807i), null);
    }
}
