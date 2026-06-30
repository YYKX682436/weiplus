package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public final class cf {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.cf f198092d = new com.tencent.mm.ui.cf();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f198093a = new java.lang.ref.WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public boolean f198095c = true;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f198094b = new com.tencent.mm.ui.bf(this, android.os.Looper.getMainLooper());

    public final boolean a(java.lang.String str) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            if (this.f198093a != null) {
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MainThreadSyncBarrier", "Sync barrier ref is empty.");
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MainThreadSyncBarrier", "Call " + str + " in main thread!");
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return true;
    }

    public void b() {
        if (a("removeSyncBarrier()")) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainThreadSyncBarrier", "removeSyncBarrier()");
        android.os.Message message = (android.os.Message) this.f198093a.get();
        if (message == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MainThreadSyncBarrier", "Sync barrier message is empty.");
            return;
        }
        android.os.Handler handler = this.f198094b;
        handler.removeMessages(255);
        this.f198093a = new java.lang.ref.WeakReference(null);
        if (message.getTarget() == null) {
            message.setTarget(handler);
        }
        handler.sendEmptyMessageAtTime(0, 0L);
        com.tencent.mm.sdk.platformtools.o3.b(false);
    }

    public void c() {
        if (a("sendSyncBarrier()")) {
            return;
        }
        boolean c17 = com.tencent.mm.sdk.platformtools.o3.c();
        this.f198095c = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MainThreadSyncBarrier", "bIsSyncBarrierEnabled = %s", java.lang.Boolean.valueOf(c17));
        if (!this.f198095c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MainThreadSyncBarrier", "SyncBarrier hack not enabled");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainThreadSyncBarrier", "sendSyncBarrier()");
        if (this.f198093a.get() != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MainThreadSyncBarrier", "Exist a sync barrier message. Wrong state.");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        android.os.Handler handler = this.f198094b;
        android.os.Message obtainMessage = handler.obtainMessage();
        handler.sendMessageAtFrontOfQueue(obtainMessage);
        obtainMessage.setTarget(null);
        obtainMessage.arg1 = -1;
        this.f198093a = new java.lang.ref.WeakReference(obtainMessage);
        com.tencent.mm.sdk.platformtools.o3.b(true);
        android.os.Message obtain = android.os.Message.obtain();
        obtain.setAsynchronous(true);
        obtain.what = 255;
        handler.sendMessageDelayed(obtain, 600L);
    }
}
