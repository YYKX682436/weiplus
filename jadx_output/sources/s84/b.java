package s84;

/* loaded from: classes4.dex */
public class b extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f404893a;

    /* renamed from: b, reason: collision with root package name */
    public final int f404894b;

    /* renamed from: c, reason: collision with root package name */
    public final s84.a f404895c;

    public b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, s84.a aVar) {
        this.f404893a = snsInfo;
        this.f404894b = i17 == 0 ? 1 : 2;
        this.f404895c = aVar;
    }

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404893a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
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
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f404894b));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        s84.a aVar = this.f404895c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        try {
            jSONObject.put("dragDuration", aVar.f404889a);
            jSONObject.put("dragCount", aVar.f404890b);
            jSONObject.put("jumpCount", aVar.f404891c);
            jSONObject.put("firstPlaybackTime", aVar.f404892d);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragReportData");
        return "sns_ad_full_card_drag_image_report";
    }
}
