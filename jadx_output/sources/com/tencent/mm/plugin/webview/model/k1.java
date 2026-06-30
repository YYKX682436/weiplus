package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class k1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, com.tencent.mm.plugin.webview.ui.tools.jsapi.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182976d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182977e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.g14 f182978f;

    /* renamed from: g, reason: collision with root package name */
    public final int f182979g;

    public k1(r45.g14 g14Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, com.tencent.mm.protobuf.g gVar, int i17, java.util.LinkedList linkedList, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPISetAuth", "NetSceneJSAPISetAuth doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s]", str, str3, str4, str5, str6, str7, str8, java.lang.Integer.valueOf(i17));
        this.f182978f = g14Var;
        this.f182979g = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b24();
        lVar.f70665b = new r45.c24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-setauth";
        lVar.f70667d = 1096;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182976d = a17;
        r45.b24 b24Var = (r45.b24) a17.f70710a.f70684a;
        b24Var.f370453d = str;
        b24Var.f370463q = str2;
        b24Var.f370454e = str3;
        b24Var.f370455f = str4;
        b24Var.f370456g = str5;
        b24Var.f370457h = str6;
        b24Var.f370458i = str7;
        b24Var.f370459m = str8;
        b24Var.f370461o = i17;
        b24Var.f370460n = gVar;
        b24Var.f370462p = linkedList;
        b24Var.f370464r = i19;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPISetAuth", "doScene");
        this.f182977e = u0Var;
        return dispatch(sVar, this.f182976d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1096;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.webview.NetSceneJSAPISetAuth", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f182977e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.o
    public int s() {
        return this.f182979g;
    }
}
