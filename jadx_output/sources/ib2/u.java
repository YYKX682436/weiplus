package ib2;

/* loaded from: classes2.dex */
public final class u extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ib2.w wVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.f290154c = wVar;
    }

    @Override // v92.g
    public void e(com.tencent.mm.ui.widget.dialog.k0 bottomSheet) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        ib2.w wVar = this.f290154c;
        wVar.E.getClass();
        if (!(this instanceof nr2.t)) {
            bottomSheet.f211876p = new ib2.l(wVar, bottomSheet);
        }
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            bottomSheet.f211885w = new ib2.o(wVar, O6);
        }
        bottomSheet.f211886x = new ib2.p(wVar, bottomSheet);
    }

    @Override // v92.g
    public void h() {
        ib2.w wVar = this.f290154c;
        r45.vx0 vx0Var = wVar.f290156d;
        long j17 = vx0Var != null ? vx0Var.getLong(0) : 0L;
        android.app.Activity context = wVar.getContext();
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
        hc2.v0.e(menuView, "finder_forward_menu_complaint", 0, 0, false, false, null, new ib2.q(this.f290154c), 62, null);
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_chat", 0, 0, false, false, null, new ib2.r(this.f290154c), 62, null);
    }

    @Override // v92.g
    public void m(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_menu_fav", 0, 0, false, false, null, new ib2.s(this.f290154c), 62, null);
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        hc2.v0.e(menuView, "finder_forward_share_to_sns", 0, 0, false, false, null, new ib2.t(this.f290154c), 62, null);
    }

    @Override // v92.g
    public void r() {
        ib2.w wVar = this.f290154c;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            com.tencent.mm.plugin.finder.assist.n7.r(com.tencent.mm.plugin.finder.assist.n7.f102406a, wVar.getContext(), O6, false, false, null, null, 56, null);
        }
    }

    @Override // v92.g
    public void s() {
        ib2.w wVar = this.f290154c;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            so2.v0 v0Var = so2.v0.f410644a;
            r45.vx0 vx0Var = wVar.f290156d;
            android.app.Activity context = wVar.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            so2.v0.a(v0Var, vx0Var, O6, (androidx.appcompat.app.AppCompatActivity) context, null, null, 24, null);
        }
    }

    @Override // v92.g
    public void t() {
        ib2.w wVar = this.f290154c;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            com.tencent.mm.plugin.finder.assist.n7.f102406a.s(wVar.getContext(), O6, false);
        }
    }

    @Override // v92.g
    public void u() {
        super.u();
        ib2.w wVar = this.f290154c;
        java.util.Iterator it = ((com.tencent.mm.pluginsdk.forward.m) wVar.E).Vi().iterator();
        while (it.hasNext()) {
            java.util.Map P6 = wVar.P6((java.lang.String) it.next());
            if (P6 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("quick_forward_avatar", "view_exp", P6, 1, false);
            }
        }
    }
}
