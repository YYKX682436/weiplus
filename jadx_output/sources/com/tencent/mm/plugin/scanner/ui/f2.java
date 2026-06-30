package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class f2 implements e04.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159548b;

    public f2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI, java.lang.String str) {
        this.f159548b = scanTranslationCaptureUI;
        this.f159547a = str;
    }

    @Override // e04.q2
    public void a(java.lang.String str, e04.r2 r2Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159548b;
        if (str.equals(scanTranslationCaptureUI.f159368y)) {
            long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - scanTranslationCaptureUI.P[1]);
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = scanTranslationCaptureUI.N;
            oCRTranslateReportStruct.f59748g = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "upload img cost %d", java.lang.Long.valueOf(oCRTranslateReportStruct.f59748g));
            oCRTranslateReportStruct.f59754m = oCRTranslateReportStruct.b("FileID", r2Var.f246080b, true);
            oCRTranslateReportStruct.f59755n = oCRTranslateReportStruct.b("AesKey", r2Var.f246081c, true);
            int i17 = r2Var.f246079a;
            java.lang.String str2 = this.f159547a;
            if (i17 == -21009 || i17 == -21000) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.c2(this));
                oCRTranslateReportStruct.f59747f = 3L;
            } else if (i17 != 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.e2(this));
                oCRTranslateReportStruct.f59747f = 3L;
            } else if (com.tencent.mm.sdk.platformtools.t8.N0(r2Var.f246080b, r2Var.f246081c)) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.a2(this));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationCaptureUI", "fileId %s", r2Var.f246080b);
                gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.e0(scanTranslationCaptureUI.G, (int) com.tencent.mm.vfs.w6.k(str2), r2Var.f246080b, r2Var.f246081c, 1, 2));
            }
            if (scanTranslationCaptureUI.H != 1 || scanTranslationCaptureUI.M == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("delete tmp path %s", str2);
            com.tencent.mm.vfs.w6.h(str2);
        }
    }
}
