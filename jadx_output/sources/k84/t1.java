package k84;

/* loaded from: classes4.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.s1 f305253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k84.s1 s1Var) {
        super(0);
        this.f305253d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb4.r rVar;
        mb4.v i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        k84.r1 r1Var = k84.d4.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        k84.s1 dataRef = this.f305253d;
        kotlin.jvm.internal.o.g(dataRef, "dataRef");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = dataRef.f305235b;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            int i18 = dataRef.f305236c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            r1Var.c(3);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, dataRef.f305234a);
            java.lang.String str = snsInfo.getAdXml().adExtInfo;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("adExtInfo", str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put("extInfo", jSONObject2);
            mb4.c cVar = snsInfo.getAdXml().adSocialInfo;
            if (cVar != null && (rVar = cVar.f325388m) != null && (i17 = rVar.i()) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                java.lang.String str3 = i17.f325480a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                if (str3 != null) {
                    str2 = str3;
                }
            }
            jSONObject2.put("numberRequestId", str2);
            jSONObject2.put("totalLikeCount", i18);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            com.tencent.mars.xlog.Log.i("AdFireworkCheerComponent", "sns_ad_firework_cheer_report:".concat(jSONObject3));
            ca4.m0.a("sns_ad_firework_cheer_report", jSONObject3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            dataRef.f305236c = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$ReportStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$1");
        return f0Var;
    }
}
