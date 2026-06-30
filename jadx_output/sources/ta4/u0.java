package ta4;

/* loaded from: classes15.dex */
public final class u0 {

    /* renamed from: b */
    public static final boolean f416839b;

    /* renamed from: c */
    public static final boolean f416840c;

    /* renamed from: a */
    public static final ta4.u0 f416838a = new ta4.u0();

    /* renamed from: d */
    public static final java.util.concurrent.ConcurrentLinkedDeque f416841d = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: e */
    public static final java.lang.Object f416842e = new java.lang.Object();

    /* renamed from: f */
    public static final java.lang.Object f416843f = new java.lang.Object();

    /* renamed from: g */
    public static java.lang.String f416844g = "";

    /* renamed from: h */
    public static int f416845h = -1;

    static {
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        f416839b = dVar.fj(e42.d0.clicfg_sns_image_report_normal, false);
        f416840c = dVar.fj(e42.d0.clicfg_sns_image_report_control, true);
    }

    public static final void a(ta4.u0 u0Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = f416841d;
        if (concurrentLinkedDeque.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        } else {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int max = java.lang.Math.max(50, concurrentLinkedDeque.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "checkFlushReport, size:" + concurrentLinkedDeque.size() + ", limit:" + max);
            if (concurrentLinkedDeque.size() > max) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            }
            do {
                ta4.a aVar = (ta4.a) kz5.n0.Y(concurrentLinkedDeque);
                concurrentLinkedDeque.removeFirst();
                if (aVar != null) {
                    if (z17) {
                        u0Var.q(aVar, ta4.j.f416778p);
                    }
                    u0Var.n(aVar);
                }
            } while (concurrentLinkedDeque.size() > 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "checkFlushReport cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkFlushReport", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final ta4.a b(ta4.u0 u0Var, java.lang.String str) {
        ta4.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f416842e) {
            try {
                ta4.u0 u0Var2 = f416838a;
                aVar = null;
                if (u0Var2.i()) {
                    ta4.a l17 = u0Var2.l(str);
                    if (l17 == null) {
                        if (r26.n0.D(str, "_", false, 2, null)) {
                            java.util.Iterator it = r26.n0.f0(str, new java.lang.String[]{"_"}, false, 0, 6, null).iterator();
                            if (it.hasNext()) {
                                aVar = u0Var2.l((java.lang.String) it.next());
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                        aVar = l17;
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkReportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return aVar;
    }

    public static final void c(ta4.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f416843f) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "endSession:" + f416844g);
                f416844g = "";
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$endSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final /* synthetic */ java.lang.Object d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataListLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.lang.Object obj = f416842e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataListLock$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return obj;
    }

    public static final /* synthetic */ java.util.concurrent.ConcurrentLinkedDeque e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReportDataList$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = f416841d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReportDataList$p", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return concurrentLinkedDeque;
    }

    public static final /* synthetic */ void f(ta4.u0 u0Var, ta4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.n(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final /* synthetic */ void g(ta4.u0 u0Var, ta4.a aVar, ta4.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        u0Var.q(aVar, jVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void h(java.lang.String mediaId, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callbackToUI", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.x(mediaId, i17, i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callbackToUI", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void j(java.lang.String mediaId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.c0(mediaId, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void m(java.lang.String mediaId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadHitCache", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.g0(mediaId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadHitCache", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void o(java.lang.String mediaId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "showBitmapSuccess media:".concat(mediaId));
        pm0.v.O("SnsImageLoadReporter", new ta4.p0(mediaId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public static final void p(java.lang.String str, java.lang.String mediaId, int i17, java.lang.String fromScene, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        pm0.v.O("SnsImageLoadReporter", new ta4.s0(mediaId, i17, fromScene, z17, str, z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }

    public final boolean i() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        synchronized (f416843f) {
            try {
                z17 = f416844g.length() > 0;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSessionValid", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return z17;
    }

    public final java.lang.String k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return "";
        }
        if (str.length() <= 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r26.p0.A0(str));
        sb6.append('*');
        sb6.append(str.length());
        sb6.append('*');
        sb6.append(r26.p0.D0(str));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("encryptContent", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return sb7;
    }

    public final ta4.a l(java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        java.util.Iterator it = f416841d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((ta4.a) obj).a(), str)) {
                break;
            }
        }
        ta4.a aVar = (ta4.a) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r4 == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(ta4.a r15) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta4.u0.n(ta4.a):void");
    }

    public final void q(ta4.a aVar, ta4.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        if (aVar.b() != jVar) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
            long j17 = aVar.f416717o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartLoadTick", "com.tencent.mm.plugin.sns.report.Data");
            long j18 = elapsedRealtime - j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStage", "com.tencent.mm.plugin.sns.report.Data");
            kotlin.jvm.internal.o.g(jVar, "<set-?>");
            aVar.f416707e = jVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStage", "com.tencent.mm.plugin.sns.report.Data");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStageCost", "com.tencent.mm.plugin.sns.report.Data");
            org.json.JSONObject jSONObject = aVar.f416710h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStageCost", "com.tencent.mm.plugin.sns.report.Data");
            jSONObject.put(jVar.toString(), j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "media:" + aVar.a() + " updateStageCost:" + jVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateStageCost", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
    }
}
