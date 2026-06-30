package n74;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n74.g f335344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n74.g gVar, java.lang.String str) {
        super(1);
        this.f335344d = gVar;
        this.f335345e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$1");
        try {
            this.f335344d.getClass();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("AdLandingPagesDownloadResourceHelper2", " downloadImg task cancel  res=" + this.f335345e + ' ');
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadImg$2$1$1");
        return f0Var;
    }
}
