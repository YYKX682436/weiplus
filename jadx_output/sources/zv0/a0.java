package zv0;

/* loaded from: classes5.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476154d;

    public a0(zv0.f0 f0Var) {
        this.f476154d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zv0.f0 f0Var = this.f476154d;
        f0Var.getClass();
        yz5.l onApplyToAllButtonClicked = f0Var.getOnApplyToAllButtonClicked();
        if (onApplyToAllButtonClicked != null) {
            onApplyToAllButtonClicked.invoke(f0Var.getSelectedTransitionInfo());
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/transition/TransitionPanel$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
