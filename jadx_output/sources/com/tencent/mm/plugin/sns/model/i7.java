package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i7 implements t21.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f164309b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f164310c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f164311d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f164312e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f164313f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f164314g = 6;

    /* renamed from: h, reason: collision with root package name */
    public boolean f164315h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f164316i = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.sns.model.z7 f164308a = null;

    public i7() {
        this.f164309b = null;
        this.f164310c = null;
        this.f164311d = null;
        this.f164309b = new java.util.LinkedList();
        this.f164310c = new java.util.concurrent.ConcurrentHashMap();
        this.f164311d = new java.util.LinkedList();
    }

    public static /* synthetic */ java.util.LinkedList b(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.LinkedList linkedList = i7Var.f164312e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    public static /* synthetic */ java.util.LinkedList c(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.LinkedList linkedList = i7Var.f164309b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    public static void d(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (i7Var.f164312e) {
            try {
                boolean d17 = n74.l0.d();
                java.util.Iterator it = i7Var.f164312e.iterator();
                while (it.hasNext()) {
                    t21.v0 v0Var = (t21.v0) it.next();
                    if (v0Var.f414993q != 1) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(v0Var.f414980d);
                        if (k17 != null) {
                            java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(k17.getLocalid(), (r45.jj4) k17.getTimeLine().ContentObj.f369840h.get(0));
                            if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_RESUME resume preload sns:[%s]", v0Var.f414980d);
                                if (v0Var.b(i7Var) < 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]", java.lang.Integer.valueOf(i7Var.hashCode()));
                                    it.remove();
                                }
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_RESUME sns:[%s] , video[%s] already download finish, do nothing.", k17.getLocalid(), i17);
                                it.remove();
                            }
                        }
                    } else if (!d17) {
                        r45.jj4 p17 = i7Var.p(v0Var);
                        if (p17 == null) {
                            it.remove();
                            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload, findMediaFromMultiVideoAd is null");
                        } else {
                            java.lang.String str = v0Var.f414980d;
                            java.lang.String i18 = com.tencent.mm.plugin.sns.model.y6.i(str, p17);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
                                java.lang.Object[] objArr = new java.lang.Object[3];
                                objArr[0] = str;
                                objArr[1] = v0Var.f414981e;
                                dn.o oVar = v0Var.f414984h;
                                objArr[2] = oVar != null ? oVar.f241814b2 : "";
                                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload resume preload sns fakeLocalId: [%s], cdnMediaId: [%s], mediaId: [%s]", objArr);
                                if (v0Var.b(i7Var) < 0) {
                                    com.tencent.mars.xlog.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload current preload task do scene error. hash: [%d]", java.lang.Integer.valueOf(i7Var.hashCode()));
                                    it.remove();
                                }
                            } else {
                                com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload sns fakeLocalId: [%s], video [%s] already download finish, do nothing.", str, i18);
                                it.remove();
                            }
                        }
                    }
                }
                for (int size = i7Var.f164312e.size(); size < i7Var.f164313f; size++) {
                    i7Var.v();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public static boolean e(com.tencent.mm.plugin.sns.model.i7 i7Var, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.pointers.PBool pBool2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z17 = false;
        pBool.value = false;
        pBool2.value = false;
        synchronized (i7Var.f164311d) {
            try {
                if (a84.b0.b(i7Var.f164311d)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    java.util.Iterator it = i7Var.f164311d.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                        if (q74.t0.f(snsInfo)) {
                            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "checkPreloadListHasSlideCardAd: preloadList has slideFullCardAd");
                            z17 = true;
                        } else if (snsInfo != null && snsInfo.isLookbookCardAd()) {
                            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "checkPreloadListHasSlideCardAd: preloadList has lookbookAd");
                            pBool.value = true;
                        } else if (snsInfo != null && snsInfo.isFlipCardAd()) {
                            com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "checkPreloadListHasSlideCardAd: preloadList has flipCardAd");
                            pBool2.value = true;
                        }
                        if (z17 && pBool.value && pBool2.value) {
                            break;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadListHasMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z17;
    }

    public static /* synthetic */ java.util.LinkedList f(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        java.util.LinkedList linkedList = i7Var.f164311d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    public static boolean g(com.tencent.mm.plugin.sns.model.i7 i7Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PString pString) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z17 = true;
        if (snsInfo != null) {
            if (snsInfo.isAd()) {
                pBool.value = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (t21.o2.Ni().d(false)) {
                pBool.value = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else {
                com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo);
                if (f17.PreDownloadInfo == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                    pBool.value = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    int i17 = ma4.a.f325223g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    if (i17 <= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", java.lang.Integer.valueOf(i7Var.hashCode()));
                        pBool.value = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    } else {
                        pString.value = ca4.z0.t0(f17.Id);
                        pInt.value = i17;
                        if (ma4.a.a()) {
                            pBool.value = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD enableTimelinePreload [false]");
                            pBool.value = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return z17;
        }
        pBool.value = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        z17 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z17;
    }

    public static boolean h(com.tencent.mm.plugin.sns.model.i7 i7Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.pointers.PBool pBool, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PString pString) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z17 = true;
        if (snsInfo != null) {
            if (snsInfo.isAd()) {
                pBool.value = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (com.tencent.mm.sdk.platformtools.t8.H1(snsInfo.getCreateTime()) >= 86400) {
                pBool.value = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (t21.o2.Ni().d(false)) {
                pBool.value = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else {
                com.tencent.mm.protocal.protobuf.SnsObject f17 = com.tencent.mm.plugin.sns.model.s5.f(snsInfo);
                if (f17.PreDownloadInfo == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                    pBool.value = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "%d check sns video[%s] preload [%d %d %s]", java.lang.Integer.valueOf(i7Var.hashCode()), snsInfo.getLocalid(), java.lang.Integer.valueOf(f17.PreDownloadInfo.f378575d), java.lang.Integer.valueOf(f17.PreDownloadInfo.f378576e), f17.PreDownloadInfo.f378577f);
                    if (f17.PreDownloadInfo.f378575d <= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", java.lang.Integer.valueOf(i7Var.hashCode()));
                        pBool.value = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    } else {
                        pString.value = ca4.z0.t0(f17.Id);
                        r45.kb5 kb5Var = f17.PreDownloadInfo;
                        pInt.value = kb5Var.f378575d;
                        if (d11.b.a(kb5Var.f378577f)) {
                            pBool.value = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        } else {
                            if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                i17 = f17.PreDownloadInfo.f378576e & 1;
                            } else if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                i17 = f17.PreDownloadInfo.f378576e & 2;
                            } else if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                                i17 = f17.PreDownloadInfo.f378576e & 4;
                            } else {
                                pBool.value = false;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            }
                            if (i17 > 0) {
                                pBool.value = false;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            } else {
                                pBool.value = false;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            }
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return z17;
        }
        pBool.value = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        z17 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dn.o i(com.tencent.mm.plugin.sns.model.i7 r28, com.tencent.mm.plugin.sns.storage.SnsInfo r29, com.tencent.mm.pointers.PInt r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i7.i(com.tencent.mm.plugin.sns.model.i7, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.pointers.PInt, java.lang.String):dn.o");
    }

    /* JADX WARN: Finally extract failed */
    public static void j(com.tencent.mm.plugin.sns.model.i7 i7Var, java.lang.String str, java.util.List list, com.tencent.mm.pointers.PInt pInt) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        i7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadAdVideos", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        for (int i17 = 0; i17 < list.size(); i17++) {
            dn.o oVar = (dn.o) list.get(i17);
            if (oVar != null) {
                java.lang.String e17 = ca4.m0.e(str, oVar.f241814b2 + "_");
                t21.v0 v0Var = new t21.v0(oVar, e17);
                v0Var.f414991o = i7Var.f164316i;
                v0Var.f414993q = 1;
                if (v0Var.b(i7Var) < 0) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i7Var.hashCode());
                    dn.o oVar2 = v0Var.f414984h;
                    com.tencent.mars.xlog.Log.w("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload, curr preload task do scene error. hash: [%d], localId: [%s], fakeLocalId: [%s], mediaId: [%s], cdnMediaId: [%s]", valueOf, str, e17, oVar2 != null ? oVar2.f241814b2 : "", v0Var.f414981e);
                } else {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(pInt.value);
                    dn.o oVar3 = v0Var.f414984h;
                    com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload, sns:[%s] start to preload, pPreloadPercent: %d, localId: [%s], fakeLocalId: [%s], mediaId: [%s], cdnMediaId: [%s] [success to preload]", e17, valueOf2, str, e17, oVar3 != null ? oVar3.f241814b2 : "", v0Var.f414981e);
                    v0Var.f414990n = java.lang.System.currentTimeMillis();
                    synchronized (i7Var.f164312e) {
                        try {
                            i7Var.f164312e.add(i17, v0Var);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadAdVideos", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            throw th6;
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadAdVideos", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public static byte[] q(r45.jj4 jj4Var) {
        r45.g96 g96Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (jj4Var == null || (g96Var = jj4Var.H1) == null || android.text.TextUtils.isEmpty(g96Var.f375028e)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        try {
            r45.t76 t76Var = new r45.t76();
            t76Var.f386202d = jj4Var.H1.f375028e;
            byte[] byteArray = t76Var.toByteArray();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return byteArray;
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoService", "set getSnsVideoCtxBuffer error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoCtxBuffer", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
    }

    public static java.lang.String r(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "mediaObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return "";
        }
        java.util.LinkedList linkedList = jj4Var.T;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.jz6 jz6Var = (r45.jz6) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "rule type:%s value:%s", jz6Var.f378234d, jz6Var.f378235e);
        }
        if (linkedList.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return "";
        }
        r45.jz6 jz6Var2 = (r45.jz6) linkedList.get(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "select rule type:%s value:%s", jz6Var2.f378234d, jz6Var2.f378235e);
        java.lang.String str = jz6Var2.f378235e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return str;
    }

    @Override // t21.u0
    public void a(t21.v0 v0Var, boolean z17, int i17, int i18) {
        t21.v2 v2Var;
        t21.v0 v0Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoService", "%d on preload finish but scene is null?", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        synchronized (this.f164312e) {
            try {
                java.util.Iterator it = this.f164312e.iterator();
                while (true) {
                    v2Var = null;
                    if (!it.hasNext()) {
                        v0Var2 = null;
                        break;
                    } else if (v0Var == ((t21.v0) it.next())) {
                        v0Var2 = v0Var;
                        break;
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        if (v0Var2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoService", "%d on preload finish, but scene callback not same object.", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        java.lang.String str = v0Var.f414984h.X1;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "onPreloadFinish snsLocalId:%s media id:%s videoFlag:%s", v0Var.f414980d, v0Var.f414981e, str);
        java.lang.String str2 = v0Var.f414980d;
        java.lang.String str3 = v0Var.f414981e;
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.sns.model.y6.f164773a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        } else if (android.text.TextUtils.isEmpty(str)) {
            v2Var = com.tencent.mm.plugin.sns.model.y6.j(str2, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
        } else {
            java.lang.String f17 = com.tencent.mm.plugin.sns.model.y6.f(str2, str3, str, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            t21.v2 h17 = t21.d3.h(f17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoByFileName", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
            v2Var = h17;
        }
        if (v2Var != null) {
            v2Var.f415008f = i18;
            t21.d3.Q(v2Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_DONE  preload video[%s] finish success[%b] range[%d, %d]  hash:[%d]", v0Var.c(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hashCode()));
        cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.d7(this, v0Var2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public boolean k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD null snsInfo . [fail in queue]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineMaxParallelInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i17 = ma4.a.f325218b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineMaxParallelInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        this.f164313f = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineMaxPreloadInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i18 = ma4.a.f325217a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineMaxPreloadInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        this.f164314g = i18;
        synchronized (this.f164311d) {
            try {
                if (this.f164311d.size() >= this.f164314g && !snsInfo.isAd()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD sns:[%s] full stack .[fail in queue], and the sns info is not ad.", snsInfo.getLocalid());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    return false;
                }
                this.f164311d.add(snsInfo);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD hash(%d) sns:[%s] add preload video  [success in queue]", java.lang.Integer.valueOf(hashCode()), snsInfo.getLocalid());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                return true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r2 == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.tencent.mm.plugin.sns.storage.SnsInfo r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i7.l(com.tencent.mm.plugin.sns.storage.SnsInfo, boolean):void");
    }

    public boolean m(r45.jj4 jj4Var, int i17, java.lang.String str, boolean z17, boolean z18, int i18, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsVideoService", "addSnsVideoTask snsLocalId:%s mediaId:%s", str, str2);
        if (jj4Var.f377859h == 2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_timeline_jump_downloading_task, true);
        com.tencent.mm.plugin.sns.model.z7 z7Var = this.f164308a;
        if (fj6 && z7Var != null && !android.text.TextUtils.isEmpty(z7Var.f164813b) && !android.text.TextUtils.isEmpty(z7Var.f164817f) && z7Var.f164817f.equals(str) && z7Var.f164813b.equals(str2) && z17 == z7Var.f164814c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoService", "[%s]task is downloading now.", str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return true;
        }
        com.tencent.mm.plugin.sns.model.z7 z7Var2 = new com.tencent.mm.plugin.sns.model.z7();
        z7Var2.f164813b = com.tencent.mm.plugin.sns.model.y6.c(i17, jj4Var);
        z7Var2.f164815d = jj4Var;
        z7Var2.f164816e = i17;
        z7Var2.f164817f = str;
        z7Var2.f164814c = z17 ? 1 : 0;
        z7Var2.f164818g = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("offerQueue", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.f7(this, z7Var2, z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerQueue", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (z18) {
            w();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    public void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        this.f164308a = null;
        synchronized (this.f164312e) {
            try {
                this.f164312e.clear();
            } finally {
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f164310c).clear();
        this.f164309b.clear();
        synchronized (this.f164311d) {
            try {
                this.f164311d.clear();
            } finally {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (this.f164311d) {
            try {
                this.f164311d.clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public final r45.jj4 p(t21.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        r45.jj4 jj4Var = null;
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, current is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        dn.o oVar = v0Var.f414984h;
        java.lang.String str = oVar != null ? oVar.f241814b2 : "";
        java.lang.String str2 = v0Var.f414980d;
        java.lang.String k17 = ca4.m0.k(str2, str + "_");
        com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, localId is " + k17 + ", current resume preload fakeLocalId is " + str2 + ", current resume preload mediaId is " + str + ", cdnMediaId is " + v0Var.f414981e);
        com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(k17);
        if (k18 == null) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, snsInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        if (q74.t0.f(k18) && k18.getAdXml().adSliderFullCardInfo != null) {
            java.util.List<s34.x0> list = k18.getAdXml().adSliderFullCardInfo.resInfoList;
            if (a84.b0.b(list)) {
                com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, adSlideFullCardItemInfoList is null or empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                return null;
            }
            java.util.Iterator<s34.x0> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s34.x0 next = it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.N0(str, next.f402828e.f377855d) && com.tencent.mm.sdk.platformtools.t8.D0(str, next.f402828e.f377855d)) {
                    jj4Var = next.f402828e;
                    break;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return jj4Var;
        }
        if (k18.isLookbookCardAd()) {
            com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, getLookbookAdMediaById, mediaId=" + str);
            r45.jj4 f17 = n74.m0.f(k18, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return f17;
        }
        if (!k18.isFlipCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        com.tencent.mars.xlog.Log.e("SlideFullCard.MicroMsg.SnsVideoService", "findMediaFromMultiVideoAd, getFlipCardMediaById, mediaId=" + str);
        r45.jj4 e17 = n74.m0.e(k18, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findMediaFromMultiVideoAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return e17;
    }

    public boolean s(r45.jj4 jj4Var, int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mm.plugin.sns.model.z7 z7Var = this.f164308a;
        if (z7Var != null && !android.text.TextUtils.isEmpty(z7Var.f164817f) && z7Var.f164817f.equals(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return true;
        }
        java.lang.String c17 = com.tencent.mm.plugin.sns.model.y6.c(i17, jj4Var);
        if (android.text.TextUtils.isEmpty(c17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        boolean containsKey = ((java.util.concurrent.ConcurrentHashMap) this.f164310c).containsKey(c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return containsKey;
    }

    public void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public boolean u(java.lang.String str, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.e7(this, str, objArr));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    public final synchronized void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD preload size:%d  queue size:%d", java.lang.Integer.valueOf(this.f164312e.size()), java.lang.Integer.valueOf(this.f164311d.size()));
        cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.c7(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    public void w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        cp.e.b("SnsVideoService", new com.tencent.mm.plugin.sns.model.g7(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }
}
