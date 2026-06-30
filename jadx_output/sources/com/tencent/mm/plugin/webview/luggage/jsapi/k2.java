package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class k2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182380b;

    public k2(com.tencent.mm.plugin.webview.luggage.jsapi.l2 l2Var, sd.b bVar, int i17) {
        this.f182379a = bVar;
        this.f182380b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.j14 j14Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        sd.b bVar = this.f182379a;
        if (i17 != 0 || i18 != 0) {
            bVar.c("fail", null);
            return;
        }
        if (this.f182380b == 2) {
            bVar.c("fail", null);
            return;
        }
        r45.j24 j24Var = (r45.j24) oVar.f70711b.f70700a;
        if (j24Var == null || (j14Var = j24Var.f377509d) == null) {
            bVar.c("fail", null);
            return;
        }
        int i19 = j14Var.f377491d;
        java.lang.String str2 = j14Var.f377492e;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "jsErrcode = %d", java.lang.Integer.valueOf(i19));
        if (i19 == 0) {
            new java.util.HashMap().put("code", j24Var.f377510e);
            bVar.a();
        } else {
            bVar.c("fail", null);
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "errMsg = %s", str2);
        }
    }
}
