package ww1;

/* loaded from: classes9.dex */
public class s1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450278d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450279e;

    public s1(int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ax();
        lVar.f70665b = new r45.bx();
        lVar.f70667d = 3781;
        lVar.f70666c = "/cgi-bin/mmpay-bin/qrcodesavenotify";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f450278d = a17;
        r45.ax axVar = (r45.ax) a17.f70710a.f70684a;
        axVar.f370319d = i17;
        axVar.f370320e = i18;
        axVar.f370321f = str;
        axVar.f370322g = str2;
        axVar.f370323h = (int) (java.lang.System.currentTimeMillis() / 1000);
        axVar.f370324i = gVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450279e = u0Var;
        return dispatch(sVar, this.f450278d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3781;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fQrcodeSaveNotify", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        this.f450279e.onSceneEnd(i18, i19, str, this);
    }
}
