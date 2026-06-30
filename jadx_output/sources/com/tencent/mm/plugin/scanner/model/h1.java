package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.scanner.model.i1 f158918d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f158919e;

    public h1(com.tencent.mm.plugin.scanner.model.i1 info, yz5.p callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f158918d = info;
        this.f158919e = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.model.i1 i1Var = this.f158918d;
        java.lang.String str = i1Var.f158934a;
        java.lang.String str2 = i1Var.f158934a;
        i1Var.f158936c = 1;
        android.graphics.Bitmap bitmap = null;
        if (com.tencent.mm.vfs.w6.j(str)) {
            try {
                bitmap = com.tencent.mm.sdk.platformtools.x.J(str2, null);
                if (bitmap == null || bitmap.isRecycled()) {
                    i1Var.f158935b = 3;
                } else {
                    i1Var.f158935b = 0;
                }
                if (bitmap != null) {
                    bitmap.getAllocationByteCount();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanGoodsResourceManager", e17, "decodeImage exception", new java.lang.Object[0]);
                i1Var.f158935b = 3;
            }
            i1Var.f158936c = 2;
            if (bitmap != null && !bitmap.isRecycled()) {
                com.tencent.mm.plugin.scanner.model.n1.f158962d.put(str2, bitmap);
            }
        } else {
            i1Var.f158935b = 2;
            i1Var.f158936c = 2;
        }
        this.f158919e.invoke(i1Var, bitmap);
    }
}
