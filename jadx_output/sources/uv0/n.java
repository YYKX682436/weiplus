package uv0;

/* loaded from: classes5.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431341d;

    public n(uv0.u uVar) {
        this.f431341d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel$initListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uv0.u filterPanel = this.f431341d;
        uv0.i iVar = filterPanel.U;
        if (iVar != null) {
            vv0.k filterInfo = filterPanel.f431351J;
            uv0.h hVar = (uv0.h) iVar;
            kotlin.jvm.internal.o.g(filterPanel, "filterPanel");
            kotlin.jvm.internal.o.g(filterInfo, "filterInfo");
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(hVar.f431333a);
            i0Var.d(com.tencent.mm.R.string.lkp);
            i0Var.f(com.tencent.mm.R.string.lkq);
            i0Var.f211821b.E = new uv0.g(filterPanel, hVar, filterInfo);
            i0Var.e(com.tencent.mm.R.string.apj);
            i0Var.h();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/filter/FilterPanel$initListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
