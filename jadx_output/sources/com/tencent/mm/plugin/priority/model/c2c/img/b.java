package com.tencent.mm.plugin.priority.model.c2c.img;

/* loaded from: classes12.dex */
public class b extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.priority.model.c2c.img.c f153172d;

    public b(com.tencent.mm.plugin.priority.model.c2c.img.c cVar) {
        this.f153172d = cVar;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.CheckNetworkNetStatTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.priority.model.c2c.img.c cVar = this.f153172d;
        long uidRxBytes = android.net.TrafficStats.getUidRxBytes(cVar.f153180n);
        long uidTxBytes = android.net.TrafficStats.getUidTxBytes(cVar.f153180n);
        long j17 = (uidRxBytes - cVar.f153178i) + (uidTxBytes - cVar.f153179m);
        if (j17 <= 20480) {
            cVar.f153177h = false;
            cVar.d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CImgAutoDownloader", "byteDelta %d", java.lang.Long.valueOf(j17));
        cVar.f153178i = uidRxBytes;
        cVar.f153179m = uidTxBytes;
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        kq3.l lVar = nVar.f265536u;
        com.tencent.mm.plugin.priority.model.c2c.img.b bVar = new com.tencent.mm.plugin.priority.model.c2c.img.b(cVar);
        kq3.k kVar = lVar.f311279b;
        if (kVar != null) {
            lVar.f311279b.sendMessageDelayed(kVar.obtainMessage(1, bVar), 1000L);
        }
    }
}
