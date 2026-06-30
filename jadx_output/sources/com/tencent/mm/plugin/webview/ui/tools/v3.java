package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class v3 implements db5.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f186960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.x3 f186961b;

    public v3(java.util.List list, com.tencent.mm.plugin.webview.ui.tools.x3 x3Var) {
        this.f186960a = list;
        this.f186961b = x3Var;
    }

    @Override // db5.v4
    public final void a(android.view.MenuItem menuItem, android.view.View view) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(menuItem.getItemId());
        java.util.List list = this.f186960a;
        if (list.contains(valueOf)) {
            return;
        }
        list.add(java.lang.Integer.valueOf(menuItem.getItemId()));
        this.f186961b.c("expose", menuItem);
    }
}
