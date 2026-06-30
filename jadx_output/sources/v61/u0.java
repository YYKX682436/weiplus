package v61;

/* loaded from: classes13.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f433479a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.b4 f433480b = null;

    public static void a(v61.t0 t0Var) {
        int ordinal = t0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f433479a = 0;
                if (f433480b == null) {
                    f433480b = new com.tencent.mm.sdk.platformtools.b4(new v61.s0(), true);
                }
                f433480b.c(900000L, 900000L);
                return;
            }
            if (ordinal != 2) {
                return;
            }
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = f433480b;
        if (b4Var != null) {
            b4Var.d();
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(36);
        f433479a = 0;
        f433480b = null;
    }
}
