package k5;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f304126g = a5.a0.e("ForceStopRunnable");

    /* renamed from: h, reason: collision with root package name */
    public static final long f304127h = java.util.concurrent.TimeUnit.DAYS.toMillis(3650);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f304128d;

    /* renamed from: e, reason: collision with root package name */
    public final b5.w f304129e;

    /* renamed from: f, reason: collision with root package name */
    public int f304130f = 0;

    public f(android.content.Context context, b5.w wVar) {
        this.f304128d = context.getApplicationContext();
        this.f304129e = wVar;
    }

    public static void c(android.content.Context context) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        int i17 = j3.b.b() ? 167772160 : 134217728;
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, -1, intent, i17);
        long currentTimeMillis = java.lang.System.currentTimeMillis() + f304127h;
        if (alarmManager != null) {
            zj0.a aVar = new zj0.a();
            aVar.c(broadcast);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Long.valueOf(currentTimeMillis));
            aVar.c(0);
            yj0.a.d(alarmManager, aVar.b(), "androidx/work/impl/utils/ForceStopRunnable", "setAlarm", "(Landroid/content/Context;)V", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
            int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
            zj0.c.f473285a.set(aVar);
            alarmManager.setExact(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
            yj0.a.f(alarmManager, "androidx/work/impl/utils/ForceStopRunnable", "setAlarm", "(Landroid/content/Context;)V", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.f.a():void");
    }

    public boolean b() {
        a5.d dVar = this.f304129e.f17896b;
        dVar.getClass();
        boolean isEmpty = android.text.TextUtils.isEmpty(null);
        java.lang.String str = f304126g;
        if (isEmpty) {
            a5.a0.c().a(str, "The default process name was not specified.", new java.lang.Throwable[0]);
            return true;
        }
        boolean a17 = k5.j.a(this.f304128d, dVar);
        a5.a0.c().a(str, java.lang.String.format("Is default app process = %s", java.lang.Boolean.valueOf(a17)), new java.lang.Throwable[0]);
        return a17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = f304126g;
        b5.w wVar = this.f304129e;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                b5.u.a(this.f304128d);
                a5.a0.c().a(str, "Performing cleanup operations.", new java.lang.Throwable[0]);
                try {
                    a();
                    return;
                } catch (android.database.sqlite.SQLiteAccessPermException | android.database.sqlite.SQLiteCantOpenDatabaseException | android.database.sqlite.SQLiteConstraintException | android.database.sqlite.SQLiteDatabaseCorruptException | android.database.sqlite.SQLiteDatabaseLockedException | android.database.sqlite.SQLiteTableLockedException e17) {
                    int i17 = this.f304130f + 1;
                    this.f304130f = i17;
                    if (i17 >= 3) {
                        a5.a0.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e17);
                        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e17);
                        wVar.f17896b.getClass();
                        throw illegalStateException;
                    }
                    a5.a0.c().a(str, java.lang.String.format("Retrying after %s", java.lang.Long.valueOf(i17 * 300)), e17);
                    try {
                        java.lang.Thread.sleep(this.f304130f * 300);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        } finally {
            wVar.e();
        }
    }
}
