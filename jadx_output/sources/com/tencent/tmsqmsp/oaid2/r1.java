package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class r1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.q f215656d;

    public r1(com.tencent.tmsqmsp.oaid2.q qVar) {
        this.f215656d = qVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.tmsqmsp.oaid2.t0.c("HSDID did service binded");
        com.tencent.tmsqmsp.oaid2.n a17 = com.tencent.tmsqmsp.oaid2.n.a.a(iBinder);
        com.tencent.tmsqmsp.oaid2.q qVar = this.f215656d;
        qVar.f215644c = a17;
        qVar.a(true);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f215656d.a(false);
    }
}
