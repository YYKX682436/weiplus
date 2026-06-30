package iv0;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iv0.w f295073d;

    public l(iv0.w wVar) {
        this.f295073d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iv0.w wVar = this.f295073d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) wVar.getContext(), 1, false);
        k0Var.f211872n = iv0.j.f295071d;
        k0Var.f211881s = new iv0.k(wVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
