package ot4;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f348864d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f348865e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348866f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348867g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, java.lang.String str9) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.f65();
        lVar.f70665b = new r45.g65();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payibggenprepay";
        lVar.f70667d = 1563;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f348865e = a17;
        r45.f65 f65Var = (r45.f65) a17.f70710a.f70684a;
        f65Var.f374046d = str;
        f65Var.f374049g = str4;
        f65Var.f374047e = str2;
        f65Var.f374050h = str5;
        f65Var.f374051i = str6;
        f65Var.f374048f = str3;
        f65Var.f374052m = str7;
        f65Var.f374053n = str8;
        f65Var.f374054o = i17;
        java.lang.String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", str, str4, str2, str5, str6, str3, str7, str8);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f348864d = u0Var;
        return dispatch(sVar, this.f348865e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1563;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay raw net errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.g65 g65Var = (r45.g65) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url. biz_errcode: %d, biz_errmsg: %s", java.lang.Integer.valueOf(g65Var.f374926g), g65Var.f374927h);
            str = g65Var.f374927h;
            i19 = g65Var.f374926g;
            this.f348866f = g65Var.f374924e;
            this.f348867g = g65Var.f374928i;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url failed");
            this.f348866f = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkk);
        }
        this.f348864d.onSceneEnd(i18, i19, str, this);
    }
}
