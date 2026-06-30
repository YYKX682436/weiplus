package r34;

/* loaded from: classes4.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("filterFeedList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("SnsAdSession.SnsAdPullSessionManager", "filterFeedList, list empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterFeedList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return;
        }
        int size = list.size();
        pm0.v.c0(list, r34.f.f369002d);
        int size2 = size - list.size();
        if (size2 > 0) {
            h(12, size2);
        }
        com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "filterFeedList, delCount=" + size2 + ", totalCount=" + size);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("filterFeedList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
    }

    public final java.lang.String b(int i17, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findAboveFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        if (list == null || list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAboveFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return "";
        }
        while (-1 < i17) {
            if (!((zc4.b) list.get(i17)).n().isAd()) {
                java.lang.String t07 = ca4.z0.t0(((zc4.b) list.get(i17)).n().y0());
                kotlin.jvm.internal.o.f(t07, "longToString(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAboveFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                return t07;
            }
            g(16);
            i17--;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findAboveFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        return "";
    }

    public final java.lang.String c(int i17, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findBelowFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        if (list == null || list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findBelowFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return "";
        }
        int size = list.size();
        while (i17 < size) {
            if (!((zc4.b) list.get(i17)).n().isAd()) {
                java.lang.String t07 = ca4.z0.t0(((zc4.b) list.get(i17)).n().y0());
                kotlin.jvm.internal.o.f(t07, "longToString(...)");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findBelowFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                return t07;
            }
            g(16);
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findBelowFirstNonAdFeedId", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        return "";
    }

    public final org.json.JSONArray d(java.util.List list, java.util.List list2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPositionRecordJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPositionRecordJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return null;
        }
        java.util.Iterator it = list2.iterator();
        while (true) {
            boolean z18 = true;
            if (!it.hasNext()) {
                break;
            }
            r34.b bVar = (r34.b) it.next();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdRecordFromUIList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            int size = list.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdRecordFromUIList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    z17 = false;
                    break;
                }
                if (((zc4.b) list.get(i17)).n().isAd() && bVar.e() == ((zc4.b) list.get(i17)).n().y0()) {
                    bVar.h(i17);
                    bVar.g(b(i17 - 1, list));
                    bVar.i(c(i17 + 1, list));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdRecordFromUIList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (z17) {
                bVar.f();
                r34.e.h(r34.e.f368998a, bVar, false, 2, null);
                g(13);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdRecordFromCache", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                r34.b c17 = r34.e.f368998a.c(bVar.e());
                if (c17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdRecordFromCache", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    z18 = false;
                } else {
                    bVar.g(c17.a());
                    bVar.i(c17.c());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdRecordFromCache", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                }
                if (z18) {
                    g(14);
                    bVar.f();
                } else {
                    g(15);
                    com.tencent.mars.xlog.Log.e("SnsAdSession.SnsAdPullSessionManager", "ad not found, snsId=" + bVar.f());
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertAdRecordListToJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            r34.b bVar2 = (r34.b) it6.next();
            jSONArray.put(bVar2.k());
            com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "[record]:" + bVar2.k());
            java.lang.String a17 = bVar2.a();
            if (a17 == null || a17.length() == 0) {
                g(17);
                bVar2.f();
            }
            java.lang.String c18 = bVar2.c();
            if (c18 == null || c18.length() == 0) {
                g(18);
                bVar2.f();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertAdRecordListToJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPositionRecordJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        return jSONArray;
    }

    public final jz5.l e(java.util.List list, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastFeedPosition", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        if (j17 == 0) {
            g(24);
        }
        java.lang.String t07 = ca4.z0.t0(j17);
        boolean z17 = true;
        java.lang.String str = "";
        for (int size = list.size() - 1; -1 < size; size--) {
            zc4.b bVar = (zc4.b) list.get(size);
            if (!bVar.n().isAd()) {
                if (z17) {
                    if (j17 != bVar.n().y0()) {
                        str = ca4.z0.t0(bVar.n().y0());
                        kotlin.jvm.internal.o.f(str, "longToString(...)");
                        com.tencent.mars.xlog.Log.w("SnsAdSession.SnsAdPullSessionManager", "maxId!=lastUIFeed, maxId=" + t07 + ", lastUIFeedId=" + str + ", idx=" + size);
                        g(20);
                    }
                    z17 = false;
                }
                if (j17 == bVar.n().y0()) {
                    jz5.l lVar = new jz5.l(t07, java.lang.Integer.valueOf(size));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastFeedPosition", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    return lVar;
                }
            }
        }
        g(19);
        com.tencent.mars.xlog.Log.e("SnsAdSession.SnsAdPullSessionManager", "maxId not in uiList, maxId=" + t07);
        str.length();
        jz5.l lVar2 = new jz5.l(t07, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastFeedPosition", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        return lVar2;
    }

    public final java.util.List f(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUIFeedList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        try {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            java.util.List V0 = kz5.n0.V0(((com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) a17).S6().f152065o);
            r34.h.f369003a.a(V0);
            com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "getUIFeedList, size=" + ((java.util.ArrayList) V0).size());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIFeedList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return V0;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdSession_getUIFeedList", th6);
            com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "getUIFeedList, empty list");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIFeedList", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return arrayList;
        }
    }

    public final void g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idkey", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        h(i17, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idkey", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
    }

    public final void h(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idkey", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        jx3.f.INSTANCE.w(2097L, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getErrKeyList$cp", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getErrKeyList$cp", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager");
        if (r34.h.f369004b.contains(java.lang.Integer.valueOf(i17))) {
            ca4.e0.b("ad_pull_session", "idkey", i17, 0, "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idkey", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
    }

    public final boolean i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return true;
        }
        boolean z17 = ca4.m0.u0(e42.c0.clicfg_ad_enable_session_record_with_unread, 0) > 0;
        if (!z17 || i17 != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
            return false;
        }
        com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "isEnableUnread=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPullType", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        return true;
    }

    public final java.util.List j() {
        long j17;
        java.lang.String str;
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryTopAdListFromDB", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getConfigTopAdCount", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        int u07 = ca4.m0.u0(e42.c0.clicfg_ad_pull_session_max_record, 30);
        java.lang.String str3 = "SnsAdSession.SnsAdPullSessionManager";
        com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "expt maxRecordCount=" + u07);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getConfigTopAdCount", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        int i17 = 0;
        android.database.Cursor J0 = com.tencent.mm.plugin.sns.model.l4.Vi().J0(c01.id.e(), 0, u07);
        if (J0 != null) {
            try {
                if (J0.moveToFirst()) {
                    int i18 = 0;
                    while (true) {
                        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = new com.tencent.mm.plugin.sns.storage.AdSnsInfo();
                        adSnsInfo.convertFrom(J0);
                        int a17 = i64.z0.a(adSnsInfo);
                        boolean c17 = l44.b0.c(adSnsInfo);
                        long j18 = adSnsInfo.field_snsId;
                        java.lang.String t07 = ca4.z0.t0(j18);
                        j17 = elapsedRealtime;
                        long j19 = adSnsInfo.field_createAdTime;
                        java.lang.String str4 = adSnsInfo.getAdInfo().uxInfo;
                        str = str3;
                        kotlin.jvm.internal.o.d(t07);
                        kotlin.jvm.internal.o.d(str4);
                        r34.b bVar = new r34.b(j18, t07, j19, a17, -1, i17, str4, null, null, c17, false, null, 3456, null);
                        if (adSnsInfo.isCollectedAd()) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollectedAd", str2);
                            bVar.f368995k = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollectedAd", str2);
                            java.util.Iterator it = ((java.util.ArrayList) adSnsInfo.getAdXml().collectedAdInfo.a()).iterator();
                            while (it.hasNext()) {
                                s34.v1 v1Var = (s34.v1) it.next();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubAdList", str2);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubAdList", str2);
                                java.util.List list = bVar.f368996l;
                                java.lang.String a18 = v1Var.a();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTid", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
                                java.lang.String str5 = v1Var.f402794g;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTid", "com.tencent.mm.plugin.sns.ad.adxml.SubAdItem");
                                list.add(new s34.w1(a18, str5));
                                str2 = str2;
                            }
                        }
                        java.lang.String str6 = str2;
                        arrayList.add(bVar);
                        i17++;
                        if (c17) {
                            i18++;
                        }
                        if (!J0.moveToNext()) {
                            break;
                        }
                        str2 = str6;
                        elapsedRealtime = j17;
                        str3 = str;
                    }
                    i17 = i18;
                } else {
                    j17 = elapsedRealtime;
                    str = "SnsAdSession.SnsAdPullSessionManager";
                }
                vz5.b.a(J0, null);
            } finally {
            }
        } else {
            j17 = elapsedRealtime;
            str = "SnsAdSession.SnsAdPullSessionManager";
        }
        if (arrayList.isEmpty()) {
            g(21);
        } else if (arrayList.size() < u07) {
            g(22);
        }
        com.tencent.mars.xlog.Log.i(str, "queryTopAdListFromDB, count=" + arrayList.size() + ", maxCount=" + u07 + ", expiredCount=" + i17 + ", timeCost=" + (android.os.SystemClock.elapsedRealtime() - j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryTopAdListFromDB", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        return arrayList;
    }

    public final void k(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdDistance", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
        java.util.Iterator it = list.iterator();
        zc4.b bVar = null;
        int i17 = 0;
        while (it.hasNext()) {
            zc4.b bVar2 = (zc4.b) it.next();
            if (bVar2.n().isAd()) {
                if (bVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportDistance", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    int i18 = (i17 < 0 || i17 > 4) ? 50 : i17 + 45;
                    com.tencent.mars.xlog.Log.i("SnsAdSession.SnsAdPullSessionManager", "doReportDistance, distance=" + i17 + ", key=" + i18);
                    g(i18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportDistance", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
                    i17 = 0;
                }
                bVar = bVar2;
            } else if (bVar != null) {
                i17++;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdDistance", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPullSessionManager$Companion");
    }
}
