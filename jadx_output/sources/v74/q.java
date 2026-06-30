package v74;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final v74.p f433878d = new v74.p(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f433879a;

    /* renamed from: b, reason: collision with root package name */
    public int f433880b;

    /* renamed from: c, reason: collision with root package name */
    public r45.jj4 f433881c;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        return adClickActionInfo;
    }

    public final r45.jj4 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        r45.jj4 jj4Var = this.f433881c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        return jj4Var;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        boolean z17 = this.f433880b == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        return z17;
    }

    public final void d(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
        this.clickActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
    }
}
