package com.tencent.rtmp.video;

/* loaded from: classes13.dex */
public class ScreenCaptureService extends android.app.Service {
    private static final java.lang.String CHANNEL_ID = "notification_id";
    private static final int NOTIFICATION_ID = 13957237;
    private static final java.lang.String TAG = "ScreenCaptureService";

    private android.app.Notification createNotification() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
            ((android.app.NotificationManager) getSystemService("notification")).createNotificationChannel(new android.app.NotificationChannel(CHANNEL_ID, "notification_name", 2));
        }
        android.app.Notification.Builder defaults = new android.app.Notification.Builder(this).setDefaults(1);
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
            defaults.setChannelId(CHANNEL_ID);
        }
        return defaults.build();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Service on bind");
        return new android.os.Binder();
    }

    @Override // android.app.Service
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        android.media.projection.MediaProjection mediaProjection;
        int intExtra = intent.getIntExtra("code", -1);
        android.content.Intent intent2 = (android.content.Intent) intent.getParcelableExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "On Start server command, code:" + intExtra + ", data:" + intent2);
        if (intent2 == null) {
            stopSelf();
            return 2;
        }
        try {
            if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 29) {
                startForeground(NOTIFICATION_ID, createNotification(), 32);
            } else if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
                startForeground(NOTIFICATION_ID, createNotification());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "start foreground failed.", th6);
        }
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            try {
                mediaProjection = ((android.media.projection.MediaProjectionManager) getSystemService("media_projection")).getMediaProjection(intExtra, intent2);
            } catch (java.lang.Throwable th7) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "onStartCommand mediaProjectionManager getMediaProjection fail.", th7);
                mediaProjection = null;
            }
            com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this).a(mediaProjection);
        }
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Service on unbind");
        return super.onUnbind(intent);
    }
}
