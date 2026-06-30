package op5;

/* loaded from: classes9.dex */
public abstract class a extends com.tencent.mm.wallet_core.model.z0 {
    public abstract int H();

    @Override // com.tencent.mm.wallet_core.model.z0
    public void configRequest(boolean z17, boolean z18) {
        com.tencent.mm.modelbase.o commReqResp = getCommReqResp();
        if (commReqResp == null) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.k75();
            lVar.f70665b = new r45.l75();
            lVar.f70666c = "/cgi-bin/mmpay-bin/payu";
            lVar.f70667d = 1518;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            commReqResp = lVar.a();
            commReqResp.setIsUserCmd(true);
        }
        r45.k75 k75Var = (r45.k75) commReqResp.f70710a.f70684a;
        if (z17) {
            k75Var.f378454d = H();
        }
        if (z18) {
            k75Var.f378455e = 1;
        }
        setCommReqResp(commReqResp);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.callback = u0Var;
        if (c01.z1.I()) {
            return dispatch(sVar, this.f214040rr, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetScenePayUBase", "hy: serious error: not payupay");
        u0Var.onSceneEnd(1000, -100868, "Pay Method Err", this);
        return 1;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public java.lang.String getEncryptUrl(java.lang.String str) {
        return com.tenpay.android.wechat.TenpayUtil.signWith3Des(str);
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public int getPayCgicmd() {
        return H();
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public com.tencent.mm.wallet_core.model.e1 getRetModel(com.tencent.mm.modelbase.o oVar) {
        r45.l75 l75Var = (r45.l75) oVar.f70711b.f70700a;
        com.tencent.mm.wallet_core.model.e1 e1Var = new com.tencent.mm.wallet_core.model.e1();
        int i17 = l75Var.f379200g;
        e1Var.f213890c = l75Var.f379199f;
        e1Var.f213889b = l75Var.f379198e;
        e1Var.f213888a = l75Var.f379197d;
        e1Var.f213892e = l75Var.f379202i;
        e1Var.f213891d = l75Var.f379201h;
        return e1Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1518;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var) {
        ((r45.k75) oVar.f70710a.f70684a).f378456f = cu5Var;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToRequest(java.lang.StringBuilder sb6, java.lang.String str) {
        sb6.append(java.net.URLEncoder.encode(str));
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void putToWXReqText(com.tencent.mm.modelbase.o oVar, r45.cu5 cu5Var) {
        ((r45.k75) oVar.f70710a.f70684a).f378457g = cu5Var;
    }
}
