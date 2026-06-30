package com.tencent.mm.plugin.finder.report;

/* loaded from: classes3.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.r5 f125335a = new com.tencent.mm.plugin.finder.report.r5();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.report.q5 f125336b;

    public final void a() {
        com.tencent.mm.plugin.finder.report.q5 q5Var = f125336b;
        if (q5Var != null && q5Var.f125271d == 0) {
            if (q5Var != null) {
                q5Var.f125271d = java.lang.System.currentTimeMillis();
            }
            com.tencent.mm.plugin.finder.report.q5 q5Var2 = f125336b;
            if (q5Var2 != null) {
                if (q5Var2.f125268a == 0 || q5Var2.f125269b == 0 || q5Var2.f125270c == 0 || q5Var2.f125272e == 0 || q5Var2.f125271d == 0) {
                    com.tencent.mars.xlog.Log.i("LiveEnterCostReporter", "report invalid data, enter=" + q5Var2.f125268a + ", reusme=" + q5Var2.f125269b + ", select=" + q5Var2.f125270c + ", startPlay=" + q5Var2.f125272e + ", firstFrame=" + q5Var2.f125271d);
                } else {
                    com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct finderGlobalLoadingRptStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderGlobalLoadingRptStruct();
                    finderGlobalLoadingRptStruct.f56921d = 10L;
                    finderGlobalLoadingRptStruct.f56922e = 5L;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("isPreloadSuccess", q5Var2.f125274g);
                    jSONObject.put("totalCost", q5Var2.f125271d - q5Var2.f125268a);
                    jSONObject.put("clickToResumeCost", q5Var2.f125269b - q5Var2.f125268a);
                    jSONObject.put("resumeToSelectCost", q5Var2.f125270c - q5Var2.f125269b);
                    jSONObject.put("selectToStartPlayCost", q5Var2.f125272e - q5Var2.f125270c);
                    jSONObject.put("startPlayToFirstFrame", q5Var2.f125271d - q5Var2.f125272e);
                    jSONObject.put("selectToFirstFrameCost", q5Var2.f125271d - q5Var2.f125270c);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    finderGlobalLoadingRptStruct.f56923f = finderGlobalLoadingRptStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r26.i0.t(jSONObject2, ",", ";", false), true);
                    finderGlobalLoadingRptStruct.f56924g = finderGlobalLoadingRptStruct.b("tag", q5Var2.f125273f ? "PreloadCoreMode" : "NormalMode", true);
                    finderGlobalLoadingRptStruct.f56925h = finderGlobalLoadingRptStruct.b("majorData", java.lang.String.valueOf(q5Var2.f125271d - q5Var2.f125268a), true);
                    finderGlobalLoadingRptStruct.k();
                    com.tencent.mars.xlog.Log.i("LiveEnterCostReporter", "report21680 info:" + finderGlobalLoadingRptStruct.n());
                }
            }
        }
        f125336b = null;
    }
}
