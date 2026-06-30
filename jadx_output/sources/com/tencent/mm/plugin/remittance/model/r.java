package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class r extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156985d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ep f156986e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156987f;

    public r(r45.k6 k6Var, java.lang.String str, int i17, int i18, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dp();
        lVar.f70665b = new r45.ep();
        lVar.f70667d = 2504;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fsucpage";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156985d = a17;
        r45.dp dpVar = (r45.dp) a17.f70710a.f70684a;
        dpVar.f372629d = k6Var;
        dpVar.f372630e = str;
        dpVar.f372631f = i17;
        if (i17 == 1) {
            dpVar.f372632g = i18;
            dpVar.f372633h = j17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fSucpage", "NetSceneBusiF2fSucpage suc_page_extend %s req %s fault_flag %s fault_retry_cnt %s fault_retry_client_time %s", str, com.tencent.mm.plugin.remittance.model.a.b(k6Var), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156987f = u0Var;
        return dispatch(sVar, this.f156985d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2504;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fSucpage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f156986e = (r45.ep) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (this.f156986e.f373632g != null) {
            stringBuffer.append("response: " + this.f156986e.f373633h);
            stringBuffer.append("is_show_btn: " + this.f156986e.f373632g.f1107g);
            if (this.f156986e.f373632g.f1104d != null) {
                stringBuffer.append("single_exposure_info_list " + this.f156986e.f373632g.f1104d.size());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fSucpage", "ret_code: %s, ret_msg: %s %s", java.lang.Integer.valueOf(this.f156986e.f373629d), this.f156986e.f373630e, stringBuffer.toString());
        com.tencent.mm.modelbase.u0 u0Var = this.f156987f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
