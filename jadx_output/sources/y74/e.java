package y74;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final y74.e f459784a = new y74.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f459785b = new java.util.LinkedHashMap();

    public static final void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordAdRequestEnd", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordAdRequestEnd", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            return;
        }
        java.util.Map map = f459785b;
        synchronized (map) {
            try {
                map.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordAdRequestEnd", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordAdRequestEnd", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r8 = this;
            java.lang.String r0 = "AdTimelineReporter"
            java.lang.String r1 = "getAsyncRequestReportEnable called "
            java.lang.String r2 = "getAsyncRequestReportEnable"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L2e
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L2e
            e42.d0 r6 = e42.d0.clicfg_sns_ad_timeline_async_request_report_android     // Catch: java.lang.Throwable -> L2e
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L2e
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            r6.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2c
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L41
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            r1 = move-exception
            r5 = r4
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getAsyncRequestReportEnable, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        L41:
            if (r5 <= 0) goto L44
            r4 = 1
        L44:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y74.e.a():boolean");
    }
}
