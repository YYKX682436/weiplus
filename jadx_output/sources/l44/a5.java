package l44;

/* loaded from: classes4.dex */
public abstract class a5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f316030a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f316031b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public static zy2.u9 f316032c;

    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.plugin.sns.storage.ADXml r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.a5.a(com.tencent.mm.plugin.sns.storage.ADXml, java.lang.String):void");
    }

    public static void b(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (aDInfo == null || a84.b0.b(aDInfo.adClickActionInfoList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            for (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo : aDInfo.adClickActionInfoList) {
                if (adClickActionInfo != null) {
                    i(adClickActionInfo.f162586i0, str);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r16, com.tencent.mm.plugin.sns.storage.ADXml r17, com.tencent.mm.plugin.sns.storage.SnsInfo r18, int r19) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.a5.c(android.content.Context, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.plugin.sns.storage.SnsInfo, int):void");
    }

    public static void d(android.content.Context context, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (aDInfo == null || a84.b0.b(aDInfo.adClickActionInfoList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        } else {
            for (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo : aDInfo.adClickActionInfoList) {
                if (adClickActionInfo != null) {
                    f(snsInfo, i17, context, adClickActionInfo);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadFinderInfo", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [d44.b, l44.y4] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        vd2.h5 a17;
        ?? r17 = "doCacheFinderLivingRoom";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i17);
        if (adInfo == null || !adInfo.preloadFinderLive) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.N0(str, str2, str3, str4)) {
            com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "doCacheFinderLivingRoom, username, liveId, feedExportId or feedNonceId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        java.lang.String m17 = l44.s4.m(snsInfo.getUxinfo(), T, i18);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("is_from_ad", java.lang.Boolean.TRUE);
        arrayMap.put("key_extra_info", m17);
        ?? y4Var = new l44.y4();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingRequest", "doPreloadFinderLivingRoom, liveId=" + str2 + ", username=" + str + ", snsId=" + T);
            a17 = d44.h.a();
        } catch (java.lang.Throwable th6) {
            th = th6;
            str5 = "doCacheFinderLivingRoom";
            r17 = 4;
            str6 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest";
            str7 = "doPreloadFinderLivingRoom";
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "the IFinderUtilApi is null in doPreloadFinderLivingRoom, is there something wrong in wechat??!!, snsId=" + T);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest");
            str5 = "doCacheFinderLivingRoom";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str2);
        try {
            if (E1 != 0) {
                str5 = "doCacheFinderLivingRoom";
                r17 = 4;
                str6 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest";
                str7 = "doPreloadFinderLivingRoom";
                ((vd2.t3) a17).d(context, str, E1, str3, str4, arrayMap, new d44.g(T, 4, y4Var), new d44.e(T, 4, y4Var));
            } else {
                str5 = "doCacheFinderLivingRoom";
                r17 = 4;
                str6 = "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest";
                str7 = "doPreloadFinderLivingRoom";
                com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "is the liveId not number in doPreloadFinderLivingRoom????, snsId=" + T + ", livingId=" + E1);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLivingRequest", "doPreloadFinderLivingRoom is failed! sns id = " + T + ", exp=" + th.toString());
            try {
                y4Var.a(T, r17, -1, null);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    public static void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.content.Context context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        e(snsInfo, i17, l44.s4.c(adClickActionInfo.f162569a), context, adClickActionInfo.finderUsername, adClickActionInfo.finderLiveId, adClickActionInfo.f162574c0, adClickActionInfo.f162576d0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCacheFinderLivingRoom", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    public static void g(java.lang.String str, int i17, ab4.d0 d0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (d0Var instanceof f54.h) {
            f54.h hVar = (f54.h) d0Var;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.f259722z1)) {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().preloadFinderFeeds(str, i17, hVar.f259722z1);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    public static void h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        java.util.List list = f316030a;
        if (list.contains(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "reqFinderFeedsObjectIds start, exportId is " + str);
        list.add(str);
        if (f316032c == null) {
            ((com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).getClass();
            com.tencent.mm.plugin.finder.service.b2 b2Var = new com.tencent.mm.plugin.finder.service.b2();
            f316032c = b2Var;
            b2Var.f126009b = new l44.z4();
        }
        ((com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).wi(42, str, true, null, new l44.t4());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        java.util.List list = f316030a;
        if (list.contains(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "onAddAppear req finderFeedsObjectIds start, exportId is " + str);
        list.add(str);
        ((com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).wi(42, str, true, str2, new l44.w4());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reqFinderFeedsObjectId", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
    }
}
