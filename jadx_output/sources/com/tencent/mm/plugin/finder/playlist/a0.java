package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class a0 extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f122252e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context, com.tencent.mm.plugin.finder.playlist.l0 l0Var, o25.y1 y1Var) {
        super((androidx.appcompat.app.AppCompatActivity) context);
        this.f122250c = context;
        this.f122251d = l0Var;
        this.f122252e = y1Var;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
    }

    @Override // v92.g
    public boolean a() {
        return this.f122251d.f122338d.f();
    }

    @Override // v92.g
    public void e(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        boolean a17 = a();
        android.content.Context context = this.f122250c;
        o25.y1 y1Var = this.f122252e;
        if (a17) {
            bottomSheet.f211876p = new com.tencent.mm.plugin.finder.playlist.r(y1Var, context, bottomSheet);
        }
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122251d;
        r45.ev2 g17 = com.tencent.mm.plugin.finder.playlist.l0.g(l0Var);
        if (g17 != null) {
            bottomSheet.f211885w = new com.tencent.mm.plugin.finder.playlist.u(y1Var, l0Var, context, g17);
        }
        bottomSheet.f211886x = new com.tencent.mm.plugin.finder.playlist.v(y1Var, bottomSheet);
    }

    @Override // v92.g
    public void h() {
        r45.vx0 vx0Var = this.f122251d.f122338d.h().f122285e;
        long j17 = vx0Var != null ? vx0Var.getLong(0) : 0L;
        android.content.Context context = this.f122250c;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{85, pm0.v.u(j17)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public int j() {
        return 0;
    }

    @Override // v92.g
    public void k(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_menu_complaint", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.playlist.w(this.f122251d), 62, null);
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_chat", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.playlist.x(this.f122251d), 62, null);
    }

    @Override // v92.g
    public void m(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_menu_fav", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.playlist.y(this.f122251d), 62, null);
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_sns", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.playlist.z(this.f122251d), 62, null);
    }

    @Override // v92.g
    public boolean o() {
        return this.f122251d.f122338d.h().f122284d;
    }

    @Override // v92.g
    public void r() {
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122251d;
        r45.ev2 g17 = com.tencent.mm.plugin.finder.playlist.l0.g(l0Var);
        if (g17 != null) {
            com.tencent.mm.plugin.finder.assist.n7.f102406a.q(this.f122250c, g17, (r16 & 4) != 0 ? false : l0Var.w(), (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        }
    }

    @Override // v92.g
    public void s() {
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122251d;
        r45.ev2 g17 = com.tencent.mm.plugin.finder.playlist.l0.g(l0Var);
        if (g17 != null) {
            so2.v0 v0Var = so2.v0.f410644a;
            r45.vx0 vx0Var = l0Var.f122338d.h().f122285e;
            android.content.Context context = this.f122250c;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            so2.v0.a(v0Var, vx0Var, g17, (androidx.appcompat.app.AppCompatActivity) context, null, null, 24, null);
        }
    }

    @Override // v92.g
    public void t() {
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122251d;
        r45.ev2 g17 = com.tencent.mm.plugin.finder.playlist.l0.g(l0Var);
        if (g17 != null) {
            com.tencent.mm.plugin.finder.assist.n7.f102406a.s(this.f122250c, g17, l0Var.w());
        }
    }

    @Override // v92.g
    public void u() {
        super.u();
        java.util.List Vi = ((com.tencent.mm.pluginsdk.forward.m) this.f122252e).Vi();
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122251d;
        java.util.Iterator it = Vi.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.playlist.l0.y(l0Var, "quick_forward_avatar", false, (java.lang.String) it.next(), 2, null);
        }
    }

    @Override // v92.g
    public boolean x() {
        return this.f122251d.f122338d.e();
    }
}
