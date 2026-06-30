package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f159577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159579f;

    public k3(int i17, android.graphics.Bitmap bitmap, com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159577d = i17;
        this.f159578e = bitmap;
        this.f159579f = scanTranslationResultUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("drawTranslationResult() called with: session = ");
        int i17 = this.f159577d;
        sb6.append(i17);
        sb6.append(", newBitmap = ");
        android.graphics.Bitmap bitmap = this.f159578e;
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", sb6.toString());
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159579f;
        if (i17 == scanTranslationResultUI.f159391x) {
            if (bitmap == null) {
                scanTranslationResultUI.X6(null);
                return;
            }
            scanTranslationResultUI.C.f59750i = (int) (java.lang.System.currentTimeMillis() - scanTranslationResultUI.D[1]);
            scanTranslationResultUI.f159385r = bitmap;
            com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.U6(scanTranslationResultUI);
            scanTranslationResultUI.Z6(scanTranslationResultUI.f159385r);
        }
    }
}
