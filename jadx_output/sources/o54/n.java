package o54;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public long f343157a;

    /* renamed from: b, reason: collision with root package name */
    public long f343158b;

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
        if (this.f343158b != 0) {
            this.f343157a += android.os.SystemClock.elapsedRealtime() - this.f343158b;
        }
        this.f343158b = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
        if (this.f343158b == 0) {
            this.f343158b = android.os.SystemClock.elapsedRealtime();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.landingpage.helper.PlayedTimeReporter");
    }
}
