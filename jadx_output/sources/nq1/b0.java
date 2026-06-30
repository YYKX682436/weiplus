package nq1;

/* loaded from: classes12.dex */
public class b0 implements ak0.i {

    /* renamed from: a, reason: collision with root package name */
    public final nq1.a0 f338954a;

    public b0(nq1.a0 a0Var) {
        this.f338954a = a0Var;
    }

    @Override // ak0.i
    public void a(java.io.File file, java.io.File file2, java.lang.String str, int i17) {
    }

    @Override // ak0.i
    public void b(java.io.File file, java.util.List list, java.lang.Throwable th6) {
    }

    @Override // ak0.i
    public void c(java.io.File file, int i17) {
        y45.m$$a m__a = (y45.m$$a) this.f338954a;
        m__a.getClass();
        d55.u.b("MicroMsg.recovery.operator", "#onPatchPackageCheckFail, code = " + i17, new java.lang.Object[0]);
        int abs = i17 != 0 ? java.lang.Math.abs(i17) + 10 : 0;
        d55.w wVar = new d55.w(m__a.f459372a, "recovery_statistic");
        wVar.e();
        int i18 = wVar.getInt("crash_count", 0);
        boolean z17 = wVar.getBoolean("launch_recovery", false);
        boolean z18 = wVar.getBoolean("launch_recovery_real", false);
        boolean z19 = wVar.getBoolean("recover_from_crash", false);
        wVar.getInt("recovery_status", -1);
        int i19 = wVar.getInt("recovery_from", 0);
        int i27 = wVar.getInt("recover_internal_status", 0);
        int i28 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        wVar.getBoolean("recover_is_discard", false);
        java.lang.String string = wVar.getString("recover_app_ver", "");
        wVar.g("crash_count", i18);
        wVar.putBoolean("launch_recovery", z17);
        wVar.putBoolean("launch_recovery_real", z18);
        wVar.putBoolean("recover_from_crash", z19);
        wVar.putInt("recovery_status", abs);
        wVar.putInt("recovery_from", i19);
        wVar.putInt("recover_internal_status", i27);
        wVar.putInt("recover_launch_mode", i28);
        wVar.putLong("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", false);
        wVar.putString("recover_app_ver", string);
        wVar.c();
    }

    @Override // ak0.i
    public void d(java.io.File file, java.lang.String str, java.lang.String str2) {
    }

    @Override // ak0.i
    public void e(java.io.File file, java.lang.Throwable th6) {
    }

    @Override // ak0.i
    public void f(java.io.File file, boolean z17, long j17) {
    }

    @Override // ak0.i
    public void g(android.content.Intent intent) {
    }

    @Override // ak0.i
    public void h(java.io.File file) {
    }
}
