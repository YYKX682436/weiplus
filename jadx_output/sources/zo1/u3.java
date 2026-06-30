package zo1;

/* loaded from: classes5.dex */
public final class u3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow f474784e;

    public u3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI, android.widget.PopupWindow popupWindow) {
        this.f474783d = selectContactUI;
        this.f474784e = popupWindow;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSortPopWindow$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.a2 a2Var = com.tencent.mm.plugin.backup.roambackup.a2.f92567a;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474783d;
        com.tencent.mm.plugin.backup.roambackup.a2.b(a2Var, selectContactUI.f92863w, 4L, null, 4, null);
        wo1.v vVar = selectContactUI.f92861u;
        kotlin.jvm.internal.o.d(vVar);
        vVar.onSortTypeChanged(i17);
        wo1.v vVar2 = selectContactUI.f92861u;
        kotlin.jvm.internal.o.d(vVar2);
        java.lang.String sortTypeDescription = vVar2.getSortTypeDescription();
        android.widget.TextView textView = selectContactUI.f92849f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("sortTypeTv");
            throw null;
        }
        textView.setText(sortTypeDescription);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "change sort type to position=" + i17 + ", desc=" + sortTypeDescription);
        this.f474784e.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSortPopWindow$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
