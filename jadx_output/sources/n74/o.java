package n74;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f335405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335406h;

    public o(r45.jj4 jj4Var, java.lang.String str, java.lang.String str2, yz5.p pVar, java.lang.String str3) {
        this.f335402d = jj4Var;
        this.f335403e = str;
        this.f335404f = str2;
        this.f335405g = pVar;
        this.f335406h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(new n74.n(this.f335405g, this.f335406h));
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        r45.jj4 jj4Var = this.f335402d;
        com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
        d17.f195313b = (int) (java.lang.System.currentTimeMillis() / 1000);
        Cj.g(jj4Var, 4, null, d17, this.f335403e, this.f335404f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper$downloadVideoForAdResource$3");
    }
}
