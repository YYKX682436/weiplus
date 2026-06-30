package o42;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static int f342832b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public static int f342833c = 30000;

    /* renamed from: d, reason: collision with root package name */
    public static int f342834d = 10000;

    /* renamed from: e, reason: collision with root package name */
    public static int f342835e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static long f342836f = 60000;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f342837a;

    public b() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_edge_computing_threshold_controller, "", true);
        if (!u46.l.e(Zi)) {
            java.lang.String[] split = Zi.split(";");
            if (split.length > 0 && !u46.l.e(split[0])) {
                f342832b = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
            }
            if (split.length > 1 && !u46.l.e(split[1])) {
                f342834d = com.tencent.mm.sdk.platformtools.t8.P(split[1], 0);
            }
            if (split.length > 2 && !u46.l.e(split[2])) {
                f342833c = com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
            }
            if (split.length > 3 && !u46.l.e(split[3])) {
                f342835e = com.tencent.mm.sdk.platformtools.t8.P(split[3], 0);
            }
            if (split.length > 4 && !u46.l.e(split[4])) {
                f342836f = com.tencent.mm.sdk.platformtools.t8.P(split[4], 0);
            }
        }
        this.f342837a = new java.util.HashMap();
    }
}
