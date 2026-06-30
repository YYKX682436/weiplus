package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.f f164849a = new com.tencent.mm.plugin.sns.statistics.f();

    public static /* synthetic */ void b(com.tencent.mm.plugin.sns.statistics.f fVar, int i17, int i18, long j17, int i19, java.lang.String str, int i27, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report$default", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
        fVar.a(i17, i18, (i27 & 4) != 0 ? 0L : j17, (i27 & 8) != 0 ? -1 : i19, (i27 & 16) != 0 ? "" : str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report$default", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
    }

    public final void a(int i17, int i18, long j17, int i19, java.lang.String finderContextId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        com.tencent.mm.autogen.mmdata.rpt.finder_page_exposeStruct finder_page_exposestruct = new com.tencent.mm.autogen.mmdata.rpt.finder_page_exposeStruct();
        finder_page_exposestruct.f63106d = finder_page_exposestruct.b("sessionid", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri(), true);
        finder_page_exposestruct.f63108f = finder_page_exposestruct.b("commentscene", java.lang.String.valueOf(i17), true);
        finder_page_exposestruct.f63109g = i18;
        finder_page_exposestruct.f63110h = finder_page_exposestruct.b("event_time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
        finder_page_exposestruct.f63111i = finder_page_exposestruct.b("finderusername", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null), true);
        finder_page_exposestruct.f63115m = j17;
        finder_page_exposestruct.f63107e = finder_page_exposestruct.b("findercontextid", finderContextId, true);
        if (i19 != -1 && i18 == 1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("nextstep", i19);
            finder_page_exposestruct.f63112j = finder_page_exposestruct.b("udf_kv", jSONObject.toString(), true);
        }
        finder_page_exposestruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderReportSns21874", "FinderReportSns21874 report scene:" + i17 + " eventCode:" + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.statistics.FinderReportSns21874");
    }
}
