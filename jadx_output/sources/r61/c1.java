package r61;

/* loaded from: classes4.dex */
public class c1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f392827d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f392828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f392829f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392830g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392831h;

    public c1(r61.b1 b1Var, java.lang.String str, int i17) {
        this.f392827d = -1;
        this.f392829f = 0;
        int ordinal = b1Var.ordinal();
        if (ordinal == 0) {
            this.f392827d = 1;
        } else if (ordinal == 1) {
            this.f392827d = 2;
        }
        this.f392828e = str;
        this.f392829f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vh();
        lVar.f70665b = new r45.wh();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindgooglecontact";
        lVar.f70667d = 487;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f392830g = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
        this.f392831h = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f392830g;
        r45.vh vhVar = (r45.vh) oVar.f70710a.f70684a;
        vhVar.f388229d = this.f392827d;
        vhVar.f388230e = this.f392828e;
        vhVar.f388231f = this.f392829f;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 487;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f392831h.onSceneEnd(i18, i19, str, this);
    }
}
