package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.floatball.k f184210a = new com.tencent.mm.plugin.webview.ui.tools.floatball.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f184211b;

    static {
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.plugin.webview.ui.tools.floatball.j());
        f184211b = new java.util.LinkedHashMap();
    }

    public final void a(java.lang.String id6, com.tencent.mm.plugin.webview.core.e3 controller, qx4.d0 jsapi) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_search_minimize_keepalive_count, 0);
        java.util.LinkedHashMap linkedHashMap = f184211b;
        int size = linkedHashMap.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchFloatBallMgr", "cacheSearchWebView " + id6 + ", current:" + size + ", limit:" + Ni);
        if (Ni <= 0) {
            return;
        }
        if (Ni <= size) {
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                jz5.o oVar = (jz5.o) ((java.lang.ref.SoftReference) entry.getValue()).get();
                if (kotlin.jvm.internal.o.b(oVar != null ? (com.tencent.mm.plugin.webview.core.e3) oVar.f302841d : null, controller)) {
                    linkedHashMap.remove(entry.getKey());
                } else {
                    com.tencent.mm.plugin.webview.ui.tools.floatball.k kVar = f184210a;
                    java.lang.Object key = entry.getKey();
                    kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                    kVar.c((java.lang.String) key);
                }
            }
        }
        linkedHashMap.put(id6, new java.lang.ref.SoftReference(new jz5.o(controller, jsapi, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
    }

    public final com.tencent.mm.plugin.webview.core.e3 b(java.lang.String id6) {
        jz5.o oVar;
        kotlin.jvm.internal.o.g(id6, "id");
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) f184211b.get(id6);
        if (softReference == null || (oVar = (jz5.o) softReference.get()) == null) {
            return null;
        }
        return (com.tencent.mm.plugin.webview.core.e3) oVar.f302841d;
    }

    public final void c(java.lang.String id6) {
        jz5.o oVar;
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        boolean z17;
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mars.xlog.Log.i("MicroMsg.SearchFloatBallMgr", "removeCacheSearchWebView ".concat(id6));
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) f184211b.remove(id6);
        if (softReference == null || (oVar = (jz5.o) softReference.get()) == null || (e3Var = (com.tencent.mm.plugin.webview.core.e3) oVar.f302841d) == null || !(z17 = e3Var.L) || !z17) {
            return;
        }
        e3Var.y1();
    }
}
