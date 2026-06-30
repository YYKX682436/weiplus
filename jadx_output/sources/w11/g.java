package w11;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.b50 f442025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kl0 f442026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442027f;

    public g(r45.b50 b50Var, r45.kl0 kl0Var, java.lang.String str) {
        this.f442025d = b50Var;
        this.f442026e = kl0Var;
        this.f442027f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.DoCmdErrorReportStruct doCmdErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.DoCmdErrorReportStruct();
        doCmdErrorReportStruct.f55864f = this.f442025d.f370530d;
        r45.kl0 kl0Var = this.f442026e;
        doCmdErrorReportStruct.f55863e = doCmdErrorReportStruct.b("reversion", kl0Var.f378801f, true);
        doCmdErrorReportStruct.f55865g = kl0Var.f378802g;
        doCmdErrorReportStruct.f55866h = kl0Var.f378804i;
        doCmdErrorReportStruct.f55862d = doCmdErrorReportStruct.b("wholeStack", this.f442027f, true);
        doCmdErrorReportStruct.f55867i = kl0Var.f378805m;
        doCmdErrorReportStruct.k();
    }
}
