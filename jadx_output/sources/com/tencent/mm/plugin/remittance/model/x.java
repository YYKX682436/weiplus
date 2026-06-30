package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zv f157057d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f157058e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f157059f;

    public x(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, int i19, java.lang.String str5, java.lang.String str6, int i27) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yv();
        lVar.f70665b = new r45.zv();
        lVar.f70667d = 2773;
        lVar.f70666c = "/cgi-bin/mmpay-bin/f2fsucpage";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f157058e = a17;
        r45.yv yvVar = (r45.yv) a17.f70710a.f70684a;
        yvVar.f391385d = str;
        yvVar.f391386e = str2;
        yvVar.f391387f = i17;
        yvVar.f391388g = str3;
        yvVar.f391389h = str4;
        yvVar.f391390i = i18;
        yvVar.f391391m = i19;
        yvVar.f391392n = str5;
        yvVar.f391393o = str6;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f157059f = u0Var;
        return dispatch(sVar, this.f157058e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2773;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fSuccPage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.zv zvVar = (r45.zv) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f157057d = zvVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fSuccPage", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(zvVar.f392381d), this.f157057d.f392382e);
        com.tencent.mm.modelbase.u0 u0Var = this.f157059f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
