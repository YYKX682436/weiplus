package yn1;

/* loaded from: classes12.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.f0 f463662d = new yn1.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Notification.Builder builder;
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.migration.MigrationActivity.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o9u);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.Object systemService = context.getSystemService("notification");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("MigrationPushChannel") == null) {
                notificationManager.createNotificationChannel(new android.app.NotificationChannel("MigrationPushChannel", "MigrationPushChannel", 4));
            }
            builder = new android.app.Notification.Builder(context, "MigrationPushChannel");
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        builder.setContentTitle(string).setStyle(new android.app.Notification.BigTextStyle().bigText("")).setSmallIcon(com.tencent.mm.R.drawable.c7v).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
        java.lang.Object systemService2 = context.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService2).notify(539298096, builder.build());
        com.tencent.mm.plugin.backup.migration.MigrationForegroundService.f92549g = true;
        return jz5.f0.f302826a;
    }
}
