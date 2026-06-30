package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class j1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, com.tencent.mm.plugin.webview.ui.tools.jsapi.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182950d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182951e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.jsapi.n f182952f;

    /* renamed from: g, reason: collision with root package name */
    public final int f182953g;

    public j1(com.tencent.mm.plugin.webview.ui.tools.jsapi.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, byte[] bArr, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "NetSceneJSAPIRealtimeVerify doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s]", str, str3, str4, str5, str6, str7, str8);
        this.f182952f = nVar;
        this.f182953g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z14();
        lVar.f70665b = new r45.a24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-realtimeverify";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182950d = a17;
        r45.z14 z14Var = (r45.z14) a17.f70710a.f70684a;
        z14Var.f391597d = str;
        z14Var.f391605o = str2;
        z14Var.f391598e = str3;
        z14Var.f391599f = str4;
        z14Var.f391600g = str5;
        z14Var.f391601h = str6;
        z14Var.f391602i = str7;
        z14Var.f391603m = str8;
        z14Var.f391604n = com.tencent.mm.protobuf.g.b(bArr);
        z14Var.f391606p = i18;
    }

    public r45.a24 H() {
        com.tencent.mm.modelbase.o oVar = this.f182950d;
        if (oVar == null) {
            return null;
        }
        return (r45.a24) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "doScene");
        this.f182951e = u0Var;
        return dispatch(sVar, this.f182950d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f182951e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.o
    public int s() {
        return this.f182953g;
    }
}
