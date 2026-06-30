package ec4;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.s f251116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o55.a f251117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251118f;

    public c(ec4.s sVar, o55.a aVar, java.lang.String str) {
        this.f251116d = sVar;
        this.f251117e = aVar;
        this.f251118f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$3");
        ((com.tencent.mm.plugin.sns.ui.q6) this.f251116d).b(3, this.f251117e, this.f251118f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$3");
    }
}
