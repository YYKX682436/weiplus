package s01;

/* loaded from: classes4.dex */
public class p0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401917d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401918e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f401919f;

    public p0(java.lang.String str, r45.pj pjVar, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cs6();
        lVar.f70665b = new r45.ds6();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/updatebizchat";
        lVar.f70667d = bb1.e.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401918e = a17;
        r45.cs6 cs6Var = (r45.cs6) a17.f70710a.f70684a;
        cs6Var.f371815d = str;
        cs6Var.f371816e = pjVar;
        this.f401919f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401917d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneUpdateBizChat", "do scene");
        return dispatch(sVar, this.f401918e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return bb1.e.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401917d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
