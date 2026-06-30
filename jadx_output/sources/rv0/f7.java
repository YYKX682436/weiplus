package rv0;

/* loaded from: classes5.dex */
public final class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400007d;

    public f7(rv0.j7 j7Var) {
        this.f400007d = j7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/SpeedEditingPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onApplyToAllButtonClicked = this.f400007d.getOnApplyToAllButtonClicked();
        if (onApplyToAllButtonClicked != null) {
            onApplyToAllButtonClicked.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/SpeedEditingPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
