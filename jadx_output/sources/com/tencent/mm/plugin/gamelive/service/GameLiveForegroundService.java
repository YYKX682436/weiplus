package com.tencent.mm.plugin.gamelive.service;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gamelive/service/GameLiveForegroundService;", "Landroid/app/Service;", "<init>", "()V", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class GameLiveForegroundService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveForegroundService", "foreground service onCreate");
        if (!gm0.j1.b().m()) {
            stopSelf();
            return;
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        r45.wp1 wp1Var = dk2.ef.f233390j.f233684b;
        java.lang.String string = wp1Var != null ? wp1Var.getString(3) : null;
        java.lang.String r17 = i65.a.r(this, com.tencent.mm.R.string.a0r);
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(r17);
        k0Var.e(r17);
        k0Var.f(string);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        notification.icon = com.tencent.mm.R.drawable.c7v;
        k0Var.h(2, true);
        android.app.Notification b17 = k0Var.b();
        kotlin.jvm.internal.o.f(b17, "build(...)");
        try {
            startForeground(46, b17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveForegroundService", "start foreground service happened error %s", e17.getMessage());
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveForegroundService", "foreground service onDestroy");
        try {
            stopForeground(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveForegroundService", "onDestroy happened error %s", e17);
        }
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(46);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveForegroundService", "foreground service onStartCommand");
        if (gm0.j1.b().m()) {
            return 3;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveForegroundService", "error called foreground service in onStartCommand process");
        stopSelf();
        return 2;
    }
}
