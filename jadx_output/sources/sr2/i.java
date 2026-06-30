package sr2;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o f411582d;

    public i(sr2.o oVar) {
        this.f411582d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.o oVar = this.f411582d;
        if (oVar.f411650g == null) {
            oVar.f411650g = db5.e1.Q(oVar.getContext(), "", oVar.getContext().getResources().getString(com.tencent.mm.R.string.f490604zq), true, false, sr2.g.f411566d);
            pm0.v.T(new db2.k(oVar.f411647d).l(), new sr2.h(oVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
