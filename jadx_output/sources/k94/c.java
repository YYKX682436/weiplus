package k94;

/* loaded from: classes4.dex */
public final class c implements k94.g {

    /* renamed from: a, reason: collision with root package name */
    public static final k94.c f305940a = new k94.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f305941b = new java.util.HashMap();

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(status, "status");
        java.util.HashMap hashMap = f305941b;
        k94.b bVar = (k94.b) hashMap.get(viewId);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleRawExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            hashMap.put(viewId, new k94.b(false, 0L, 0L, false, 15, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f260531e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            h94.a aVar = concurrentHashMap != null ? (h94.a) concurrentHashMap.get(viewId) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
            if (aVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleRawExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExpose$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
                k94.d.b(aVar, 0, 0, 0, 0, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExpose$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2113, 1);
                com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "report raw exposure: viewId=".concat(viewId));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleRawExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            }
            com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "MOVE_IN: viewId=" + viewId + ", timestamp=" + currentTimeMillis + ", exposeRatio=" + d17);
            if (d17 >= 0.5d) {
                k94.b bVar2 = (k94.b) hashMap.get(viewId);
                if (bVar2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                    return;
                } else if (!bVar2.a()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                    bVar2.f305936a = true;
                    bVar2.f305937b = java.lang.System.currentTimeMillis();
                    bVar2.f305938c = 0L;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                }
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    if (bVar == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                        return;
                    }
                    if (bVar.a()) {
                        b(viewId, bVar, currentTimeMillis);
                    }
                    hashMap.remove(viewId);
                    com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "REMOVED: viewId=" + viewId + ", timestamp=" + currentTimeMillis);
                }
            } else {
                if (bVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                    return;
                }
                boolean a17 = bVar.a();
                boolean z17 = d17 >= 0.5d;
                if (!a17 && z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                    bVar.f305936a = true;
                    bVar.f305937b = java.lang.System.currentTimeMillis();
                    bVar.f305938c = 0L;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startValidExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                    com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "RATIO_CHANGED: viewId=" + viewId + ", became valid, ratio=" + d17);
                } else if (a17 && !z17) {
                    b(viewId, bVar, currentTimeMillis);
                    com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "RATIO_CHANGED: viewId=" + viewId + ", became invalid, ratio=" + d17);
                }
            }
        } else {
            if (bVar == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                return;
            }
            if (bVar.a()) {
                b(viewId, bVar, currentTimeMillis);
            }
            hashMap.remove(viewId);
            com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "INVISIBLE: viewId=" + viewId + ", timestamp=" + currentTimeMillis);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
    }

    public final void b(java.lang.String traceId, k94.b bVar, long j17) {
        boolean z17;
        int i17;
        int i18;
        java.lang.Integer num;
        java.lang.Integer num2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j18 = bVar.f305937b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j19 = 0;
        if (j18 > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            long j27 = bVar.f305937b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidExposureStartTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            j19 = j17 - j27;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j28 = bVar.f305938c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j29 = j28 + j19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleValidExposureEnd: viewId=");
        sb6.append(traceId);
        sb6.append(", currentDuration=");
        sb6.append(j19);
        sb6.append("ms, accumulatedDuration=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        long j37 = bVar.f305938c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccumulatedDuration", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        sb6.append(j37);
        sb6.append("ms, totalDuration=");
        sb6.append(j29);
        sb6.append("ms");
        com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", sb6.toString());
        if (j29 >= 1000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            boolean z18 = bVar.f305939d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            if (z18) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2113, 5);
                com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "view id = " + traceId + ", total duration > 1s, already reported!!!");
                bVar.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                return;
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needCheck1s", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ws_fold_ad_expose_check_1s, 0) == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needCheck1s", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                java.lang.Object m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    ca4.q.c("WsFoldAdExposeStatistic", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needCheck1s", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                z17 = false;
            }
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2113, 4);
                com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", "view id = " + traceId + ", need check but < 1s");
                bVar.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f260531e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        h94.a aVar = concurrentHashMap != null ? (h94.a) concurrentHashMap.get(traceId) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            boolean z19 = bVar.f305939d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
            if (!z19) {
                k94.f fVar = k94.f.f305946a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
                k94.e eVar = (k94.e) k94.f.f305947b.get(traceId);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
                int i19 = (int) j29;
                int a17 = eVar != null ? eVar.a() + 1 : 0;
                if (eVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    int i27 = (eVar.f305943a * eVar.f305945c) + eVar.f305944b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    i17 = i27;
                } else {
                    i17 = 0;
                }
                if (eVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    i18 = eVar.f305945c;
                } else {
                    i18 = 0;
                }
                k94.d.b(aVar, 1, i19, a17, i17, i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                bVar.f305939d = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReported", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("report valid exposure: viewId=");
                sb7.append(traceId);
                sb7.append(", totalDuration=");
                sb7.append(j29);
                sb7.append(",playCount = ");
                sb7.append(eVar != null ? java.lang.Integer.valueOf(eVar.a() + 1) : null);
                sb7.append(", playTotalTime = ");
                if (eVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    int i28 = (eVar.f305943a * eVar.f305945c) + eVar.f305944b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    num = java.lang.Integer.valueOf(i28);
                } else {
                    num = null;
                }
                sb7.append(num);
                sb7.append(",videoTotalTime = ");
                if (eVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    num2 = java.lang.Integer.valueOf(eVar.f305945c);
                } else {
                    num2 = null;
                }
                sb7.append(num2);
                com.tencent.mars.xlog.Log.i("WsFoldAdExposeStatistic", sb7.toString());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2113, j29 >= 1000 ? 2 : 3);
            }
        }
        bVar.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleValidExposureEnd", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
    }
}
