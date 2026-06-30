package mq4;

/* loaded from: classes12.dex */
public abstract class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f330793d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330794e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330795f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.g1 f330796g = com.tencent.mm.plugin.voip.model.h1.a();

    public int H() {
        return 0;
    }

    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
    }

    public abstract com.tencent.mm.modelbase.u0 J();

    public java.lang.Object K() {
        return this.f330793d.f70711b.f70700a;
    }

    public void L() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipNetSceneBase", "netscene " + getClass().getSimpleName() + '@' + java.lang.Integer.toHexString(hashCode()) + " is started.");
        gm0.j1.d().g(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int H = H();
        if (H != 0) {
            return H;
        }
        this.f330795f = u0Var;
        this.f330794e = J();
        return dispatch(sVar, this.f330793d, this);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        I(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mm.modelbase.u0 u0Var = this.f330795f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        if (this.f330794e != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new mq4.d0(this, i18, i19, str));
        }
    }
}
