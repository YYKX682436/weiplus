package k84;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.n f305267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k84.n nVar) {
        super(0);
        this.f305267d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        mb4.p pVar;
        mb4.h0 c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        k84.l lVar = k84.q1.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        k84.n dataRef = this.f305267d;
        kotlin.jvm.internal.o.g(dataRef, "dataRef");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = dataRef.f305133b;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            int i17 = dataRef.f305134c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            int i18 = dataRef.f305135d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            int i19 = dataRef.f305136e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, dataRef.f305132a);
            java.lang.String str2 = snsInfo.getAdXml().adExtInfo;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("adExtInfo", str2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put("extInfo", jSONObject2);
            mb4.c cVar = snsInfo.getAdXml().adSocialInfo;
            if (cVar == null || (pVar = cVar.f325387l) == null || (c17 = pVar.c()) == null) {
                str = null;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.TagInfo");
                str = c17.f325413a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.TagInfo");
            }
            jSONObject2.put("numberRequestId", str);
            jSONObject2.put("totalLikeCount", i17);
            jSONObject2.put("continuousLikeCount", i18);
            jSONObject2.put("bannerPlayCount", i19);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.tencent.mars.xlog.Log.i("AdContinuousLikeComponent", "sns_ad_continuous_like_report:".concat(jSONObject3));
            ca4.m0.a("sns_ad_continuous_like_report", jSONObject3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            dataRef.f305134c = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotalLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            dataRef.f305135d = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContinuousLikeCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            dataRef.f305136e = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBannerPlayCount", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$ReportStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$1");
        return f0Var;
    }
}
