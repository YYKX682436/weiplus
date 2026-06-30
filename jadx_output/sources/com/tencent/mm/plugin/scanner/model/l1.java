package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.api.ScanGoodsRequest f158949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f158950e;

    public l1(com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest, long j17) {
        this.f158949d = scanGoodsRequest;
        this.f158950e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.model.n1 n1Var = com.tencent.mm.plugin.scanner.model.n1.f158959a;
        com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest = this.f158949d;
        java.lang.String format = java.lang.String.format("deco:%s,succ:%s,tips:%s", java.util.Arrays.copyOf(new java.lang.Object[]{scanGoodsRequest.f158671p, scanGoodsRequest.f158672q, scanGoodsRequest.f158673r}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.scanner.model.n1.f158963e;
        if (concurrentHashMap.containsKey(format)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsResourceManager", "loadResource set can not release");
            concurrentHashMap.put(format, java.lang.Boolean.FALSE);
        }
        long j17 = this.f158950e;
        com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest2 = this.f158949d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String decorationImagePath = scanGoodsRequest2.f158671p;
        kotlin.jvm.internal.o.f(decorationImagePath, "decorationImagePath");
        arrayList.add(new com.tencent.mm.plugin.scanner.model.i1(decorationImagePath));
        java.lang.String successImagePath = scanGoodsRequest2.f158672q;
        kotlin.jvm.internal.o.f(successImagePath, "successImagePath");
        arrayList.add(new com.tencent.mm.plugin.scanner.model.i1(successImagePath));
        java.lang.String scanTipsImagePath = scanGoodsRequest2.f158673r;
        kotlin.jvm.internal.o.f(scanTipsImagePath, "scanTipsImagePath");
        arrayList.add(new com.tencent.mm.plugin.scanner.model.i1(scanTipsImagePath));
        com.tencent.mm.plugin.scanner.model.g1 g1Var = new com.tencent.mm.plugin.scanner.model.g1(j17, arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsResourceManager", "batchDecodeImage start");
        boolean z17 = false;
        for (com.tencent.mm.plugin.scanner.model.i1 i1Var : g1Var.f158911b) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.tencent.mm.plugin.scanner.model.n1.f158962d.get(i1Var.f158934a);
            if (bitmap == null || bitmap.isRecycled()) {
                ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.scanner.model.h1(i1Var, new com.tencent.mm.plugin.scanner.model.k1(g1Var)));
                z17 = true;
            } else {
                i1Var.f158936c = 2;
                i1Var.f158935b = 0;
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsResourceManager", "batchDecodeImage use cache no need to decode");
        n1Var.b(g1Var.f158910a, 0, "ok");
    }
}
