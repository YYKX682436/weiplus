package s01;

/* loaded from: classes4.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401873d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401874e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f401875f;

    public g0(java.lang.String str, r45.j53 j53Var, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u90();
        lVar.f70665b = new r45.v90();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/createbizchatinfo";
        lVar.f70667d = 1355;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401874e = a17;
        r45.u90 u90Var = (r45.u90) a17.f70710a.f70684a;
        u90Var.f387151d = str;
        u90Var.f387152e = j53Var;
        this.f401875f = obj;
    }

    public r45.v90 H() {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar = this.f401874e;
        if (oVar == null || (fVar = oVar.f70711b.f70700a) == null) {
            return null;
        }
        return (r45.v90) fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401873d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "do scene");
        return dispatch(sVar, this.f401874e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1355;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401873d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
