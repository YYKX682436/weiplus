package kn;

/* loaded from: classes2.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309380d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309381e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f309382f;

    public c0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        this.f309382f = str2;
        r45.so6 so6Var = new r45.so6();
        so6Var.f385889d = str;
        so6Var.f385890e = str2;
        lVar.f70664a = so6Var;
        lVar.f70665b = new r45.to6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/transferchatroomowner";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f309380d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309381e = u0Var;
        return dispatch(sVar, this.f309380d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.yc.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + i18 + " errCode " + i19 + " errMsg " + str);
        this.f309381e.onSceneEnd(i18, i19, str, this);
    }
}
