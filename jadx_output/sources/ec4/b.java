package ec4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec4.s f251112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o55.a f251113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251114f;

    public b(ec4.s sVar, o55.a aVar, java.lang.String str) {
        this.f251112d = sVar;
        this.f251113e = aVar;
        this.f251114f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$2");
        ((com.tencent.mm.plugin.sns.ui.q6) this.f251112d).b(1, this.f251113e, this.f251114f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader$commitFakeVideo$1$2");
    }
}
