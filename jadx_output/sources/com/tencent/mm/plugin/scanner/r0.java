package com.tencent.mm.plugin.scanner;

/* loaded from: classes12.dex */
public class r0 implements e04.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.q0 f159136d;

    public r0(com.tencent.mm.plugin.scanner.q0 q0Var) {
        this.f159136d = q0Var;
    }

    @Override // e04.v2
    public void v5(int i17, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "drawTranslationResult() called with: sessionId = [" + i17 + "], newBitmap = [" + bitmap + "]");
        if (bitmap != null) {
            com.tencent.mm.plugin.scanner.q0 q0Var = this.f159136d;
            if (q0Var.f159125o.containsKey(java.lang.Integer.valueOf(i17))) {
                if (q0Var.f159126p.containsKey(java.lang.Integer.valueOf(i17)) && q0Var.f159127q.containsKey(java.lang.Integer.valueOf(i17))) {
                    ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i17))).f59750i = java.lang.System.currentTimeMillis() - ((java.lang.Long) q0Var.f159127q.get(java.lang.Integer.valueOf(i17))).longValue();
                    ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i17))).k();
                    q0Var.f159126p.remove(java.lang.Integer.valueOf(i17));
                    q0Var.f159127q.remove(java.lang.Integer.valueOf(i17));
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(q0Var.f159126p.size()), java.lang.Integer.valueOf(q0Var.f159127q.size()));
                }
                if (gm0.j1.a()) {
                    java.lang.String Zi = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).Zi("jpg");
                    try {
                        com.tencent.mm.sdk.platformtools.x.D0(bitmap, 80, android.graphics.Bitmap.CompressFormat.JPEG, Zi, false);
                        com.tencent.mm.plugin.scanner.model.o2 o2Var = new com.tencent.mm.plugin.scanner.model.o2();
                        com.tencent.mm.plugin.scanner.model.p2 p2Var = (com.tencent.mm.plugin.scanner.model.p2) q0Var.f159125o.get(java.lang.Integer.valueOf(i17));
                        o2Var.field_originMD5 = com.tencent.mm.sdk.platformtools.w2.a(p2Var.f158975a + com.tencent.mm.vfs.w6.l(p2Var.f158975a));
                        o2Var.field_resultFile = Zi;
                        o2Var.field_fromLang = p2Var.f158977c;
                        o2Var.field_toLang = p2Var.f158978d;
                        o2Var.field_brand = p2Var.f158979e;
                        o2Var.field_originalImageFileId = p2Var.f158981g;
                        o2Var.field_originalImageAesKey = p2Var.f158982h;
                        o2Var.field_resultImageFileId = p2Var.f158983i;
                        o2Var.field_resultImageAesKey = p2Var.f158984j;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "translate %d success, insert translate result %s", java.lang.Integer.valueOf(i17), Zi);
                        ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().z0(o2Var);
                        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = new com.tencent.mm.autogen.events.ScanTranslationResultEvent();
                        am.ct ctVar = scanTranslationResultEvent.f54739g;
                        ctVar.f6400a = i17;
                        ctVar.f6402c = true;
                        ctVar.f6403d = Zi;
                        ctVar.getClass();
                        ctVar.getClass();
                        if (q0Var.f159126p.containsKey(java.lang.Integer.valueOf(i17))) {
                            ctVar.f6401b = (int) ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i17))).f59745d;
                        }
                        scanTranslationResultEvent.e();
                        q0Var.f159125o.remove(java.lang.Integer.valueOf(i17));
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginScanTranslation", e17, "save translate result file error", new java.lang.Object[0]);
                        q0Var.fj(i17);
                    }
                }
            }
        }
    }
}
