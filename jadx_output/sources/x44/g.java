package x44;

/* loaded from: classes4.dex */
public final class g extends w44.d {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
    
        if (r2.isFreeSimCard() == true) goto L50;
     */
    @Override // w44.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(w44.b r23, org.json.JSONObject r24) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x44.g.c(w44.b, org.json.JSONObject):void");
    }

    public final long p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, boolean z17, int i17, boolean z18, java.lang.String str6) {
        long b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0 i18 = com.tencent.mm.plugin.downloader.model.r0.i();
        if (z18) {
            com.tencent.mm.plugin.downloader_app.model.a aVar = new com.tencent.mm.plugin.downloader_app.model.a();
            aVar.f97234a = str4;
            aVar.f97237d = str6;
            aVar.f97238e = str;
            aVar.f97239f = str2;
            aVar.f97241h = str3;
            aVar.f97236c = str5;
            aVar.f97242i = 1;
            aVar.f97246m = z17;
            aVar.f97244k = 5101;
            b17 = ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).wi(aVar, x44.f.f451828a);
        } else {
            com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
            t0Var.f97156g = str;
            t0Var.f97173x = str;
            t0Var.f97157h = str2;
            t0Var.f97154e = str3;
            t0Var.f97150a = str4;
            t0Var.f97158i = z17;
            t0Var.f97153d = str5;
            if (j17 > 0) {
                t0Var.f97152c = j17;
            }
            if (i17 > 0) {
                t0Var.f97155f = i17;
            } else {
                t0Var.f97155f = 1;
            }
            b17 = i18.b(t0Var);
        }
        x44.n nVar = x44.n.f451859d;
        w44.b d17 = d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        nVar.j(b17, new x44.e3(d17.f442895e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight");
        return b17;
    }
}
