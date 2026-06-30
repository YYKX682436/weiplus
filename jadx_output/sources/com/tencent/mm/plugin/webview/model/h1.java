package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class h1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, com.tencent.mm.plugin.webview.ui.tools.jsapi.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182906d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182907e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.jsapi.n f182908f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f182909g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f182910h;

    /* renamed from: i, reason: collision with root package name */
    public final int f182911i;

    public h1(com.tencent.mm.plugin.webview.ui.tools.jsapi.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, byte[] bArr, int i17, java.lang.String str9, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIAuth", "NetSceneJSAPIAuth doScene appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s], [%s]", str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17), str9);
        this.f182908f = nVar;
        this.f182909g = str4;
        this.f182910h = str;
        this.f182911i = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.h14();
        lVar.f70665b = new r45.i14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-auth";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.channels.j.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182906d = a17;
        r45.h14 h14Var = (r45.h14) a17.f70710a.f70684a;
        h14Var.f375749d = str;
        h14Var.f375759q = str2;
        h14Var.f375750e = str3;
        h14Var.f375751f = str4;
        h14Var.f375752g = str5;
        h14Var.f375753h = str6;
        h14Var.f375754i = str7;
        h14Var.f375755m = str8;
        h14Var.f375756n = com.tencent.mm.protobuf.g.b(bArr);
        h14Var.f375757o = i17;
        h14Var.f375758p = str9;
        h14Var.f375760r = i19;
    }

    public r45.i14 H() {
        com.tencent.mm.modelbase.o oVar = this.f182906d;
        if (oVar == null) {
            return null;
        }
        return (r45.i14) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIAuth", "doScene");
        this.f182907e = u0Var;
        return dispatch(sVar, this.f182906d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.channels.j.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIAuth", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f182907e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.o
    public int s() {
        return this.f182911i;
    }
}
