package k84;

/* loaded from: classes4.dex */
public class k extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f305084a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f305085b;

    /* renamed from: c, reason: collision with root package name */
    public int f305086c;

    /* renamed from: d, reason: collision with root package name */
    public int f305087d;

    /* renamed from: e, reason: collision with root package name */
    public int f305088e;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        try {
            jSONObject.putOpt("snsid", this.f305084a);
            jSONObject.putOpt("uxinfo", this.f305085b);
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f305086c == 0 ? 1 : 2));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        try {
            jSONObject.putOpt("playCount", java.lang.Integer.valueOf(this.f305087d));
            jSONObject.putOpt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(this.f305088e));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    public void c(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f305084a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f305085b = str2;
        this.f305086c = i17;
        this.f305087d = i18;
        this.f305088e = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttractAnimationChannel");
        return "sns_ad_card_like_attracting_animation_played";
    }
}
