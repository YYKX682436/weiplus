package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public final class z implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.a0 f158329d;

    public z(com.tencent.mm.plugin.report.service.a0 a0Var) {
        this.f158329d = a0Var;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.tencent.mm.plugin.report.service.n lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "onServiceConnected");
        com.tencent.mm.plugin.report.service.a0 a0Var = this.f158329d;
        int i17 = com.tencent.mm.plugin.report.service.m.f158288d;
        if (iBinder == null) {
            lVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.report.service.IKVReport_AIDL");
            lVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.plugin.report.service.n)) ? new com.tencent.mm.plugin.report.service.l(iBinder) : (com.tencent.mm.plugin.report.service.n) queryLocalInterface;
        }
        a0Var.getClass();
        com.tencent.mm.plugin.report.service.KVReportService.f158138n = lVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KVReportService", "onServiceDisconnected");
    }
}
