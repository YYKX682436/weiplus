package fn2;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f264407d;

    public u(fn2.b0 b0Var) {
        this.f264407d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fn2.b0 b0Var = this.f264407d;
        kotlinx.coroutines.y0 y0Var = b0Var.f264215g;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new fn2.t(b0Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
