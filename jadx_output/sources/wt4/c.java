package wt4;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f449533d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f449534e;

    /* renamed from: f, reason: collision with root package name */
    public r45.x65 f449535f = null;

    public c(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i75();
        lVar.f70665b = new r45.j75();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payuqueryuserroll";
        lVar.f70667d = com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f449534e = a17;
        r45.i75 i75Var = (r45.i75) a17.f70710a.f70684a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        i75Var.f376797d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f449533d = u0Var;
        return dispatch(sVar, this.f449534e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayUQueryUserRoll", "errType = " + i18 + " errCode " + i19 + " errMsg " + str);
        this.f449533d.onSceneEnd(i18, i19, str, this);
        if (i18 == 0 && i19 == 0) {
            r45.x65 x65Var = ((r45.j75) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f377629d;
            this.f449535f = x65Var;
            if (x65Var != null) {
                java.lang.String str2 = x65Var.f389817d;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetScenePayUQueryUserRoll", "hy: user roll is null!!!");
            }
        }
    }
}
