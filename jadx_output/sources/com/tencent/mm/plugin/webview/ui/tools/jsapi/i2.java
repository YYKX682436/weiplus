package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class i2 implements com.tencent.mm.plugin.webview.ui.tools.widget.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.j2 f185187a;

    public i2(com.tencent.mm.plugin.webview.ui.tools.jsapi.j2 j2Var) {
        this.f185187a = j2Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.j2 j2Var = this.f185187a;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 k2Var = j2Var.f185208e;
            k2Var.f185228d.i5(k2Var.f185225a, "authorize:fail auth cancel", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) j2Var.f185208e.f185226b).a();
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 k2Var2 = j2Var.f185208e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = k2Var2.f185228d;
        java.lang.String str = k2Var2.f185227c;
        nw4.y2 y2Var = k2Var2.f185225a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = k2Var2.f185226b;
        c1Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h2 h2Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.h2(c1Var, y2Var, e8Var, i17);
        ((j80.e) eVar).getClass();
        d17.g(new bl0.b(str, linkedList, 0, i17, -1, h2Var));
        if (i17 == 2) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k2 k2Var3 = j2Var.f185208e;
            k2Var3.f185228d.i5(k2Var3.f185225a, "authorize:fail auth deny", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) j2Var.f185208e.f185226b).a();
        }
    }
}
