package t74;

/* loaded from: classes4.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f416148a;

    /* renamed from: b, reason: collision with root package name */
    public int f416149b;

    /* renamed from: c, reason: collision with root package name */
    public int f416150c;

    /* renamed from: d, reason: collision with root package name */
    public int f416151d;

    /* renamed from: e, reason: collision with root package name */
    public int f416152e;

    /* renamed from: f, reason: collision with root package name */
    public int f416153f;

    /* renamed from: g, reason: collision with root package name */
    public int f416154g;

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPlayTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        int i17 = this.f416154g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPlayTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        return i17;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        int i17 = this.f416152e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        return i17;
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentPlayTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        this.f416154g = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentPlayTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
    }

    public final void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
        this.f416152e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayTotalTime", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData$ItemData");
    }
}
