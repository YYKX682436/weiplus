package e93;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f250355d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f250356e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f250357f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f250358g = new java.util.ArrayList();

    public c(java.lang.String str) {
        this.f250357f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yb0();
        lVar.f70665b = new r45.zb0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/delcontactlabel";
        lVar.f70667d = 636;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250355d = lVar.a();
        this.f250357f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f250356e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f250355d;
        r45.yb0 yb0Var = (r45.yb0) oVar.f70710a.f70684a;
        java.lang.String str = this.f250357f;
        yb0Var.f390945d = str;
        if (str != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            yb0Var.f390945d = str;
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Label.NetSceneDelContactLabel", "cpan[doScene] label id list is null.");
        u0Var.onSceneEnd(3, -1, "[doScene]empty label is list.", this);
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 636;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f250356e.onSceneEnd(i18, i19, str, this);
    }
}
