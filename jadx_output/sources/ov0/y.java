package ov0;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.i0 f349159d;

    public y(ov0.i0 i0Var) {
        this.f349159d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ov0.t tVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ov0.i0 i0Var = this.f349159d;
        ov0.t tVar2 = (ov0.t) i0Var.f69240i;
        ov0.e selectedTabPage = tVar2 != null ? tVar2.getSelectedTabPage() : null;
        ov0.e eVar = ov0.e.f349125e;
        if (selectedTabPage != eVar && (tVar = (ov0.t) i0Var.f69240i) != null) {
            tVar.R(eVar);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
