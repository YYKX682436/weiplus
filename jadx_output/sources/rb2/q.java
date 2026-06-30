package rb2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.v f393729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393730e;

    public q(rb2.v vVar, so2.y0 y0Var) {
        this.f393729d = vVar;
        this.f393730e = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshAdContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f393729d.f393686e;
        kotlin.jvm.internal.o.d(view);
        so2.y0 y0Var = this.f393730e;
        nPresenter.e(view, y0Var);
        if (y0Var.f410703d.i1()) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("feedid", pm0.v.u(y0Var.f410703d.field_feedId));
            r45.qy0 promotion_info = y0Var.f410703d.u0().getPromotion_info();
            if (promotion_info == null || (str = promotion_info.getString(4)) == null) {
                str = "";
            }
            lVarArr[1] = new jz5.l("promotion_buffer", str);
            ((cy1.a) rVar).Bj("promotion_comment_ad_label", "view_clk", kz5.c1.k(lVarArr), 1, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshAdContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
