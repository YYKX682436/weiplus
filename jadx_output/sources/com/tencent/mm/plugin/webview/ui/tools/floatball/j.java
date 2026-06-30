package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes5.dex */
public final class j extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar = com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchFloatBallMgr", com.tencent.mm.plugin.appbrand.page.m2.NAME);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_search_minimize_keepalive_duration, 0) * 1000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184211b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            jz5.o oVar = (jz5.o) ((java.lang.ref.SoftReference) entry.getValue()).get();
            if (oVar != null && java.lang.System.currentTimeMillis() - ((java.lang.Number) oVar.f302843f).longValue() >= Ni) {
                arrayList.add(str);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.floatball.k.f184210a.c((java.lang.String) it.next());
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
