package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class q implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.s f182440c;

    public q(com.tencent.mm.plugin.webview.luggage.jsapi.s sVar, sd.b bVar, java.lang.String str) {
        this.f182440c = sVar;
        this.f182438a = bVar;
        this.f182439b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.j14 j14Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        sd.b bVar = this.f182438a;
        if (i17 != 0 || i18 != 0) {
            bVar.c("fail", null);
            return;
        }
        r45.h24 h24Var = (r45.h24) oVar.f70711b.f70700a;
        if (h24Var == null || (j14Var = h24Var.f375773d) == null) {
            bVar.c("fail", null);
            return;
        }
        int i19 = j14Var.f377491d;
        java.lang.String str2 = j14Var.f377492e;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", java.lang.Integer.valueOf(i19));
        if (i19 == -12000) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.jsapi.p(this, h24Var.f375774e, h24Var.f375775f, h24Var.f375776g));
        } else if (i19 == 0) {
            bVar.a();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "ERROR = %s", str2);
            bVar.c("fail", null);
        }
    }
}
