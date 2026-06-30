package cw0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.d f222611d;

    public b(cw0.d dVar) {
        this.f222611d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a onEditOperationClickListener = this.f222611d.getOnEditOperationClickListener();
        if (onEditOperationClickListener != null) {
            onEditOperationClickListener.s1(fv0.a.f266944p);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel$initViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
