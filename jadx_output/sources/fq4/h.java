package fq4;

/* loaded from: classes12.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f265598d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f265599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265600f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f265601g = 2;

    public h(int i17, java.lang.String str) {
        fq4.c cVar = new fq4.c();
        this.f265599e = cVar;
        r45.ir3 ir3Var = ((c01.l9) cVar.getReqObj()).f37309a;
        ir3Var.f377280d = str;
        ir3Var.f377281e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetVoiceprintTicketRsa", "sceneType %d %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f265598d = u0Var;
        return dispatch(sVar, this.f265599e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.ia.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.jr3 jr3Var = ((c01.m9) v0Var.getRespObj()).f37331a;
        this.f265600f = jr3Var.f378066d;
        if (i18 == 4 && i19 == -301) {
            c01.f9.d(jr3Var.f378067e, jr3Var.f378069g, jr3Var.f378068f, true, 0);
            int i27 = this.f265601g - 1;
            this.f265601g = i27;
            if (i27 <= 0) {
                this.f265598d.onSceneEnd(3, -1, "", this);
                return;
            } else {
                doScene(dispatcher(), this.f265598d);
                return;
            }
        }
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new fq4.g(this, v0Var.getReqObj().getRsaInfo().f342999c));
        } else if (i18 == 0 || i19 == 0) {
            this.f265598d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f265598d.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }
}
