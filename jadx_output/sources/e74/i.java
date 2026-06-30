package e74;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static volatile e74.i f249965b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseLongArray f249966c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f249967a = new android.util.ArrayMap();

    static {
        android.util.SparseLongArray sparseLongArray = new android.util.SparseLongArray();
        f249966c = sparseLongArray;
        sparseLongArray.append(1, 1800000L);
        sparseLongArray.append(2, 300000L);
        sparseLongArray.append(com.tencent.thumbplayer.core.common.TPGeneralError.FAILED, 5000L);
        sparseLongArray.append(1000003, 60000L);
        sparseLongArray.append(3, 3600000L);
        sparseLongArray.append(10, 60000L);
        sparseLongArray.append(13, 60000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(e74.i r12, com.tencent.mm.plugin.sns.storage.SnsInfo r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e74.i.a(e74.i, com.tencent.mm.plugin.sns.storage.SnsInfo, int, boolean):void");
    }

    public static void b(e74.i iVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17) {
        r45.a3[] a3VarArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        iVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpdateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        java.lang.String T = ca4.z0.T(snsInfo);
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        if (i17 == 2) {
            adInfo = snsInfo.getAtAdInfo();
        }
        java.lang.String str = adInfo != null ? adInfo.uxInfo : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeAdDynamicFeedUpdateInfoRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
        if (snsInfo.needDynamicViewUpdate()) {
            s34.l lVar = snsInfo.getAdXml().adDynamicFeedUpdateInfo;
            lVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            java.lang.String str2 = lVar.f402698a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberRequestParams", "com.tencent.mm.plugin.sns.ad.adxml.AdDynamicFeedUpdateInfo");
            r45.a3[] a3VarArr2 = new r45.a3[1];
            com.tencent.mars.xlog.Log.i("AdDynamicUpdateItemHelper", "makeAdDynamicFeedUpdateInfoRequestParams, snsId=" + ca4.z0.t0(snsInfo.field_snsId) + ", numberRequestParams=" + str2);
            try {
                r45.a3 a3Var = new r45.a3();
                a3Var.f369690d = 13;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt("numberRequestParams", str2);
                a3Var.f369691e = jSONObject.toString();
                a3VarArr2[0] = a3Var;
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeAdDynamicFeedUpdateInfoRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
            a3VarArr = a3VarArr2;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeAdDynamicFeedUpdateInfoRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
            a3VarArr = null;
        }
        r45.a3[] e17 = iVar.e(T, a3VarArr, z17);
        if (a84.b0.d(e17)) {
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpdateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, snsId=" + T);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 10);
            new k64.r(T, str, e17).K(new e74.e(iVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpdateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public static e74.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (f249965b == null) {
            synchronized (e74.i.class) {
                try {
                    if (f249965b == null) {
                        f249965b = new e74.i();
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    throw th6;
                }
            }
        }
        e74.i iVar = f249965b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return iVar;
    }

    public void c(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doForceLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        try {
            h(i17, snsInfo, false);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doForceLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public void d(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        try {
            h(i17, snsInfo, true);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLivingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public final r45.a3[] e(java.lang.String str, r45.a3[] a3VarArr, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterRequestParams", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (a3VarArr == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterRequestParams", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (r45.a3 a3Var : a3VarArr) {
            if (a3Var != null) {
                int i17 = a3Var.f369690d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                boolean g17 = g(str, i17, null, z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                if (g17) {
                    linkedList.add(a3Var);
                }
            }
        }
        r45.a3[] a3VarArr2 = (r45.a3[]) linkedList.toArray(new r45.a3[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterRequestParams", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return a3VarArr2;
    }

    public final boolean g(java.lang.String str, int i17, s34.n nVar, boolean z17) {
        e74.k kVar;
        long j17;
        long j18;
        android.util.SparseArray sparseArray;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        java.util.Map map = this.f249967a;
        android.util.SparseArray sparseArray2 = (android.util.SparseArray) ((android.util.ArrayMap) map).get(str);
        if (sparseArray2 == null) {
            sparseArray2 = new android.util.SparseArray();
            ((android.util.ArrayMap) map).put(str, sparseArray2);
        }
        android.util.SparseArray sparseArray3 = sparseArray2;
        s34.m mVar = null;
        boolean z18 = true;
        if (z17) {
            kVar = (e74.k) sparseArray3.get(i17);
            if (kVar != null) {
                if (a84.f0.b() - kVar.f249968a < kVar.f249969b) {
                    z18 = false;
                }
            }
        } else {
            kVar = null;
        }
        boolean z19 = z18;
        if (z19) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("keepRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            if (nVar != null && (sparseArray = nVar.f402717a) != null) {
                mVar = (s34.m) sparseArray.get(i17);
            }
            long b17 = a84.f0.b();
            if (kVar == null) {
                long j19 = f249966c.get(i17, 5000L);
                if (mVar != null) {
                    j17 = j19;
                    long j27 = mVar.f402707b;
                    if (j27 > 5000) {
                        j18 = j27;
                        kVar = new e74.k(b17, j18, i17);
                    }
                } else {
                    j17 = j19;
                }
                j18 = j17;
                kVar = new e74.k(b17, j18, i17);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLastRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.RequestTime");
                kVar.f249968a = b17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLastRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.RequestTime");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keepRequestTime", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            sparseArray3.put(i17, kVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        return z19;
    }

    public final void h(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("livingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("livingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return;
        }
        if (snsInfo.getAdXml().adLiveInfo != null) {
            int i18 = snsInfo.getAdXml().adLiveInfo.f402745a;
            r45.a3[] a3VarArr = null;
            if (i18 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWeAppLivingRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                java.lang.String T = ca4.z0.T(snsInfo);
                com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
                if (i17 == 2) {
                    adInfo = snsInfo.getAtAdInfo();
                }
                java.lang.String str = adInfo != null ? adInfo.uxInfo : "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeWeAppLivingRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
                if (snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeWeAppLivingRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
                } else {
                    s34.r0 r0Var = snsInfo.getAdXml().adLiveInfo;
                    if (r0Var.f402745a == 0) {
                        a3VarArr = new r45.a3[1];
                        try {
                            r45.a3 a3Var = new r45.a3();
                            a3Var.f369690d = 2;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.putOpt("liveParams", r0Var.f402746b);
                            a3Var.f369691e = jSONObject.toString();
                            a3VarArr[0] = a3Var;
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeWeAppLivingRequestParams", "com.tencent.mm.plugin.sns.ad.widget.living.AdDynamicUpdateItemHelper");
                }
                r45.a3[] e17 = e(T, a3VarArr, z17);
                if (a84.b0.g(e17)) {
                    new k64.r(T, str, e17).K(new e74.a(this));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWeAppLivingRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            } else if (i18 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = snsInfo.getAdXml().adCardActionBtnInfo != null ? snsInfo.getAdXml().adCardActionBtnInfo.clickActionInfo : null;
                if (adClickActionInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                } else {
                    java.lang.String T2 = ca4.z0.T(snsInfo);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    boolean g17 = g(T2, com.tencent.thumbplayer.core.common.TPGeneralError.FAILED, null, z17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    if (g17) {
                        d44.h.c(T2, adClickActionInfo.finderUsername, adClickActionInfo.X, new e74.f(this));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    } else {
                        com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "requestFinderLivingNoticeState: is the time not expired??");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingNoticeState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                    }
                }
            } else if (i18 == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                s34.r0 r0Var2 = snsInfo.getAdXml().adLiveInfo;
                i(ca4.z0.T(snsInfo), r0Var2.f402747c, r0Var2.f402748d, z17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            }
        } else if (snsInfo.getAdXml().adHeadLivingInfo != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestFinderLivingStateByAdHeadLivingInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            s34.n0 n0Var = snsInfo.getAdXml().adHeadLivingInfo;
            java.lang.String T3 = ca4.z0.T(snsInfo);
            n0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderLiveId", "com.tencent.mm.plugin.sns.ad.adxml.AdHeadLivingInfo");
            i(T3, n0Var.f402718a, n0Var.f402719b, z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingStateByAdHeadLivingInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("livingStatusRequest", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public final void i(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        boolean g17 = g(str, 1000003, null, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (g17) {
            d44.h.d(str, str2, str3, new e74.g(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "requestFinderLivingState: is the time not expired??");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFinderLivingState", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
    }

    public void j(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (snsInfo == null || !snsInfo.needDynamicViewUpdate()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "--updateDynamicFeedInfo, snsId=" + T + ", src=" + i17);
        ((ku5.t0) ku5.t0.f312615d).g(new e74.d(this, snsInfo, i17, z17, T));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDynamicFeedInfo", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
    }

    public void k(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (!i64.y.i(snsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
            return;
        }
        boolean z18 = ca4.m0.u0(e42.c0.clicfg_ad_enable_update_living_product, 1) > 0;
        java.lang.String T = ca4.z0.T(snsInfo);
        com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "--updateAdFinderLivingProduct, snsId=" + T + ", src=" + i17 + ", careTime=" + z17 + ", isEnableUpdate=" + z18);
        if (!z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new e74.b(this, snsInfo, i17, z17, T));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFinderLivingProduct", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
    }
}
