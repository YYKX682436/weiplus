package r61;

/* loaded from: classes2.dex */
public class s1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392950d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392951e;

    public s1(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.a26();
        lVar.f70665b = new r45.b26();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newsetemailpwd";
        lVar.f70667d = 382;
        lVar.f70668e = 181;
        lVar.f70669f = 1000000181;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f392951e = a17;
        ((r45.a26) a17.f70710a.f70684a).f369671d = com.tencent.mm.sdk.platformtools.t8.A(str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392950d = u0Var;
        return dispatch(sVar, this.f392951e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 382;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f392950d.onSceneEnd(i18, i19, str, this);
    }
}
