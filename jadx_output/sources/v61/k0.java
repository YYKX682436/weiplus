package v61;

/* loaded from: classes2.dex */
public class k0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433453d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433454e;

    public k0() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c00();
        lVar.f70665b = new r45.d00();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkcansetalias";
        lVar.f70667d = 926;
        this.f433453d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433454e = u0Var;
        return dispatch(sVar, this.f433453d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 926;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckModifyAlias", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f433454e.onSceneEnd(i18, i19, str, this);
    }
}
