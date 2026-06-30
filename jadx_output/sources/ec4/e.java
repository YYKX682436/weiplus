package ec4;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.s f251141d;

    public e(ec4.s sVar) {
        this.f251141d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$5");
        ((com.tencent.mm.plugin.sns.ui.q6) this.f251141d).a(false, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$5");
    }
}
