package da2;

/* loaded from: classes2.dex */
public final class i extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final r45.r03 f227759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.r03 r03Var, androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f227759c = r03Var;
    }

    public final long A() {
        r45.hj2 hj2Var;
        r45.r03 r03Var = this.f227759c;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null) {
            return 0L;
        }
        return hj2Var.getLong(0);
    }

    public final java.lang.String B() {
        r45.r03 r03Var = this.f227759c;
        return hc2.m0.c(r03Var != null ? (r45.hj2) r03Var.getCustom(19) : null, this.f434158a, null);
    }

    public final void C(android.view.View view, java.lang.String str) {
        hc2.v0.e(view, str, 0, 0, false, false, null, new da2.h(this.f434158a.getIntent().getLongExtra("key_ref_feed_id", 0L)), 62, null);
    }

    public final boolean D() {
        r45.r03 r03Var = this.f227759c;
        r45.hj2 hj2Var = r03Var != null ? (r45.hj2) r03Var.getCustom(19) : null;
        return hj2Var != null && hj2Var.getInteger(14) == 1;
    }

    public final r45.ht0 E() {
        r45.ht0 ht0Var = new r45.ht0();
        ht0Var.set(0, pm0.v.u(A()));
        ht0Var.set(1, B());
        ht0Var.set(5, D() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.f491947lw2).toString() : com.tencent.mm.sdk.platformtools.x2.f193071a.getText(com.tencent.mm.R.string.eqg).toString());
        return ht0Var;
    }

    @Override // v92.g
    public boolean f() {
        return A() == 0;
    }

    @Override // v92.g
    public void h() {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        long A = A();
        boolean D = D();
        androidx.appcompat.app.AppCompatActivity context = this.f434158a;
        if (D) {
            bd2.b bVar = bd2.b.f19244a;
            kotlin.jvm.internal.o.g(context, "activity");
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(hc2.m0.b(context));
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = h17 != null ? cu2.u.f222441a.p(h17) : null;
            bVar.l(context, bVar.h(context, 10009, kz5.c1.k(new jz5.l(dm.i4.COL_ID, pm0.v.u(p17 != null ? p17.getItemId() : 0L)), new jz5.l("topic_id", pm0.v.u(A)))), false, null);
            return;
        }
        r45.r03 r03Var = this.f227759c;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var.getCustom(3)) == null || (str = zi2Var.getString(12)) == null) {
            str = "";
        }
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&song_id=%s=&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{83, str, pm0.v.u(A)}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public void l(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        C(menuView, "finder_forward_share_to_chat");
    }

    @Override // v92.g
    public void n(android.content.Context context, android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(menuView, "menuView");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        C(menuView, "finder_forward_share_to_sns");
    }

    @Override // v92.g
    public boolean p() {
        return (B().length() == 0) || A() == 0;
    }

    @Override // v92.g
    public void r() {
        r45.hj2 hj2Var;
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        java.lang.String B = B();
        r45.r03 r03Var = this.f227759c;
        com.tencent.mm.plugin.finder.assist.n7.J(n7Var, mMActivity, B, 15, (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null) ? 0L : hj2Var.getInteger(4), hc2.m0.a(r03Var != null ? (r45.hj2) r03Var.getCustom(19) : null, appCompatActivity), z(), null, 9, "", E(), java.lang.Boolean.valueOf(D()), null, 2048, null);
    }

    @Override // v92.g
    public void t() {
        r45.hj2 hj2Var;
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        java.lang.String B = B();
        r45.r03 r03Var = this.f227759c;
        com.tencent.mm.plugin.finder.assist.n7.K(n7Var, mMActivity, B, 15, (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null) ? 0L : hj2Var.getInteger(4), hc2.m0.a(r03Var != null ? (r45.hj2) r03Var.getCustom(19) : null, appCompatActivity), z(), null, 9, "", E(), java.lang.Boolean.valueOf(D()), null, 2048, null);
    }

    public final java.lang.String z() {
        r45.hj2 hj2Var;
        java.lang.String str;
        r45.r03 r03Var = this.f227759c;
        if (r03Var == null || (hj2Var = (r45.hj2) r03Var.getCustom(19)) == null) {
            return "";
        }
        java.lang.String g17 = com.tencent.mm.plugin.finder.assist.w2.g(2, hj2Var.getInteger(4));
        int integer = hj2Var.getInteger(5);
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        java.lang.String i17 = com.tencent.mm.plugin.finder.assist.w2.i(integer);
        long integer2 = hj2Var.getInteger(4);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        if (integer2 > 0) {
            str = "" + appCompatActivity.getResources().getString(com.tencent.mm.R.string.eqm, g17);
        } else {
            str = "";
        }
        if (hj2Var.getInteger(4) > 0 && hj2Var.getInteger(5) > 0) {
            str = str + " · ";
        }
        if (hj2Var.getInteger(5) > 0) {
            str = str + appCompatActivity.getResources().getString(com.tencent.mm.R.string.f491944eq5, i17);
        }
        return str == null ? "" : str;
    }
}
