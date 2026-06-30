package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.scanner.model.n1 f158959a = new com.tencent.mm.plugin.scanner.model.n1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f158960b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f158961c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f158962d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f158963e = new java.util.concurrent.ConcurrentHashMap();

    public final android.graphics.Bitmap a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return (android.graphics.Bitmap) f158962d.get(str);
    }

    public final void b(long j17, int i17, java.lang.String errMsg) {
        java.util.HashMap hashMap = f158960b;
        com.tencent.mm.plugin.scanner.model.f1 f1Var = (com.tencent.mm.plugin.scanner.model.f1) hashMap.get(java.lang.Long.valueOf(j17));
        if (f1Var != null) {
            c04.y yVar = (c04.y) f1Var;
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "loadResource onLoadResult errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), errMsg);
            if (i17 == 0) {
                java.lang.String decorationImagePath = yVar.f37699b.f158671p;
                kotlin.jvm.internal.o.f(decorationImagePath, "decorationImagePath");
                com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView.v(yVar.f37698a, decorationImagePath);
            }
        }
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    public final void c(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f158962d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) concurrentHashMap.get(str);
        if (bitmap != null) {
            bitmap.recycle();
        }
        concurrentHashMap.remove(str);
    }
}
