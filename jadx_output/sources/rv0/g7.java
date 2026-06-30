package rv0;

/* loaded from: classes5.dex */
public final class g7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400022d;

    public g7(rv0.j7 j7Var) {
        this.f400022d = j7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/SpeedEditingPanel$setupViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onResetButtonClicked = this.f400022d.getOnResetButtonClicked();
        if (onResetButtonClicked != null) {
            onResetButtonClicked.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/SpeedEditingPanel$setupViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
