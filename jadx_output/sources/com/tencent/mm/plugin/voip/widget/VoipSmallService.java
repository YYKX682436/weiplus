package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes7.dex */
public class VoipSmallService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onBind");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("notification");
        if (!fp.h.c(26) || notification == null) {
            return null;
        }
        startForeground(40, notification);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onDestroy");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
