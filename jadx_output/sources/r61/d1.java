package r61;

/* loaded from: classes2.dex */
public class d1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392836d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392837e;

    public d1(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 870;
        r45.bi biVar = new r45.bi();
        biVar.f370771d = str;
        lVar.f70664a = biVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindoldwx";
        lVar.f70665b = new r45.ci();
        this.f392836d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392837e = u0Var;
        return dispatch(sVar, this.f392836d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 870;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOldWx", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f392837e.onSceneEnd(i18, i19, str, this);
    }
}
