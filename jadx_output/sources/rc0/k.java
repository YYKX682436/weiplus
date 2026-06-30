package rc0;

/* loaded from: classes12.dex */
public class k implements com.tencent.mm.app.h4 {
    public k(rc0.l lVar) {
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread thread, java.lang.String str, java.lang.Throwable th6) {
        int d17;
        d55.r0 a17 = d55.r0.a();
        d55.k0 k0Var = a17.f226615b;
        if (k0Var == null) {
            android.content.Context context = a17.f226614a;
            if (context != null) {
                d55.v vVar = new d55.v(context, "recovery_crash_count");
                vVar.a();
                java.lang.Math.max(vVar.getInt("crash_count", 0), 0);
                java.io.File file = new java.io.File(new java.io.File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), "recovery_crash");
                new android.os.Bundle();
                new java.util.concurrent.atomic.AtomicBoolean();
                new java.io.File(file, "fast_persist_data");
                d17 = java.lang.Math.max(vVar.getInt("crash_count", 0), 0);
            }
            d17 = -1;
        } else {
            if (k0Var instanceof d55.b0) {
                d17 = ((d55.b0) k0Var).d();
            }
            d17 = -1;
        }
        com.tencent.mars.xlog.Log.i("RecoveryOnSplashService", "#afterReport, handling java crash with recovery, lastCrashCount = " + d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "do recovery report directly");
        ((ku5.t0) ku5.t0.f312615d).g(new h21.i(d17));
        d55.w wVar = new d55.w(com.tencent.mm.sdk.platformtools.x2.f193071a, "recovery_statistic");
        wVar.e();
        int i17 = wVar.getInt("crash_count", 0);
        boolean z17 = wVar.getBoolean("launch_recovery", false);
        boolean z18 = wVar.getBoolean("launch_recovery_real", false);
        boolean z19 = wVar.getBoolean("recover_from_crash", false);
        int i18 = wVar.getInt("recovery_status", -1);
        int i19 = wVar.getInt("recovery_from", 0);
        int i27 = wVar.getInt("recover_internal_status", 0);
        int i28 = wVar.getInt("recover_launch_mode", 0);
        long j17 = wVar.getLong("recover_running_time", 0L);
        boolean z27 = wVar.getBoolean("recover_is_discard", false);
        wVar.getString("recover_app_ver", "");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193111g;
        wVar.g("crash_count", i17);
        wVar.putBoolean("launch_recovery", z17);
        wVar.putBoolean("launch_recovery_real", z18);
        wVar.putBoolean("recover_from_crash", z19);
        wVar.g("recovery_status", i18);
        wVar.g("recovery_from", i19);
        wVar.g("recover_internal_status", i27);
        wVar.g("recover_launch_mode", i28);
        wVar.g("recover_running_time", j17);
        wVar.putBoolean("recover_is_discard", z27);
        wVar.putString("recover_app_ver", str2);
        wVar.h();
        d55.r0.a().c(3);
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}
