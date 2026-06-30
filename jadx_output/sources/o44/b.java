package o44;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f342858a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f342859b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f342860c;

    /* renamed from: d, reason: collision with root package name */
    public final f54.p f342861d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f342862e;

    public b(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent, f54.p pVar) {
        this.f342860c = snsAdNativeLandingPagesUI;
        this.f342862e = adLandingHBCardComponent;
        this.f342861d = pVar;
    }

    public org.json.JSONArray a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject b17 = b(1, false);
        if (b17 != null) {
            jSONArray.put(b17);
        }
        org.json.JSONObject b18 = b(2, false);
        if (b18 != null) {
            jSONArray.put(b18);
        }
        org.json.JSONObject b19 = b(1, true);
        if (b19 != null) {
            jSONArray.put(b19);
        }
        org.json.JSONObject b27 = b(2, true);
        if (b27 != null) {
            jSONArray.put(b27);
        }
        org.json.JSONObject b28 = b(4, false);
        if (b28 != null) {
            jSONArray.put(b28);
        }
        if (jSONArray.length() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return jSONArray;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardCompStatJsonStr", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return null;
    }

    public final org.json.JSONObject b(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        o44.a aVar = (o44.a) this.f342858a.get(c(i17, z17));
        org.json.JSONObject jSONObject = null;
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HBCardStatistics", "toJsonObject exp=" + e17.toString());
        }
        if (aVar.f342854c > 0) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("subType", aVar.f342852a);
            jSONObject2.put("isDoubleCard", aVar.f342853b ? 1 : 0);
            int i18 = aVar.f342854c;
            if (i18 > 0) {
                jSONObject2.put("expCnt", i18);
            }
            int i19 = aVar.f342855d;
            if (i19 > 0) {
                jSONObject2.put("btnClkCnt", i19);
            }
            int i27 = aVar.f342856e;
            if (i27 > 0) {
                jSONObject2.put("linkClkCnt", i27);
            }
            if (aVar.f342852a != 1) {
                java.lang.String str = aVar.f342857f;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                jSONObject2.put("giveCardId", str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
            jSONObject = jSONObject2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
            return jSONObject;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toJsonObject", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper$CardStatInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardStatInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return jSONObject;
    }

    public final java.lang.String c(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17 ? "3" : "");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        return sb7;
    }

    public void d(int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCardBtnClick", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        java.lang.String c17 = c(i17, z17);
        java.util.HashMap hashMap = this.f342858a;
        o44.a aVar = (o44.a) hashMap.get(c17);
        if (aVar == null) {
            aVar = new o44.a(this);
            aVar.f342853b = z17;
            aVar.f342852a = i17;
            aVar.f342857f = this.f342861d.F;
            hashMap.put(c17, aVar);
        }
        if (i18 != 3) {
            aVar.f342855d++;
        } else {
            aVar.f342856e++;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = this.f342862e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adChannelClickReport", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        try {
            ab4.n0 A7 = this.f342860c.A7();
            java.lang.String j17 = A7.j();
            java.lang.String o17 = A7.o();
            int l17 = A7.l();
            java.lang.String e17 = A7.e();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (j17 == null) {
                j17 = "";
            }
            jSONObject.put("snsid", j17);
            if (o17 == null) {
                o17 = "";
            }
            jSONObject.put("uxinfo", o17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, l17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("btnType", i18);
            if (e17 == null) {
                e17 = "";
            }
            jSONObject2.put("canvasId", e17);
            adLandingHBCardComponent.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            java.lang.String str = adLandingHBCardComponent.f162737x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            jSONObject2.put("twistCardId", str);
            org.json.JSONObject V = adLandingHBCardComponent.V();
            if (V != null) {
                jSONObject2.put("hbCard", V);
            }
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("canvas_hb_card_btn_click", jSONObject.toString());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("HBCardStatistics", "reportShakeActionResult, exp=" + e18.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adChannelClickReport", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCardBtnClick", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
    }

    public void e(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCardExposure", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
        java.lang.String c17 = c(i17, z17);
        java.util.HashMap hashMap = this.f342858a;
        o44.a aVar = (o44.a) hashMap.get(c17);
        if (aVar == null) {
            aVar = new o44.a(this);
            aVar.f342853b = z17;
            aVar.f342852a = i17;
            aVar.f342857f = this.f342861d.F;
            hashMap.put(c17, aVar);
        }
        aVar.f342854c++;
        this.f342859b++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCardExposure", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.HBCardStatHelper");
    }
}
