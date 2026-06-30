package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.h1 f187820a = new com.tencent.mm.plugin.webview.webcompt.h1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f187821b = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(java.lang.String url, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(url, "url");
        if (linkedList != null) {
            java.lang.String c17 = f187820a.c(url);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComptCache", "addJSAPIWebCompt " + linkedList.size());
            if (c17 != null) {
                ((java.util.concurrent.ConcurrentHashMap) f187821b).put(c17, linkedList);
            }
        }
    }

    public final java.util.LinkedList b(java.lang.String url, org.json.JSONArray list) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(list, "list");
        java.lang.String c17 = c(url);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<r45.d24> linkedList2 = (java.util.LinkedList) ((java.util.concurrent.ConcurrentHashMap) f187821b).get(c17);
        if (linkedList2 != null) {
            for (r45.d24 d24Var : linkedList2) {
                int length = list.length();
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        break;
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) list.get(i17), d24Var.f372006d)) {
                        linkedList.add(d24Var);
                        break;
                    }
                    i17++;
                }
            }
        }
        return linkedList;
    }

    public final java.lang.String c(java.lang.String url) {
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(url)) {
            return url;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        kotlin.jvm.internal.o.g(url, "url");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.n(url);
    }
}
