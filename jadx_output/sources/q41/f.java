package q41;

/* loaded from: classes11.dex */
public abstract class f {
    public static final void a(java.lang.String str, int i17, int i18) {
        if (str == null || str.length() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).a(new q41.b(str, i17, i18, java.lang.System.currentTimeMillis()));
    }

    public static final void b(k41.g0 g0Var, int i17, int i18, long j17) {
        if (g0Var == null) {
            return;
        }
        if (j17 == 0) {
            j17 = java.lang.System.currentTimeMillis();
        }
        long j18 = j17;
        ((ku5.t0) ku5.t0.f312615d).a(new q41.c(g0Var, i17, i18, j18));
    }

    public static /* synthetic */ void c(k41.g0 g0Var, int i17, int i18, long j17, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        b(g0Var, i17, i18, j17);
    }

    public static final void d(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23393, "", "", "", "", java.lang.Integer.valueOf(i17), 0, 0, "", "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 0);
    }

    public static final void e(java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(str);
        if (Di == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).a(new q41.d(str2, (k41.g0) Di, currentTimeMillis));
    }
}
