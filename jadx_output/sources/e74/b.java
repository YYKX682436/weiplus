package e74;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f249954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f249955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f249956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e74.i f249958h;

    public b(e74.i iVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17, java.lang.String str) {
        this.f249958h = iVar;
        this.f249954d = snsInfo;
        this.f249955e = i17;
        this.f249956f = z17;
        this.f249957g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$2");
        try {
            e74.i.a(this.f249958h, this.f249954d, this.f249955e, this.f249956f);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct exp, snsId=" + this.f249957g + ", exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$2");
    }
}
