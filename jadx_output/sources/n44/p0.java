package n44;

/* loaded from: classes14.dex */
public final class p0 extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f335012a;

    /* renamed from: e, reason: collision with root package name */
    public long f335016e;

    /* renamed from: f, reason: collision with root package name */
    public int f335017f;

    /* renamed from: g, reason: collision with root package name */
    public int f335018g;

    /* renamed from: h, reason: collision with root package name */
    public int f335019h;

    /* renamed from: j, reason: collision with root package name */
    public n44.o0 f335021j;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f335013b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f335014c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f335015d = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f335020i = new java.util.ArrayList();

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        if (jSONObject != null) {
            jSONObject.putOpt("snsid", this.f335014c);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("uxinfo", this.f335015d);
        }
        if (jSONObject != null) {
            jSONObject.putOpt("aid", this.f335013b);
        }
        if (jSONObject != null) {
            jSONObject.putOpt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f335012a));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    @Override // a84.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.json.JSONObject r17) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n44.p0.b(org.json.JSONObject):void");
    }

    public final n44.o0 c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.media.g6.NAME, "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        n44.o0 o0Var = this.f335021j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.media.g6.NAME, "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        return o0Var;
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic");
        return "sns_ad_conventional_half_screen_report";
    }
}
