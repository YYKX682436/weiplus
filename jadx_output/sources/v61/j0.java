package v61;

/* loaded from: classes2.dex */
public class j0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433449d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433450e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f433451f;

    public j0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.hz hzVar = new r45.hz();
        hzVar.f376562d = str;
        this.f433451f = str;
        lVar.f70664a = hzVar;
        lVar.f70665b = new r45.iz();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkaliasvalid";
        lVar.f70667d = 3516;
        this.f433449d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433450e = u0Var;
        return dispatch(sVar, this.f433449d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3516;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckAliasValid", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f433450e.onSceneEnd(i18, i19, str, this);
    }
}
