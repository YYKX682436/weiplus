package vw0;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f440819d;

    public z(vw0.i0 i0Var) {
        this.f440819d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw0.i0 i0Var = this.f440819d;
        vw0.i0.a(i0Var, i0Var.f440793p);
        i0Var.f440785e.setVisibility(8);
        i0Var.f440786f.setVisibility(8);
        i0Var.f440787g.setVisibility(0);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/TextStyleView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
