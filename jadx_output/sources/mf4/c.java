package mf4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final mf4.c f326149a = new mf4.c();

    /* renamed from: b, reason: collision with root package name */
    public static long f326150b;

    /* renamed from: c, reason: collision with root package name */
    public static long f326151c;

    /* renamed from: d, reason: collision with root package name */
    public static long f326152d;

    /* renamed from: e, reason: collision with root package name */
    public static int f326153e;

    /* renamed from: f, reason: collision with root package name */
    public static int f326154f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f326155g;

    /* renamed from: h, reason: collision with root package name */
    public static long f326156h;

    /* renamed from: i, reason: collision with root package name */
    public static long f326157i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f326158j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f326159k;

    public final void a() {
        long j17 = f326156h;
        boolean z17 = f326158j;
        long j18 = f326151c;
        if (j17 == 0 && z17) {
            if (j18 == 0) {
                long j19 = f326150b;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                f326156h = java.lang.System.currentTimeMillis() - j19;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(988L, 63L, 1L);
                g0Var.C(988L, 62L, f326156h);
                return;
            }
            long j27 = f326157i;
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            f326156h = java.lang.System.currentTimeMillis() - j27;
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.C(988L, 61L, 1L);
            g0Var2.C(988L, 60L, f326156h);
        }
    }
}
