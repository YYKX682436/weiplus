package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f164990b = "";

    /* renamed from: d, reason: collision with root package name */
    public static boolean f164992d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f164993e;

    /* renamed from: g, reason: collision with root package name */
    public static long f164995g;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.w0 f164989a = new com.tencent.mm.plugin.sns.statistics.w0();

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct f164991c = new com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f164994f = new java.util.HashMap();

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIsBackgroundUserType", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.tencent.mm.plugin.sns.statistics.a aVar = com.tencent.mm.plugin.sns.statistics.a.f164826a;
        int i17 = (aVar.g() || aVar.h()) ? 1 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIsBackgroundUserType", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        return i17;
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "reportUserAction: " + i17 + ", " + f164990b + ", " + f164992d + ", " + f164993e);
        if (!f164992d) {
            c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            return;
        }
        if (i17 == 3 && f164993e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "reportUserAction >> report is fake video publish");
            java.util.HashMap hashMap = f164994f;
            java.lang.String str = f164991c.f60794d;
            kotlin.jvm.internal.o.f(str, "getSessionid(...)");
            hashMap.put(str, f164991c);
        } else {
            com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct snsVideoPublishLogStruct = f164991c;
            snsVideoPublishLogStruct.f60795e = i17;
            snsVideoPublishLogStruct.f60796f = a();
            f164991c.k();
        }
        c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportUserAction", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "reset >> " + f164990b);
        f164991c = new com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct();
        f164992d = false;
        f164993e = false;
        f164995g = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    public final void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsCurrentFakeVideo", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "setIsCurrentFakeVideo >> " + z17);
        f164993e = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsCurrentFakeVideo", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }

    public final void e(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoMuxTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct snsVideoPublishLogStruct = f164991c;
        long j18 = snsVideoPublishLogStruct.f60801k;
        snsVideoPublishLogStruct.f60801k = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "updateVideoMuxTime >> sessionId: " + f164991c.f60794d + ", time: " + j17 + ", lastMuxTime: " + j18 + ", currentMuxTime: " + f164991c.f60801k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoMuxTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
    }
}
