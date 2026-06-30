package f34;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f259317d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f259318e;

    public a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gt();
        lVar.f70665b = new r45.ht();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/card/cancelshakecard";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.d2.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f259318e = a17;
        r45.gt gtVar = (r45.gt) a17.f70710a.f70684a;
        gtVar.f375522d = str;
        gtVar.f375523e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f259317d = u0Var;
        return dispatch(sVar, this.f259318e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.d2.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCancelShakeCard", "onGYNetEnd, getType = 1252 errType = " + i18 + " errCode = " + i19);
        this.f259317d.onSceneEnd(i18, i19, str, this);
    }
}
