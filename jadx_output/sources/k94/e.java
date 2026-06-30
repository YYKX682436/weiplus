package k94;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f305943a;

    /* renamed from: b, reason: collision with root package name */
    public int f305944b;

    /* renamed from: c, reason: collision with root package name */
    public final int f305945c;

    public e(int i17, int i18, int i19) {
        this.f305943a = i17;
        this.f305944b = i18;
        this.f305945c = i19;
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
        int i17 = this.f305943a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
        return i17;
    }
}
