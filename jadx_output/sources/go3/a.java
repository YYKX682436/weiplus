package go3;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f274105d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f274106e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f274107f;

    /* renamed from: g, reason: collision with root package name */
    public int f274108g = 0;

    public a(boolean z17, byte[] bArr) {
        this.f274107f = true;
        this.f274107f = z17;
        o45.nh nhVar = new o45.nh(z17);
        this.f274106e = nhVar;
        ((o45.oh) nhVar.getReqObj()).f342991b.f373617e = com.tencent.mm.protobuf.g.b(bArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f274105d = u0Var;
        this.f274108g++;
        return dispatch(sVar, this.f274106e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f274107f ? 3944 : 836;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f274105d;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        if (this.f274108g < 2) {
            if (doScene(dispatcher(), this.f274105d) < 0) {
                this.f274105d.onSceneEnd(3, -1, "", this);
            }
        } else {
            com.tencent.mm.modelbase.u0 u0Var2 = this.f274105d;
            if (u0Var2 != null) {
                u0Var2.onSceneEnd(i18, i19, str, this);
            }
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
}
