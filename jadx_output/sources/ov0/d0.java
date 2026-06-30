package ov0;

/* loaded from: classes5.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.i0 f349123d;

    public d0(ov0.i0 i0Var) {
        this.f349123d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ov0.i0 i0Var = this.f349123d;
        i0Var.getClass();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(i0Var, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/textedit/TextEditTabPanelUIC$onFirstAttached$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
