package l44;

/* loaded from: classes4.dex */
public class q4 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final l44.r4 f316316a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f316317b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q4(l44.r4 r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "access$000"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = r4.f316328c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            long r0 = (long) r2
            r3.<init>(r5, r0)
            r5 = 0
            r3.f316317b = r5
            r3.f316316a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.q4.<init>(l44.r4, long):void");
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
        this.f316317b = true;
        l44.r4 r4Var = this.f316316a;
        if (r4Var != null) {
            r4Var.a(0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
        l44.r4 r4Var = this.f316316a;
        if (r4Var != null) {
            r4Var.a(j17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
    }
}
