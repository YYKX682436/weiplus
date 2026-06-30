package s01;

/* loaded from: classes4.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401876d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401877e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f401878f;

    public h0(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f401878f = false;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.za3();
        lVar.f70665b = new r45.ab3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizchatinfo";
        lVar.f70667d = 1352;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401877e = a17;
        r45.za3 za3Var = (r45.za3) a17.f70710a.f70684a;
        za3Var.f391858e = str;
        za3Var.f391857d = str2;
        this.f401878f = z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401876d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneGetBizChatInfo", "do scene");
        return dispatch(sVar, this.f401877e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1352;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401876d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
