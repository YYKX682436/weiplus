package j35;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f297499a;

    /* renamed from: b, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f297500b = new j35.c();

    public static void a(final android.app.Activity activity) {
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmPermissionHelper", "checkExactAlarmPermission, activity is null");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.a0.c() || android.os.Build.VERSION.SDK_INT < 31 || activity.getApplicationInfo().targetSdkVersion < 31) {
            return;
        }
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) activity.getSystemService("alarm");
        if (alarmManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmPermissionHelper", "am is null");
            return;
        }
        if (alarmManager.canScheduleExactAlarms()) {
            return;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_enable_request_exact_alarm_permission, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlarmPermissionHelper", "skip request schedule exact alarm permission");
            return;
        }
        if (java.lang.System.currentTimeMillis() - j35.u.f("android.permission.SCHEDULE_EXACT_ALARM", 161) < 60000) {
            return;
        }
        if (j35.u.f("android.permission.SCHEDULE_EXACT_ALARM", 161) != 0 && !z2.h.b(activity, "android.permission.SCHEDULE_EXACT_ALARM")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlarmPermissionHelper", "user disable request schedule exact alarm permission");
        } else {
            if (f297499a) {
                return;
            }
            f297499a = true;
            db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.f492698mv2), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.f490347sg), false, new android.content.DialogInterface.OnClickListener() { // from class: j35.b$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlarmPermissionHelper", "need request schedule exact alarm permission");
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED");
                    android.content.BroadcastReceiver broadcastReceiver = j35.b.f297500b;
                    android.app.Activity activity2 = activity;
                    activity2.registerReceiver(broadcastReceiver, intentFilter, 2);
                    android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/AlarmPermissionHelper", "lambda$checkExactAlarmPermission$0", "(Landroid/app/Activity;Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity2, "com/tencent/mm/pluginsdk/permission/AlarmPermissionHelper", "lambda$checkExactAlarmPermission$0", "(Landroid/app/Activity;Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    j35.u.m("android.permission.SCHEDULE_EXACT_ALARM", 161);
                    j35.b.f297499a = false;
                }
            }, new j35.b$$b());
        }
    }
}
