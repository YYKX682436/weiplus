package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class w0 implements com.tencent.mm.plugin.downloader.model.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.c1 f144072d;

    public w0(com.tencent.mm.plugin.lite.logic.c1 c1Var) {
        this.f144072d = c1Var;
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void b(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.lite.logic.b1 b1Var = (com.tencent.mm.plugin.lite.logic.b1) ((java.util.concurrent.ConcurrentHashMap) this.f144072d.f143913d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f144072d.f143913d).remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppDownloadPkg", "cdn download fail, id: %d, errCode: %d, appId: %s. need http download.", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), b1Var.f143904b.f347346a);
        com.tencent.mm.plugin.lite.logic.c1 c1Var = this.f144072d;
        c1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.lite.logic.a1(c1Var, b1Var));
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "onTaskFinished id:%s, savedFilePath:%s", java.lang.Long.valueOf(j17), str);
        com.tencent.mm.plugin.lite.logic.c1 c1Var = this.f144072d;
        com.tencent.mm.plugin.lite.logic.b1 b1Var = (com.tencent.mm.plugin.lite.logic.b1) ((java.util.concurrent.ConcurrentHashMap) c1Var.f143913d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f143913d).remove(java.lang.Long.valueOf(j17));
        c1Var.g(b1Var, str, "cdn");
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void f(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void k(long j17) {
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void l(long j17, java.lang.String str) {
        com.tencent.mm.plugin.lite.logic.c1 c1Var = this.f144072d;
        com.tencent.mm.plugin.lite.logic.b1 b1Var = (com.tencent.mm.plugin.lite.logic.b1) ((java.util.concurrent.ConcurrentHashMap) c1Var.f143913d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        b1Var.f143909g = currentTimeMillis;
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f143913d).put(java.lang.Long.valueOf(j17), b1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "onTaskStarted id:%s, startDownloadTime:%d, savedFilePath:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), str);
    }

    @Override // com.tencent.mm.plugin.downloader.model.g1
    public void m(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", "onTaskRemoved id:%s", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.lite.logic.c1 c1Var = this.f144072d;
        com.tencent.mm.plugin.lite.logic.b1 b1Var = (com.tencent.mm.plugin.lite.logic.b1) ((java.util.concurrent.ConcurrentHashMap) c1Var.f143913d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        java.util.Map map = c1Var.f143914e;
        oq1.q qVar = b1Var.f143904b;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(qVar.f347349d)) {
            ((java.util.concurrent.ConcurrentHashMap) c1Var.f143914e).remove(qVar.f347349d);
        }
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f143913d).remove(java.lang.Long.valueOf(j17));
    }
}
