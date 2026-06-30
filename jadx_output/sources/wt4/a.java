package wt4;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f449529d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f449530e;

    public a(int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c75();
        lVar.f70665b = new r45.d75();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payubatchuserroll";
        lVar.f70667d = com.tencent.mm.minigame.y.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f449530e = a17;
        r45.c75 c75Var = (r45.c75) a17.f70710a.f70684a;
        c75Var.f371349d = i17;
        c75Var.f371350e = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f449529d = u0Var;
        return dispatch(sVar, this.f449530e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.minigame.y.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePayUPayQueryUserRoll", "errType = " + i18 + " errCode " + i19 + " errMsg " + str);
        this.f449529d.onSceneEnd(i18, i19, str, this);
        if (i18 == 0 && i19 == 0) {
            int i27 = ((r45.d75) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f372204d;
        }
    }
}
