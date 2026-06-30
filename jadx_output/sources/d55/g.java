package d55;

/* loaded from: classes12.dex */
public abstract class g extends d55.a {
    @Override // d55.h
    public void b(android.content.Context context, d55.j jVar) {
        java.lang.String str;
        android.content.Intent intent;
        d55.w wVar;
        int i17;
        boolean z17;
        java.lang.Class<?> d17 = ((d55.d) this).f226577b.d();
        if (d17 == null) {
            d17 = null;
        }
        if (d17 == null) {
            d55.o0.a(4, "MicroMsg.recovery.callback", "can not get target service, skip");
            return;
        }
        try {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(context, d17);
            intent2.putExtra("extra_crash_count", jVar.f226591d.f226597a);
            jVar.a();
            com.tencent.mm.recoveryv2.RecoveryCrash$Record recoveryCrash$Record = new com.tencent.mm.recoveryv2.RecoveryCrash$Record();
            recoveryCrash$Record.f192206d = jVar.f226591d.f226597a;
            recoveryCrash$Record.f192207e = jVar.f226588a;
            recoveryCrash$Record.f192208f = jVar.f226589b;
            intent2.putExtra("extra_crash_record", recoveryCrash$Record);
            try {
                context.startService(intent2);
                wVar = new d55.w(context, "recovery_statistic");
                wVar.e();
                i17 = wVar.getInt("crash_count", 0);
                z17 = wVar.getBoolean("launch_recovery", false);
                intent = intent2;
            } catch (java.lang.Exception e17) {
                e = e17;
                intent = intent2;
            }
            try {
                boolean z18 = wVar.getBoolean("launch_recovery_real", false);
                boolean z19 = wVar.getBoolean("recover_from_crash", false);
                int i18 = wVar.getInt("recovery_status", -1);
                int i19 = wVar.getInt("recovery_from", 0);
                int i27 = wVar.getInt("recover_internal_status", 0);
                wVar.getInt("recover_launch_mode", 0);
                long j17 = wVar.getLong("recover_running_time", 0L);
                boolean z27 = wVar.getBoolean("recover_is_discard", false);
                java.lang.String string = wVar.getString("recover_app_ver", "");
                wVar.g("crash_count", i17);
                wVar.putBoolean("launch_recovery", z17);
                wVar.putBoolean("launch_recovery_real", z18);
                wVar.putBoolean("recover_from_crash", z19);
                wVar.g("recovery_status", i18);
                wVar.g("recovery_from", i19);
                wVar.g("recover_internal_status", i27);
                wVar.g("recover_launch_mode", 2);
                wVar.g("recover_running_time", j17);
                wVar.putBoolean("recover_is_discard", z27);
                wVar.putString("recover_app_ver", string);
                wVar.h();
            } catch (java.lang.Exception e18) {
                e = e18;
                str = "MicroMsg.recovery.callback";
                try {
                    d55.o0.a(5, str, "start service fail + " + e.getMessage() + ", try bind service");
                } catch (java.lang.Exception e19) {
                    e = e19;
                }
                try {
                    context.bindService(intent, new d55.f(this), 1);
                } catch (java.lang.Exception e27) {
                    e = e27;
                    d55.q0.a(str, "start service fail", e);
                }
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            str = "MicroMsg.recovery.callback";
        }
    }
}
