package l41;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315955d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315956e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315957f;

    /* renamed from: g, reason: collision with root package name */
    public r45.a05 f315958g;

    public x(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bk3();
        lVar.f70665b = new r45.ck3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenimcontact";
        lVar.f70667d = 881;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315956e = a17;
        this.f315957f = str;
        str2 = str2 == null ? "" : str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMContact", "get openim username: %s, roomname: %s, ticket:%s", str, str2, str3);
        r45.bk3 bk3Var = (r45.bk3) a17.f70710a.f70684a;
        bk3Var.f370819d = str;
        bk3Var.f370820e = str2;
        bk3Var.f370821f = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315955d = u0Var;
        return dispatch(sVar, this.f315956e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 881;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315957f);
        if (i18 != 0 || i19 != 0) {
            this.f315955d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.ck3 ck3Var = (r45.ck3) this.f315956e.f70711b.f70700a;
        this.f315958g = ck3Var.f371619e;
        l41.j0.b(ck3Var);
        this.f315955d.onSceneEnd(i18, i19, str, this);
    }
}
