package ec4;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.s f251143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f251144e;

    public f(ec4.s sVar, int i17) {
        this.f251143d = sVar;
        this.f251144e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$6");
        ((com.tencent.mm.plugin.sns.ui.q6) this.f251143d).a(true, this.f251144e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$6");
    }
}
