package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public final class t1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.r0 f215671d;

    public t1(com.tencent.tmsqmsp.oaid2.r0 r0Var) {
        this.f215671d = r0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f215671d.f215655d = com.tencent.tmsqmsp.oaid2.q0.a.a(iBinder);
            com.tencent.tmsqmsp.oaid2.r0 r0Var = this.f215671d;
            com.tencent.tmsqmsp.oaid2.r0.b bVar = r0Var.f215652a;
            if (bVar != null) {
                bVar.a(r0Var);
            }
            com.tencent.tmsqmsp.oaid2.t0.b(com.tencent.tmsqmsp.oaid2.r0.f215651f + " Service onServiceConnected");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f215671d.f215655d = null;
        com.tencent.tmsqmsp.oaid2.t0.b(com.tencent.tmsqmsp.oaid2.r0.f215651f + " Service onServiceDisconnected");
    }
}
