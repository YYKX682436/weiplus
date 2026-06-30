package zo1;

/* loaded from: classes3.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474768d;

    public s4(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI) {
        this.f474768d = selectPackageUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI = this.f474768d;
        selectPackageUI.startActivityForResult(new android.content.Intent(selectPackageUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI.class), 122);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectPackageUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
