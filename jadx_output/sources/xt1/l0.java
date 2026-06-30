package xt1;

/* loaded from: classes2.dex */
public class l0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456519d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456520e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fg5 f456521f;

    public l0(java.util.LinkedList linkedList, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ne3();
        lVar.f70665b = new r45.oe3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getdynamiccardcode";
        lVar.f70667d = 1382;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456519d = a17;
        r45.ne3 ne3Var = (r45.ne3) a17.f70710a.f70684a;
        ne3Var.f381308d = linkedList;
        ne3Var.f381309e = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456520e = u0Var;
        return dispatch(sVar, this.f456519d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1382;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            this.f456521f = ((r45.oe3) this.f456519d.f70711b.f70700a).f382195d;
        }
        this.f456520e.onSceneEnd(i18, i19, str, this);
    }
}
