package k64;

/* loaded from: classes.dex */
public final class f implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k64.g f304592d;

    public f(k64.g gVar) {
        this.f304592d = gVar;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1$doScene$wrapCallback$1");
        com.tencent.mars.xlog.Log.i("CgiRequestHelper", "IOnGYNetEnd() called with: errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        k64.g gVar = this.f304592d;
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSceneCallback", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
        com.tencent.mm.modelbase.u0 u0Var = gVar.f304593d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSceneCallback", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1");
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, gVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$netScene$1$doScene$wrapCallback$1");
    }
}
