package zo1;

/* loaded from: classes5.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f474736e;

    public p3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI, wo1.v vVar) {
        this.f474735d = selectContactUI;
        this.f474736e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$setupView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.a2 a2Var = com.tencent.mm.plugin.backup.roambackup.a2.f92567a;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474735d;
        com.tencent.mm.plugin.backup.roambackup.a2.b(a2Var, selectContactUI.f92863w, 5L, null, 4, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", (java.lang.String[]) this.f474736e.getSelectedList().toArray(new java.lang.String[0]));
        selectContactUI.setResult(-1, intent);
        selectContactUI.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$setupView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
