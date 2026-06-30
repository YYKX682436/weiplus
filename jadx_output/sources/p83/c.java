package p83;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352734d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lr3 f352735e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352736f = null;

    public c() {
        this.f352734d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kr3();
        lVar.f70665b = new r45.lr3();
        lVar.f70667d = 746;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getwcocallinfo";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352734d = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetCallInfo", "NetSceneIPCallGetCallInfo");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352736f = u0Var;
        return dispatch(sVar, this.f352734d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 746;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetCallInfo", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352735e = (r45.lr3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f352736f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
