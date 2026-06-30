package com.tencent.mm.plugin.rtos.service;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/rtos/service/RtosWatchServiceGuard;", "Landroid/app/Service;", "<init>", "()V", "InnerService", "my3/f0", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class RtosWatchServiceGuard extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final int f158587d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f158588e = -1;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/rtos/service/RtosWatchServiceGuard$InnerService;", "Landroid/app/Service;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public static final class InnerService extends android.app.Service {
        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                startForeground(-1214, new android.app.Notification());
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosWatchServiceGuard.InnerService", "set service for push exception:%s.", e17);
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onBind last pid:%d pid:%d threadID:" + java.lang.Thread.currentThread(), java.lang.Integer.valueOf(this.f158587d), java.lang.Integer.valueOf(android.os.Process.myPid()));
        return new my3.f0();
    }

    @Override // android.app.Service
    public void onCreate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onCreate threadID:" + java.lang.Thread.currentThread());
        super.onCreate();
        if (fp.h.a(26)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "stayForeground");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 22, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onDestroy threadID:" + java.lang.Thread.currentThread());
        super.onDestroy();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 23, 0);
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        int myPid = android.os.Process.myPid();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onStartCommand last pid:%d pid:%d flags:%d startId:%d", java.lang.Integer.valueOf(this.f158588e), java.lang.Integer.valueOf(myPid), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (myPid != this.f158588e) {
            this.f158588e = myPid;
        }
        return super.onStartCommand(intent, i17, i18);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onUnbind");
        return super.onUnbind(intent);
    }
}
