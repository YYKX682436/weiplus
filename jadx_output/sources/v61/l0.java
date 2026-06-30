package v61;

/* loaded from: classes2.dex */
public class l0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f433457d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f433458e = null;

    public l0(r45.mz5 mz5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = mz5Var;
        lVar.f70665b = new r45.nz5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendphoto2fbwall";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOff;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f433457d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f433458e = u0Var;
        return dispatch(sVar, this.f433457d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOff;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f433458e.onSceneEnd(i18, i19, str, this);
    }
}
