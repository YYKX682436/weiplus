package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class j3 extends xu5.o {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f192759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.k3 f192760i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f192761j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.sdk.platformtools.n3 n3Var, xu5.b bVar, android.os.Handler.Callback callback, long j17, com.tencent.mm.sdk.platformtools.k3 k3Var) {
        super(bVar, callback);
        this.f192761j = n3Var;
        this.f192759h = j17;
        this.f192760i = k3Var;
    }

    @Override // xu5.o
    public void b(android.os.Message message) {
        this.f192761j.handleMessage(message);
    }

    @Override // xu5.o, qu5.a
    public void dispatchMessage(android.os.Message message) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f192761j;
        n3Var.runningMsg = message;
        super.dispatchMessage(message);
        n3Var.runningMsg = null;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (this.f192759h == currentThread.getId()) {
            if (currentTimeMillis2 < 300) {
                return;
            }
        } else if (currentTimeMillis2 < 5000) {
            return;
        }
        com.tencent.mars.xlog.Log.w("Handler#Monitor", "This msg handle so slow[%sms]! runnable=%s callback=%s thread=%s", java.lang.Long.valueOf(currentTimeMillis2), message.getCallback(), this.f192760i, currentThread.getName());
    }
}
