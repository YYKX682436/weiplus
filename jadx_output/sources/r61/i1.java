package r61;

/* loaded from: classes4.dex */
public class i1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392884d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392885e;

    /* renamed from: f, reason: collision with root package name */
    public int f392886f;

    public i1(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3513;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getoldacctfriend";
        r45.pj3 pj3Var = new r45.pj3();
        this.f392886f = i17;
        pj3Var.f383101e = i17;
        pj3Var.f383100d = str;
        pj3Var.f383102f = str2;
        lVar.f70664a = pj3Var;
        lVar.f70665b = new r45.qj3();
        this.f392884d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOldAccountFriend", "get old account friend %s, max seq %d, session %s", str, java.lang.Integer.valueOf(i17), str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392885e = u0Var;
        return dispatch(sVar, this.f392884d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3513;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOldAccountFriend", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = this.f392884d;
            if (!((r45.qj3) oVar.f70711b.f70700a).f384052d.isEmpty()) {
                this.f392886f = ((r45.ky4) ((r45.qj3) oVar.f70711b.f70700a).f384052d.get(((r45.qj3) r1).f384052d.size() - 1)).f379038f;
            }
        }
        this.f392885e.onSceneEnd(i18, i19, str, this);
    }
}
