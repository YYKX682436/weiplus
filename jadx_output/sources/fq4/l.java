package fq4;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f265614d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f265615e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265616f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f265617g = 0;

    public l(int i17, java.lang.String str) {
        fq4.b bVar = new fq4.b();
        this.f265615e = bVar;
        c01.j9 j9Var = (c01.j9) bVar.getReqObj();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaGetVoicePrintResource", "sceneType %d %s", java.lang.Integer.valueOf(i17), str);
        r45.er3 er3Var = j9Var.f37269a;
        er3Var.f373691d = i17;
        er3Var.f373692e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f265614d = u0Var;
        return dispatch(sVar, this.f265615e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 616;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        c01.k9 k9Var = (c01.k9) v0Var.getRespObj();
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new fq4.k(this, v0Var.getReqObj().getRsaInfo().f342999c));
        } else {
            if (i18 != 0 && i19 != 0) {
                this.f265614d.onSceneEnd(i18, i19, str, this);
                return;
            }
            r45.wr5 wr5Var = k9Var.f37287a.f374575d;
            if (wr5Var != null) {
                this.f265616f = new java.lang.String(wr5Var.f389403e.f371841f.f192156a);
                this.f265617g = k9Var.f37287a.f374575d.f389402d;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneRsaGetVoicePrintResource", "resp ResourceData null ");
            }
            this.f265614d.onSceneEnd(i18, i19, str, this);
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
