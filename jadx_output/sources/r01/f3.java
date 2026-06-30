package r01;

/* loaded from: classes2.dex */
public class f3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368067d;

    /* renamed from: e, reason: collision with root package name */
    public final r01.e3 f368068e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368069f;

    public f3(java.lang.String str, int i17, com.tencent.mm.protobuf.f fVar, r01.e3 e3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBiztransfer", "NetSceneBiztransfer username (%s) cmdid (%s)", str, java.lang.Integer.valueOf(i17));
        this.f368068e = e3Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1915;
        lVar.f70666c = "/cgi-bin/mmocbiz-bin-new/biztransfer";
        lVar.f70664a = new r45.wm();
        lVar.f70665b = new r45.xm();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368069f = a17;
        r45.wm wmVar = (r45.wm) a17.f70710a.f70684a;
        wmVar.f389265d = str;
        wmVar.f389266e = i17;
        if (fVar != null) {
            try {
                wmVar.f389267f = com.tencent.mm.protobuf.g.b(fVar.toByteArray());
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException("bad cgi request", e17);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368067d = u0Var;
        return dispatch(sVar, this.f368069f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1915;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBiztransfer", "NetSceneBiztransfer onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r01.e3 e3Var = this.f368068e;
        if (e3Var != null) {
            e3Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f368067d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
