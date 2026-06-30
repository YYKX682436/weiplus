package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class k6 implements db5.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f185606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f185608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f185609d;

    public k6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, java.util.List list, int i17, int i18) {
        this.f185609d = c6Var;
        this.f185606a = list;
        this.f185607b = i17;
        this.f185608c = i18;
    }

    @Override // db5.v4
    public void a(android.view.MenuItem menuItem, android.view.View view) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(menuItem.getItemId());
        java.util.List list = this.f185606a;
        if (list.contains(valueOf)) {
            return;
        }
        int i17 = this.f185607b + 1;
        this.f185609d.a0(menuItem.getItemId(), this.f185608c, i17, com.tencent.mm.plugin.webview.model.s5.EXPOSE);
        list.add(java.lang.Integer.valueOf(menuItem.getItemId()));
    }
}
