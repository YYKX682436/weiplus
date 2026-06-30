package l44;

/* loaded from: classes4.dex */
public abstract class o4 {
    public static java.util.List a(java.util.List list) {
        java.util.List d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.w("ConsecutiveAdDataImproveHelper", "deleteConsecutiveAd, cursor==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        if (f()) {
            d17 = c(list);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            d17 = d(list);
        }
        if (a84.b0.b(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return list;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (a84.b0.b(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                long j17 = ((l44.n4) it.next()).f316277b;
                if (j17 != 0) {
                    com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "delete sns id " + ca4.z0.t0(j17));
                    hashSet.add(java.lang.Long.valueOf(j17));
                    a84.n.d(j17);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1907, 11);
                    i64.u1.b(22, 1, 105);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                xc4.p pVar = (xc4.p) it6.next();
                if (!pVar.isAd() || !hashSet.contains(java.lang.Long.valueOf(pVar.y0()))) {
                    arrayList.add(pVar);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            list = arrayList;
        }
        i64.u1.a(20, d17.size());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1612L, 30L, d17.size());
        a84.t0.a(new l44.l4(d17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return list;
    }

    public static java.util.List b(java.util.List list) {
        java.util.List d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.w("ConsecutiveAdDataImproveHelper", "deleteConsecutiveAd, cursor==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        if (f()) {
            d17 = c(list);
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            d17 = d(list);
        }
        if (a84.b0.b(d17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            long j17 = ((l44.n4) it.next()).f316277b;
            if (j17 != 0) {
                com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "delete sns id " + ca4.z0.t0(j17));
                arrayList.add(java.lang.Long.valueOf(j17));
                a84.n.d(j17);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1907, 11);
                i64.u1.b(22, 1, 100);
            }
        }
        i64.u1.a(20, d17.size());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1612L, 30L, d17.size());
        a84.t0.a(new l44.l4(d17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    public static java.util.List c(java.util.List list) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        try {
            if (a84.b0.b(list)) {
                java.util.List list2 = java.util.Collections.EMPTY_LIST;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
                return list2;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdFeedGap", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            int u07 = ca4.m0.u0(e42.c0.clicfg_timeline_ad_session_min_gap, 1);
            com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "ad session min gap = " + u07);
            int max = java.lang.Math.max(u07, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdFeedGap", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            int i18 = 0;
            if (g()) {
                i17 = 0;
                while (i17 < list.size()) {
                    xc4.p pVar = (xc4.p) list.get(i17);
                    if (!pVar.isAd()) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.storage.SnsInfo c17 = pVar.c1();
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = c17.getAdSnsInfo();
                    if (adSnsInfo == null) {
                        com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, current adSnsInfo is null");
                        ca4.e0.a("ad_pull_session", "curAdSnsInfo is null", i18, i18, ca4.z0.t0(c17.field_snsId));
                    } else {
                        com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "delete first ad, snsId = " + ca4.z0.t0(c17.field_snsId));
                        arrayList.add(new l44.n4(adSnsInfo, 9, 29));
                    }
                    i17++;
                    i18 = 0;
                }
            } else {
                i17 = 0;
            }
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo2 = null;
            int i19 = 0;
            while (i17 < list.size()) {
                xc4.p pVar2 = (xc4.p) list.get(i17);
                if (pVar2.isAd()) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo c18 = pVar2.c1();
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo3 = c18.getAdSnsInfo();
                    if (adSnsInfo3 == null) {
                        com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, current adSnsInfo is null");
                        ca4.e0.a("ad_pull_session", "curAdSnsInfo is null", 0, 0, ca4.z0.t0(c18.field_snsId));
                    } else {
                        if (adSnsInfo2 != null && i19 < max) {
                            int i27 = adSnsInfo3.getAdXml().adPriority;
                            int i28 = adSnsInfo2.getAdXml().adPriority;
                            if (i27 > i28) {
                                arrayList.add(new l44.n4(adSnsInfo2, 8, 26));
                            } else if (i27 < i28) {
                                arrayList.add(new l44.n4(adSnsInfo3, 8, 26));
                            } else if (adSnsInfo3.field_createAdTime < adSnsInfo2.field_createAdTime) {
                                arrayList.add(new l44.n4(adSnsInfo3, 8, 27));
                            } else {
                                arrayList.add(new l44.n4(adSnsInfo2, 8, 27));
                            }
                        }
                        adSnsInfo2 = adSnsInfo3;
                        i19 = 0;
                    }
                } else {
                    i19++;
                }
                i17++;
            }
            if (h()) {
                xc4.p pVar3 = (xc4.p) list.get(list.size() - 1);
                if (pVar3.isAd()) {
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo4 = pVar3.c1().getAdSnsInfo();
                    if (adSnsInfo4 != null) {
                        com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "delete last ad, snsId = " + ca4.z0.t0(adSnsInfo4.field_snsId));
                        arrayList.add(new l44.n4(pVar3.c1().getAdSnsInfo(), 9, 28));
                    } else {
                        com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, current adSnsInfo is null");
                        ca4.e0.a("ad_pull_session", "curAdSnsInfo is null", 0, 0, ca4.z0.t0(pVar3.c1().field_snsId));
                    }
                }
            }
            j(arrayList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByPriority, exp=" + th6.toString());
            ca4.q.c("filterConsecutiveAdByPriority error", th6);
            java.util.List list3 = java.util.Collections.EMPTY_LIST;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return list3;
        }
    }

    public static java.util.List d(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                xc4.p pVar = (xc4.p) list.get(i18);
                long y07 = pVar.y0();
                if (pVar.isAd()) {
                    arrayList.add(new l44.m4(i17, y07));
                }
                i17++;
            }
            if (arrayList.size() < 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
                return null;
            }
            java.util.List e17 = e(arrayList);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "filterConsecutiveAdByTime, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterConsecutiveAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
    }

    public static java.util.List e(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l44.m4 m4Var = null;
        for (int i17 = 0; i17 < list.size(); i17++) {
            l44.m4 m4Var2 = (l44.m4) list.get(i17);
            com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(m4Var2.f316265b);
            long j17 = m4Var2.f316265b;
            java.lang.String t07 = ca4.z0.t0(j17);
            if (y07 != null) {
                m4Var2.f316266c = y07.field_createAdTime;
            } else {
                com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "getDelAdByTime, no ad, snsId=" + t07);
            }
            com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "getDelAdByTime, snsId=" + t07 + ", idx=" + m4Var2.f316264a + ", time=" + m4Var2.f316266c);
            if (m4Var != null && m4Var2.f316264a - m4Var.f316264a == 1) {
                if (m4Var2.f316266c > m4Var.f316266c) {
                    arrayList.add(new l44.n4(0L, m4Var.f316265b));
                } else {
                    arrayList.add(new l44.n4(0L, j17));
                    m4Var.f316264a = m4Var2.f316264a;
                }
            }
            m4Var = m4Var2;
        }
        com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "getDelAdByTime, cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", adCount=" + list.size() + ", delCount=" + arrayList.size());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return arrayList;
    }

