package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f152365d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f152366e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f152367f = false;

    /* renamed from: g, reason: collision with root package name */
    public final int f152368g;

    public b(int i17, int i18, java.lang.String str) {
        this.f152368g = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.of5();
        lVar.f70665b = new r45.pf5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/pushnewtips";
        lVar.f70667d = 597;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f152366e = a17;
        r45.of5 of5Var = (r45.of5) a17.f70710a.f70684a;
        of5Var.f382226d = i17;
        of5Var.f382227e = i18;
        of5Var.f382228f = str;
        this.f152368g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f152365d = u0Var;
        return dispatch(sVar, this.f152366e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 597;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f152367f = ((r45.pf5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f383009d;
            this.f152365d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetScenePushCompatNewTips", "errType:" + i18 + " errCode:" + i19);
        this.f152365d.onSceneEnd(i18, i19, str, this);
    }
}
