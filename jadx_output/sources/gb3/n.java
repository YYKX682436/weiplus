package gb3;

/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f270031a;

    /* renamed from: b, reason: collision with root package name */
    public static long f270032b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f270033c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f270034d;

    public static void a(int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f270031a)) {
            return;
        }
        if (f270034d || !(i17 == 9 || i17 == 10 || i17 == 11)) {
            if (i17 == 9 || i17 == 10 || i17 == 11) {
                f270034d = false;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18889, java.lang.Integer.valueOf(i17), f270031a, java.lang.Long.valueOf((android.os.SystemClock.elapsedRealtime() / 1000) - f270032b), f270033c);
        }
    }
}
