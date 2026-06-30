package com.tencent.xweb.remotedebug;

/* loaded from: classes13.dex */
public class XWebRemoteDebugService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.String string = getString(com.tencent.xwebsdk.R.string.xweb_remote_debug_notification_channel_name);
            java.lang.String string2 = getString(com.tencent.xwebsdk.R.string.xweb_remote_debug_notification_channel_desc);
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("channel_id_xweb_remote_debug", string, 3);
            notificationChannel.setDescription(string2);
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) getSystemService(android.app.NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
                by5.c4.f("XWebRemoteDebugService", "createNotificationChannel");
            }
        }
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this, 0, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.xweb.remotedebug.XWebRemoteDebugServiceStopReceiver.class), 201326592);
        z2.k0 k0Var = new z2.k0(this, "channel_id_xweb_remote_debug");
        k0Var.D.icon = com.tencent.xwebsdk.R.drawable.xweb_remote_debug_service_notification;
        k0Var.f(getString(com.tencent.xwebsdk.R.string.xweb_remote_debug_notification_content_title));
        k0Var.e(getString(com.tencent.xwebsdk.R.string.xweb_remote_debug_notification_content_desc));
        k0Var.f469463g = broadcast;
        k0Var.f469466j = 0;
        k0Var.h(16, true);
        by5.c4.f("XWebRemoteDebugService", "createNotification");
        try {
            startForeground(-120410, k0Var.b());
        } catch (java.lang.Exception e17) {
            by5.c4.d("XWebRemoteDebugService", "startForeground error:", e17);
        }
    }
}
