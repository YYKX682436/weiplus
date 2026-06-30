package g11;

/* loaded from: classes5.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f267565d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f267566e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f267567f = new g11.a(this);

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        this.f267565d = f9Var;
        f9Var.r1(1);
        f9Var.u1(str2);
        f9Var.e1(c01.w9.o(str2));
        f9Var.j1(1);
        f9Var.d1(str3);
        f9Var.setType(c01.e2.C(str2));
        long M9 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var);
        iz5.a.g(null, M9 != -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsgFake", "new msg inserted to db , local id = " + M9);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f267566e = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsgFake", "send local msg, msgId = " + this.f267565d.getMsgId());
        this.f267567f.sendEmptyMessageDelayed(0, 500L);
        return 999;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 522;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recv local msg, msgId = ");
        com.tencent.mm.storage.f9 f9Var = this.f267565d;
        sb6.append(f9Var.getMsgId());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsgFake", sb6.toString());
        f9Var.r1(2);
        f9Var.e1(c01.w9.m(f9Var.Q0(), java.lang.System.currentTimeMillis() / 1000));
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
        this.f267566e.onSceneEnd(0, 0, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
