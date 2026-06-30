package qf0;

@j95.b
/* loaded from: classes11.dex */
public final class q extends i95.w implements rf0.o {
    public void wi(java.lang.String title, java.lang.String text, android.app.PendingIntent pendingIntent) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(text, "text");
        wn4.x xVar = wn4.x.f447571a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "showNotification, title = %s, text = %s", title, text);
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(null);
        k0Var.h(16, true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(title);
        k0Var.e(text);
        k0Var.f469463g = pendingIntent;
        notification.icon = com.tencent.mm.R.drawable.c7v;
        android.app.Notification b17 = k0Var.b();
        kotlin.jvm.internal.o.f(b17, "build(...)");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).notify(9342, b17);
    }
}
