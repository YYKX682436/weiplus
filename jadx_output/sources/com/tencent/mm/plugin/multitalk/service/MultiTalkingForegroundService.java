package com.tencent.mm.plugin.multitalk.service;

/* loaded from: classes13.dex */
public class MultiTalkingForegroundService extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public boolean f150227d = false;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onDestroy");
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(43);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "VoipForegroundService onDestroy");
        try {
            stopForeground(true);
            this.f150227d = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkingForegroundService", "onDestroy happened error %s", e17);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTalkingForegroundService", "null intent");
            stopSelf();
            com.tencent.mm.plugin.multitalk.model.e3.Ri().H = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
            return 2;
        }
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkingForegroundService", "error called voip foreground service in onStartCommand process");
            stopSelf();
            com.tencent.mm.plugin.multitalk.model.e3.Ri().H = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
            return 2;
        }
        if (fp.h.a(26)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "version below oreo");
            stopSelf();
            com.tencent.mm.plugin.multitalk.model.e3.Ri().H = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
            return 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "foreground service is on bind ");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "setNotificationBind");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "voip notification type is 43");
        if (this.f150227d) {
            stopForeground(true);
            this.f150227d = false;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h0y);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h2o);
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class);
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, 43, intent, fp.g0.a(134217728));
        int i19 = fp.h.a(19) ? com.tencent.mm.R.drawable.c7u : com.tencent.mm.R.drawable.c7v;
        z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
        k0Var.m(string2);
        k0Var.D.when = java.lang.System.currentTimeMillis();
        k0Var.f(string);
        k0Var.e(string2);
        k0Var.h(2, true);
        k0Var.f469463g = activity;
        android.app.Notification a17 = vq4.p0.a(k0Var);
        a17.icon = i19;
        a17.flags |= 32;
        int intExtra = intent.getIntExtra("enterMainUiWithPermission", 0);
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).n(43, a17, false);
        try {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                intExtra = 0;
            }
            z2.y1.a(this, 43, a17, intExtra);
            this.f150227d = true;
        } catch (java.lang.SecurityException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTalkingForegroundService", e17, "startForeground error: %s", e17.getMessage());
            com.tencent.mm.plugin.multitalk.model.e3.Ri().H = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "markForegroundServiceStartFailed isBindSmallService: false");
        }
        ((kg0.p) ((lg0.m) i95.n0.c(lg0.m.class))).Ai();
        return 3;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingForegroundService", "MultiTalkingForegroundService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
