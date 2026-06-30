package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class c1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f213873d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f213874e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f213875f;

    /* renamed from: g, reason: collision with root package name */
    public int f213876g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f213877h;

    /* renamed from: i, reason: collision with root package name */
    public int f213878i;

    public c1(java.lang.String str, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f213875f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wx6();
        lVar.f70665b = new r45.xx6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifypurchase";
        lVar.f70667d = 414;
        lVar.f70668e = 215;
        lVar.f70669f = 1000000215;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213873d = a17;
        r45.wx6 wx6Var = (r45.wx6) a17.f70710a.f70684a;
        this.f213875f = str;
        wx6Var.f389556e = str;
        wx6Var.f389557f = i17;
        wx6Var.f389564p = i19;
        wx6Var.f389558g = i18;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            wx6Var.f389559h = str6;
            wx6Var.f389560i = str5;
        }
        wx6Var.f389561m = str2;
        wx6Var.f389563o = str4;
        if (str3 != null) {
            byte[] bytes = str3.getBytes();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            wx6Var.f389555d = cu5Var;
        } else {
            wx6Var.f389555d = new r45.cu5();
        }
        wx6Var.f389562n = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyPurchase", "productId:" + str + ",verifyType:" + i17 + ",payType:" + i18 + ",count:%s" + i19 + ",payload:" + str2 + ",purchaseData:" + str3 + ",dataSignature:" + str4 + ",currencyType:" + str5 + ",price:" + str6);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f213874e = u0Var;
        return dispatch(sVar, this.f213873d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 414;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyPurchase", "ErrType:" + i18 + "   errCode:" + i19);
        this.f213878i = 0;
        if (i18 != 0 || i19 != 0) {
            this.f213878i = -1;
            this.f213874e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.xx6 xx6Var = (r45.xx6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (xx6Var.BaseResponse != null) {
            this.f213876g = xx6Var.f390588f;
            this.f213877h = xx6Var.f390586d;
        }
        this.f213874e.onSceneEnd(i18, i19, str, this);
    }

    public c1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        this.f213875f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wx6();
        lVar.f70665b = new r45.xx6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifypurchase";
        lVar.f70667d = 414;
        lVar.f70668e = 215;
        lVar.f70669f = 1000000215;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213873d = a17;
        r45.wx6 wx6Var = (r45.wx6) a17.f70710a.f70684a;
        this.f213875f = str;
        wx6Var.f389556e = str;
        wx6Var.f389558g = i17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            wx6Var.f389559h = str3;
        }
        wx6Var.f389561m = str2;
        wx6Var.f389557f = i18;
        if (str4 != null) {
            byte[] bytes = str4.getBytes();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            wx6Var.f389555d = cu5Var;
        } else {
            wx6Var.f389555d = new r45.cu5();
        }
        wx6Var.f389562n = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyPurchase", "ProductID:%s, Price:%s, PayType:%s, BillNo:%s", str, str3, java.lang.Integer.valueOf(i17), str2);
    }
}
