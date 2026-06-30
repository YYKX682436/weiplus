package kw2;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f313115a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f313116b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f313117c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public long f313118d;

    /* renamed from: e, reason: collision with root package name */
    public long f313119e;

    /* renamed from: f, reason: collision with root package name */
    public long f313120f;

    /* renamed from: g, reason: collision with root package name */
    public long f313121g;

    public static final void a(kw2.y yVar, java.lang.String str, kw2.h hVar, java.lang.String str2) {
        boolean z17;
        yVar.getClass();
        boolean z18 = hVar.f313019c;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313117c;
        if (z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<kw2.e> arrayList2 = hVar.f313022f;
            for (java.lang.Object obj : arrayList2) {
                kw2.e eVar = (kw2.e) obj;
                if (((int) eVar.f312955a) == 2 || !(z17 = eVar.B) || (z17 && eVar.C)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == arrayList2.size()) {
                concurrentHashMap.remove(str);
                com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_checkPlaySessionReport " + str2 + " size:" + arrayList.size());
                for (kw2.e eVar2 : arrayList2) {
                    if (((int) eVar2.f312955a) == 2 || !eVar2.B) {
                        eVar2.f312964j = 0L;
                        eVar2.f312965k = "";
                        eVar2.f312966l = "";
                    }
                    long j17 = eVar2.f312973s - eVar2.f312972r;
                    eVar2.f312970p = j17;
                    eVar2.f312969o = j17 - eVar2.P;
                    eVar2.f312971q = cu2.x.c(cu2.x.f222449a, str, false, false, false, 14, null).field_playCount;
                    eVar2.f312968n = eVar2.R.size() * 100;
                    yVar.f(eVar2, "checkPlaySessionReport#" + str2);
                }
            } else if (kotlin.jvm.internal.o.b(str2, "onPlayerStop")) {
                java.util.Iterator it = kz5.n0.q0(arrayList2, arrayList).iterator();
                while (it.hasNext()) {
                    com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PLAY_checkPlaySessionReport " + str2 + " come stop but item" + ((kw2.e) it.next()));
                }
            }
        }
        if (concurrentHashMap.size() > 200) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "checkIfDeleteSomeItem leak 200");
            concurrentHashMap.clear();
        }
    }

    public static final void b(kw2.y yVar, kw2.h hVar, kw2.e eVar, so2.i3 i3Var, long j17, long j18, boolean z17, kw2.f fVar, java.lang.String str) {
        yVar.getClass();
        eVar.f312975u = j17;
        eVar.f312973s = c01.id.a();
        eVar.A = z17;
        if (j18 > 0) {
            eVar.f312961g = j18;
            eVar.f312960f = j18 / 1000;
        }
        eVar.f312978x = c01.id.a();
        if (((int) eVar.f312955a) == 2 || !eVar.B) {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose#closeitem local play " + eVar.Q + "  " + str);
            kw2.e.V.d(eVar, i3Var);
            return;
        }
        if (eVar.C) {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose " + eVar.Q + ' ' + str + " return for stopDownloaderHit.");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PLAY_handleOnPlayItemClose " + eVar.Q + ' ' + str + " observer:" + fVar + '.');
        if (fVar != null) {
            fVar.a(new kw2.k(eVar, str, yVar, z17, hVar));
        }
    }

    public final void c(long j17) {
        this.f313118d += j17;
        com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkTotalSize finderTotalDownloadSize cdr " + com.tencent.mm.sdk.platformtools.j8.f192789t + ':' + e() + ':' + this.f313118d + ':' + this.f313119e + " percent:" + ((((float) this.f313119e) * 1.0f) / ((float) this.f313118d)) + " gap size:" + (this.f313118d - this.f313119e));
    }

    public final java.lang.String d(long j17) {
        return j17 == 1 ? "预下载" : j17 == 2 ? "本地播放" : j17 == 3 ? "边下边播" : j17 == 4 ? "本地预渲染" : j17 == 5 ? "在线预渲染" : "未知非法";
    }

    public final long e() {
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
        return com.tencent.mm.modelcdntran.l1.f71041y;
    }

    public final void f(kw2.e eVar, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.FinderVideoDownloadPlayStruct finderVideoDownloadPlayStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoDownloadPlayStruct();
        finderVideoDownloadPlayStruct.f57971d = eVar.f312955a;
        finderVideoDownloadPlayStruct.f57972e = eVar.f312956b;
        finderVideoDownloadPlayStruct.f57973f = eVar.f312957c;
        finderVideoDownloadPlayStruct.f57974g = eVar.f312958d;
        finderVideoDownloadPlayStruct.f57975h = finderVideoDownloadPlayStruct.b("FeedId", eVar.f312959e, true);
        finderVideoDownloadPlayStruct.f57976i = eVar.f312960f;
        finderVideoDownloadPlayStruct.f57977j = eVar.f312961g;
        finderVideoDownloadPlayStruct.f57978k = eVar.f312962h;
        finderVideoDownloadPlayStruct.f57979l = finderVideoDownloadPlayStruct.b("VideoFormat", eVar.f312963i, true);
        finderVideoDownloadPlayStruct.f57980m = eVar.f312964j;
        finderVideoDownloadPlayStruct.f57981n = finderVideoDownloadPlayStruct.b("DownloadStartTime", eVar.f312965k, true);
        finderVideoDownloadPlayStruct.f57982o = finderVideoDownloadPlayStruct.b("DownloadEndTime", eVar.f312966l, true);
        finderVideoDownloadPlayStruct.f57983p = eVar.f312967m;
        finderVideoDownloadPlayStruct.f57984q = eVar.f312968n;
        finderVideoDownloadPlayStruct.f57985r = eVar.f312969o;
        finderVideoDownloadPlayStruct.f57986s = eVar.f312970p;
        finderVideoDownloadPlayStruct.f57987t = eVar.f312971q;
        finderVideoDownloadPlayStruct.f57988u = finderVideoDownloadPlayStruct.b("PlayStartTime", java.lang.String.valueOf(eVar.f312972r), true);
        finderVideoDownloadPlayStruct.f57989v = finderVideoDownloadPlayStruct.b("PlayEndTime", java.lang.String.valueOf(eVar.f312973s), true);
        finderVideoDownloadPlayStruct.f57990w = eVar.f312974t;
        finderVideoDownloadPlayStruct.f57991x = eVar.f312975u;
        finderVideoDownloadPlayStruct.f57993z = com.tencent.mm.sdk.platformtools.j8.f192789t - this.f313121g;
        finderVideoDownloadPlayStruct.f57992y = e() - this.f313120f;
        finderVideoDownloadPlayStruct.A = finderVideoDownloadPlayStruct.b("NetConnInfo", eVar.T, true);
        finderVideoDownloadPlayStruct.C = finderVideoDownloadPlayStruct.b("ByPass", r26.i0.v(eVar.U, ",", ";", false, 4, null), true);
        this.f313120f = e();
        this.f313121g = com.tencent.mm.sdk.platformtools.j8.f192789t;
        finderVideoDownloadPlayStruct.k();
        if (eVar.f312955a == -1) {
            com.tencent.mars.xlog.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid actionType " + eVar);
        }
        if (eVar.f312956b == -1) {
            com.tencent.mars.xlog.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid downloadType " + eVar);
        }
        if (eVar.f312962h <= 0) {
            com.tencent.mars.xlog.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid fileSize:" + eVar.f312962h + ' ' + eVar);
        }
        if (eVar.f312964j < 0) {
            com.tencent.mars.xlog.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid downloadSize:" + eVar.f312964j + ' ' + eVar);
        }
        if (eVar.f312964j - eVar.f312962h > 1024) {
            com.tencent.mars.xlog.Log.e("FinderNetworkFlowReport", "FinderNetworkFlowReport.checkValidItem invalid gap size:" + (eVar.f312964j - eVar.f312962h) + ' ' + eVar);
        }
        this.f313119e += eVar.f312964j;
        com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "checkTotalSize finderTotalReportSize wcdr " + com.tencent.mm.sdk.platformtools.j8.f192789t + ':' + e() + ':' + this.f313118d + ':' + this.f313119e + " percent:" + ((((float) this.f313119e) * 1.0f) / ((float) this.f313118d)) + " gap size:" + (this.f313118d - this.f313119e));
        com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "FinderNetworkFlowReport.handleReport " + d(eVar.f312955a) + ' ' + eVar.f312979y + " ftpp:" + eVar.Q + " mediaId:" + eVar.f312976v + " recordMs:" + (eVar.f312978x - eVar.f312977w) + ' ' + str + ' ' + g() + " downloadReportData:" + eVar);
    }

    public final java.lang.String g() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f313117c;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((kw2.h) entry.getValue()).f313020d) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
            if (!((kw2.h) entry2.getValue()).f313020d) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return "T:" + concurrentHashMap.size() + " P:" + this.f313115a.size() + " R:" + this.f313116b.size() + " L:" + linkedHashMap.size() + " O:" + linkedHashMap2.size();
    }

    public final void h(java.lang.String mediaId, cs2.p pVar, so2.i3 cache) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(cache, "cache");
        if (pVar != null) {
            long j17 = pVar.f222089f2;
            ek4.b taskContext = pVar.f222087d2;
            kotlin.jvm.internal.o.g(taskContext, "taskContext");
            pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.v(j17, mediaId, taskContext, cache, this));
            return;
        }
        com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PRELOAD_startPreload mediaId:" + mediaId + " return for result is null  size:" + this.f313115a.size() + " list:");
    }

    public final void i(java.lang.String mediaId, dn.h hVar, java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        if (hVar != null) {
            pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.x(this, mediaId, invokeSource, hVar));
            return;
        }
        com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PRELOAD_stopPreload mediaId:" + mediaId + ' ' + invokeSource + " return for result is null  size:" + this.f313115a.size() + " list:");
    }
}
