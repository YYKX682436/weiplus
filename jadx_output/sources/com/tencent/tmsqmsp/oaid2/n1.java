package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class n1 implements android.content.ServiceConnection {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.m1 f215623e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.k f215624f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f215622d = new java.util.concurrent.CountDownLatch(2);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.tmsqmsp.oaid2.l.c f215625g = new com.tencent.tmsqmsp.oaid2.l.c(this);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.tmsqmsp.oaid2.l.b f215626h = new com.tencent.tmsqmsp.oaid2.l.b(this);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f215623e = new com.tencent.tmsqmsp.oaid2.m1();
        if (iBinder != null) {
            try {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDService");
                if (queryLocalInterface instanceof com.tencent.tmsqmsp.oaid2.k) {
                    this.f215624f = (com.tencent.tmsqmsp.oaid2.k) queryLocalInterface;
                } else {
                    this.f215624f = new com.tencent.tmsqmsp.oaid2.j(iBinder);
                }
            } catch (java.lang.Throwable unused) {
                java.util.concurrent.CountDownLatch countDownLatch = this.f215622d;
                countDownLatch.countDown();
                countDownLatch.countDown();
                return;
            }
        }
        com.tencent.tmsqmsp.oaid2.k kVar = this.f215624f;
        if (kVar == null) {
            return;
        }
        kVar.b(this.f215626h);
        this.f215624f.a(this.f215625g);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.CountDownLatch countDownLatch = this.f215622d;
        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}
