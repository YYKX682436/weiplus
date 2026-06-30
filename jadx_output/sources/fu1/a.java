package fu1;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266813d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266814e;

    /* renamed from: f, reason: collision with root package name */
    public int f266815f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f266816g;

    public a(java.lang.String str) {
        this.f266816g = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sc0();
        lVar.f70665b = new r45.tc0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/card/delsharecard";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.webview.t.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266813d = a17;
        ((r45.sc0) a17.f70710a.f70684a).f385622d = str;
        this.f266816g = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266814e = u0Var;
        return dispatch(sVar, this.f266813d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.webview.t.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.webview.t.CTRL_INDEX), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.tc0 tc0Var = (r45.tc0) this.f266813d.f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelShareCard", "ret_code:" + tc0Var.f386295d);
            int i27 = tc0Var.f386295d;
            this.f266815f = i27;
            if (i27 == 0) {
                fu1.i nj6 = xt1.t0.nj();
                nj6.getClass();
                nj6.f266845d.A("ShareCardInfo", "delete from ShareCardInfo where card_id = '" + this.f266816g + "'");
            }
        }
        this.f266814e.onSceneEnd(i18, i19, str, this);
    }
}
