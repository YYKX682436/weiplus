package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes10.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.l2 f158944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f158945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f158946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f158947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f158948h;

    public k2(com.tencent.mm.plugin.scanner.model.l2 l2Var, byte[] bArr, android.graphics.Point point, int i17, long j17) {
        this.f158944d = l2Var;
        this.f158945e = bArr;
        this.f158946f = point;
        this.f158947g = i17;
        this.f158948h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Point point;
        byte[] bArr = this.f158945e;
        int i17 = this.f158947g;
        long j17 = this.f158948h;
        com.tencent.mm.plugin.scanner.model.l2 l2Var = this.f158944d;
        l2Var.getClass();
        try {
            if (!(!(bArr.length == 0)) || (point = this.f158946f) == null) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr, 17, point.x, point.y, null);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
            android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(byteArrayOutputStream.toByteArray());
            int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
            if (G != null) {
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(G, i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslateHandler", "processFrame decode cost %d, rotate cost %d", java.lang.Integer.valueOf(currentTimeMillis2), java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - currentTimeMillis3)));
                if (w07 != null) {
                    java.lang.String wi6 = ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).wi("jpg");
                    kotlin.jvm.internal.o.d(wi6);
                    l2Var.e(wi6, 0, w07, j17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslateHandler", e17, "scanTranslate processFrame exception", new java.lang.Object[0]);
        }
    }
}
