package ks3;

/* loaded from: classes2.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f311665d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f311666e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f311667f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f311668g;

    public f0(boolean z17, java.lang.String str) {
        this.f311668g = "";
        this.f311667f = z17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f311668g = str == null ? "" : str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new ks3.r0();
        lVar.f70665b = new ks3.s0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/switchpushmail";
        lVar.f70667d = 129;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f311666e = a17;
        ks3.r0 r0Var = (ks3.r0) a17.f70710a.f70684a;
        r0Var.f311744d = this.f311667f ? 1 : 2;
        r0Var.f311745e = this.f311668g;
        this.f311665d = u0Var;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 129;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(17, java.lang.Integer.valueOf(((ks3.s0) this.f311666e.f70711b.f70700a).f311748d));
        }
        updateDispatchId(i17);
        this.f311665d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
