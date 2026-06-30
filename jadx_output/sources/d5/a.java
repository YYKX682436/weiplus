package d5;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f226469a = a5.a0.e("Alarms");

    public static void a(android.content.Context context, java.lang.String str, int i17) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, i17, d5.b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        a5.a0.c().a(f226469a, java.lang.String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, java.lang.Integer.valueOf(i17)), new java.lang.Throwable[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(service);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(alarmManager, arrayList.toArray(), "androidx/work/impl/background/systemalarm/Alarms", "cancelExactAlarm", "(Landroid/content/Context;Ljava/lang/String;I)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
        yj0.a.f(alarmManager, "androidx/work/impl/background/systemalarm/Alarms", "cancelExactAlarm", "(Landroid/content/Context;Ljava/lang/String;I)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
    }

    public static void b(android.content.Context context, b5.w wVar, java.lang.String str, long j17) {
        int intValue;
        androidx.work.impl.WorkDatabase workDatabase = wVar.f17897c;
        j5.m mVar = (j5.m) workDatabase.k();
        j5.i a17 = mVar.a(str);
        if (a17 != null) {
            a(context, str, a17.f297748b);
            c(context, str, a17.f297748b, j17);
            return;
        }
        synchronized (k5.g.class) {
            workDatabase.c();
            try {
                java.lang.Long a18 = ((j5.h) workDatabase.j()).a("next_alarm_manager_id");
                int i17 = 0;
                intValue = a18 != null ? a18.intValue() : 0;
                if (intValue != Integer.MAX_VALUE) {
                    i17 = intValue + 1;
                }
                ((j5.h) workDatabase.j()).b(new j5.e("next_alarm_manager_id", i17));
                workDatabase.h();
            } finally {
                workDatabase.f();
            }
        }
        j5.i iVar = new j5.i(str, intValue);
        l4.q qVar = mVar.f297751a;
        qVar.b();
        qVar.c();
        try {
            mVar.f297752b.e(iVar);
            qVar.h();
            qVar.f();
            c(context, str, intValue, j17);
        } catch (java.lang.Throwable th6) {
            qVar.f();
            throw th6;
        }
    }

    public static void c(android.content.Context context, java.lang.String str, int i17, long j17) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, i17, d5.b.a(context, str), 201326592);
        if (alarmManager != null) {
            zj0.a aVar = new zj0.a();
            aVar.c(service);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Long.valueOf(j17));
            aVar.c(0);
            yj0.a.d(alarmManager, aVar.b(), "androidx/work/impl/background/systemalarm/Alarms", "setExactAlarm", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
            int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
            zj0.c.f473285a.set(aVar);
            alarmManager.setExact(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
            yj0.a.f(alarmManager, "androidx/work/impl/background/systemalarm/Alarms", "setExactAlarm", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
        }
    }
}
