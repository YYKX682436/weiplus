package vi3;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f437554a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f437555b = 1644429312;

    /* renamed from: c, reason: collision with root package name */
    public static int f437556c = 302122240;

    /* renamed from: d, reason: collision with root package name */
    public static int f437557d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static int f437558e = 20;

    /* renamed from: f, reason: collision with root package name */
    public static int f437559f = 100;

    /* renamed from: g, reason: collision with root package name */
    public static int f437560g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static int f437561h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f437562i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f437563j = 1000;

    public static void a(long j17, long j18, long j19, long j27, int i17, int i18, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14108, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public static void b(long j17, long j18, long j19, long j27, int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14108, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(str.equals("afterLogin") ? 1 : str.equals("afterSleep") ? 2 : str.equals("getMore") ? 3 : 0));
    }
}
