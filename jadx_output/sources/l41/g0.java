package l41;

/* loaded from: classes2.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, ab0.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315815d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315816e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315817f;

    public g0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        this.f315817f = str2;
        r45.ko4 ko4Var = new r45.ko4();
        ko4Var.f378877d = str;
        r45.xz4 xz4Var = new r45.xz4();
        ko4Var.f378878e = xz4Var;
        xz4Var.f390630d = str2;
        lVar.f70664a = ko4Var;
        lVar.f70665b = new r45.lo4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/modopenimchatroomowner";
        lVar.f70667d = 811;
        this.f315815d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315816e = u0Var;
        return dispatch(sVar, this.f315815d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 811;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTransferOpenImChatRoomOwner", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f315816e.onSceneEnd(i18, i19, str, this);
    }
}
