package h34;

/* loaded from: classes2.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278528d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f278529e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f278530f;

    /* renamed from: g, reason: collision with root package name */
    public final int f278531g;

    public g(java.lang.String str, int i17) {
        this.f278530f = str;
        this.f278531g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f278528d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vo3();
        lVar.f70665b = new r45.wo3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/gettvinfo";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278529e = a17;
        r45.vo3 vo3Var = (r45.vo3) a17.f70710a.f70684a;
        vo3Var.f388406d = this.f278530f;
        vo3Var.f388407e = this.f278531g;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f278528d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        java.lang.String str;
        r45.vo3 vo3Var = (r45.vo3) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (vo3Var.f388407e >= 0 && (str = vo3Var.f388406d) != null && str.length() > 0) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", java.lang.Integer.valueOf(vo3Var.f388407e));
        return com.tencent.mm.modelbase.o1.EFailed;
    }
}
