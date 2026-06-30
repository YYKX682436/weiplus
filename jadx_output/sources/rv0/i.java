package rv0;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j f400040d;

    public i(rv0.j jVar) {
        this.f400040d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.a onEditOperationClickListener = this.f400040d.getOnEditOperationClickListener();
        if (onEditOperationClickListener != null) {
            onEditOperationClickListener.s1(fv0.a.f266945q);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel$initViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
