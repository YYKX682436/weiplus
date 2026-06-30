package ez3;

/* loaded from: classes12.dex */
public class o implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.scanner.q0 q0Var = (com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class);
        q0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "onSceneEnd errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (m1Var.getType() == 294) {
            com.tencent.mm.plugin.scanner.model.e0 e0Var = (com.tencent.mm.plugin.scanner.model.e0) m1Var;
            int i19 = e0Var.f158879h;
            if (i17 != 0 || i18 != 0) {
                if (q0Var.f159126p.containsKey(java.lang.Integer.valueOf(i19)) && q0Var.f159127q.containsKey(java.lang.Integer.valueOf(i19))) {
                    ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i19))).f59750i = java.lang.System.currentTimeMillis() - ((java.lang.Long) q0Var.f159127q.get(java.lang.Integer.valueOf(i19))).longValue();
                    ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i19))).f59747f = 5L;
                    ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i19))).k();
                    q0Var.f159126p.remove(java.lang.Integer.valueOf(i19));
                    q0Var.f159127q.remove(java.lang.Integer.valueOf(i19));
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(q0Var.f159126p.size()), java.lang.Integer.valueOf(q0Var.f159127q.size()));
                }
                q0Var.fj(i19);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "TranslationSpr useNewCgi: %d newOcrmt: %s", 1, java.lang.String.valueOf(e0Var.f158884p));
            if (e0Var.f158884p) {
                q0Var.hj(i19, e0Var, q0Var.f159128r);
                return;
            }
            java.util.List list = e0Var.f158878g;
            if (list == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PluginScanTranslation", "startTranslation, translationInfos is null, sessionId: " + i19);
                return;
            }
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "session %d, angle %f, translationInfos length %d", java.lang.Integer.valueOf(i19), java.lang.Float.valueOf(e0Var.H()), java.lang.Integer.valueOf(linkedList.size()));
            if (q0Var.f159126p.containsKey(java.lang.Integer.valueOf(i19))) {
                ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i19))).f59749h = java.lang.System.currentTimeMillis() - e0Var.f158880i;
            }
            if (linkedList.size() <= 0 || !q0Var.f159125o.containsKey(java.lang.Integer.valueOf(i19))) {
                if (q0Var.f159126p.containsKey(java.lang.Integer.valueOf(i19)) && q0Var.f159127q.containsKey(java.lang.Integer.valueOf(i19))) {
                    ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i19))).f59750i = java.lang.System.currentTimeMillis() - ((java.lang.Long) q0Var.f159127q.get(java.lang.Integer.valueOf(i19))).longValue();
                }
                q0Var.fj(i19);
                return;
            }
            com.tencent.mm.plugin.scanner.model.p2 p2Var = (com.tencent.mm.plugin.scanner.model.p2) q0Var.f159125o.get(java.lang.Integer.valueOf(i19));
            if (p2Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginScanTranslation", "startTranslation, record is null, sessionId: " + i19);
            } else {
                p2Var.f158977c = e0Var.f158884p ? e0Var.f158889u : ((r45.xv4) e0Var.f158876e.f70711b.f70700a).f390501h;
                p2Var.f158978d = e0Var.I();
                boolean z17 = e0Var.f158884p;
                p2Var.f158979e = z17 ? e0Var.f158891w : ((r45.xv4) e0Var.f158876e.f70711b.f70700a).f390503m;
                p2Var.f158981g = e0Var.f158882n;
                p2Var.f158982h = e0Var.f158883o;
                p2Var.f158983i = z17 ? e0Var.f158885q : "";
                p2Var.f158984j = z17 ? e0Var.f158886r : "";
                e04.w2 aj6 = q0Var.aj();
                float H = e0Var.H();
                java.lang.String str2 = p2Var.f158976b;
                e04.v2 v2Var = q0Var.f159128r;
                aj6.getClass();
                if (i19 != 0 && linkedList.size() > 0 && v2Var != null) {
                    android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str2, new android.graphics.BitmapFactory.Options());
                    if (J2 == null) {
                        ((com.tencent.mm.plugin.scanner.r0) v2Var).v5(i19, null);
                    } else {
                        if (aj6.f246149a != 0 && i19 != aj6.f246149a) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", java.lang.Integer.valueOf(aj6.f246149a), java.lang.Integer.valueOf(i19));
                            aj6.f246149a = 0;
                            aj6.f246150b = null;
                        }
                        aj6.f246149a = i19;
                        aj6.f246150b = v2Var;
                        new e04.u2(aj6, i19, list, H, J2).f(new java.lang.Void[0]);
                    }
                }
            }
            com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = (com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) q0Var.f159126p.get(java.lang.Integer.valueOf(i19));
            if (oCRTranslateReportStruct != null) {
                oCRTranslateReportStruct.f59747f = 1L;
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginScanTranslation", "startTranslation, report is null, sessionId: " + i19);
        }
    }
}
