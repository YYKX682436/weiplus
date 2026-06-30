package d55;

/* loaded from: classes12.dex */
public abstract class b extends d55.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f226563b = false;

    @Override // d55.a, d55.h
    public void a(android.content.Context context, d55.j jVar) {
        if (!this.f226563b) {
            d55.o0.a(5, "MicroMsg.recovery.callback", "do NOT suicide, bcs launching activity fail");
            return;
        }
        d55.o0.a(4, "MicroMsg.recovery.callback", "suicide when launch recovery activity");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/recoveryv2/RecoveryUtils$Internals", "killProcess", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
    }

    @Override // d55.h
    public void b(android.content.Context context, d55.j jVar) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        android.content.Intent intent = new android.content.Intent();
        java.lang.Class<?> c17 = ((d55.c) this).f226575c.c();
        if (c17 == null) {
            c17 = null;
        }
        if (c17 == null) {
            d55.o0.a(4, "MicroMsg.recovery.callback", "can not get target activity, skip");
            return;
        }
        try {
            d55.o0.a(4, "MicroMsg.recovery.callback", "start recovery activity, target = ".concat(c17.getName()));
            intent.setClass(context, c17);
            intent.putExtra("extra_crash_count", jVar.f226591d.f226597a);
            jVar.a();
            com.tencent.mm.recoveryv2.RecoveryCrash$Record recoveryCrash$Record = new com.tencent.mm.recoveryv2.RecoveryCrash$Record();
            recoveryCrash$Record.f192206d = jVar.f226591d.f226597a;
            try {
                recoveryCrash$Record.f192207e = jVar.f226588a;
                recoveryCrash$Record.f192208f = jVar.f226589b;
                intent.putExtra("extra_crash_record", recoveryCrash$Record);
                intent.addFlags(276824064);
                arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                str = "MicroMsg.recovery.callback";
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "MicroMsg.recovery.callback";
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            str = "MicroMsg.recovery.callback";
        }
        try {
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/recoveryv2/RecoveryCallback$ActivityRecoveryCallback", "onRecovery", "(Landroid/content/Context;Lcom/tencent/mm/recoveryv2/RecoveryCrash;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/recoveryv2/RecoveryCallback$ActivityRecoveryCallback", "onRecovery", "(Landroid/content/Context;Lcom/tencent/mm/recoveryv2/RecoveryCrash;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f226563b = true;
            d55.w wVar = new d55.w(context, "recovery_statistic");
            wVar.e();
            int i17 = wVar.getInt("crash_count", 0);
            boolean z17 = wVar.getBoolean("launch_recovery", false);
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
            wVar.g("recover_launch_mode", 1);
            wVar.g("recover_running_time", j17);
            wVar.putBoolean("recover_is_discard", z27);
            wVar.putString("recover_app_ver", string);
            wVar.h();
        } catch (java.lang.Exception e19) {
            e = e19;
            d55.q0.a(str, "start activity fail", e);
        }
    }
}
