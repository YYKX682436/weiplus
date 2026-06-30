package k94;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f305936a;

    /* renamed from: b, reason: collision with root package name */
    public long f305937b;

    /* renamed from: c, reason: collision with root package name */
    public long f305938c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f305939d;

    public b(boolean z17, long j17, long j18, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        j18 = (i17 & 4) != 0 ? 0L : j18;
        z18 = (i17 & 8) != 0 ? false : z18;
        this.f305936a = z17;
        this.f305937b = j17;
        this.f305938c = j18;
        this.f305939d = z18;
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        boolean z17 = this.f305936a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidExposure", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        return z17;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
        this.f305936a = false;
        this.f305937b = java.lang.System.currentTimeMillis();
        this.f305938c = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic$AdExposureState");
    }
}
