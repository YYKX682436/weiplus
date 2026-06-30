package s01;

/* loaded from: classes2.dex */
public class l0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401896d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401897e;

    public l0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pf3();
        lVar.f70665b = new r45.qf3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getfavbizchatlist";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401897e = a17;
        ((r45.pf3) a17.f70710a.f70684a).f383002d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401896d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneGetFavBizChatList", "do scene");
        return dispatch(sVar, this.f401897e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.c.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401896d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
