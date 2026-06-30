package i94;

/* loaded from: classes4.dex */
public final class b implements a84.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final h94.a f289762a;

    public b(h94.a foldAdInfo) {
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        this.f289762a = foldAdInfo;
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        return "timeline_ad_feedback_click_positive_btn";
    }

    @Override // a84.r0
    public java.lang.String j() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        h94.a aVar = this.f289762a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jSONObject.put("snsid", aVar.c());
            jSONObject.put("uxinfo", aVar.e());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportExtraData", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportExtraData", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            m521constructorimpl = kotlin.Result.m521constructorimpl(jSONObject.put("adExtInfo", aVar.f279741k));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("baseInfo", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackApproveChannelData");
        return jSONObject2;
    }
}
