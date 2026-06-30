package d44;

/* loaded from: classes4.dex */
public class a extends a84.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f226417a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f226418b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f226419c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f226420d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f226421e;

    /* renamed from: f, reason: collision with root package name */
    public int f226422f;

    /* renamed from: g, reason: collision with root package name */
    public int f226423g;

    @Override // a84.s0
    public void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        try {
            jSONObject.putOpt("snsid", this.f226417a);
            jSONObject.putOpt("uxinfo", this.f226418b);
            jSONObject.putOpt("adExtInfo", this.f226419c);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    @Override // a84.s0
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        try {
            jSONObject.putOpt("finderUsername", this.f226420d);
            jSONObject.putOpt("finderLiveNoticeId", this.f226421e);
            jSONObject.putOpt("result", java.lang.Integer.valueOf(this.f226422f));
            jSONObject.putOpt(ya.b.SOURCE, java.lang.Integer.valueOf(this.f226423g));
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    public void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.f226417a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f226418b = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f226419c = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f226420d = str4;
        if (str5 == null) {
            str5 = "";
        }
        this.f226421e = str5;
        this.f226422f = i17;
        this.f226423g = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
    }

    @Override // a84.r0
    public java.lang.String getChannel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.finder.AdFinderLivingNoticeChannel");
        return "sns_ad_finder_live_notice_reserve";
    }
}
