package s01;

/* loaded from: classes2.dex */
public class j0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401886d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401887e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f401888f;

    public j0(java.lang.String str, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bb3();
        lVar.f70665b = new r45.cb3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizchatmyuserinfo";
        lVar.f70667d = 1354;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401887e = a17;
        ((r45.bb3) a17.f70710a.f70684a).f370655d = str;
        this.f401888f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401886d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "do scene");
        return dispatch(sVar, this.f401887e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1354;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401886d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
