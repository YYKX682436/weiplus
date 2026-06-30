package ta4;

/* loaded from: classes4.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f416720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ta4.c1 f416722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f416723g;

    public a1(int i17, java.lang.String str, ta4.c1 c1Var, int i18) {
        this.f416720d = i17;
        this.f416721e = str;
        this.f416722f = c1Var;
        this.f416723g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter$doReport$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doReport >> localId: ");
        sb6.append(this.f416720d);
        sb6.append(" snsId: ");
        java.lang.String str2 = this.f416721e;
        sb6.append(str2);
        org.chromium.base.Log.i("MicroMsg.SnsPostMediaMetaDataReporter", sb6.toString());
        ta4.c1 c1Var = this.f416722f;
        c1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        c1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathList", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathList", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataSource");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = c1Var.f416731a;
        java.util.List<java.lang.String> list = c1Var.f416732b;
        if (i17 == 4) {
            for (java.lang.String str3 : list) {
                if (com.tencent.mm.vfs.w6.j(str3)) {
                    org.json.JSONObject g17 = com.tencent.mm.plugin.sight.base.e.g(str3);
                    if (g17 == null || (str = g17.toString()) == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            }
        }
        ta4.b1 b1Var = ta4.b1.f416725a;
        int size = list.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        com.tencent.mm.autogen.mmdata.rpt.SnsPostMediaDataReportStruct snsPostMediaDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsPostMediaDataReportStruct();
        snsPostMediaDataReportStruct.f60688d = snsPostMediaDataReportStruct.b("SnsFeedId", str2, true);
        snsPostMediaDataReportStruct.f60689e = size;
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        byte[] bytes = jSONArray2.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        snsPostMediaDataReportStruct.f60690f = snsPostMediaDataReportStruct.b("MetaDataJsonArray", android.util.Base64.encodeToString(bytes, 2), true);
        snsPostMediaDataReportStruct.f60691g = this.f416723g;
        snsPostMediaDataReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$wrapDataToReport", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.report.SnsPostMediaMetaDataReporter$doReport$1$1");
    }
}
