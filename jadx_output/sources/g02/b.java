package g02;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f267417a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f267418b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f267419c = new java.util.HashMap();

    public static int a(android.content.Context context) {
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return 4;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return 5;
        }
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
        if (netType == -1) {
            return 255;
        }
        if (netType == 0) {
            return 1;
        }
        if (netType != 5) {
            return netType != 6 ? 6 : 3;
        }
        return 2;
    }

    public static void b(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jj0.b a17 = jj0.b.a(10737, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis), 1, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, 0, str2, "", str3, java.lang.Integer.valueOf(a(com.tencent.mm.sdk.platformtools.x2.f193071a)), 0, 1, str4, str5);
        ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
        com.tencent.mm.game.report.k.a(a17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0150, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r14) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(int r27, g02.c r28) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g02.b.c(int, g02.c):void");
    }

    public static void d(java.lang.String str, long j17, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if ("appid_is_empty".equals(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(860L, j17, j18, false);
        } else {
            p95.a.a(new g02.a(str, j17, j18));
        }
    }

    public static void e(long j17, int i17) {
        f267417a.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public static java.lang.String f(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadReportUtil", e17.getMessage());
            return "";
        }
    }
}
