package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159815d;

    public x2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159815d = scanTranslationCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159815d;
        int i17 = scanTranslationCaptureUI.H;
        if (i17 == 2) {
            try {
                scanTranslationCaptureUI.N.f59753l = 1L;
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(scanTranslationCaptureUI, scanTranslationCaptureUI.f159366w, new com.tencent.mm.plugin.scanner.ui.v2(this));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e17, "copy to gallery error", new java.lang.Object[0]);
            }
        } else if (i17 == 3) {
            try {
                scanTranslationCaptureUI.N.f59752k = 1L;
                if (scanTranslationCaptureUI.L == 0) {
                    try {
                        scanTranslationCaptureUI.f159367x = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).Zi("jpg");
                        com.tencent.mm.sdk.platformtools.x.D0(scanTranslationCaptureUI.f159365v, 80, android.graphics.Bitmap.CompressFormat.JPEG, scanTranslationCaptureUI.f159367x, false);
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e18, "save translate result file error", new java.lang.Object[0]);
                    }
                }
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).wi(scanTranslationCaptureUI, scanTranslationCaptureUI.f159367x, new com.tencent.mm.plugin.scanner.ui.w2(this));
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanTranslationCaptureUI", e19, "save to gallery error", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
