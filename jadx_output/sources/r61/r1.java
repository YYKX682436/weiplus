package r61;

/* loaded from: classes4.dex */
public class r1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392948d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392949e;

    public r1(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zz5();
        lVar.f70665b = new r45.a06();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendverifyemail";
        lVar.f70667d = 108;
        lVar.f70668e = 43;
        lVar.f70669f = 1000000043;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f392949e = a17;
        r45.zz5 zz5Var = (r45.zz5) a17.f70710a.f70684a;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        zz5Var.f392493d = du5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392948d = u0Var;
        return dispatch(sVar, this.f392949e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 108;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f392948d.onSceneEnd(i18, i19, str, this);
    }
}
