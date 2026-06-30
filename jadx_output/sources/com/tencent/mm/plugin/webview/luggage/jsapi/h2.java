package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class h2 implements com.tencent.mm.plugin.webview.ui.tools.widget.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.i2 f182326a;

    public h2(com.tencent.mm.plugin.webview.luggage.jsapi.i2 i2Var) {
        this.f182326a = i2Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.luggage.jsapi.i2 i2Var = this.f182326a;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "press back button!");
            i2Var.f182343h.f182354a.c("auth_cancel", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.j2 j2Var = i2Var.f182343h;
        com.tencent.mm.plugin.webview.luggage.jsapi.l2 l2Var = j2Var.f182356c;
        java.lang.String str = j2Var.f182355b;
        java.lang.String str2 = i2Var.f182339d;
        sd.b bVar = j2Var.f182354a;
        l2Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.i24 i24Var = new r45.i24();
        lVar.f70664a = i24Var;
        lVar.f70665b = new r45.j24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-login-confirm";
        lVar.f70667d = 1117;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        i24Var.f376680d = str;
        i24Var.f376681e = linkedList;
        i24Var.f376682f = 0;
        i24Var.f376683g = str2;
        i24Var.f376685i = 0;
        i24Var.f376684h = i17;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.luggage.jsapi.k2(l2Var, bVar, i17));
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLogin", "fail auth deny!");
            i2Var.f182343h.f182354a.c("auth_deny", null);
        }
    }
}
