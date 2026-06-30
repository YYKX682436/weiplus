package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class i3 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f192733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.k3 f192734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f192735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.sdk.platformtools.n3 n3Var, android.os.Looper looper, android.os.Handler.Callback callback, long j17, com.tencent.mm.sdk.platformtools.k3 k3Var) {
        super(looper, callback);
        this.f192735c = n3Var;
        this.f192733a = j17;
        this.f192734b = k3Var;
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f192735c;
        n3Var.runningMsg = message;
        n3Var.beforeDispatchMessage(message);
        java.lang.Runnable callback = message.getCallback();
        if (callback != null) {
            bm5.u1.a(com.tencent.mm.sdk.platformtools.i.a(), callback.getClass().getSimpleName());
        }
        super.dispatchMessage(message);
        n3Var.afterDispatchMessage(message);
        n3Var.runningMsg = null;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (this.f192733a == currentThread.getId()) {
            if (currentTimeMillis2 < 300) {
                return;
            }
        } else if (currentTimeMillis2 < 5000) {
            return;
        }
        com.tencent.mars.xlog.Log.w("Handler#Monitor", "This msg handle so slow[%sms]! runnable=%s callback=%s thread=%s", java.lang.Long.valueOf(currentTimeMillis2), message.getCallback(), this.f192734b, currentThread.getName());
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f192735c.handleMessage(message);
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        this.f192735c.beforeSendMessage(message, j17);
        return super.sendMessageAtTime(message, j17);
    }
}
