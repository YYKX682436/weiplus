package vq1;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f439239d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f439240e;

    /* renamed from: f, reason: collision with root package name */
    public long f439241f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f439242g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vr3 f439243h;

    public a(java.lang.String str, java.lang.String str2) {
        this.f439242g = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1869;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getweappbox";
        lVar.f70664a = new r45.ur3();
        lVar.f70665b = new r45.vr3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f439240e = a17;
        ((r45.ur3) a17.f70710a.f70684a).f387593d = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.NetSceneBox", "Create NetSceneBox %s %s", str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f439241f = java.lang.System.currentTimeMillis();
        this.f439239d = u0Var;
        return dispatch(sVar, this.f439240e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1869;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Box.NetSceneBox", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f439241f));
        this.f439243h = (r45.vr3) this.f439240e.f70711b.f70700a;
        this.f439239d.onSceneEnd(i18, i19, str, this);
    }
}
