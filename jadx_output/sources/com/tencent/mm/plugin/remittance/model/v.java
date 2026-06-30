package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class v extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.vv f157035r;

    public v(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.uv();
        lVar.f70665b = new r45.vv();
        lVar.f70667d = 2736;
        lVar.f70666c = "/cgi-bin/mmpay-bin/f2fdynamiccode";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.uv uvVar = (r45.uv) a17.f70710a.f70684a;
        uvVar.f387655d = i17;
        uvVar.f387656e = str;
        uvVar.f387657f = str2;
        uvVar.f387658g = java.net.URLDecoder.decode(str3);
        uvVar.f387659h = str4;
        uvVar.f387660i = str5;
        uvVar.f387661m = str6;
        uvVar.f387662n = str7;
        uvVar.f387663o = str8;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fDynamicCode", "amount: %s, username: %s, transfer_code_id: %s", java.lang.Integer.valueOf(i17), str, java.net.URLDecoder.decode(str3));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fDynamicCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.vv vvVar = (r45.vv) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f157035r = vvVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fDynamicCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(vvVar.f388593d), this.f157035r.f388594e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.vv vvVar = (r45.vv) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = vvVar.f388593d;
        this.f214030h = vvVar.f388594e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2736;
    }
}
