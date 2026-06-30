package q34;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f359957a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f359958b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f359959c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f359960d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f359961e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f359962f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f359963g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f359964h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f359965i;

    public final void a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFromJson", "com.tencent.mm.plugin.sns.ad.adinfo.AdDynamicConfig");
        if (jSONObject != null) {
            this.f359957a = jSONObject.optInt("forbidAutoPlay") == 1;
            this.f359958b = jSONObject.optInt("hideFirstBossComment") == 1;
            this.f359959c = jSONObject.has("finderLiveStreamDisplayType") ? java.lang.Integer.valueOf(jSONObject.optInt("finderLiveStreamDisplayType")) : null;
            this.f359960d = jSONObject.optInt("hideGameGiftTag") == 1;
            this.f359961e = jSONObject.optInt("hideConsultBar") == 1;
            this.f359962f = jSONObject.optInt("hideAdChainStrengthenLabel") == 1;
            this.f359963g = jSONObject.optInt("showPersonalizedInfoInFeedback") == 1;
            this.f359964h = jSONObject.optInt("hideLikedAdsInFeedback") == 1;
            this.f359965i = jSONObject.optInt("showReasonToastInFeedback") == 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFromJson", "com.tencent.mm.plugin.sns.ad.adinfo.AdDynamicConfig");
    }
}
