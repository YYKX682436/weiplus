package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class j2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.l2 f182356c;

    public j2(com.tencent.mm.plugin.webview.luggage.jsapi.l2 l2Var, sd.b bVar, java.lang.String str) {
        this.f182356c = l2Var;
        this.f182354a = bVar;
        this.f182355b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.j14 j14Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        sd.b bVar = this.f182354a;
        if (i17 != 0 || i18 != 0) {
            bVar.c("fail", null);
            return;
        }
        r45.l24 l24Var = (r45.l24) oVar.f70711b.f70700a;
        if (l24Var == null || (j14Var = l24Var.f379086d) == null) {
            bVar.c("fail", null);
            return;
        }
        int i19 = j14Var.f377491d;
        java.lang.String str2 = j14Var.f377492e;
        java.lang.String str3 = l24Var.f379095p;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "NetSceneJSLogin jsErrcode %d", java.lang.Integer.valueOf(i19));
        if (i19 == -12000) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.jsapi.i2(this, str3, l24Var.f379088f, l24Var.f379089g, l24Var.f379090h));
        } else if (i19 == 0) {
            new java.util.HashMap().put("code", l24Var.f379087e);
            bVar.a();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", str2);
            bVar.c("fail", null);
        }
    }
}
