package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class i1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, com.tencent.mm.plugin.webview.ui.tools.jsapi.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182929d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182930e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.jsapi.n f182931f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f182932g;

    /* renamed from: h, reason: collision with root package name */
    public final int f182933h;

    public i1(com.tencent.mm.plugin.webview.ui.tools.jsapi.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, java.lang.String str8, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "NetSceneJSAPIPreVerify doScene url[%s], appid[%s], [%s], [%s], [%s], [%s]", str, str3, str4, str5, str6, str7);
        if (nVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.webview.NetSceneJSAPIPreVerify", "JSVerifyEnd cb is null");
        }
        this.f182931f = nVar;
        this.f182932g = str;
        this.f182933h = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x14();
        lVar.f70665b = new r45.y14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-preverify";
        lVar.f70667d = bb1.g.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182929d = a17;
        r45.x14 x14Var = (r45.x14) a17.f70710a.f70684a;
        x14Var.f389650d = str;
        x14Var.f389660q = str2;
        x14Var.f389651e = str3;
        x14Var.f389652f = linkedList;
        x14Var.f389659p = linkedList2;
        x14Var.f389653g = str4;
        x14Var.f389654h = str5;
        x14Var.f389655i = str6;
        x14Var.f389656m = str7;
        x14Var.f389657n = i17;
        x14Var.f389658o = str8;
        x14Var.f389661r = i19;
        x14Var.f389662s = i27;
    }

    public r45.y14 H() {
        com.tencent.mm.modelbase.o oVar = this.f182929d;
        if (oVar == null) {
            return null;
        }
        return (r45.y14) oVar.f70711b.f70700a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "doScene");
        this.f182930e = u0Var;
        return dispatch(sVar, this.f182929d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return bb1.g.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f182930e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.o
    public int s() {
        return this.f182933h;
    }
}
