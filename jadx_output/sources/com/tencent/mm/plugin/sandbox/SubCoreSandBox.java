package com.tencent.mm.plugin.sandbox;

@j95.b
/* loaded from: classes11.dex */
public class SubCoreSandBox extends i95.w implements mi3.f {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f158609d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f158610e;

    public mi3.e Ai(android.content.Context context, int i17, android.content.DialogInterface.OnCancelListener onCancelListener, boolean z17) {
        int i18 = com.tencent.mm.sandbox.updater.Updater.f192322o;
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", com.tencent.mm.sdk.platformtools.t8.i1()).commit();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(34);
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater", "show update dialog");
        com.tencent.mm.sandbox.updater.Updater updater = (com.tencent.mm.sandbox.updater.Updater) android.view.View.inflate(context, com.tencent.mm.R.layout.d2v, null);
        updater.c();
        com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(context, "", true, 0, null);
        c17.setCancelable(true);
        c17.setOnCancelListener(new s65.q0(updater, onCancelListener));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(405L, 48L, 1L, true);
        updater.f192324e = c17;
        updater.f192325f = false;
        return updater;
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mm.app.p4.a(10);
        if (context == null || intent == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "reportCrash() process:mm");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 0L, 1L, true);
            intent.putExtra("exceptionProcess", "mm");
        } else if (com.tencent.mm.sdk.platformtools.x2.p()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "reportCrash() process:push");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 1L, 1L, true);
            intent.putExtra("exceptionProcess", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "reportCrash() process:other");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 2L, 1L, true);
            intent.putExtra("exceptionProcess", "other");
        }
        boolean booleanExtra = intent.getBooleanExtra("use_bugreporter", false);
        java.lang.String str2 = "";
        if (booleanExtra) {
            java.lang.String str3 = com.tencent.mm.sandbox.monitor.m.f192302a;
            try {
                java.lang.String stringExtra = intent.getStringExtra("tag");
                str = stringExtra != null ? stringExtra : "exception";
                str2 = com.tencent.mm.sandbox.monitor.m.f192302a + intent.getStringExtra("userName") + "." + str + "." + java.lang.System.currentTimeMillis() + ".preventcrashlog";
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMBugReporter", e17, "", new java.lang.Object[0]);
            }
        } else {
            java.util.HashMap hashMap = com.tencent.mm.sandbox.monitor.f.f192291a;
            try {
                java.lang.String stringExtra2 = intent.getStringExtra("tag");
                str = stringExtra2 != null ? stringExtra2 : "exception";
                str2 = com.tencent.mm.storage.v3.f196273a + "crashprevent/" + intent.getStringExtra("userName") + "." + str + "." + c01.id.a() + ".crashlog";
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CrashUpload", e18, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSandBox", "startExceptionMonitorService() crashPreventPath:%s", str2);
        intent.putExtra("exceptionPreventPath", str2);
        try {
            intent.setClass(context, com.tencent.mm.sandbox.monitor.ExceptionMonitorService.class);
            com.tencent.mm.app.p4.a(11);
            com.tencent.mm.sdk.platformtools.x2.f193071a.startService(intent);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreSandBox", "startExceptionMonitorService() %s %s", e19.getClass().getSimpleName(), e19.getMessage());
            intent.setClass(context, com.tencent.mm.sandbox.monitor.ExceptionMonitorBroadcastReceiver.class);
            com.tencent.mm.app.p4.a(12);
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
        }
        if (intent.getBooleanExtra("exceptionJava", false)) {
            if (booleanExtra) {
                com.tencent.mm.sandbox.monitor.m.d(intent, str2);
            } else {
                com.tencent.mm.sandbox.monitor.f.e(intent, str2);
            }
        }
    }

    public void wi(boolean z17) {
        f158609d = true;
        f158610e = z17;
    }
}
