package l44;

/* loaded from: classes4.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.f3 f316135a = new l44.f3();

    public static final org.json.JSONObject a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLocalRecordJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            l44.f3 f3Var = f316135a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            int Ni = e0Var != null ? ((h62.d) e0Var).Ni(e42.c0.clicfg_sns_ad_passthrough_report_local_ads_time_config, 0) : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLimitConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            e42.e0 e0Var2 = (e42.e0) i95.n0.c(e42.e0.class);
            int Ni2 = e0Var2 != null ? ((h62.d) e0Var2).Ni(e42.c0.clicfg_sns_ad_passthrough_report_local_ads_limit_config, 50) : 50;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLimitConfig", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            com.tencent.mars.xlog.Log.i("SnsAd.AdLocalRecordHelper", "the time config is " + Ni + ", limit config is " + Ni2);
            l44.c3 b17 = f3Var.b(Ni, Ni2);
            r8 = b17 != null ? b17.a() : null;
            com.tencent.mars.xlog.Log.i("SnsAd.AdLocalRecordHelper", "obtain local record json takes " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("getAdLocalRecordJSON", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLocalRecordJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        return r8;
    }

    public final l44.c3 b(int i17, int i18) {
        int i19;
        android.database.Cursor D0;
        android.database.Cursor d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        java.lang.String str = "SnsAd.AdLocalRecordHelper";
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdLocalRecordHelper", "the time config is 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            return null;
        }
        int e17 = c01.id.e();
        int i27 = e17 - (86400 * i17);
        if (i27 <= 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdLocalRecordHelper", "the time is invalid!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
            return null;
        }
        int i28 = i18 <= 0 ? -1 : i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        l44.d3 d3Var = l44.e3.f316108k;
        if (Fj == null || (d17 = Fj.d1("", i27, i28)) == null) {
            i19 = 0;
        } else {
            int i29 = 0;
            int i37 = 0;
            while (d17.moveToNext()) {
                try {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                    snsInfo.convertFrom(d17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    boolean z17 = snsInfo.isAd();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAd", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
                    if (z17) {
                        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
                        if (adSnsInfo != null) {
                            arrayList.add(d3Var.a(adSnsInfo, i29, i37));
                            linkedHashSet.add(java.lang.Long.valueOf(adSnsInfo.field_snsId));
                            i29++;
                            i37++;
                            str = str;
                        }
                    } else {
                        i29++;
                    }
                } finally {
                }
            }
            str = str;
            com.tencent.mars.xlog.Log.i(str, "the getAdCursorForTimeLine ad absolute pos is " + i29 + ", ad relative pos is " + i37);
            vz5.b.a(d17, null);
            i19 = i37;
        }
        com.tencent.mm.plugin.sns.storage.z0 Vi = com.tencent.mm.plugin.sns.model.l4.Vi();
        if (Vi != null && (D0 = Vi.D0(e17, i27)) != null) {
            while (D0.moveToNext()) {
                try {
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo2 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo();
                    adSnsInfo2.convertFrom(D0);
                    if (!linkedHashSet.contains(java.lang.Long.valueOf(adSnsInfo2.field_snsId))) {
                        int i38 = i19 + 1;
                        arrayList.add(d3Var.a(adSnsInfo2, -1, i19));
                        i19 = i38;
                    }
                } finally {
                }
            }
            vz5.b.a(D0, null);
        }
        com.tencent.mars.xlog.Log.i(str, "the getAdInTime cursor ad relative pos is " + i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchAdRecords", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        l44.c3 c3Var = new l44.c3(i17, arrayList, 0, 4, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalAdRecordJson", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper");
        return c3Var;
    }
}
