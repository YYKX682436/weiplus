package e04;

/* loaded from: classes5.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f245861a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f245862b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f245863c;

    static {
        try {
            boolean a17 = gm0.j1.a();
            if (a17 && f245863c == null) {
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_scan_camera_error_mmkv");
                f245863c = M;
                f245861a = (M != null ? M.getLong("open_camera_error_time", 0L) : 0L) > 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraErrorHelper", "checkInitMMKV %s, mmkv: %s", java.lang.Boolean.valueOf(a17), f245863c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCameraErrorHelper", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    public static final void a(e04.y0 y0Var, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraErrorHelper", "reportCameraErrorAction action: " + y0Var + ", actionTimestamp: " + j17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        java.lang.String str = f245862b;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(y0Var.f246160d);
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT);
        objArr[4] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion);
        g0Var.d(30467, objArr);
    }
}