    public static boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDelConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        boolean z17 = false;
        if (ca4.m0.u0(e42.c0.clicfg_ad_disable_delete_consecutive_ad_by_priority, 0) == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
            boolean O6 = r44.f.O6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnablePullSession", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            if (O6) {
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2097, 25);
        }
        com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "isDelConsecutiveAdByPriority = " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelConsecutiveAdByPriority", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r7 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g() {
        /*
            java.lang.String r0 = "isEnableDeleteFirstAd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            e42.c0 r2 = e42.c0.clicfg_ad_enable_delete_first
            r3 = 0
            int r2 = ca4.m0.u0(r2, r3)
            r4 = 1
            if (r2 == r4) goto L3c
            java.lang.String r2 = "isEnableDeleteAdAfterLoadPage"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            java.lang.String r7 = "access$getSIsEnableDeleteAdAfterLoadPage$cp"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)
            boolean r8 = r44.f.f369560n
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
            if (r8 == 0) goto L33
            boolean r7 = r44.f.O6()
            if (r7 == 0) goto L33
            r7 = r4
            goto L34
        L33:
            r7 = r3
        L34:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            if (r7 == 0) goto L3d
        L3c:
            r3 = r4
        L3d:
            if (r3 == 0) goto L48
            com.tencent.mm.plugin.report.service.g0 r2 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r4 = 2097(0x831, float:2.939E-42)
            r5 = 30
            r2.A(r4, r5)
        L48:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "isEnableDeleteFirstAd = "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "ConsecutiveAdDataImproveHelper"
            com.tencent.mars.xlog.Log.i(r4, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.o4.g():boolean");
    }

    public static boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableDeleteLastAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        boolean z17 = ca4.m0.u0(e42.c0.clicfg_ad_enable_delete_last, 0) == 1;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2097, 31);
        }
        com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "isEnableDeleteLastAd = " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableDeleteLastAd", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        return z17;
    }

    public static java.util.List i(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            ca4.m0.j0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFilterValue", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            java.util.List b17 = b(list);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return b17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ConsecutiveAdDataImproveHelper", "there is something wrong in removeConsecutiveAd: " + android.util.Log.getStackTraceString(th6));
            ca4.e0.a("filter_ad_exp", "", 0, 0, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeConsecutiveAdWithReturn", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return null;
        }
    }

    public static void j(java.util.List list) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPriorityDeleteRecordData", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
        if (a84.b0.b(list)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPriorityDeleteRecordData", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
            return;
        }
        l44.t5 b17 = l44.t5.b();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            l44.n4 n4Var = (l44.n4) it.next();
            if (n4Var.f316277b != 0 && (str = n4Var.f316278c) != null) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                int i17 = n4Var.f316280e;
                g0Var.A(2097, i17);
                long j17 = n4Var.f316277b;
                java.lang.String t07 = ca4.z0.t0(j17);
                int i18 = n4Var.f316279d;
                b17.a(str, t07, i18, 0);
                com.tencent.mars.xlog.Log.i("ConsecutiveAdDataImproveHelper", "delete ad by priority, snsid = " + ca4.z0.t0(j17) + ", deleteType = " + i18 + ", reportKey = " + i17);
                if (i18 == 9) {
                    ca4.e0.a("ad_pull_session", "delete first or last ad", i17, 0, "");
                }
            }
        }
        b17.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPriorityDeleteRecordData", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataImproveHelper");
    }
}
