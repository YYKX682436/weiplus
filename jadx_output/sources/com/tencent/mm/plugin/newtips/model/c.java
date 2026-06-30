package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f152369d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f152370e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f152371f;

    public c(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.of5();
        lVar.f70665b = new r45.pf5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/pushnewtips";
        lVar.f70667d = 597;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f152370e = a17;
        ((r45.of5) a17.f70710a.f70684a).f382229g = str;
        this.f152371f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f152369d = u0Var;
        return dispatch(sVar, this.f152370e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 597;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NetScenePushNewTips", "errType:" + i18 + " errCode:" + i19);
            this.f152369d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.pf5 pf5Var = (r45.pf5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        boolean z17 = pf5Var.f383009d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str2 = this.f152371f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "setLocalNewTipsState() uniqueId:%s isReject:%s", str2, valueOf);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("new_tips_" + gm0.m.i());
        M.getClass();
        M.putBoolean(str2, z17);
        this.f152369d.onSceneEnd(i18, i19, str, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NetScenePushNewTips", "onGYNetEnd() uniqueId:%s IsReject:%s", str2, java.lang.Boolean.valueOf(pf5Var.f383009d));
    }
}
