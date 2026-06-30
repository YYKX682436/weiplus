package vs3;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.wallet_core.model.d1 implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f439920d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f439921e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.wallet.PayInfo f439922f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f439923g;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rh6();
        lVar.f70665b = new r45.sh6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/submitpayproductbuyinfo";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX;
        lVar.f70668e = 230;
        lVar.f70669f = 1000000230;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f439921e = a17;
        r45.rh6 rh6Var = (r45.rh6) a17.f70710a.f70684a;
        this.f439923g = str;
        rh6Var.f384878f = str;
        rh6Var.f384876d = str2;
        rh6Var.f384877e = str3;
        rh6Var.f384879g = str4;
        rh6Var.f384880h = bt4.f.b().c(str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f439920d = u0Var;
        return dispatch(sVar, this.f439921e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        this.f439922f = payInfo;
        r45.sh6 sh6Var = (r45.sh6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = sh6Var.f385739d;
            payInfo.f192116o = this.f439923g;
            payInfo.f192117p = sh6Var.f385740e;
            payInfo.f192114m = str2;
        }
        if (i19 == 0) {
            i19 = sh6Var.f385741f;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = sh6Var.f385742g;
        }
        this.f439922f.getClass();
        this.f439922f.f192121t = str != null ? str : "";
        this.f439920d.onSceneEnd(i18, i19, str, this);
    }
}
