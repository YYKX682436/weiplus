package vr3;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final vr3.v f439652a = new vr3.v();

    public final void a(com.tencent.mm.storage.z3 z3Var, int i17, int i18, long j17, java.lang.String str) {
        int i19 = (!(z3Var != null && z3Var.r2()) || ((int) z3Var.E2) <= 0) ? 0 : 1;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21647, d17, 2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void b(com.tencent.mm.storage.z3 z3Var, int i17, int i18, long j17, java.lang.String str) {
        int i19 = 0;
        if ((z3Var != null && z3Var.r2()) && ((int) z3Var.E2) > 0) {
            i19 = 1;
        }
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21647, d17, 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
