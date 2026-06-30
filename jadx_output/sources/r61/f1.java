package r61;

/* loaded from: classes4.dex */
public class f1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392870d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392871e;

    public f1(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s20();
        lVar.f70665b = new r45.t20();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkunbind";
        lVar.f70667d = 254;
        lVar.f70668e = 131;
        lVar.f70669f = 1000000131;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f392871e = a17;
        ((r45.s20) a17.f70710a.f70684a).f385425d = i17;
    }

    public java.lang.String H() {
        try {
            return ((r45.t20) this.f392871e.f70711b.f70700a).f386075d;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneCheckUnBind", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392870d = u0Var;
        return dispatch(sVar, this.f392871e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 254;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f392870d.onSceneEnd(i18, i19, str, this);
    }
}
