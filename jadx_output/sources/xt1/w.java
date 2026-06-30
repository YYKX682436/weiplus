package xt1;

/* loaded from: classes11.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456595d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456596e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456597f;

    /* renamed from: g, reason: collision with root package name */
    public int f456598g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456599h;

    public w(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, int i19, r45.pd6 pd6Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s0();
        lVar.f70665b = new r45.t0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/acceptcarditem";
        lVar.f70667d = 1037;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456595d = a17;
        r45.s0 s0Var = (r45.s0) a17.f70710a.f70684a;
        s0Var.f385353f = str;
        s0Var.f385351d = str2;
        s0Var.f385352e = i17;
        s0Var.f385354g = str3;
        s0Var.f385356i = str4;
        s0Var.f385355h = str5;
        s0Var.f385357m = i18;
        s0Var.f385358n = i19;
        s0Var.f385359o = pd6Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456596e = u0Var;
        return dispatch(sVar, this.f456595d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1037;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        com.tencent.mm.modelbase.o oVar = this.f456595d;
        if (i18 == 0 && i19 == 0) {
            r45.t0 t0Var = (r45.t0) oVar.f70711b.f70700a;
            if (t0Var != null) {
                this.f456597f = t0Var.f386043d;
                this.f456598g = t0Var.f386044e;
                this.f456599h = t0Var.f386045f;
            }
        } else {
            r45.t0 t0Var2 = (r45.t0) oVar.f70711b.f70700a;
            if (t0Var2 != null) {
                this.f456597f = t0Var2.f386043d;
                this.f456598g = t0Var2.f386044e;
                this.f456599h = t0Var2.f386045f;
            }
        }
        this.f456596e.onSceneEnd(i18, i19, str, this);
    }
}
