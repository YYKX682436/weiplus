package r61;

/* loaded from: classes12.dex */
public class m1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f392906d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392907e = null;

    public m1(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        r61.l1 l1Var = new r61.l1();
        this.f392906d = l1Var;
        r61.y0 y0Var = (r61.y0) l1Var.getReqObj();
        r45.ro3 ro3Var = y0Var.f392999a;
        ro3Var.f385054e = str;
        ro3Var.f385055f = str2;
        ro3Var.f385056g = str3;
        ro3Var.f385057h = str4;
        ro3Var.f385058i = str5;
        ro3Var.f385059m = str6;
        ro3Var.f385060n = i17;
        ro3Var.f385061o = com.tencent.mm.sdk.platformtools.m2.d();
        gm0.j1.b();
        y0Var.f392999a.f385062p = gm0.m.e();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392907e = u0Var;
        return dispatch(sVar, this.f392906d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 4 || i19 != -102) {
            this.f392907e.onSceneEnd(i18, i19, str, this);
        } else {
            gm0.j1.e().j(new r61.k1(this, v0Var.getReqObj().getRsaInfo().f342999c));
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
