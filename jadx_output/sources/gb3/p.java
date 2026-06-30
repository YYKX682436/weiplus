package gb3;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final gb3.p f270042a = new gb3.p();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f270043b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f270044c;

    /* renamed from: d, reason: collision with root package name */
    public static int f270045d;

    /* renamed from: e, reason: collision with root package name */
    public static int f270046e;

    public final void a(int i17) {
        java.lang.String str = f270043b;
        if (str == null || str.length() == 0) {
            f270043b = java.util.UUID.randomUUID().toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareActionReport", "reportData：uuid %s, source_way:%s target_type:%s hb_mode :%s action：%s", f270043b, java.lang.Integer.valueOf(f270044c), java.lang.Integer.valueOf(f270045d), java.lang.Integer.valueOf(f270046e), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28838, f270043b, java.lang.Integer.valueOf(f270044c), java.lang.Integer.valueOf(f270045d), java.lang.Integer.valueOf(f270046e), java.lang.Integer.valueOf(i17));
    }
}
