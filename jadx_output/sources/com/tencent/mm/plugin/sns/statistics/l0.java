package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f164895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.s0 f164896e;

    public l0(com.tencent.mm.plugin.sns.statistics.s0 s0Var, java.util.LinkedHashMap linkedHashMap) {
        this.f164896e = s0Var;
        this.f164895d = linkedHashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedHashMap linkedHashMap = this.f164895d;
        int size = linkedHashMap.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = this.f164896e;
        int i17 = s0Var.f164949f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (size >= i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i18 = s0Var.f164949f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i19 = size - i18;
            java.util.Iterator it = linkedHashMap.keySet().iterator();
            for (int i27 = 0; it.hasNext() && i27 < i19; i27++) {
                it.next();
                it.remove();
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.statistics.k0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.storage.j3 j3Var = s0Var.f164939a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        j3Var.f(6, linkedHashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "save exposure feed id for cgi [%d] oriSize[%d] cost[%d]", java.lang.Integer.valueOf(linkedHashMap.size()), java.lang.Integer.valueOf(size), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1");
    }
}
