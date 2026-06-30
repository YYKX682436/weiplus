package sr2;

/* loaded from: classes.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f411631d;

    public m(android.widget.CheckBox checkBox) {
        this.f411631d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f411631d.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/FinderPostAdCommentApplyUIC$initCommentApplyDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
