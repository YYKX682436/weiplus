package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.webview.ui.tools.widget.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.p f182411a;

    public o(com.tencent.mm.plugin.webview.luggage.jsapi.p pVar) {
        this.f182411a = pVar;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAuthorize", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.luggage.jsapi.p pVar = this.f182411a;
        if (i17 != 1 && i17 != 2) {
            pVar.f182425g.f182438a.c("auth_cancel", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.q qVar = pVar.f182425g;
        com.tencent.mm.plugin.webview.luggage.jsapi.s sVar = qVar.f182440c;
        java.lang.String str = qVar.f182439b;
        sd.b bVar = qVar.f182438a;
        sVar.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.e24 e24Var = new r45.e24();
        lVar.f70664a = e24Var;
        lVar.f70665b = new r45.f24();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
        lVar.f70667d = me1.a.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        e24Var.f372924d = str;
        e24Var.f372925e = linkedList;
        e24Var.f372927g = 0;
        e24Var.f372926f = i17;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.luggage.jsapi.r(sVar, bVar, i17));
        if (i17 == 2) {
            pVar.f182425g.f182438a.c("auth_deny", null);
        }
    }
}
