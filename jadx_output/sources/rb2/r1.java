package rb2;

/* loaded from: classes10.dex */
public final class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393741f;

    public r1(so2.y0 y0Var, rb2.z2 z2Var, in5.s0 s0Var) {
        this.f393739d = y0Var;
        this.f393740e = z2Var;
        this.f393741f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$initSelectStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$initSelectStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        so2.y0 y0Var = this.f393739d;
        boolean z18 = (y0Var.f410703d.u0().getExtFlag() & 2) != 0;
        int i17 = z18 ? 4 : 3;
        rb2.z2 z2Var = this.f393740e;
        z2Var.f393686e.U(y0Var, i17, new rb2.q1(y0Var, i17, z2Var));
        in5.s0 s0Var = this.f393741f;
        if (z18) {
            android.content.Context context = s0Var.f293121e;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.nlf);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        } else {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.v2_);
            if (p17 != null) {
                hc2.f1.d(p17);
            }
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(s0Var.f293121e);
            e4Var2.d(com.tencent.mm.R.string.nlc);
            e4Var2.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var2.c();
        }
        boolean z19 = !z18;
        so2.g0.f(y0Var, z19);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.v2_);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        z2Var.K(z19, (com.tencent.mm.ui.widget.imageview.WeImageView) p18);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(z2Var.f393686e.f0().getItemId()));
        lVarArr[1] = new jz5.l("comment_id", pm0.v.u(y0Var.getItemId()));
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.getString(1)) == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("finder_context_id", str);
        if (V6 != null && (string = V6.getString(2)) != null) {
            str2 = string;
        }
        lVarArr[3] = new jz5.l("finder_tab_context_id", str2);
        lVarArr[4] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[5] = new jz5.l("fav_result", java.lang.Integer.valueOf(i17 != 3 ? 2 : 1));
        ((cy1.a) rVar).Bj("finder_comment_fav_button", "view_clk", kz5.c1.k(lVarArr), 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$initSelectStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
