package g62;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f269087d;

    /* renamed from: e, reason: collision with root package name */
    public int f269088e;

    /* renamed from: f, reason: collision with root package name */
    public int f269089f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f269090g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f269091h;

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f269087d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jm0();
        lVar.f70665b = new r45.km0();
        lVar.f70666c = "/cgi-bin/mmexptappsvr-bin/reportexptdebug";
        lVar.f70667d = 2743;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.jm0 jm0Var = (r45.jm0) a17.f70710a.f70684a;
        jm0Var.f377926d = this.f269088e;
        int i17 = this.f269089f;
        if (i17 == 0) {
            i17 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        }
        jm0Var.f377927e = i17;
        jm0Var.f377928f = this.f269090g;
        jm0Var.f377929g = this.f269091h;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2743;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDebugReport", "send expt debug info ongynetend type[%d] errType[%d] errCode[%d] errMsg[%s]", java.lang.Integer.valueOf(this.f269088e), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f269087d.onSceneEnd(i18, i19, str, this);
    }
}
