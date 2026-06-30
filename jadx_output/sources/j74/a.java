package j74;

/* loaded from: classes4.dex */
public class a implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public long f298051a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f298052b;

    /* renamed from: c, reason: collision with root package name */
    public int f298053c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298054d;

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        return "timeline_ad_feedback_click_positive_btn";
    }

    @Override // a84.r0
    public java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("snsid", java.lang.String.valueOf(this.f298051a));
            java.lang.String str = this.f298052b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("uxinfo", str);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f298053c);
            java.lang.String str3 = this.f298054d;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject.put("adExtInfo", str2);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        java.lang.String jSONObject2 = jSONObject.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.data.AdApprovedFeedbackChannelData");
        return jSONObject2;
    }
}
