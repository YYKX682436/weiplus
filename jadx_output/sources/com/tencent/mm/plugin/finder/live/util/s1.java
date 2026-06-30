package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.s1 f115677a = new com.tencent.mm.plugin.finder.live.util.s1();

    public final void a(com.tencent.mm.plugin.finder.live.util.r1 reportType, java.util.Map map) {
        java.lang.String jSONObject;
        kotlin.jvm.internal.o.g(reportType, "reportType");
        kotlin.jvm.internal.o.g(map, "map");
        org.json.JSONObject a17 = ri.l0.a(map);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportKv type: ");
        int i17 = reportType.f115667d;
        sb6.append(i17);
        sb6.append(" json: ");
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i("KTVReportUtil", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.KMusicSdkDataReportStruct kMusicSdkDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.KMusicSdkDataReportStruct();
        kMusicSdkDataReportStruct.f58549d = i17;
        kMusicSdkDataReportStruct.f58550e = kMusicSdkDataReportStruct.b("Result", (a17 == null || (jSONObject = a17.toString()) == null) ? "" : r26.i0.t(jSONObject, ",", ";", false), true);
        kMusicSdkDataReportStruct.k();
    }
}
