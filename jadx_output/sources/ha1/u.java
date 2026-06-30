package ha1;

/* loaded from: classes7.dex */
public final class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ha1.u f279788d = new ha1.u();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, -1, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), fp.g0.a(268435456));
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        kotlin.jvm.internal.o.d(alarmManager);
        long currentTimeMillis = java.lang.System.currentTimeMillis() + 100;
        zj0.a aVar = new zj0.a();
        aVar.c(activity);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Long.valueOf(currentTimeMillis));
        aVar.c(1);
        yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "prepare_restart", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
        zj0.c.f473285a.set(aVar);
        alarmManager.set(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
        yj0.a.f(alarmManager, "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "prepare_restart", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        kotlin.jvm.internal.o.f(runningAppProcesses, "getRunningAppProcesses(...)");
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            java.lang.String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.o.f(processName, "processName");
            if (r26.n0.B(processName, com.tencent.mm.sdk.platformtools.x2.f193072b + ':', false)) {
                int i18 = runningAppProcessInfo.pid;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(obj2, "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
