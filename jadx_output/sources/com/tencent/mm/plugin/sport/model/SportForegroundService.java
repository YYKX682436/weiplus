package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class SportForegroundService extends android.app.Service {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f171768e;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f171769d;

    public static void a() {
        if (fp.h.c(26)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportForegroundService", "stopSportForegroundService");
            f171768e = false;
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.sport.model.SportForegroundService.class));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportForegroundService", "onDestroy");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f171769d;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportForegroundService", "onStartCommand %d", java.lang.Integer.valueOf(i18));
        if (!fp.h.c(26)) {
            return 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportForegroundService", "onStartCommand startForeground");
        f171768e = true;
        android.app.Notification.Builder builder = new android.app.Notification.Builder(getApplicationContext(), "reminder_channel_id");
        builder.setContentTitle(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jjj)).setWhen(java.lang.System.currentTimeMillis());
        try {
            z2.y1.a(this, 419430, builder.build(), android.os.Build.VERSION.SDK_INT >= 34 ? 256 : 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportForegroundService", "start foreground service happened error %s", e17.getMessage());
        }
        ((ue4.r) i95.n0.c(ue4.r.class)).Bi().a();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f171769d = n3Var;
        n3Var.postDelayed(new com.tencent.mm.plugin.sport.model.v(this), androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
        return 2;
    }
}
