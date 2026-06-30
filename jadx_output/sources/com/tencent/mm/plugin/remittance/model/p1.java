package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class p1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.ly f156955r;

    /* renamed from: s, reason: collision with root package name */
    public final int f156956s;

    public p1(int i17, java.lang.String str, java.lang.String str2) {
        this.f156956s = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ky();
        lVar.f70665b = new r45.ly();
        lVar.f70667d = 2838;
        lVar.f70666c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_querydetail";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.ky kyVar = (r45.ky) a17.f70710a.f70684a;
        kyVar.f379034d = str;
        kyVar.f379035e = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferQuery", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ly lyVar = (r45.ly) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156955r = lyVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferQuery", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(lyVar.f379960d), this.f156955r.f379961e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.ly lyVar = (r45.ly) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = lyVar.f379960d;
        this.f214030h = lyVar.f379961e;
    }

    public com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo P() {
        com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo resendMsgInfo = new com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo();
        r45.zw4 zw4Var = this.f156955r.f379967n;
        if (zw4Var != null) {
            resendMsgInfo.f188590d = zw4Var.f392430d;
            resendMsgInfo.f188591e = zw4Var.f392431e;
            resendMsgInfo.f188592f = zw4Var.f392432f;
            resendMsgInfo.f188593g = zw4Var.f392433g;
            resendMsgInfo.f188594h = zw4Var.f392434h;
        }
        return resendMsgInfo;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2838;
    }
}
