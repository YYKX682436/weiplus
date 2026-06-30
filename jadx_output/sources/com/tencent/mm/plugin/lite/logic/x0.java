package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.gen.LiteAppReporter f144081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oq1.q f144082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.h f144083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144084g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.k2 f144085h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.logic.c1 f144086i;

    public x0(com.tencent.mm.plugin.lite.logic.c1 c1Var, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter, oq1.q qVar, com.tencent.mm.plugin.lite.api.h hVar, java.lang.String str, com.tencent.mm.plugin.lite.logic.k2 k2Var) {
        this.f144086i = c1Var;
        this.f144081d = liteAppReporter;
        this.f144082e = qVar;
        this.f144083f = hVar;
        this.f144084g = str;
        this.f144085h = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.w.initLib();
        oq1.q qVar = this.f144082e;
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = this.f144081d;
        if (liteAppReporter == null) {
            liteAppReporter = com.tencent.mm.plugin.lite.utils.LiteAppReporterDependencyImpl.INSTANCE.getLiteAppReporter(qVar.f347346a);
        }
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2 = liteAppReporter;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 93L, 1L);
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        java.lang.String str = qVar.f347349d;
        t0Var.f97150a = str;
        t0Var.f97153d = qVar.f347350e;
        t0Var.f97155f = 2;
        t0Var.f97159j = false;
        t0Var.B = false;
        t0Var.C = qVar.f347365t;
        com.tencent.mm.plugin.lite.logic.c1 c1Var = this.f144086i;
        if (((java.util.concurrent.ConcurrentHashMap) c1Var.f143914e).containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppDownloadPkg", qVar.f347349d + " is downloading");
            com.tencent.mm.plugin.lite.api.h hVar = this.f144083f;
            if (hVar != null) {
                hVar.fail(qVar.f347346a, 8);
                return;
            }
            return;
        }
        if (liteAppReporter2 != null) {
            liteAppReporter2.logDownload(com.tencent.liteapp.gen.DownloadAction.DOWNLOAD_PACKAGE, qVar.f347360o);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        com.tencent.mm.plugin.lite.logic.c1 c1Var2 = this.f144086i;
        com.tencent.mm.plugin.lite.logic.b1 b1Var = new com.tencent.mm.plugin.lite.logic.b1(c1Var2, "downloadLiteAppPkg", this.f144082e, this.f144084g, liteAppReporter2, this.f144083f, null);
        b1Var.f143908f = this.f144085h;
        ((java.util.concurrent.ConcurrentHashMap) c1Var2.f143913d).put(java.lang.Long.valueOf(b17), b1Var);
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f143914e).put(qVar.f347349d, b1Var);
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f143915f).put(qVar.f347349d, java.lang.Long.valueOf(b17));
    }
}
