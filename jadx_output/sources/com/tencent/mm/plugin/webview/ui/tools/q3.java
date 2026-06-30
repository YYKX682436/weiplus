package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class q3 {
    public q3(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String url, android.content.Intent intent) {
        java.util.List arrayList;
        boolean z17;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ip.e a17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
            java.util.List list = a17.f293554c;
            if (list.isEmpty()) {
                list.addAll(a17.a());
            }
            arrayList = java.util.Collections.unmodifiableList(list);
        } else {
            arrayList = new java.util.ArrayList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewActionBarHelper", "fullScreenMpLinkInfos size: " + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r26.i0.A(r26.n0.u0(url).toString(), ((jp.a) obj).f300970a, false, 2, null)) {
                break;
            }
        }
        jp.a aVar = (jp.a) obj;
        int intExtra = intent.getIntExtra(com.tencent.mm.ui.w2.f211197j, -1);
        if (aVar != null) {
            java.util.List list2 = aVar.f300971b;
            z17 = list2.isEmpty() ? true : list2.contains(java.lang.Integer.valueOf(intExtra));
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            java.lang.Boolean bool = valueOf.booleanValue() ? valueOf : null;
            if (bool != null) {
                bool.booleanValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewActionBarHelper", "check should fullscreen Match url: " + url + ", urlPrefix: " + aVar.f300970a + " itemShowType: " + intExtra);
            }
        }
        return z17;
    }
}
