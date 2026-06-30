package kn1;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a */
    public static kn1.p f309658a = kn1.p.f309654e;

    /* renamed from: b */
    public static kn1.n f309659b = kn1.n.f309643e;

    /* renamed from: c */
    public static final java.lang.String f309660c = "session_id";

    /* renamed from: d */
    public static int f309661d;

    public static final void a(kn1.m action, kn1.o status, java.lang.String extra) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(extra, "extra");
        b(action, status, extra, 0L, 0L, 0L, 0L);
    }

    public static final void b(kn1.m action, kn1.o status, java.lang.String extra, long j17, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(extra, "extra");
        java.lang.String u17 = r26.i0.u(extra, ',', ';', false, 4, null);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(f309658a.f309657d);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f309659b.f309648d);
        int i17 = action.f309642d;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        int i18 = status.f309653d;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i18);
        java.lang.Long valueOf5 = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(j18);
        java.lang.String str = f309660c;
        g0Var.d(26824, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), u17, com.tencent.mm.sdk.platformtools.z.f193109e, com.tencent.mm.sdk.platformtools.z.f193105a, java.lang.Integer.valueOf(f309661d));
        com.tencent.mars.xlog.Log.i("Report26824", "report26824: type = %d, paired_device = %d, action = %d, status = %d, costTime = %d, size = %d, sessionId = %s, size2 = %d, size3 = %d, extra = %s, rev = %s, buildTag = %s, protocolVer = %d", java.lang.Integer.valueOf(f309658a.f309657d), java.lang.Integer.valueOf(f309659b.f309648d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str, java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), u17, com.tencent.mm.sdk.platformtools.z.f193105a, com.tencent.mm.sdk.platformtools.z.f193109e, java.lang.Integer.valueOf(f309661d));
    }

    public static /* synthetic */ void c(kn1.m mVar, kn1.o oVar, java.lang.String str, long j17, long j18, long j19, long j27, int i17, java.lang.Object obj) {
        b((i17 & 1) != 0 ? kn1.m.f309632e : mVar, (i17 & 2) != 0 ? kn1.o.f309649e : oVar, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? 0L : j17, (i17 & 16) != 0 ? 0L : j18, (i17 & 32) != 0 ? 0L : j19, (i17 & 64) == 0 ? j27 : 0L);
    }
}
