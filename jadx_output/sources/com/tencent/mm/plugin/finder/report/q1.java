package com.tencent.mm.plugin.finder.report;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.q1 f125255a = new com.tencent.mm.plugin.finder.report.q1();

    /* renamed from: b, reason: collision with root package name */
    public static long f125256b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f125257c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.report.p1 f125258d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f125259e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f125260f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f125261g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f125262h;

    public static void e(com.tencent.mm.plugin.finder.report.q1 q1Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        q1Var.getClass();
        if (z18) {
            return;
        }
        f125259e = z17;
        com.tencent.mm.plugin.finder.report.p1 p1Var = f125258d;
        if (p1Var != null) {
            p1Var.f125230a = android.os.SystemClock.elapsedRealtime();
        }
        if (!q1Var.c()) {
            f125257c = 2L;
        }
        f125262h = true;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.finder.report.p1 p1Var = f125258d;
        if (p1Var != null) {
            com.tencent.mm.plugin.finder.report.q1 q1Var = f125255a;
            if (q1Var.c()) {
                jSONObject.put("realFirstFrameTime", p1Var.f125231b - p1Var.f125236g);
            } else {
                jSONObject.put("realFirstFrameTime", p1Var.f125231b - p1Var.f125230a);
            }
            jSONObject.put("isPrePlay", q1Var.c());
        }
        return jSONObject;
    }

    public final long b(long j17) {
        if (j17 < 0) {
            return 0L;
        }
        return j17;
    }

    public final boolean c() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3937z4).getValue()).r()).intValue() == 1;
    }

    public final void d(kn0.g gVar, com.tencent.mm.plugin.finder.storage.FeedData feedData) {
        com.tencent.mm.plugin.finder.report.p1 p1Var = f125258d;
        if (p1Var != null) {
            p1Var.f125231b = android.os.SystemClock.elapsedRealtime();
        }
        com.tencent.mm.plugin.finder.report.p1 p1Var2 = f125258d;
        if (p1Var2 != null) {
            if (p1Var2.f125230a == 0 || p1Var2.f125231b == 0 || p1Var2.f125232c == 0 || p1Var2.f125234e == 0 || p1Var2.f125233d == 0 || p1Var2.f125235f == 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveReporter", "report invalid data, startTime=" + p1Var2.f125230a + ", firstFrame=" + p1Var2.f125231b + ", startPlay=" + p1Var2.f125232c + ", decodeStart=" + p1Var2.f125234e + ", connectSuccess=" + p1Var2.f125233d + "playBegin=" + p1Var2.f125235f);
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.FinderLivePerformanceDataStruct finderLivePerformanceDataStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLivePerformanceDataStruct();
            finderLivePerformanceDataStruct.f57270d = f125256b;
            finderLivePerformanceDataStruct.f57271e = f125259e ? 3L : f125257c;
            boolean z17 = f125262h;
            com.tencent.mm.plugin.finder.report.q1 q1Var = f125255a;
            if (z17 || f125257c != 2) {
                java.lang.String jSONObject = q1Var.a().toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                finderLivePerformanceDataStruct.f57281o = finderLivePerformanceDataStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r26.i0.t(jSONObject, ",", ";", false), true);
                finderLivePerformanceDataStruct.f57272f = q1Var.b(p1Var2.f125231b - p1Var2.f125230a);
                finderLivePerformanceDataStruct.f57273g = q1Var.b(p1Var2.f125232c - p1Var2.f125230a);
            } else {
                java.lang.String jSONObject2 = q1Var.a().toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                finderLivePerformanceDataStruct.f57281o = finderLivePerformanceDataStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r26.i0.t(jSONObject2, ",", ";", false), true);
                finderLivePerformanceDataStruct.f57272f = 0L;
                finderLivePerformanceDataStruct.f57273g = 0L;
            }
            finderLivePerformanceDataStruct.f57274h = q1Var.b(p1Var2.f125233d - p1Var2.f125232c);
            finderLivePerformanceDataStruct.f57275i = q1Var.b(p1Var2.f125234e - p1Var2.f125233d);
            finderLivePerformanceDataStruct.f57276j = q1Var.b(p1Var2.f125231b - p1Var2.f125235f);
            finderLivePerformanceDataStruct.f57277k = f125260f ? 1 : 0;
            finderLivePerformanceDataStruct.f57278l = q1Var.b(p1Var2.f125231b - p1Var2.f125232c);
            if (gVar != null) {
                finderLivePerformanceDataStruct.f57279m = finderLivePerformanceDataStruct.b("snn", gVar.f309549p, true);
                finderLivePerformanceDataStruct.f57280n = gVar.f309535b;
            } else if (feedData != null) {
                finderLivePerformanceDataStruct.f57279m = finderLivePerformanceDataStruct.b("snn", feedData.getNickName(), true);
                finderLivePerformanceDataStruct.f57280n = feedData.getLiveId();
            }
            finderLivePerformanceDataStruct.k();
            com.tencent.mars.xlog.Log.i("FinderLiveReporter", "report23799 info:" + finderLivePerformanceDataStruct.n());
        }
    }
}
