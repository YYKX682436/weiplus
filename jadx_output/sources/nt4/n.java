package nt4;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.model.d1 implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f339846d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f339847e;

    public n(com.tencent.mm.opensdk.modelpay.PayReq payReq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.r55();
        lVar.f70665b = new r45.s55();
        lVar.f70666c = getUri();
        lVar.f70667d = getType();
        lVar.f70668e = 188;
        lVar.f70669f = 1000000188;
        com.tencent.mm.wallet_core.ui.r1.J(payReq.prepayId);
        lVar.f70671h = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f339847e = a17;
        r45.r55 r55Var = (r45.r55) a17.f70710a.f70684a;
        r55Var.f384552d = payReq.appId;
        r55Var.f384553e = payReq.partnerId;
        r55Var.f384554f = payReq.prepayId;
        r55Var.f384555g = payReq.nonceStr;
        r55Var.f384556h = payReq.timeStamp;
        r55Var.f384557i = payReq.packageValue;
        r55Var.f384558m = payReq.sign;
        r55Var.f384559n = payReq.signType;
        r55Var.f384560o = str;
        r55Var.f384563r = str2;
        r55Var.f384564s = str3;
        r55Var.f384561p = at4.g0.c();
        r55Var.f384565t = str4;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f339846d = u0Var;
        return dispatch(sVar, this.f339847e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 397;
    }

    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/payauthapp";
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f339846d.onSceneEnd(i18, i19, str, this);
    }
}
