package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes7.dex */
public class MultiTalkingSmallService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onBind");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("notification");
        if (!fp.h.c(26) || notification == null) {
            return null;
        }
        startForeground(43, notification);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onDestroy");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
