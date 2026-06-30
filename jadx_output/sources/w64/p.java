package w64;

/* loaded from: classes4.dex */
public final class p implements bi4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w64.o f443332a;

    public p(w64.o oVar) {
        this.f443332a = oVar;
    }

    @Override // bi4.l1
    public final void onFinishAction(int i17, java.lang.String str, pj4.r0 r0Var) {
        w64.o oVar = this.f443332a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$jumpToTextStatus$1");
        com.tencent.mars.xlog.Log.i("AdJumpTextStatusUIHelper", "callback:  result = " + i17 + ", errMsg = " + str + ",  info = " + r0Var);
        if (i17 == 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                oVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put("snsid", oVar.f443329e);
                oVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put("uxinfo", oVar.f443328d);
                oVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, oVar.f443330f);
                oVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdExtInfo", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$ReportInfo");
                jSONObject.put("adExtInfo", oVar.f443331g);
                ca4.m0.a("sns_ad_state_publish_user_confirm", jSONObject.toString());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("AdJumpTextStatusUIHelper", th6, "adChannelCgiReport error!", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdJumpTextStatusUIHelper$jumpToTextStatus$1");
    }
}
