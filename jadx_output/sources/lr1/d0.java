package lr1;

/* loaded from: classes2.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f320649d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f320650e;

    public d0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ze4();
        lVar.f70665b = new r45.af4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/getallrecvtmpmsgoption";
        lVar.f70667d = 1031;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f320650e = a17;
        ((r45.ze4) a17.f70710a.f70684a).f391952d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f320649d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "do scene");
        return dispatch(sVar, this.f320650e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1031;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f320649d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
