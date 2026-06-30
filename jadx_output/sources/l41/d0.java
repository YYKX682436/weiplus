package l41;

/* loaded from: classes2.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315793d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315794e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315795f;

    public d0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ys5();
        lVar.f70665b = new r45.zs5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/revokeopenimchatroomqrcode";
        lVar.f70667d = nd1.w0.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315794e = a17;
        this.f315795f = str;
        r45.ys5 ys5Var = (r45.ys5) a17.f70710a.f70684a;
        ys5Var.f391336d = str;
        ys5Var.f391337e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneRevokeOpenIMChatRoomQRCode", "get roomname:%s, qrcode:%s", str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315793d = u0Var;
        return dispatch(sVar, this.f315794e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return nd1.w0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneRevokeOpenIMChatRoomQRCode", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315795f);
        com.tencent.mm.modelbase.u0 u0Var = this.f315793d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
