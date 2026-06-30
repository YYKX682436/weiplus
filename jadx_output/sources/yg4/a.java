package yg4;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yg4.a f462328a = new yg4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f462329b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f462330c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final int f462331d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f462332e = 17;

    public final void a(java.lang.String str, long j17, long j18, long j19) {
        com.tencent.mm.autogen.mmdata.rpt.WACanvasPerformanceReportStruct wACanvasPerformanceReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WACanvasPerformanceReportStruct();
        wACanvasPerformanceReportStruct.f61911d = wACanvasPerformanceReportStruct.b("AppId", "wx2f3fb5db9f226462", true);
        wACanvasPerformanceReportStruct.f61914g = j18;
        wACanvasPerformanceReportStruct.f61915h = wACanvasPerformanceReportStruct.b("Scene", str, true);
        wACanvasPerformanceReportStruct.f61912e = j17;
        wACanvasPerformanceReportStruct.f61913f = j19;
        com.tencent.mars.xlog.Log.i("MagicLiveCardReporter", "eventType:" + j17 + " report appId:" + wACanvasPerformanceReportStruct.f61911d + " sessionId:" + wACanvasPerformanceReportStruct.f61914g + " scene:" + wACanvasPerformanceReportStruct.f61915h + " eventTimestamp:" + wACanvasPerformanceReportStruct.f61913f);
        wACanvasPerformanceReportStruct.k();
    }

    public final void b(java.lang.String frameSetName) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        com.tencent.mars.xlog.Log.i("MagicLiveCardReporter", "markStartTimeForScene frameSetName:".concat(frameSetName));
        java.util.HashMap hashMap = f462329b;
        if (hashMap.containsKey(frameSetName)) {
            com.tencent.mars.xlog.Log.e("MagicLiveCardReporter", "markStartTimeForScene sessionIdMap already has frameSetName:".concat(frameSetName));
        } else {
            hashMap.put(frameSetName, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}
