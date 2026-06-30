package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public final class z1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tmsqmsp.oaid2.a0 f215695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.z f215696e;

    public z1(com.tencent.tmsqmsp.oaid2.z zVar, com.tencent.tmsqmsp.oaid2.a0 a0Var) {
        this.f215696e = zVar;
        this.f215695d = a0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.tmsqmsp.oaid2.y yVar;
        synchronized (this) {
            this.f215696e.f215694d = com.tencent.tmsqmsp.oaid2.y.a.a(iBinder);
            yVar = this.f215696e.f215694d;
            com.tencent.tmsqmsp.oaid2.c.a(new com.tencent.tmsqmsp.oaid2.b0(yVar, this.f215695d));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.tmsqmsp.oaid2.z zVar = this.f215696e;
        zVar.f215694d = null;
        zVar.f215694d = null;
    }
}
