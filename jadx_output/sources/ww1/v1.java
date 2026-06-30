package ww1;

/* loaded from: classes2.dex */
public class v1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450314d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450315e;

    public v1(int i17, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n26();
        lVar.f70665b = new r45.o26();
        lVar.f70667d = 304;
        lVar.f70666c = "/cgi-bin/micromsg-bin/setpushsound";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f450314d = a17;
        r45.n26 n26Var = (r45.n26) a17.f70710a.f70684a;
        n26Var.f381031d = i17;
        n26Var.f381032e = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSetPushSound", "type: %d, sound: %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450315e = u0Var;
        return dispatch(sVar, this.f450314d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 304;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSetPushSound", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f450315e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
