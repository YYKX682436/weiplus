package e74;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f249960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f249961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f249962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e74.i f249964h;

    public d(e74.i iVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17, java.lang.String str) {
        this.f249964h = iVar;
        this.f249960d = snsInfo;
        this.f249961e = i17;
        this.f249962f = z17;
        this.f249963g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$4");
        try {
            e74.i.b(this.f249964h, this.f249960d, this.f249961e, this.f249962f);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct exp, snsId=" + this.f249963g + ", exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$4");
    }
}
