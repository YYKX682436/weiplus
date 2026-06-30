package z12;

/* loaded from: classes12.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469341d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469342e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f469343f;

    public o(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.de3();
        lVar.f70665b = new r45.ee3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmgetdesignersimpleinfo";
        lVar.f70667d = 239;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469341d = lVar.a();
        this.f469343f = str;
    }

    public r45.ee3 H() {
        com.tencent.mm.modelbase.o oVar = this.f469341d;
        if (oVar == null) {
            return null;
        }
        return (r45.ee3) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469342e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469341d;
        r45.de3 de3Var = (r45.de3) oVar.f70710a.f70684a;
        de3Var.f372346d = this.f469343f;
        de3Var.f372347e = 0;
        de3Var.f372348f = null;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 239;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        z85.r rVar;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.storage.n5 Ai = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai();
            synchronized (Ai.f195163a) {
                rVar = Ai.f195172j;
            }
            r45.ee3 H = H();
            java.lang.String str2 = this.f469343f;
            rVar.z0(str2, H);
            y12.p.f458877a.e(H().f373357d, str2);
        }
        this.f469342e.onSceneEnd(i18, i19, str, this);
    }
}
