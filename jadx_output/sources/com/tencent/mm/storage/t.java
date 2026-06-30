package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u f195316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195317e;

    public t(com.tencent.mm.storage.u uVar, int i17) {
        this.f195316d = uVar;
        this.f195317e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.u uVar = this.f195316d;
        uVar.y0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (int i17 = 0; i17 < this.f195317e; i17++) {
            com.tencent.mm.storage.r rVar = new com.tencent.mm.storage.r();
            long j17 = i17 + currentTimeMillis;
            rVar.field_aId = java.lang.String.valueOf(j17);
            rVar.field_msgId = j17;
            rVar.field_exposeTime = currentTimeMillis;
            uVar.z0(rVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAdInfoStorage", "mockExposeAdCount traceId=" + rVar.field_aId);
        }
    }
}
