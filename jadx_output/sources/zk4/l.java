package zk4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f473539b;

    /* renamed from: c, reason: collision with root package name */
    public static jm4.g3 f473540c;

    /* renamed from: a, reason: collision with root package name */
    public static final zk4.l f473538a = new zk4.l();

    /* renamed from: d, reason: collision with root package name */
    public static final b66.o f473541d = new zk4.g();

    /* renamed from: e, reason: collision with root package name */
    public static final b66.t f473542e = new zk4.k();

    /* renamed from: f, reason: collision with root package name */
    public static final jm4.n3 f473543f = new zk4.j();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jm4.k3 a(java.util.List r9, bw5.o50 r10, bw5.pp0 r11, il4.e r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zk4.l.a(java.util.List, bw5.o50, bw5.pp0, il4.e):jm4.k3");
    }

    public final jm4.g3 b() {
        jm4.g3 g3Var = f473540c;
        if (g3Var != null) {
            return g3Var;
        }
        jm4.u2 a17 = jm4.w2.f300435d.a();
        if (a17 != null) {
            jm4.n2 a18 = ((jm4.w2) a17).a(bw5.eq0.TingMusic);
            if (a18 != null) {
                return ((jm4.p2) a18).f();
            }
        }
        return null;
    }

    public final void c(jm4.g3 task) {
        com.tencent.unit_rc.BaseObjectDef baseObjectDef;
        kotlin.jvm.internal.o.g(task, "task");
        jm4.z2 z2Var = (jm4.z2) urgen.ur_0025.UR_C8FE.UR_97F8(((jm4.h3) task).getCppPointer());
        int d17 = (z2Var == null || (baseObjectDef = (jm4.k3) urgen.ur_0025.UR_2801.UR_9AFC(((jm4.a3) z2Var).getCppPointer())) == null) ? 0 : ((b66.c) baseObjectDef).d();
        if (f473539b) {
            f473539b = false;
        } else if (d17 > 1000 || d17 == 5) {
            rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            k8Var.N(true);
            k8Var.L(true);
        }
    }

    public final ll4.c d(java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        jm4.u2 a17 = jm4.w2.f300435d.a();
        jm4.c6 c6Var = a17 != null ? (jm4.c6) urgen.ur_0025.UR_8227.UR_7A53(((jm4.w2) a17).getCppPointer(), taskId) : null;
        if (c6Var instanceof kl4.a0) {
            ll4.d dVar = ((kl4.a0) c6Var).f308868e;
            if (dVar instanceof ll4.c) {
                return (ll4.c) dVar;
            }
        }
        return null;
    }
}
