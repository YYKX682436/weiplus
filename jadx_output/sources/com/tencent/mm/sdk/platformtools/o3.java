package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class o3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f192892a;

    public static void b(boolean z17) {
        f192892a = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerAsync", "sIsDuringSyncBarrierTimeSpan = %s", java.lang.Boolean.valueOf(f192892a));
    }

    public static boolean c() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChattingAnimSyncBarrier()) == 1;
    }

    public boolean d(java.lang.Runnable runnable) {
        return e(runnable, android.os.SystemClock.uptimeMillis());
    }

    public final boolean e(java.lang.Runnable runnable, long j17) {
        if (!c() || !f192892a) {
            return postAtTime(runnable, j17);
        }
        android.os.Message obtainMessage = obtainMessage(-16711936, runnable);
        obtainMessage.setAsynchronous(true);
        return sendMessageAtTime(obtainMessage, j17);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == -16711936) {
            java.lang.Object obj = message.obj;
            if (obj instanceof java.lang.Runnable) {
                ((java.lang.Runnable) obj).run();
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.n3, qu5.a
    public boolean post(java.lang.Runnable runnable) {
        return d(runnable);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3, qu5.a
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        return e(runnable, 0L);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3, qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        if (j17 < 0) {
            j17 = 0;
        }
        return e(runnable, android.os.SystemClock.uptimeMillis() + j17);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3, qu5.a
    public void removeCallbacks(java.lang.Runnable runnable) {
        removeMessages(-16711936, runnable);
        super.removeCallbacks(runnable);
    }
}
