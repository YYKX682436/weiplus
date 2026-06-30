package e93;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f250364d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f250365e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.f54 f250366f;

    public f(int i17, java.lang.String str) {
        this.f250366f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.es6();
        lVar.f70665b = new r45.fs6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/updatecontactlabel";
        lVar.f70667d = 637;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250364d = lVar.a();
        if (i17 < 0 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        r45.f54 f54Var = new r45.f54();
        this.f250366f = f54Var;
        f54Var.f374022e = i17;
        f54Var.f374021d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f250365e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f250364d;
        r45.es6 es6Var = (r45.es6) oVar.f70710a.f70684a;
        r45.f54 f54Var = this.f250366f;
        if (f54Var != null) {
            es6Var.f373715d = f54Var;
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[doScene] label pair is null.");
        u0Var.onSceneEnd(3, -1, "[doScene]empty label pair.", this);
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 637;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f250365e.onSceneEnd(i18, i19, str, this);
    }
}
