package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes13.dex */
public final class q1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.p0 f215647d;

    public q1(com.tencent.tmsqmsp.oaid2.p0 p0Var) {
        this.f215647d = p0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f215647d.f215636a = com.tencent.tmsqmsp.oaid2.o0.a.a(iBinder);
        synchronized (this.f215647d.f215639d) {
            this.f215647d.f215639d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f215647d.f215636a = null;
    }
}
