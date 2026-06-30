package l41;

/* loaded from: classes4.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, ab0.t {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315948d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315949e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315950f;

    public w(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zj3();
        lVar.f70665b = new r45.ak3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenimchatroomqrcode";
        lVar.f70667d = uc1.o1.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315949e = a17;
        this.f315950f = str;
        ((r45.zj3) a17.f70710a.f70684a).f392148d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomQRCode", "get roomname:%s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315948d = u0Var;
        return dispatch(sVar, this.f315949e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return uc1.o1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomQRCode", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315950f);
        com.tencent.mm.modelbase.u0 u0Var = this.f315948d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
