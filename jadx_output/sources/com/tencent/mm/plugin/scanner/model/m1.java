package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.api.ScanGoodsRequest f158957e;

    public m1(java.lang.String str, com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest) {
        this.f158956d = str;
        this.f158957e = scanGoodsRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.scanner.model.n1.f158963e;
        java.lang.String str = this.f158956d;
        if (kotlin.jvm.internal.o.b(concurrentHashMap.get(str), java.lang.Boolean.TRUE)) {
            com.tencent.mm.plugin.scanner.model.n1 n1Var = com.tencent.mm.plugin.scanner.model.n1.f158959a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsResourceManager", "releaseResource requestKey: %s", str);
            concurrentHashMap.remove(str);
            com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest = this.f158957e;
            java.lang.String decorationImagePath = scanGoodsRequest.f158671p;
            kotlin.jvm.internal.o.f(decorationImagePath, "decorationImagePath");
            n1Var.c(decorationImagePath);
            java.lang.String successImagePath = scanGoodsRequest.f158672q;
            kotlin.jvm.internal.o.f(successImagePath, "successImagePath");
            n1Var.c(successImagePath);
            java.lang.String scanTipsImagePath = scanGoodsRequest.f158673r;
            kotlin.jvm.internal.o.f(scanTipsImagePath, "scanTipsImagePath");
            n1Var.c(scanTipsImagePath);
        }
    }
}
