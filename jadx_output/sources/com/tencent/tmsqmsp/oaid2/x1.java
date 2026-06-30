package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public final class x1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.x f215688d;

    public x1(com.tencent.tmsqmsp.oaid2.x xVar) {
        this.f215688d = xVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f215688d.f215685b = com.tencent.tmsqmsp.oaid2.v.a.a(iBinder);
            com.tencent.tmsqmsp.oaid2.x xVar = this.f215688d;
            com.tencent.tmsqmsp.oaid2.x.b bVar = xVar.f215687d;
            if (bVar != null) {
                bVar.a(xVar);
            }
            this.f215688d.b("Service onServiceConnected");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.tmsqmsp.oaid2.x xVar = this.f215688d;
        xVar.f215685b = null;
        xVar.b("Service onServiceDisconnected");
    }
}
