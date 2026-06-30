package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class l0 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f187856d;

    /* renamed from: e, reason: collision with root package name */
    public int f187857e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.k f187858f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f187859g;

    public l0() {
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() % 1000);
        this.f187856d = currentTimeMillis;
        this.f187857e = -1;
        this.f187858f = new com.tencent.mm.plugin.webview.webcompt.k(currentTimeMillis, true, false, 4, null);
        this.f187859g = new java.util.HashMap();
    }

    public final void a(com.tencent.mm.plugin.webview.webcompt.s1 reporter) {
        int i17;
        kotlin.jvm.internal.o.g(reporter, "reporter");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "clear workerManager#" + this.f187856d);
        java.util.Iterator it = entrySet().iterator();
        int i18 = -1;
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) entry.getValue();
            boolean z17 = k0Var.f187841d;
            int i19 = k0Var.f187838a;
            r45.d24 d24Var = k0Var.f187839b;
            if (!z17 && k0Var.f187842e) {
                java.util.HashMap hashMap = this.f187859g;
                if (!hashMap.containsKey(entry.getKey())) {
                    k0Var.f187843f = true;
                    k0Var.f187849l = null;
                    com.tencent.mm.plugin.webview.webcompt.h0 h0Var2 = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "WebComptWorker.recycle " + k0Var.f187844g + '@' + d24Var.f372006d + ':' + i19);
                    hashMap.put(entry.getKey(), k0Var);
                    reporter.a(com.tencent.mm.plugin.webview.webcompt.b.Q);
                }
            }
            if (k0Var.f187841d || i19 != (i17 = this.f187857e)) {
                java.lang.String name = d24Var.f372006d;
                kotlin.jvm.internal.o.f(name, "name");
                k0Var.f187840c.e(name, "onWebComptDestroy", "{}");
                k0Var.a().destroy();
            } else {
                i18 = i17;
            }
        }
        this.f187857e = i18;
        clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.webview.webcompt.k0) {
            return super.containsValue((com.tencent.mm.plugin.webview.webcompt.k0) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (com.tencent.mm.plugin.webview.webcompt.k0) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (com.tencent.mm.plugin.webview.webcompt.k0) super.getOrDefault((java.lang.String) obj, (com.tencent.mm.plugin.webview.webcompt.k0) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (com.tencent.mm.plugin.webview.webcompt.k0) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof com.tencent.mm.plugin.webview.webcompt.k0)) {
            return super.remove((java.lang.String) obj, (com.tencent.mm.plugin.webview.webcompt.k0) obj2);
        }
        return false;
    }
}
