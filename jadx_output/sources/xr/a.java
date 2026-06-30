package xr;

/* loaded from: classes8.dex */
public final class a implements qk.o7, xr.g {

    /* renamed from: a, reason: collision with root package name */
    public static final xr.a f456127a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f456128b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f456129c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f456130d;

    /* renamed from: e, reason: collision with root package name */
    public static final xr.f f456131e;

    /* renamed from: f, reason: collision with root package name */
    public static long f456132f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f456133g;

    /* renamed from: h, reason: collision with root package name */
    public static final qk.n7 f456134h;

    static {
        xr.a aVar = new xr.a();
        f456127a = aVar;
        f456131e = new xr.f(aVar);
        f456134h = new jq.e();
    }

    public final boolean a() {
        if (!f456128b) {
            long s17 = gm0.j1.u().c().s(8196, 0L);
            boolean z17 = (7 & s17) != 0;
            boolean z18 = f456133g || java.lang.System.currentTimeMillis() - f456132f >= 15000;
            com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[isNeedCheckTimer] continueFlag:" + s17 + ", isContinueSync:" + z17 + ", isNeedCheck:" + z18 + ", isNeedCheckSoon:" + f456133g);
            long uptimeMillis = z17 ? android.os.SystemClock.uptimeMillis() : 0L;
            f456130d = uptimeMillis;
            if (0 != uptimeMillis) {
                long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - f456130d;
                if (uptimeMillis2 >= 1800000) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1021L, 0L, 1L, true);
                } else if (uptimeMillis2 >= 1200000) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1021L, 1L, 1L, true);
                } else if (uptimeMillis2 >= 600000) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1021L, 2L, 1L, true);
                }
            }
            if (!z17 && z18) {
                f456131e.b();
                f456132f = java.lang.System.currentTimeMillis();
                f456133g = false;
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[checkLoop] check time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(r45.j4 r45, java.util.Map r46, java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.a.b(r45.j4, java.util.Map, java.lang.String):void");
    }
}
