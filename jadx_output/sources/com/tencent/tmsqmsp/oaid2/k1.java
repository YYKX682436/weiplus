package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public final class k1 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.f.b f215603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tmsqmsp.oaid2.f f215604e;

    public k1(com.tencent.tmsqmsp.oaid2.f fVar, com.tencent.tmsqmsp.oaid2.f.b bVar) {
        this.f215604e = fVar;
        this.f215603d = bVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this) {
            this.f215604e.f215585d = com.tencent.tmsqmsp.oaid2.g.a.a(iBinder);
            com.tencent.tmsqmsp.oaid2.f.b bVar = this.f215603d;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f215604e.f215585d = null;
    }
}
