package gb3;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f270020a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f270021b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f270022c;

    /* renamed from: d, reason: collision with root package name */
    public static int f270023d;

    /* renamed from: e, reason: collision with root package name */
    public static int f270024e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f270025f;

    /* renamed from: g, reason: collision with root package name */
    public static int f270026g;

    /* renamed from: h, reason: collision with root package name */
    public static int f270027h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f270028i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f270029j;

    /* renamed from: k, reason: collision with root package name */
    public static int f270030k;

    public static void a(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f270020a) || com.tencent.mm.sdk.platformtools.t8.K0(f270022c)) {
            return;
        }
        if (f270026g <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(f270028i)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16598, java.lang.Integer.valueOf(i17), f270025f, str, f270021b, f270022c, 0, f270020a, java.lang.Integer.valueOf(f270023d), java.lang.Integer.valueOf(f270024e), java.lang.Integer.valueOf(f270026g), java.lang.Integer.valueOf(f270027h), "", 0, f270029j, java.lang.Integer.valueOf(f270030k));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16598, java.lang.Integer.valueOf(i17), f270025f, str, f270021b, f270022c, 0, f270020a, java.lang.Integer.valueOf(f270023d), java.lang.Integer.valueOf(f270024e), java.lang.Integer.valueOf(f270026g), java.lang.Integer.valueOf(f270027h), f270028i, 0, f270029j, java.lang.Integer.valueOf(f270030k));
            f270028i = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "reportData：openId %s, coverId: %s  bizName:%s url:%s actionType :%s clickJumpType：%s , coverSourceJumpType:%s ", f270020a, f270022c, f270025f, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f270026g), java.lang.Integer.valueOf(f270030k));
    }

    public static void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeExposureReport", "resetData：openId %s, coverId: %s bizName：%s clickJumpType：%s", f270020a, f270022c, f270025f, java.lang.Integer.valueOf(f270026g));
        f270020a = null;
        f270021b = null;
        f270022c = null;
        f270025f = null;
        f270024e = 0;
        f270023d = 0;
        f270026g = 0;
        f270030k = 0;
        f270027h = 0;
        f270028i = null;
        f270029j = null;
    }
}
