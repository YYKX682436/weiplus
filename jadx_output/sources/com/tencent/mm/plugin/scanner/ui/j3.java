package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class j3 implements e04.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159571b;

    public j3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI, java.lang.String str) {
        this.f159570a = scanTranslationResultUI;
        this.f159571b = str;
    }

    @Override // e04.q2
    public void a(java.lang.String str, e04.r2 result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159570a;
        if (kotlin.jvm.internal.o.b(str, scanTranslationResultUI.f159388u)) {
            long currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - scanTranslationResultUI.D[1]);
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = scanTranslationResultUI.C;
            oCRTranslateReportStruct.f59748g = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "scanTranslate upload img cost %d, errCode: %d", java.lang.Long.valueOf(oCRTranslateReportStruct.f59748g), java.lang.Integer.valueOf(result.f246079a));
            oCRTranslateReportStruct.f59754m = oCRTranslateReportStruct.b("FileID", result.f246080b, true);
            oCRTranslateReportStruct.f59755n = oCRTranslateReportStruct.b("AesKey", result.f246081c, true);
            int i17 = result.f246079a;
            java.lang.String str2 = this.f159571b;
            if (i17 == -21009 || i17 == -21000) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.g3(scanTranslationResultUI));
                oCRTranslateReportStruct.f59747f = 3L;
            } else if (i17 != 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.i3(scanTranslationResultUI));
                oCRTranslateReportStruct.f59747f = 3L;
            } else if (com.tencent.mm.sdk.platformtools.t8.N0(result.f246080b, result.f246081c)) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.e3(scanTranslationResultUI));
                oCRTranslateReportStruct.f59747f = 3L;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationResultUI", "fileId %s", result.f246080b);
                gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.e0(scanTranslationResultUI.f159391x, (int) com.tencent.mm.vfs.w6.k(str2), result.f246080b, result.f246081c, 1, 2));
            }
            if (scanTranslationResultUI.f159392y != 1 || scanTranslationResultUI.B == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("delete tmp path %s", str2);
            com.tencent.mm.vfs.w6.h(str2);
        }
    }
}
