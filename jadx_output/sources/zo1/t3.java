package zo1;

/* loaded from: classes5.dex */
public final class t3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474776d;

    public t3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        this.f474776d = selectContactUI;
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
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474776d;
        zo1.d3 d3Var = selectContactUI.f92860t;
        com.tencent.mm.ui.contact.item.d item = d3Var != null ? d3Var.getItem(i17) : null;
        if (item == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "try to toggle selection of " + item.f206850s);
        wo1.v vVar = selectContactUI.f92861u;
        if (vVar != null) {
            vVar.toggleSelected(item.f206850s);
        }
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.T6(selectContactUI);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$showSearchView$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
