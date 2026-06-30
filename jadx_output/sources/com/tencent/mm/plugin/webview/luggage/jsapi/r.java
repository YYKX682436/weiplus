package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f182443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182444b;

    public r(com.tencent.mm.plugin.webview.luggage.jsapi.s sVar, sd.b bVar, int i17) {
        this.f182443a = bVar;
        this.f182444b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.j14 j14Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        sd.b bVar = this.f182443a;
        if (i17 != 0 || i18 != 0) {
            bVar.c("fail", null);
            return;
        }
        if (this.f182444b == 2) {
            bVar.c("fail", null);
            return;
        }
        r45.f24 f24Var = (r45.f24) oVar.f70711b.f70700a;
        if (f24Var == null || (j14Var = f24Var.f373941d) == null) {
            bVar.c("fail", null);
            return;
        }
        int i19 = j14Var.f377491d;
        java.lang.String str2 = j14Var.f377492e;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", java.lang.Integer.valueOf(i19));
        if (i19 == 0) {
            bVar.a();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAuthorize", "ERROR = %s", str2);
            bVar.c("fail", null);
        }
    }
}
