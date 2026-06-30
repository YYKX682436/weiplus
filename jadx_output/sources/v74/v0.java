package v74;

/* loaded from: classes4.dex */
public final class v0 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f433931a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f433932b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f433933c = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f433934d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f433935e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f433936f;

    /* renamed from: g, reason: collision with root package name */
    public int f433937g;

    /* renamed from: h, reason: collision with root package name */
    public v74.u0 f433938h;

    public v0(int i17) {
        this.f433931a = i17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f433933c);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "fillBaseJsonObject exp=" + e17);
            }
        }
        java.lang.String str = "";
        java.lang.String str2 = null;
        if (jSONObject != null) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f433932b;
            java.lang.String uxinfo = snsInfo != null ? snsInfo.getUxinfo() : null;
            if (uxinfo == null) {
                uxinfo = "";
            }
            jSONObject.putOpt("uxinfo", uxinfo);
        }
        if (jSONObject != null) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f433932b;
            if (snsInfo2 != null && (adXml = snsInfo2.getAdXml()) != null) {
                str2 = adXml.adExtInfo;
            }
            if (str2 != null) {
                str = str2;
            }
            jSONObject.putOpt("adExtInfo", str);
        }
        int i17 = this.f433931a == 0 ? 1 : 2;
        if (jSONObject != null) {
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        int i17;
        int i18;
        r45.jj4 b17;
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f433932b;
        boolean z17 = true;
        if (!(snsInfo != null && snsInfo.isLookbookCardAd())) {
            com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "getReportStr, not lookbookAd, snsId=" + this.f433933c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            return;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("scrollCount", this.f433936f);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "fillExtJsonObject exp=" + e17);
                ca4.q.c("AdLookbookStatistic, fillExtJsonObject exp", e17);
            }
        }
        if (jSONObject != null) {
            jSONObject.put("slideCount", this.f433937g);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f433935e.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            v74.u0 u0Var = (v74.u0) entry.getValue();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            v74.q e18 = e(intValue);
            if ((e18 == null || e18.c() != z17) ? false : z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                i17 = 2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMEDIA_TYPE_IMAGE", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMEDIA_TYPE_IMAGE$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMEDIA_TYPE_IMAGE$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMEDIA_TYPE_IMAGE", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
                i17 = 1;
            }
            jSONObject2.put(ya.b.INDEX, intValue);
            jSONObject2.put("mediaType", i17);
            java.util.Iterator it6 = it;
            jSONObject2.put(dm.n.COL_EXPOSURECOUNT, u0Var.c());
            jSONObject2.put("clickCount", u0Var.a());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
            if (i17 == 2) {
                if (u0Var.b() > 0) {
                    i18 = u0Var.b();
                } else {
                    v74.q e19 = e(intValue);
                    i18 = (int) (((e19 == null || (b17 = e19.b()) == null) ? 0.0f : b17.R) * 1000);
                }
                if (u0Var.d() <= 0 || i18 <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                    i19 = u0Var.f433925d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                } else {
                    i19 = i18;
                }
                int g17 = u0Var.g() + u0Var.e();
                u0Var.g();
                u0Var.e();
                u0Var.h(0);
                jSONObject2.put("playCount", u0Var.f());
                jSONObject2.put("finishPlayCount", u0Var.d());
                jSONObject2.put("playTotalTime", g17);
                jSONObject2.put("maxPlayTime", i19);
                jSONObject2.put("videoTotalTime", i18);
            }
            jSONArray.put(jSONObject2);
            it = it6;
            z17 = true;
        }
        if (jSONObject != null) {
            jSONObject.put("reportItemList", jSONArray);
        }
        v74.u0 u0Var2 = this.f433938h;
        if (u0Var2 != null && jSONObject != null) {
            jSONObject.put("brandNewItem", g(u0Var2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearStatisticData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.tencent.mars.xlog.Log.i("AdLookbookStatistic", "clearStatisticData");
        this.f433936f = 0;
        this.f433937g = 0;
        this.f433935e.clear();
        this.f433934d.clear();
        this.f433938h = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearStatisticData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    public final v74.u0 d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        if (f(i17)) {
            java.util.HashMap hashMap = this.f433935e;
            v74.u0 u0Var = (v74.u0) hashMap.get(java.lang.Integer.valueOf(i17));
            if (u0Var == null) {
                u0Var = new v74.u0();
                hashMap.put(java.lang.Integer.valueOf(i17), u0Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            return u0Var;
        }
        com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "!isValidPosition, return fake ItemData, pos=" + i17 + ", snsId=" + this.f433933c);
        v74.u0 u0Var2 = new v74.u0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return u0Var2;
    }

    public final v74.q e(int i17) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        v74.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLookbookItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        v74.q qVar = null;
        if (f(i17) && (snsInfo = this.f433932b) != null && (adXml = snsInfo.getAdXml()) != null && (mVar = adXml.adLookbookInfo) != null) {
            qVar = (v74.q) mVar.c().get(i17);
        }
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "getLookbookItemData err, pos=" + i17 + ", snsId=" + this.f433933c);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLookbookItem", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return qVar;
    }

    public final boolean f(int i17) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        v74.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f433932b;
        if (snsInfo != null && snsInfo.isLookbookCardAd()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f433932b;
            java.util.List c17 = (snsInfo2 == null || (adXml = snsInfo2.getAdXml()) == null || (mVar = adXml.adLookbookInfo) == null) ? null : mVar.c();
            boolean z17 = c17 != null && i17 >= 0 && i17 < c17.size();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            return z17;
        }
        com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "!isValidPosition, pos=" + i17 + ", snsId=" + this.f433933c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidPosition", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return false;
    }

    public final org.json.JSONObject g(v74.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeSplashCardDataJson", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.INDEX, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMEDIA_TYPE_SIGHT$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMEDIA_TYPE_SIGHT", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem$Companion");
        jSONObject.put("mediaType", 2);
        jSONObject.put(dm.n.COL_EXPOSURECOUNT, u0Var.c());
        jSONObject.put("clickCount", u0Var.a());
        jSONObject.put("playCount", u0Var.f());
        jSONObject.put("finishPlayCount", u0Var.d());
        jSONObject.put("playTotalTime", u0Var.g());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
        int i17 = u0Var.f433925d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxPlayTimeMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
        jSONObject.put("maxPlayTime", i17);
        jSONObject.put("videoTotalTime", u0Var.b());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeSplashCardDataJson", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return jSONObject;
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return "sns_ad_lookbook_report";
    }

    public final void h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        if (f(i17)) {
            v74.u0 d17 = d(i17);
            int c17 = d17.c() + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            d17.f433928g = c17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
            com.tencent.mars.xlog.Log.i("AdLookbookStatistic", "onItemExposure, pos=" + i17 + ", total=" + d(i17).c());
        } else {
            com.tencent.mars.xlog.Log.e("AdLookbookStatistic", "onItemExposure, invalid pos=" + i17 + ", total=" + d(i17).c());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    public final void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        java.util.Set set = this.f433934d;
        if (!set.contains(java.lang.Integer.valueOf(i17))) {
            h(i17);
            set.add(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
    }

    @Override // a84.s0, a84.r0
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        java.lang.String j17 = super.j();
        kotlin.jvm.internal.o.d(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        return j17;
    }
}
