package k64;

/* loaded from: classes.dex */
public final class g extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f304593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f304595f;

    public g(int i17, com.tencent.mm.modelbase.o oVar) {
        this.f304594e = i17;
        this.f304595f = oVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
        this.f304593d = u0Var;
        int dispatch = dispatch(sVar, this.f304595f, new k64.f(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
        return this.f304594e;
    }
}
