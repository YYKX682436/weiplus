package lf0;

@j95.b
/* loaded from: classes.dex */
public class u extends i95.w implements mf0.z, mf0.d0 {
    public void Ai(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.startsWith("wrd")) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(900L, i17, 1L, false);
    }

    public void Bi(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryWebViewVisitTime %s", str);
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = str;
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public void wi(java.lang.String str, java.lang.String str2, int i17, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.startsWith("wrd")) {
            return;
        }
        try {
            java.lang.String format = java.lang.String.format("%s,%s,%s,%s", fp.s0.b(str2, "utf8"), java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(j17));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "kvReportTopStoryOpenWebViewError 15728 %s", format);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(15728, format);
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }
}
