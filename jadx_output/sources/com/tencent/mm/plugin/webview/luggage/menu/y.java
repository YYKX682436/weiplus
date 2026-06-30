package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f182569a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f182570b = new java.util.HashMap();

    public y() {
        d();
        e();
    }

    public void a(com.tencent.mm.plugin.webview.luggage.menu.a aVar) {
        this.f182570b.put(java.lang.Integer.valueOf(aVar.f182559a), aVar);
    }

    public void b(int i17, java.lang.String str, boolean z17) {
        this.f182569a.add(new com.tencent.mm.plugin.webview.luggage.menu.z(i17, str, z17, false));
    }

    public void c(int i17, java.lang.String str, boolean z17) {
        this.f182569a.add(new com.tencent.mm.plugin.webview.luggage.menu.z(i17, str, z17, true));
    }

    public void d() {
        a(new com.tencent.mm.plugin.webview.luggage.menu.q());
        a(new com.tencent.mm.plugin.webview.luggage.menu.v());
        a(new com.tencent.mm.plugin.webview.luggage.menu.x());
        a(new com.tencent.mm.plugin.webview.luggage.menu.r());
        a(new com.tencent.mm.plugin.webview.luggage.menu.o());
        a(new com.tencent.mm.plugin.webview.luggage.menu.k());
        a(new com.tencent.mm.plugin.webview.luggage.menu.i());
        a(new com.tencent.mm.plugin.webview.luggage.menu.l());
        a(new com.tencent.mm.plugin.webview.luggage.menu.p());
        a(new com.tencent.mm.plugin.webview.luggage.menu.s());
        a(new com.tencent.mm.plugin.webview.luggage.menu.t());
        a(new com.tencent.mm.plugin.webview.luggage.menu.h());
    }

    public void e() {
        this.f182569a.clear();
        c(35, "menuItem:minimize", true);
        b(1, "menuItem:share:appMessage", false);
        b(2, "menuItem:share:timeline", false);
        com.tencent.mm.plugin.webview.luggage.FavUrlTask favUrlTask = new com.tencent.mm.plugin.webview.luggage.FavUrlTask();
        favUrlTask.f182116f = 3;
        favUrlTask.s();
        if (favUrlTask.f182122o) {
            b(3, "menuItem:favorite", false);
            c(12, "menuItem:editTag", false);
            c(9, "menuItem:favorite", false);
        }
        c(31, "menuItem:search", true);
        c(6, "menuItem:copyUrl", false);
        b(7, "menuItem:openWithSafari", false);
        b(27, "menuItem:finish", true);
        c(28, "menuItem:refresh", true);
        c(29, "menuItem:addShortcut", false);
    }
}
