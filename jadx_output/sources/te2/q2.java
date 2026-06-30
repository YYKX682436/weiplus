package te2;

/* loaded from: classes14.dex */
public final class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f418352d;

    public q2(te2.a3 a3Var) {
        this.f418352d = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.b2 b2Var = this.f418352d.f417859g;
        if (b2Var != null) {
            ((te2.l2) b2Var).c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
