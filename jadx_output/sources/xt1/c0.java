package xt1;

/* loaded from: classes4.dex */
public class c0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456454d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456455e;

    public c0(float f17, float f18, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zp5();
        lVar.f70665b = new r45.aq5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/card/reportlocation";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.ad.jsapi.e.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456454d = a17;
        r45.zp5 zp5Var = (r45.zp5) a17.f70710a.f70684a;
        zp5Var.f392278e = f17;
        zp5Var.f392277d = f18;
        zp5Var.f392281h = str;
        zp5Var.f392280g = str2;
        zp5Var.f392279f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456455e = u0Var;
        return dispatch(sVar, this.f456454d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.ad.jsapi.e.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCardReportLocation", "onGYNetEnd, errType = " + i18 + " errCode = " + i19);
        this.f456455e.onSceneEnd(i18, i19, str, this);
    }
}
