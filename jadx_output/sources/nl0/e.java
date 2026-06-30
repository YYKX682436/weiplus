package nl0;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d95.b0 f338164a = new d95.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final d95.b0 f338165b = new d95.b0();

    public static d95.b0 a() {
        ((pl0.f) ((xs.b1) i95.n0.c(xs.b1.class))).requireAccountInitialized();
        return f338164a;
    }

    public static d95.b0 b() {
        ((dl0.e) ((xs.c1) i95.n0.c(xs.c1.class))).requireAccountInitialized();
        return f338165b;
    }

    public static int c() {
        int P = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_kara_data_clean_days", "-1", false, true), -1);
        if (P == -1) {
            return 30;
        }
        return P;
    }

    public static long d(long j17) {
        return j17 - ((((e() * 1000) * 60) * 60) * 24);
    }

    public static int e() {
        int P = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_kara_vaild_days", "-1", false, true), -1);
        if (P == -1) {
            return 21;
        }
        return P;
    }
}
