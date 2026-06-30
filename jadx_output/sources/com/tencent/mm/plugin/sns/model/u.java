package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.model.u f164697a = new com.tencent.mm.plugin.sns.model.u();

    public final void a(java.util.List list, int i17) {
        java.util.List list2 = list;
        int i18 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
        if (com.tencent.mm.sdk.platformtools.f9.MomentAds.h()) {
            com.tencent.mars.xlog.Log.w("AdPullStorageLogic", "insert, forbid ad");
            ca4.n0.b(1697, 78);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
            return;
        }
        if (list2 == null || i18 == 0) {
            com.tencent.mars.xlog.Log.w("AdPullStorageLogic", "adlist is " + list + ", createTime is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adList[");
        int size = list.size();
        int i19 = 0;
        boolean z17 = false;
        while (i19 < size) {
            r45.g5 g5Var = (r45.g5) list2.get(i19);
            if (g5Var == null) {
                com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "ad is null");
            } else {
                r45.f76 f76Var = g5Var.f374885d;
                if (f76Var == null) {
                    com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "item.SnsADObject is null");
                } else if (f76Var.f374076d == null) {
                    com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "item.SnsADObject.SnsObject is null");
                } else {
                    java.lang.String g17 = x51.j1.g(g5Var.f374886e);
                    java.lang.String g18 = x51.j1.g(g5Var.f374885d.f374077e);
                    java.lang.String f17 = x51.j1.f(g5Var.f374885d.f374076d.ObjectDesc);
                    com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = new com.tencent.mm.plugin.sns.storage.ADInfo(g17);
                    com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "insert ad, skXml %s, adXml %s, snsXml %s", g17, g18, f17);
                    l44.h3.f(aDInfo.adIPv4Url);
                    java.lang.String t07 = ca4.z0.t0(g5Var.f374885d.f374076d.Id);
                    try {
                        sb6.append(t07);
                        sb6.append(",");
                        sb6.append(aDInfo.ad_sns_pos);
                        sb6.append("|");
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("AdPullStorageLogic", "log exp=" + e17);
                    }
                    com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "insert ad, create adinfo time  " + i18 + " pos " + aDInfo.ad_sns_pos);
                    int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / ((long) 1000));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("insert ad, gettime ");
                    sb7.append(currentTimeMillis);
                    com.tencent.mars.xlog.Log.i("AdPullStorageLogic", sb7.toString());
                    com.tencent.mm.plugin.sns.model.x.o(g5Var, i18, currentTimeMillis);
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(g5Var.f374885d.f374076d.Id);
                    if (y07 != null) {
                        com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "insert ad, snsId=" + t07 + ", exposureTime=" + y07.field_exposureTime + ", , expouseCnt=" + y07.field_exposureCount + ", isExposued=" + y07.isExposured() + ", adDupSnsIdDel=" + aDInfo.adDupSnsIdDel);
                        if (aDInfo.adDupSnsIdDel == 1) {
                            l44.b0.d(y07);
                        }
                        r45.o3 remindInfoGroup = y07.getRemindInfoGroup();
                        if (remindInfoGroup == null) {
                            remindInfoGroup = new r45.o3();
                        }
                        r45.mo5 mo5Var = g5Var.f374888g;
                        remindInfoGroup.f381861d = mo5Var;
                        if (mo5Var != null) {
                            com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "insert ad, update timeline remind info , aid64:%d, aid:%d", java.lang.Long.valueOf(mo5Var.f380718i), java.lang.Integer.valueOf(remindInfoGroup.f381861d.f380713d));
                        }
                        y07.setRemindInfoGroup(remindInfoGroup);
                        y07.setLocalVisible();
                        com.tencent.mm.plugin.sns.model.l4.Vi().replace(y07);
                        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
                        if (n74.l0.a(convertToSnsInfo)) {
                            com.tencent.mm.plugin.sns.model.l4.Pj().k(convertToSnsInfo);
                            z17 = true;
                        }
                    }
                    com.tencent.mm.plugin.sns.model.x.u(g5Var.f374885d.f374076d.Id, aDInfo);
                    try {
                        java.lang.String t08 = ca4.z0.t0(g5Var.f374885d.f374076d.Id);
                        if (!n74.c1.b(aDInfo, t08)) {
                            n74.c1.c(1, t08, aDInfo, g5Var.f374885d.f374076d, y07.convertToSnsInfo());
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("AdPullStorageLogic", th6.toString());
                    }
                }
            }
            i19++;
            list2 = list;
            i18 = i17;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "the on line video preload start in AdSnsInfoStorageLogic ");
            com.tencent.mm.plugin.sns.model.l4.Pj().t();
        }
        try {
            sb6.append("],  ");
            com.tencent.mars.xlog.Log.i("AdPullStorageLogic", "insert ad, " + ((java.lang.Object) sb6));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("AdPullStorageLogic", "log exp=" + e18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertAd", "com.tencent.mm.plugin.sns.model.AdOpStorageLogic");
    }
}
