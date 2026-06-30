package np5;

/* loaded from: classes9.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo f338814g;

    /* renamed from: d, reason: collision with root package name */
    public int f338815d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.tenpay.model.p f338816e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338817f;

    public b(com.tencent.mm.modelbase.u0 u0Var) {
        this.f338817f = u0Var;
    }

    public boolean a(com.tencent.mm.wallet_core.tenpay.model.p pVar) {
        com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo = f338814g;
        int i17 = (iTenpaySave$RetryPayInfo == null || !iTenpaySave$RetryPayInfo.b()) ? 0 : f338814g.f214044d;
        com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo2 = f338814g;
        int i18 = (iTenpaySave$RetryPayInfo2 == null || !iTenpaySave$RetryPayInfo2.b()) ? 0 : f338814g.f214045e;
        int i19 = this.f338815d + 1;
        this.f338815d = i19;
        if (i19 > i18) {
            return false;
        }
        this.f338816e = pVar;
        pVar.setHasRetried(true);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        this.f338816e.resetForRetry();
        int i27 = this.f338815d;
        pVar.updateConfig(i27, i27 >= i18 ? 1 : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        gm0.j1.i();
        gm0.j1.n().f273288b.h(pVar, i17 * 1000);
        return true;
    }

    public void b(int i17, int i18, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback errCode = " + i18 + "errType = " + i17);
        if (this.f338816e != null && jSONObject != null && i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mScene !=null");
            this.f338816e.onGYNetEnd(i18, str, jSONObject);
            this.f338817f.onSceneEnd(i17, i18, str, this.f338816e);
        } else if (this.f338817f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mRealCallback !=null");
            this.f338817f.onSceneEnd(i17, i18, str, this.f338816e);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback reset");
        this.f338815d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.p) {
            if (m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.c) {
                com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo = ((rr4.d) ((com.tencent.mm.wallet_core.tenpay.model.c) m1Var)).f399233m;
                if (iTenpaySave$RetryPayInfo.b()) {
                    f338814g = iTenpaySave$RetryPayInfo;
                }
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.q(385, this);
            com.tencent.mm.wallet_core.tenpay.model.p pVar = (com.tencent.mm.wallet_core.tenpay.model.p) m1Var;
            if (pVar.ishasCGiRetried()) {
                if (this.f338816e.checkPaySuccess()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess ok");
                    b(i17, i18, str, pVar.f214055m);
                    return;
                }
                if (this.f338816e.canPayRetry()) {
                    com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo2 = f338814g;
                    if (this.f338815d < ((iTenpaySave$RetryPayInfo2 == null || !iTenpaySave$RetryPayInfo2.b()) ? 0 : f338814g.f214045e)) {
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f338816e.canPayRetry());
                        com.tencent.mm.wallet_core.tenpay.model.ITenpaySave$RetryPayInfo iTenpaySave$RetryPayInfo3 = f338814g;
                        com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try isServerDelayQuery true svrcanRetry %s localCanRetry %s", valueOf, java.lang.Boolean.valueOf(this.f338815d < ((iTenpaySave$RetryPayInfo3 == null || !iTenpaySave$RetryPayInfo3.b()) ? 0 : f338814g.f214045e)));
                        if (a(this.f338816e)) {
                            return;
                        }
                        b(i17, i18, f338814g.f214046f, pVar.f214055m);
                        return;
                    }
                }
                if (!pVar.checkRecSrvResp()) {
                    java.lang.String str2 = f338814g.f214046f;
                    com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess error %s", str2);
                    b(i17, i18, str2, pVar.f214055m);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try svr no resp");
                    if (a(this.f338816e)) {
                        return;
                    }
                    b(i17, i18, f338814g.f214046f, pVar.f214055m);
                }
            }
        }
    }
}
