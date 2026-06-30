package fu1;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266817d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266818e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266819f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f266820g = "";

    public b(double d17, double d18, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lc3();
        lVar.f70665b = new r45.mc3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266817d = a17;
        r45.lc3 lc3Var = (r45.lc3) a17.f70710a.f70684a;
        lc3Var.f379300d = d17;
        lc3Var.f379301e = d18;
        lc3Var.f379302f = str;
        lc3Var.f379303g = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_REDOT_BUFF_STRING_SYNC, "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266818e = u0Var;
        return dispatch(sVar, this.f266817d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.webview.x.CTRL_INDEX), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.mc3 mc3Var = (r45.mc3) this.f266817d.f70711b.f70700a;
            this.f266819f = mc3Var.f380361d;
            this.f266820g = mc3Var.f380362e;
        }
        this.f266818e.onSceneEnd(i18, i19, str, this);
    }
}
