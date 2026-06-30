package q74;

/* loaded from: classes4.dex */
public class v extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f360548a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360550c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360551d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f360552e;

    public v(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, int i19, boolean z17) {
        this.f360548a = snsInfo;
        this.f360549b = i17;
        this.f360550c = i18;
        this.f360551d = i19;
        this.f360552e = z17;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360548a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        try {
            jSONObject.putOpt("snsid", ca4.z0.t0(snsInfo.field_snsId));
            java.lang.String uxinfo = snsInfo.getUxinfo();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str = "";
            if (uxinfo == null) {
                uxinfo = "";
            }
            jSONObject.putOpt("uxinfo", uxinfo);
            java.lang.String str2 = snsInfo.getAdXml().adExtInfo;
            if (str2 != null) {
                str = str2;
            }
            jSONObject.putOpt("adExtInfo", str);
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f360549b));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        try {
            jSONObject.put("touchDuraion", this.f360550c);
            jSONObject.put("touchCount", this.f360551d);
            jSONObject.put("hasParticleAnim", this.f360552e ? 1 : 0);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdTouchChannelData");
        return "sns_ad_slider_card_touch_duration_report";
    }
}
