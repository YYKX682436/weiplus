package com.tencent.mm.plugin.ipcall.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ipcall/model/IPCallForegroundService;", "Landroid/app/Service;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IPCallForegroundService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "IPCallForegroundService onCreate");
        super.onCreate();
        if (!gm0.j1.b().m()) {
            stopSelf();
            return;
        }
        if (fp.h.c(26)) {
            z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            notification.icon = com.tencent.mm.R.drawable.c7v;
            k0Var.h(2, true);
            android.app.Notification a17 = vq4.p0.a(k0Var);
            try {
                if (com.tencent.mm.sdk.platformtools.x2.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "current mmprocess is exits");
                }
                startForeground(42, a17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "start foreground service happened error %s", e17.getMessage());
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "IPCallForegroundService onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallForegroundService", "onDestroy happened error %s", e17);
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(42);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallForegroundService", "error called ipcall foreground service in onStartCommand process");
            stopSelf();
            return 2;
        }
        if (!fp.h.c(26) || intent == null) {
            return 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "foreground service is on bind ");
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "setNotificationBind");
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
        intent.setFlags(268435456);
        intent.putExtra("IPCallTalkUI_isFromMiniNotification", true);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492337g40);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallForegroundService", "IPCallForegroundService notification type is 42");
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallForegroundService", "error called ipcall foreground service in setNotification process");
            stopSelf();
            return 3;
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 42, intent, fp.g0.a(134217728));
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(string);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g3s));
        k0Var.e(string);
        notification.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.f469463g = activity;
        k0Var.h(2, true);
        android.app.Notification a17 = vq4.p0.a(k0Var);
        a17.flags |= 32;
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(42, a17, false);
        return 3;
    }
}
