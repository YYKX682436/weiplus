package e45;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.r f249416d;

    public q(e45.r rVar) {
        this.f249416d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) this.f249416d.findViewById(com.tencent.mm.R.id.vfh);
        if (checkBox.getVisibility() == 0) {
            checkBox.setChecked(!checkBox.isChecked());
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/FileSelectorBottomBarUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
