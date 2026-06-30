package n74;

/* loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n74.p f335391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335394g;

    public m(n74.p pVar, r45.jj4 jj4Var, java.lang.String str, java.lang.String str2) {
        this.f335391d = pVar;
        this.f335392e = jj4Var;
        this.f335393f = str;
        this.f335394g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$2");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this.f335391d);
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        r45.jj4 jj4Var = this.f335392e;
        com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
        d17.f195313b = (int) (java.lang.System.currentTimeMillis() / 1000);
        Cj.g(jj4Var, 4, null, d17, this.f335393f, this.f335394g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$2");
    }
}
