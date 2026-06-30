package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes7.dex */
public class e2 implements com.tencent.mm.plugin.webview.ui.tools.widget.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.f2 f185066a;

    public e2(com.tencent.mm.plugin.webview.ui.tools.jsapi.f2 f2Var) {
        this.f185066a = f2Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f2 f2Var = this.f185066a;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "press back button!");
            com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 g2Var = f2Var.f185095f;
            g2Var.f185125d.i5(g2Var.f185122a, "login:fail auth cancel", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) f2Var.f185095f.f185123b).a();
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 g2Var2 = f2Var.f185095f;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = g2Var2.f185125d;
        java.lang.String str = g2Var2.f185124c;
        java.lang.String str2 = f2Var.f185094e;
        nw4.y2 y2Var = g2Var2.f185122a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e8 e8Var = g2Var2.f185123b;
        c1Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) bundle.getSerializable("key_scope");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add((java.lang.String) it.next());
        }
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        k80.e eVar = (k80.e) i95.n0.c(k80.e.class);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.d2 d2Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d2(c1Var, y2Var, e8Var, i17);
        ((j80.e) eVar).getClass();
        d17.g(new bl0.d(str, linkedList, 0, str2, 0, i17, -1, d2Var));
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "fail auth deny!");
            com.tencent.mm.plugin.webview.ui.tools.jsapi.g2 g2Var3 = f2Var.f185095f;
            g2Var3.f185125d.i5(g2Var3.f185122a, "login:fail auth deny", null);
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.a2) f2Var.f185095f.f185123b).a();
        }
    }
}
