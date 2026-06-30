package i44;

/* loaded from: classes4.dex */
public final class a extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f288384a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f288385b;

    /* renamed from: c, reason: collision with root package name */
    public int f288386c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f288387d;

    /* renamed from: e, reason: collision with root package name */
    public int f288388e;

    /* renamed from: f, reason: collision with root package name */
    public int f288389f;

    /* renamed from: g, reason: collision with root package name */
    public int f288390g;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("snsid", this.f288384a);
            } catch (java.lang.Throwable unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f288385b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("adExtInfo", this.f288387d);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f288386c));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        if (jSONObject != null) {
            jSONObject.putOpt("clickAction", java.lang.Integer.valueOf(this.f288388e));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("downloadStatus", java.lang.Integer.valueOf(this.f288389f));
        }
        if (jSONObject != null) {
            jSONObject.putOpt("autoDownload", java.lang.Integer.valueOf(this.f288390g));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
    }

    public final void c(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f288384a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f288385b = str2;
        this.f288386c = i17;
        this.f288387d = str3;
        this.f288388e = i18;
        this.f288389f = i19;
        this.f288390g = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.halfscreen.report.AdDownloadHalfScreenChannel");
        return "sns_ad_half_screen_download_report";
    }
}
