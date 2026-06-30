package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182637a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.menu.y f182638b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f182639c;

    public v2(com.tencent.mm.plugin.webview.luggage.e0 e0Var, int i17, com.tencent.mm.plugin.webview.luggage.menu.y yVar) {
        this.f182637a = e0Var;
        this.f182638b = yVar;
        boolean z17 = false;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(e0Var.f406610d, i17, false);
        this.f182639c = k0Var;
        k0Var.f211872n = new com.tencent.mm.plugin.webview.luggage.l2(this);
        k0Var.f211874o = new com.tencent.mm.plugin.webview.luggage.m2(this);
        k0Var.f211881s = new com.tencent.mm.plugin.webview.luggage.n2(this);
        k0Var.f211884v = new com.tencent.mm.plugin.webview.luggage.o2(this);
        k0Var.D = new com.tencent.mm.plugin.webview.luggage.q2(this);
        java.util.Iterator it = yVar.f182569a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.webview.luggage.menu.z zVar = (com.tencent.mm.plugin.webview.luggage.menu.z) it.next();
            if (zVar.f182572b.equals("menuItem:share:appMessage") && !zVar.f182573c) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            uw4.u.a(e0Var.f406610d, this.f182639c, new com.tencent.mm.plugin.webview.luggage.s2(this));
        }
        this.f182639c.v();
    }

    public void a(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.luggage.menu.z zVar;
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182637a;
        android.content.Context context = e0Var.f406610d;
        com.tencent.mm.plugin.webview.luggage.menu.y yVar = this.f182638b;
        yVar.getClass();
        if (menuItem == null) {
            return;
        }
        int itemId = menuItem.getItemId();
        java.util.Iterator it = yVar.f182569a.iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            zVar = (com.tencent.mm.plugin.webview.luggage.menu.z) it.next();
            if (zVar != null && zVar.f182571a == itemId) {
                break;
            }
        }
        com.tencent.mm.plugin.webview.luggage.menu.a aVar = (com.tencent.mm.plugin.webview.luggage.menu.a) ((java.util.HashMap) yVar.f182570b).get(java.lang.Integer.valueOf(zVar.f182571a));
        if (aVar == null) {
            return;
        }
        aVar.b(context, e0Var, zVar);
    }
}
