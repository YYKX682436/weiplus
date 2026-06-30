package xt1;

/* loaded from: classes14.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456486d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456487e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456488f;

    public h0(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, r45.pd6 pd6Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dc3();
        lVar.f70665b = new r45.ec3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcarditeminfo";
        lVar.f70667d = 1057;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456486d = a17;
        r45.dc3 dc3Var = (r45.dc3) a17.f70710a.f70684a;
        dc3Var.f372299d = str;
        dc3Var.f372300e = i17;
        dc3Var.f372301f = str2;
        dc3Var.f372302g = str3;
        dc3Var.f372304i = str4;
        dc3Var.f372303h = str5;
        dc3Var.f372305m = i18;
        dc3Var.f372306n = str6;
        dc3Var.f372307o = pd6Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456487e = u0Var;
        return dispatch(sVar, this.f456486d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1057;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            this.f456488f = ((r45.ec3) this.f456486d.f70711b.f70700a).f373265d;
        }
        this.f456487e.onSceneEnd(i18, i19, str, this);
    }
}
