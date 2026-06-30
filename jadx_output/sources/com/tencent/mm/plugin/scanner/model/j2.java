package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes10.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.l2 f158940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158941e;

    public j2(com.tencent.mm.plugin.scanner.model.l2 l2Var, java.lang.String str) {
        this.f158940d = l2Var;
        this.f158941e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.model.l2 l2Var = this.f158940d;
        l2Var.getClass();
        java.lang.String str = this.f158941e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslateHandler", "processImage degree %s", java.lang.Integer.valueOf(orientationInDegree));
        android.graphics.Bitmap K = com.tencent.mm.sdk.platformtools.x.K(str);
        if (K != null) {
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(K, orientationInDegree);
            kotlin.jvm.internal.o.d(str);
            kotlin.jvm.internal.o.d(w07);
            l2Var.e(str, 1, w07, 0L);
        }
    }
}
