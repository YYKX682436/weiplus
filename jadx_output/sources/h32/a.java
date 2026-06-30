package h32;

/* loaded from: classes4.dex */
public abstract class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278448d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f278449e;

    public com.tencent.mm.protobuf.f H() {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar = this.f278449e;
        if (oVar == null || (fVar = oVar.f70711b.f70700a) == null) {
            return null;
        }
        return fVar;
    }

    public abstract com.tencent.mm.protobuf.f I();

    public abstract com.tencent.mm.protobuf.f J();

    public abstract void K(com.tencent.mm.protobuf.f fVar);

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f278448d = u0Var;
        if (this.f278449e == null) {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = getType();
            lVar.f70666c = getUri();
            lVar.f70664a = I();
            lVar.f70665b = J();
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            this.f278449e = a17;
            K(a17.f70710a.f70684a);
        }
        return dispatch(sVar, this.f278449e, this);
    }

    public abstract java.lang.String getUri();

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseNetScene", "onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f278448d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
