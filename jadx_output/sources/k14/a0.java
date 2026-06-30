package k14;

/* loaded from: classes2.dex */
public class a0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303296d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303297e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rm3 f303298f;

    public a0() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qm3();
        lVar.f70665b = new r45.rm3();
        lVar.f70667d = 2745;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getreceiptassisstatus";
        lVar.f70678o = 2;
        this.f303296d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303297e = u0Var;
        return dispatch(sVar, this.f303296d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2745;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetReceipAssistStatus", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f303298f = (r45.rm3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f303297e.onSceneEnd(i18, i19, str, this);
    }
}
