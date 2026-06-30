package nr;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final nr.b f339030a = new nr.b();

    /* renamed from: b, reason: collision with root package name */
    public static long f339031b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f339032c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f339033d;

    public final void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f339031b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatEmojiBtnClickReport", "recordClose: " + currentTimeMillis + ", " + f339031b + ", " + f339033d);
        if (f339033d) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(f339032c ? 2 : 4);
            objArr[1] = java.lang.Long.valueOf(currentTimeMillis);
            g0Var.d(17302, objArr);
        }
        f339033d = false;
    }
}
