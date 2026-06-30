package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f187386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m6 f187387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187389g;

    public l6(android.app.Activity activity, com.tencent.mm.plugin.webview.ui.tools.widget.m6 m6Var, int i17, android.os.Bundle bundle) {
        this.f187386d = activity;
        this.f187387e = m6Var;
        this.f187388f = i17;
        this.f187389g = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.webview.core.u0 u0Var;
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var;
        if (this.f187386d.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.m6 m6Var = this.f187387e;
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) m6Var.f187410e.get();
        if (r0Var == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = this.f187388f;
        if (i17 == 3003 || i17 == 3004) {
            hashSet.add("menuItem:share:appMessage");
            hashSet.add("menuItem:share:timeline");
            hashSet.add("menuItem:copyUrl");
        } else {
            android.os.Bundle bundle = this.f187389g;
            if (bundle == null) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("menu_item_list");
            if (stringArrayList == null || stringArrayList.size() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PreloadWebViewStubCallback", "setMenuItemsVisible menuItems is null or nil.");
                return;
            } else {
                hashSet.addAll(stringArrayList);
                hashSet.remove("menuItem:exposeArticle");
            }
        }
        java.lang.String url = r0Var.f181916a.getUrl();
        if (url == null || (weakReference = m6Var.f187412g) == null || (u0Var = (com.tencent.mm.plugin.webview.core.u0) weakReference.get()) == null || (d0Var = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) u0Var).f187474s) == null) {
            return;
        }
        java.util.HashMap hashMap = d0Var.f187149g;
        java.lang.Object obj = hashMap.get(url);
        java.util.HashMap hashMap2 = d0Var.f187150h;
        boolean z17 = false;
        switch (i17) {
            case 3001:
            case 3003:
                if (obj == null) {
                    obj = new android.util.SparseBooleanArray();
                    hashMap.put(url, obj);
                    if (((android.util.SparseBooleanArray) d0Var.f187149g.get(url)) == null) {
                        d0Var.f187149g.put(url, new android.util.SparseBooleanArray());
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) hashMap2.get((java.lang.String) it.next());
                    if (num == null) {
                        num = -1;
                    }
                    kotlin.jvm.internal.o.d(num);
                    int intValue = num.intValue();
                    if (intValue > 0) {
                        ((android.util.SparseBooleanArray) obj).put(intValue, true);
                    }
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = d0Var.f187143a;
                if (k0Var != null && k0Var.i()) {
                    z17 = true;
                }
                if (z17) {
                    d0Var.h();
                    return;
                }
                return;
            case 3002:
            case 3004:
                if (obj != null) {
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        java.lang.Integer num2 = (java.lang.Integer) hashMap2.get((java.lang.String) it6.next());
                        if (num2 == null) {
                            num2 = -1;
                        }
                        kotlin.jvm.internal.o.d(num2);
                        int intValue2 = num2.intValue();
                        if (intValue2 > 0) {
                            ((android.util.SparseBooleanArray) obj).delete(intValue2);
                        }
                    }
                    com.tencent.mm.ui.widget.dialog.k0 k0Var2 = d0Var.f187143a;
                    if (k0Var2 != null && k0Var2.i()) {
                        z17 = true;
                    }
                    if (z17) {
                        d0Var.h();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
